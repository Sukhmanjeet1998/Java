package SmartPhone;
import calc.Calculator;

class Device1 extends Calculator {
    void Calculator(){
        System.out.println(proInt);
//        System.out.println(defInt);
        System.out.println(pubInt);
    }
}

public class SmartPhoneDevice {
    public static void main(String[] args) {
        Device1 d1 = new Device1();
    }
}
