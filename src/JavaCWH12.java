// Cylinder example with constructor
class Cylinders{
    private  int radius;
    private  int height;

    public Cylinders(){
        this.radius = 5;
        this.height = 10;
    }
    public Cylinders(int radius, int height){
        this.radius = radius;
        this.height = height;
    }

    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public double area(){
        return (2*Math.PI*radius*(radius+height));
    }
    public double volume(){
        return (Math.PI*radius*radius*height);
    }

}
public class JavaCWH12 {
    public static void main(String[] args) {
        Cylinders cl1 = new Cylinders(50,100);
        Cylinders cl2 = new Cylinders();
        System.out.println(cl1.area());
        System.out.println(cl1.volume());
        System.out.println(cl2.area());
        System.out.println(cl2.volume());
    }
}

