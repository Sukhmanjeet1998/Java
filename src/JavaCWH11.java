// Volume and area of a cylinder using getter setter
class Cylinder{
    private  int radius;
    private  int height;

    public void setRadius(int r){
        this.radius = r;
    }
    public void setHeight(int h){
        this.height = h;
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
public class JavaCWH11 {
    public static void main(String[] args) {
        Cylinder cl1 = new Cylinder();
        cl1.setHeight(100);
        cl1.setRadius(50);
        System.out.println(cl1.area());
        System.out.println(cl1.volume());
    }
}
