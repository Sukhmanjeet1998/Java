// Abstract class example 2
abstract class Colleague{
    int myAge = 24;  // you can initialize properties and can be modified by subclass
    private String name;
    private int id;
    Colleague(String name, int id){
        this.name = name;
        this.id = id;
        System.out.format("Name: %s, and Id: %d added successfully!\n",name,id);
    }
    public void displayInfo(){
        System.out.format("Your name: %s and id is %d\n",name,id);
    }
    abstract public double calculateSalary();
}

class FullTimeEmployee extends Colleague{
    private double monthlySalary;
    FullTimeEmployee(String name, int id,double monthlySalary){
        super(name,id);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}

class PartTimeEmployee extends Colleague{
    private double hourlyRate;
    private int hoursWorked;

    PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked){
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public  double calculateSalary(){
        return hoursWorked * hourlyRate;
    }

}

public class JavaCWH21 {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("Simran",4065,56000);
        fte.displayInfo();
        System.out.println("My age: "+fte.myAge);
        fte.myAge = 26;
        System.out.println("My age: "+fte.myAge);
        System.out.println(fte.calculateSalary());

        PartTimeEmployee pte = new PartTimeEmployee("Mithun",4066,3000,9);
        pte.displayInfo();
        System.out.println(pte.calculateSalary());
        System.out.println("My age: "+fte.myAge);
    }
}


//Abstract classes are useful when:

//You want to define a common framework for a group of related classes.
//Some methods should be shared, while others need to be customized by subclasses.
//You don’t want anyone to create an object of the base class directly because it’s too generic or incomplete.