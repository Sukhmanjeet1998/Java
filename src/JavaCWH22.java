interface Camera{
    int shoot = 56;   // You can add properties in interface by default they are final
    void takeSnap();
    void recordVideo();
    default void record4KVideo(){
        System.out.println("Record 4K video...");
        greet();
    }
    private void greet(){
        System.out.println("Good evening");
    }

}
interface Wifi{
    void connectToNetwork(String network);
    String[] getNetwork();
}
class MyCellPhone{
    public void callNumber(int phoneNumber){
        System.out.println("Calling: "+phoneNumber);
    }
    public void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements Camera,Wifi{
    public void takeSnap(){
        System.out.println("Taking snap...");
    }
    public void recordVideo(){
        System.out.println("Taking snap...");
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to network: "+network);
    }
    public String[] getNetwork(){
        System.out.println("Getting List of network.");
        String[] networkLists = {"Vodafone", "Jio", "Airtel"};
        return networkLists;
    }
    @Override
    public void record4KVideo(){
        System.out.println("Take snap first, and then record in 4K!");
    }
}

public class JavaCWH22 {
    public static void main(String[] args) {
        MySmartPhone msp = new MySmartPhone();
        String[] arr = msp.getNetwork();
        for (String value : arr){
            System.out.println(value);
        }
        msp.record4KVideo();
        System.out.println(msp.shoot);
//        msp.shoot = 6; // you cannot modify the property value
//        System.out.println(msp.shoot);
    }
}
