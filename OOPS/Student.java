package OOPS;
import OOPS.Student;
public class Student {
    String name;
    int rno;
    double percent;
    // public static void main(String[] args) {
    //     String name;
    //     int rno;
    //     double percent;
    //     Student s1 = new Student();
         
    // }
    public Student(String naam , int roll , double per ){
        name = naam;
        rno = roll;
        percent = per;

    }
    public int getRno(){ // Getter 
        return rno;
    }
    public void setRno(int roll){  // Setter
        rno = roll;

    }
}
