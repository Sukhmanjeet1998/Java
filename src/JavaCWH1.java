import java.util.Scanner;

public class JavaCWH1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter marks for the given subjects!");
//        System.out.print("Enter marks for maths: ");
//        int mathMarks = sc.nextInt();
//        System.out.print("Enter marks for science: ");
//        int scienceMarks = sc.nextInt();
//        System.out.print("Enter marks for hindi: ");
//        int hindiMarks = sc.nextInt();
//        System.out.print("Enter marks for SocialScience: ");
//        int sstMarks = sc.nextInt();
//        sc.close();
//        System.out.printl.out.println("Enter marks for the given subjects!");
//        System.out.print("Enter marks for maths: ");
//        int mathMarks = sc.nextInt();
//        System.out.print("Enter marks for science: ");
//        int scienceMarks = sc.nextInt();
//        System.out.print("Enter marks for hindi: ");
//        int hindiMarks = sc.nextInt();
//        System.out.print("Enter marks for SocialScience: ");
//        int sstMarks = sc.nextInt();
//        sc.close();
//        System.out.println("Sum of Maths "+mathMarks+" and Science "+scienceMarks+ " and Hindi " +hindiMarks+" and SocialScience "+sstMarks+" are: "+(mathMarks+scienceMarks+hindiMarks+sstMarks));
//        System.out.println(0b101);
//        System.out.println(2&3);
//        System.out.println(2|3);
//        float num = 6.5f + 5L;
//        System.out.println(num);
        int myNum = 56;
//        System.out.println(myNum);
//        System.out.println(myNum++);
//        System.out.println(myNum);
//        System.out.println(++myNum);
//        System.out.println(myNum);
        int y = 1;
        int x = 2;
//        System.out.println(++y*x);
//        System.out.println(y++*x);

//        Must go through once
        float myAns = 7/4 * 9/2;
//        System.out.println(myAns);
        float myCorrectAns = 7.0f/4.0f * 9.0f/2.0f;
//        System.out.println(myCorrectAns);

//        Strings..........................................................................

        String myFirstName = new String("Sukhmanjeet");  // This creates a new String object explicitly in heap memory.
        String myLastName = "Singh"; // This creates a String literal, which is automatically stored in the String pool.
//        System.out.println(myFirstName + " " + myLastName);

//        new String("Sukhmanjeet") creates a new object in the heap memory, regardless of whether "Sukhmanjeet" already exists in the String Pool.
        String s1 = new String("Hello");
        String s2 = new String("Hello");

//        System.out.println(s1 == s2); // false (different objects in the heap)

//        If "Singh" already exists in the pool, Java will reuse the existing reference instead of creating a new object.
        String s5 = "Java";
        String s6 = "Java";

//        System.out.println(s5 == s6); // true (both refer to the same object in the pool)
//        Here, s5 and s6 share the same reference from the String Pool.

        s6 = "JavaScript";
//        System.out.println(s5 == s6); // false (now both not refer to the same object in the pool)
//        Here, s5 and s6 share the different reference from the String Pool.


//      format specifier
        int a = 6;
        float f = 5.64f;
        char myChar = 'S';
        String s = "Sukhman";
        System.out.printf("The value of a is %d and f is %10.3f and myChar is %c and s is %s",a,f,myChar,s);
        System.out.println();
//        System.out.format("The value of a is %d and f is %f and myChar is %c and s is %s",a,f,myChar,s);
//        System.out.println();

        System.out.print("Enter your name!");
        String myName = sc.nextLine();
        System.out.println("Welocme "+myName);
    }

}
