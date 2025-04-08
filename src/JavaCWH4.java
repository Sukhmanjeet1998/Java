// Array and Multi Dimensional Array
import java.util.Scanner;

public class JavaCWH4 {
    public static void main(String[] args) {
//        Array

//        For loop with Array...........................................................................................
        Scanner sc = new Scanner(System.in);
//        int[] marks = new int[10];
//        System.out.printf("Enter %d numbers",marks.length);
//        System.out.println();
//        for (int i = 0; i < marks.length; i++) {
//            marks[i] = sc.nextInt();
//        }
//        sc.close();
//        for (int i = 0; i < marks.length; i++) {
//            System.out.printf("Index of %d the value is %d",i,marks[i]);
//            System.out.println();
//        }

//        For each loop with Array......................................................................................
//        for (int arrValue: marks){
//            System.out.printf("Value %d ",arrValue);
//            System.out.println();
//        }

        // ✅ Pros:
        //Simpler syntax (no need for index handling).
        //Best for read-only operations (e.g., printing, summing values).
        //Works well with arrays and collections (Lists, Sets, etc.).
        //❌ Cons:
        //Cannot access the index directly.
        //Cannot modify elements of an array directly (for primitive types).
        //Cannot iterate in reverse order easily.

//        MultiDimensional Array........................................................................................
//        int[][] flats = new int[3][5];
//        for (int i = 0; i < flats.length; i++) {
//            for (int j = 0; j < flats[i].length; j++) {
//                System.out.printf("Enter %d floor number for building number %d: ",(j+1),(i+1));
//                flats[i][j] = sc.nextInt();
//            }
//            System.out.println();
//        }
//        sc.close();
//        for (int i = 0; i < flats.length; i++) {
//            for (int j = 0; j < flats[i].length; j++) {
//                System.out.printf("For building %d floor number are %d \n",(i+1),(flats[i][j]));
//            }
//            System.out.println();
//        }

//        Sum of two matrices of size 2X3 array program.................................................................
//        int[][] myMatrice = new int[2][3];
//        int[][] myMatrice2 = new int[2][3];
//        int[][] mySumMatrice = new int[2][3];
//        System.out.println("Sum of two matrices of size 2X3 array program");
//        System.out.println("For the first matrices of size 2X3 array");
//        for (int i = 0; i < myMatrice.length; i++) {
//            for (int j = 0; j < myMatrice[i].length; j++) {
//                System.out.printf("Enter value for Row %d Column %d ",i+1,j+1);
//                myMatrice[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("For the second matrices of size 2X3 array");
//        for (int i = 0; i < myMatrice2.length; i++) {
//            for (int j = 0; j < myMatrice2[i].length; j++) {
//                System.out.printf("Enter value for Row %d Column %d ",i+1,j+1);
//                myMatrice2[i][j] = sc.nextInt();
//            }
//        }
//        sc.close();
//        System.out.println("Your given two matrices are:");
//        System.out.println("1st Matrice is:");
//        for (int i = 0; i < myMatrice.length; i++) {
//            for (int j = 0; j < myMatrice[i].length; j++) {
//                System.out.printf("%d ",myMatrice[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println("2nd Matrice is:");
//        for (int i = 0; i < myMatrice2.length; i++) {
//            for (int j = 0; j < myMatrice2[i].length; j++) {
//                System.out.printf("%d ",myMatrice2[i][j]);
//            }
//            System.out.println();
//        }
//
//        System.out.println("Sum of two matrices are: ");
//        for (int i = 0; i < myMatrice.length; i++) {
//            for (int j = 0; j < myMatrice[i].length; j++) {
//                mySumMatrice[i][j] = myMatrice[i][j] + myMatrice2[i][j];
//                System.out.printf("%d ", mySumMatrice[i][j]);
//            }
//            System.out.println();
//        }

//        Swapping for arrays...........................................................................................
        /*
        int[] myArr1 = new int[6];
        int[] myArr2 = new int[7];
        System.out.format("Enter values for array 1 with length %d\n",myArr1.length);
        for (int i = 0; i < myArr1.length; i++) {
            myArr1[i] = sc.nextInt();
        }
        System.out.format("Enter values for array 2 with length %d\n",myArr2.length);
        for (int i = 0; i < myArr2.length; i++) {
            myArr2[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Before swapping!");
        System.out.println("Element in Array1 are: ");
        for (int myArr1Value: myArr1){
            System.out.print(myArr1Value+" ");
        }
        System.out.println();
        System.out.println("Element in Array2 are: ");
        for (int myArr2Value: myArr2){
            System.out.print(myArr2Value+" ");
        }

        System.out.println("After Swapping!");
        int midpointArr1 = Math.floorDiv(myArr1.length,2);
        int midpointArr2 = Math.floorDiv(myArr2.length,2);
        int temp = 0;
        int length1 = myArr1.length;
        int length2 = myArr2.length;
        for (int i = 0; i < midpointArr1; i++) {
            temp = myArr1[i];
            myArr1[i] = myArr1[length1-i-1];
            myArr1[length1-i-1] = temp;
        }
        for (int i = 0; i < midpointArr2; i++) {
            temp = myArr2[i];
            myArr2[i] = myArr2[length2-i-1];
            myArr2[length2-i-1] = temp;
        }
        System.out.println("Element in Array1 are: ");
        for (int myArr1Value: myArr1){
            System.out.print(myArr1Value+" ");
        }
        System.out.println();
        System.out.println("Element in Array2 are: ");
        for (int myArr2Value: myArr2){
            System.out.print(myArr2Value+" ");
        }
        */

//        Find max number in a array....................................................................................
//        int[] myArr = new int[5];
//        System.out.format("Enter elements in a array with length %d\n",myArr.length);
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < myArr.length; i++) {
//            myArr[i] = sc.nextInt();
//            if (max < myArr[i]) {
//                max = myArr[i];
//            }
//            if (min > myArr[i]){
//                min = myArr[i];
//            }
//        }
//        System.out.println("Your given array is:");
//        for (int arrValue: myArr){
//            System.out.print(arrValue+" ");
//        }
//        System.out.println();
//        System.out.printf("Greatest value in the array is %d\n",max);
//        System.out.printf("Smallest value in the array is %d\n",min);

    }
}
