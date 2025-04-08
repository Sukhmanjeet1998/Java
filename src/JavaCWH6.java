// Getter Setter
// Don't make duplicate class in same package
class Employees{
    float salary;
    String name;
    public float getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setSalary(float s){
        salary = s;
    }
    public void info(){
        System.out.format("Hi my name is %s and my salary is %.2f\n",name,salary);
    }


}

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

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

public class JavaCWH6 {
    public static void main(String[] args) {
//        Employees hiSukh = new Employees();
//        hiSukh.setName("Sukhmanjeet Singh");  // by default no name set will reutrn null
//        System.out.println(hiSukh.getName());
//        hiSukh.setSalary(27000);
//        System.out.println(hiSukh.getSalary());
//        hiSukh.info();

//        Square s1 = new Square();
//        s1.side = 3;
//        System.out.println(s1.area());
//        System.out.println(s1.perimeter());


    }
}
