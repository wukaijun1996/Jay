package src.集合.exer1;

/**
 * @Time : 2022/6/5 22:40
 * @Author : wu
 * @File : MyDate.java
 * @Software: IntelliJ IDEA
 */
public class MyDate implements Comparable {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate() {
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(Object o) {

        if (o instanceof MyDate) {
            MyDate m = (MyDate) o;
            int minusYear = this.getYear() - m.getYear();
            if (minusYear != 0) {
                return minusYear;
            }

            int minusMonth = this.getMonth() - m.getMonth();
            if (minusMonth != 0) {
                return minusMonth;
            }

            return this.getDay() - m.getDay();
        }
        throw new RuntimeException("传入的数据类型不一致！");
    }
}
