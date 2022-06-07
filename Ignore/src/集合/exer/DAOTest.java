package src.集合.exer;

/**
 * @Time : 2022/6/7 21:21
 * @Author : wu
 * @File : DAOTest.java
 * @Software: IntelliJ IDEA
 */
public class DAOTest {

    public static void main(String[] args) {

        DAO<User> dao =  new DAO<>();

        dao.save("1001",new User(1001,34,"周杰伦"));
        dao.save("1002",new User(1002,20,"昆凌"));
        dao.save("1003",new User(1003,25,"蔡依林"));

        dao.update("1003",new User(1003,30,"方文山"));


        System.out.println(dao.list());
        for (User user : dao.list()) {
            System.out.println(user);
        }


    }
}
