import java.util.*;

public class JavaBasic3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1) Inaprogram,input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3
        // numbers.

        /*
         * System.out.println("Enter number 1");
         * int num1 = scan.nextInt();
         * System.out.println("Enter number 2");
         * int num2 = scan.nextInt();
         * System.out.println("Enter number 3");
         * int num3 = scan.nextInt();
         * System.out.println("Average of "+num1+", "+num2+", "+num3+": "+((num1+num2+
         * num3)/3));
         */

        // 2) Inaprogram,inputthesideofasquare.Youhavetooutputtheareaofthesquare

        /*
         * System.out.println("Enter side of a Square!");
         * int side = scan.nextInt();
         * System.out.println("Area of Square is: "+(side*side));
         */

        // 3) Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan eraser.
        // You have to output the total cost of the items back to the user as their
        // bill.(Add on : You can also try adding 18% gst tax to the items in the bill
        // as an advanced problem

        System.out.println("Enter Cost of Pencil!");
        float pencil = scan.nextFloat();
        System.out.println("Enter Cost of Pen!");
        float pen = scan.nextFloat();
        System.out.println("Enter Cost of Eraser!");
        float eraser = scan.nextFloat();
        float total = (pencil + pen + eraser);
        System.out.println("Bill is: " + total);
        float totalcost = total + (total * 0.18f);
        System.out.println("Bill with 18% of GST is: " + (totalcost));

        // 4) What will be the type of result in thefollowing Java code?

        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        double result = (f * b) + (i % c) - (d * s);
        System.out.println("Result is: " + result);

        // 5) Will the following statementgive any error in Java?
        int $ = 84;
        System.out.println("Value of $ is: " + $);
    }
}
