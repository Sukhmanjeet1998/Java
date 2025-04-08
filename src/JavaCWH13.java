// Inheritance
// super Class, Base Class, Parent Class
class GrandParent{
    private  int w;
    public void setW(int w){
        this.w = w;
    }
    public int getW(){
        return w;
    }
}


class Parent extends GrandParent{
    private int x;

    public void setX(int x) {
        this.x = x;
    }
    public int getX(){
        return x;
    }

}
// sub Class, Drive Class, Child Class
class Child extends Parent{
    private  int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY(){
        return y;
    }
}

public class JavaCWH13 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Child c1 = new Child();
        c1.setX(5);
        c1.setY(6);
        c1.setW(7);
        System.out.println("w: "+c1.getW());
        System.out.println("X: "+c1.getX());
        System.out.println("Y: "+c1.getY());
    }
}
