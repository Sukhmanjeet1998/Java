// Implement Interface Inheritance and Class Inheritance in one
interface Camera2{
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
interface Wifi2{
    void connectToNetwork(String network);
    String[] getNetwork();
}
class MyCellPhone2{
    public void callNumber(Long phoneNumber){
        System.out.println("Calling: "+phoneNumber);
    }
    public void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements Camera2,Wifi2{
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
    public void myClassMethod(){
        System.out.println("Hello this is class name MySmartPhone2!");
    }

}

public class JavaCWH24 {
    public static void main(String[] args) {
        Camera2 cam = new MySmartPhone2();
        cam.record4KVideo();

    }
}
