/*
class Employee{    //  Custom class
    int age;
    String name;
    float mySalary;
    public void message(){
        System.out.format("Hi my name is %s and my age is %d and my salary id %.3f\n",name,age,mySalary);
    }
}

public class JavaCWH5 {
//    public void print_message(){
//        System.out.println("Welcome!");
//    }
    public static void main(String[] args) {

//        Call without static keyword...................................................................................
//        JavaCWH5 c = new JavaCWH5();
//        c.print_message();
        Employee sukh = new Employee();
        sukh.age = 26;
        sukh.mySalary = 26500.689f;
        sukh.name = "Sukhmanjeet Singh";
        sukh.message();

        Employee simran = new Employee();
        simran.age = 31;
        simran.mySalary = 33500.799f;
        simran.name = "Simranjeet Singh";
        simran.message();

    }
}
*/