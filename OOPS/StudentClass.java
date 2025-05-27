package OOPS;

public class StudentClass {
    public static  class Student{
        String name;
        int rno;
        double percent;
    }

    public static void main(String[] args) {
        // Student s1 = new Student(); // Declaration 
        // s1.name = "Krishna";
        // s1.rno = 89;
        // s1.percent = 92.5;
        // // s1.setRno(76);
        // System.out.println(s1.name);
        // System.out.println(s1.rno);
        // System.out.println(s1.percent + 1 );

        // System.out.println();
        // s1.setRno(76);
;
        // Student s = new Student(); 
        // s.name = "Karan";
        // s.rno = 88;
        // s.percent = 94;


        // System.out.println(s.name);
        // System.out.println(s.rno);
        // System.out.println(s.percent + 1 );

        // System.out.println();

        // s.name = "Vidhi";
        // System.out.println(s.name);
        // s.setRno(76);

        Student s1 = new Student("Krishna" , 89 , 93.1);
        System.out.println(s1.name);
        System.out.println(s1.rno);

    }
}
