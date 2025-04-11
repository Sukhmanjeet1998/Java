// Abstract class example 1
abstract class Vehicles{
    private String name;
    Vehicles(String name){
        this.name = name;
    }
    public void startEngine(){
        System.out.format("%s engine started\n",name);
    }
//    Method name must be same but functionality completely different.
    abstract public void refuel();
}

class Car extends Vehicles{
    Car(String name){
        super(name);
    }
    @Override
    public void refuel(){
        System.out.println("Filling the car with gasoline!");
    }

}

class ElectricBike extends Vehicles{
    ElectricBike(String name){
        super(name);
    }
    @Override
    public void refuel(){
        System.out.println("Charging the bike with electricity!");
    }
}

public class JavaCWH20 {
    public static void main(String[] args) {
        Car c = new Car("Maruti Suzuki");
        c.startEngine();
        c.refuel();

        ElectricBike eb = new ElectricBike("E-Bike");
        eb.startEngine();
        eb.refuel();
    }

}
