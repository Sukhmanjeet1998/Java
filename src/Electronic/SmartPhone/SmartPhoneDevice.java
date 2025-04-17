package Electronic.SmartPhone;
import Electronic.calc.Calculator;


class Device1 extends Calculator {
    void showCalculator(){
        System.out.println("ProInt: " + proInt);
//        System.out.println(defaultInt);
        System.out.println("PubInt: " + pubInt);
    }
}

public class SmartPhoneDevice {
    public static void main(String[] args) {
        Device1 d1 = new Device1();
        d1.showCalculator();
    }
}
