// Array
import java.util.*;
import java.lang.*;
public class JavaBasic10 {

    public static void main(String[] args) {

        int num[] = {1,2,3,4};  // you know the number of values
        int num2[] = new int[4];  // when you don't know the number of values

        num[1] = 6;
        // for (int i = 0; i < num.length; i++) {
        //     System.out.println(num[i]);
        // }
        // System.out.println(num2[0]);

        int m_arr[][] = new int[3][];
        m_arr[0] = new int[3]; 
        m_arr[1] = new int[2];
        m_arr[2] = new int[4];
        
        // System.out.println(m_arr.length);

        for (int i = 0; i < m_arr.length; i++) {
            for (int j = 0; j < m_arr[i].length; j++) {
                m_arr[i][j] = (int)(Math.random() * 100);
            }
        }

        for (int i = 0; i < m_arr.length; i++) {
            for (int j = 0; j < m_arr[i].length; j++) {
                System.out.print(m_arr[i][j] + " "); 
            }
            System.out.println();
        }

        // Enchanced for loop
        for (int n[] : m_arr){
            for (int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }


    }
    
}