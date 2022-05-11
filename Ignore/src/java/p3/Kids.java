package src.java.p3;

public class Kids extends ManKind{
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
}
