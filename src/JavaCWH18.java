// Practise question
class Circle{
    public int radius;
    Circle(){
        System.out.println("I am non param constructor");
    }
    Circle(int r){
        System.out.println("R: " + r);
        System.out.println("I am circle param constructor");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle{
    private int height;
    Cylinder1(int r, int h){
        super(r);
//        super();
        System.out.println("I am cylinder param constructor");
        this.height = h;
    }
    public double volume(){
        return (Math.PI*this.radius*this.radius*this.height);
    }
}
public class JavaCWH18 {
    public static void main(String[] args) {
//        Circle c1 = new Circle(1);
//        System.out.println(c1.area());

        Cylinder1 cy1 = new Cylinder1(1,1);
        System.out.println("Area of a circle: " + cy1.area());
        System.out.println("Volume of a cylinder: " + cy1.volume());
    }
}
