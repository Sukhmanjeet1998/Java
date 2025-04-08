// Access modifier (method / properties / class) with getter and setter
class Workforce{
//    int age;
//    String myName;
//    float salary;
    private int age;
    private String myName;
    private  float salary;
    public void setAge(int myAge){
        this.age = myAge;
    }
    public void setName(String name){
        this.myName = name;
    }
    public void setSalary(float mySalary){
        this.salary = mySalary;
    }

    public int getAge(){
        return  age;
    }
    public String getName(){
        return myName;
    }
    public float getSalary(){
        return salary;
    }

    public void myInfo(){
        System.out.format("Hi my name is %s and age is %d and salary is %.2f\n",myName,age,salary);
    }
}

public class JavaCWH7 {
    public static void main(String[] args) {
        Workforce wf1 = new Workforce();
//        wf1.myName = "Sukhmanjeet Singh"; //  to direct access to private properties getting error java: myName has private access in Workforce
//        wf1.age = 26;
//        wf1.salary = 26800.3859f;

        wf1.setName("Sukhmanjeet Singh");
        wf1.setAge(26);
        wf1.setSalary(33000.286f);
        wf1.myInfo();
        System.out.println(wf1.getName());


    }
}

//Why Getter and Setter.................................................................................................
// Control Over Data Access
// 1) With setters, you can add validations, such as ensuring salary is not negative
// 2) If you allow direct access (obj.salary = 5000;), any part of the program can modify it without restrictions.

//Data Encapsulation & Abstraction
// 1) By making fields private and providing public getter and setter methods, we hide the internal representation of the object.
// 2) This ensures that the internal data cannot be changed directly, reducing unintended modifications and maintaining data integrity.

//Flexibility & Maintainability
// 1) If in the future, the way salary is calculated changes (e.g., adding bonuses or deductions), you only need to modify the getter method instead of updating multiple places in your code.

//Read-Only or Write-Only Fields
// 1) If you don’t want a field to be modified, you can remove the setter, making it read-only.
// 2) Similarly, if you only want to set a value but not allow retrieval, you can make it write-only by removing the getter.

// Enhancing Debugging & Logging
// 1) You can add logging inside getters and setters to track changes:

// While you can directly access fields without getters and setters, using them provides better security, control, flexibility, and maintainability. That’s why using getter and setter methods is considered a best practice in Java. 🚀

//......................................................................................................................