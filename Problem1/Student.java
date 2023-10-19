package Problem1;

public class Student extends Person {
    protected String myIDNum;
    protected double myGPA;

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        myIDNum = idNum;
        myGPA = gpa;
    }

    public String getIDNum() {
        return myIDNum;
    }

    public double getGPA() {
        return myGPA;
    }

    public void setIDNum(String idNum) {
        myIDNum = idNum;
    }

    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    public String toString() {
        return super.toString() + ", idNum: " + myIDNum + ", gpa: " + myGPA;
    }
}
