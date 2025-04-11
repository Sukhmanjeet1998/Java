// Abstract example 1
abstract class Pen{
    abstract public void write();
    abstract public void refill();
}
class FountainPen extends Pen{
    public void changeNib(){
        System.out.println("Change Nib of a fountain pen!");
    }
    @Override
    public void write(){
        System.out.println("Write from a fountain pen!");
    }
    @Override
    public void refill(){
        System.out.println("Refill the fountain pen!");
    }

}
public class JavaCWH25 {
    public static void main(String[] args) {
        FountainPen fp = new FountainPen();
        fp.changeNib();
        fp.write();
        fp.refill();
    }
}
