package src.Project3.service;

import src.Project3.domain.Architect;
import src.Project3.domain.Designer;
import src.Project3.domain.Employee;
import src.Project3.domain.Programmer;
import sun.security.krb5.internal.crypto.Des;

public class TeamService {

    private  static int counter = 1; //给memberId赋值使用
    private final int MAX_MEMBER = 5;//限制开发团队的人数
    private Programmer[] team = new Programmer[MAX_MEMBER];//保存=开发团队成员；
    private int total;//记录开发团队实际的人数；


    public TeamService() {
    }

    public Programmer[] getTeam() {
         Programmer[] team = new Programmer[total];
        for (int i = 0; i < team.length; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    public void addMember(Employee e) throws TeamException {


        if (total >= MAX_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }
        if (!(e instanceof Programmer)){
            throw new TeamException("该成员不是开发人员，无法添加");
        }
        if (isExit(e)){
            throw new TeamException("该成员已经存在于现有的团队中");
        }

         Programmer p = (Programmer) e;
//       if (p.getStatus().getNAME().equals("BUSY")){
        if ("BUSY".equals(p.getStatus().getNAME())){
            throw new TeamException("该成员已经是某团队成员");
        }else if ("VOCATION".equals(p.getStatus().getNAME())){
            throw new TeamException("该成员在休假，无法添加");
        }

        //获取team已有架构师 设计师 程序员的人数
        int numOfArch = 0,numOfDes = 0,numOfPro=0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect){
                numOfArch++;
            }else if (team[i] instanceof Designer){
                numOfDes++;
            }else if (team[i] instanceof Programmer){
                numOfPro++;
            }
        }

        if (p instanceof Architect){
            if(numOfArch >= 1){
                throw new TeamException("团队中至多只能有一名架构师");
            }
        }else if (p instanceof Designer){
            if (numOfDes >= 2){
                throw new TeamException("团队中至多只能有2名设计师");
            }
        }else if (p instanceof Programmer){
            if (numOfPro >= 2){
                throw new TeamException("团队中至多只能有3名程序员");
            }
        }


        //将p添加到现有的teamz中
        team[total++] = p;
        //p的属性赋值
        p.setStatus(Status.BUSY);
        p.setMemberid(counter++);









    }

    /**
     * 判断指定的员工是否已经存在于现有的团队中
     * @param e
     * @return
     */
    public boolean isExit(Employee e){
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == e.getId()){
                return true;
            }
        }
        return false;
    }

    public void removeMember(int memberId){

    }

}
