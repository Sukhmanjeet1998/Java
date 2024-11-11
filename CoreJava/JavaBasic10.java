
// Array
import java.util.*;
import java.lang.*;

class Student{
    String name;
    int rollno;
    int marks;   
}

public class JavaBasic10 {

    public static void main(String[] args) {

        int num[] = { 1, 2, 3, 4 }; // you know the number of values
        int num2[] = new int[4]; // when you don't know the number of values

        num[1] = 6;
        // for (int i = 0; i < num.length; i++) {
        // System.out.println(num[i]);
        // }
        // System.out.println(num2[0]);

        int m_arr[][] = new int[3][];
        // jagged array
        m_arr[0] = new int[3];
        m_arr[1] = new int[2];
        m_arr[2] = new int[4];

        // System.out.println(m_arr.length);

        for (int i = 0; i < m_arr.length; i++) {
            for (int j = 0; j < m_arr[i].length; j++) {
                m_arr[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < m_arr.length; i++) {
            for (int j = 0; j < m_arr[i].length; j++) {
                // System.out.print(m_arr[i][j] + " ");
            }
            // System.out.println();
        }

        // Enchanced for loop
        for (int n[] : m_arr) {
            for (int m : n) {
                // System.out.print(m + " ");
            }
            // System.out.println();
        }

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

        System.out.println(students[0].name);

        for(int i=0; i<students.length;i++){
            System.out.println("Student name: " + students[i].name + " | RollNo: " + students[i].rollno + " | Marks: " + students[i].marks);
        }        
    }

}