package src.java.p3;

public class Kids extends ManKind {
    private int yearsOld;

    public void printAge() {
        System.out.println("I am " + yearsOld + " years old");
    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public Kids() {
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void employeed() {
//        if (salary == 0){
//            System.out.println("no job");
//        }else if(salary != 0){
//            System.out.println("job");
//        }


        System.out.println("Kids should study and no job");
    }
}
