import java.util.*;
import java.lang.*;

class Student{
    String name;
    int rollno;
    int marks;   
}

public class JavaBasic11 {

    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student();
        Student std3 = new Student();
        
        std1.name = "Krishan";
        std2.name = "Ishinder";
        std3.name = "Simran";

        std1.rollno = 1;
        std2.rollno = 2;
        std3.rollno = 3;

        std1.marks = 56;
        std2.marks = 66;
        std3.marks = 76;

        Student students[] = new Student[3];
        students[0] = std1;
        students[1] = std2;
        students[2] = std3;

        // System.out.println(students[0].name);

        for(Student stud : students){
            System.out.println(stud.name + " "+ stud.rollno + " " + stud.marks);
        }       
    }

}