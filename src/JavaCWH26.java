interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    public void jump(){
        System.out.println("Jump");
    }
    public void bite(){
        System.out.println("Bite");
    }
}
class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat() {
        System.out.println("Eat");
    }
    @Override
    public void sleep() {
        System.out.println("Sleep");
    }
    public void speak(){
        System.out.println("Speak");
    }
}
public class JavaCWH26 {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.eat();
        h1.sleep();
        h1.jump();
        h1.bite();
        h1.speak();

//        Implement Polymorphism
        Monkey m1 = new Human();
        m1.bite();
        m1.jump();
//        m1.eat();

        BasicAnimal ba = new Human();
        ba.eat();
        ba.sleep();
//        ba.speak();

    }
}
