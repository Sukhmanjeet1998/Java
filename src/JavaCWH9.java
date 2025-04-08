// Constructor with getter setter
//class Subordinates{
//        private int empId;
//        private String empName;
//        private float empSalary;
//        private String empAddress;
//
//        public void setEmpId(int id){
//            this.empId = id;
//        }
//
//        public void setEmpName(String name){
//            this.empName = name;
//        }
//
//        public void setEmpSalary(float salary){
//            this.empSalary = salary;
//        }
//
//        public void setEmpAddress(String address){
//            this.empAddress = address;
//        }
//
//        public int getEmpId(){
//            return empId;
//        }
//
//        public String getEmpName(){
//            return empName;
//        }
//
//        public float getEmpSalary(){
//            return empSalary;
//        }
//
//        public String getEmpAddress(){
//            return empAddress;
//        }
//}

class Subordinates{
        private int empId;
        private String empName;
        private float empSalary;
        private String empAddress;

        public Subordinates(){
            empId = 0;
            empName = "Unknown";
            empSalary = 0.0f;
            empAddress = "Not Provided";
        }

        public Subordinates(int id){
            empId = id;
            empName = "Unknown";
            empSalary = 0.0f;
            empAddress = "Not Provided";
        }

        public Subordinates(String address){
            empId = 101;
            empName = "Unknown";
            empSalary = 0.0f;
            empAddress = address;
        }

        public Subordinates(int id, String name){
            empId = id;
            empName = name;
            empSalary = 0.0f;
            empAddress = "Not Provided";
        }

        public int getEmpId(){
            return empId;
        }
        public String getEmpName(){
            return empName;
        }
        public float getEmpSalary(){
            return empSalary;
        }
        public String getEmpAddress(){
            return empAddress;
        }

        public void getEmpInfo() {
            System.out.format("Hi my name is %s and my id is %d\n",empName,empId);
        }
}

public class JavaCWH9 {
    public static void main(String[] args) {
        Subordinates sb1 = new Subordinates();
        Subordinates sb2 = new Subordinates(215);
        Subordinates sb_2 = new Subordinates("Chandigarh");
        Subordinates sb3 = new Subordinates(1001,"Sukhmanjeet Singh");
        Subordinates sb4 = new Subordinates(1002,"Simranjeet Singh");
//        System.out.println(sb1.getEmpId());
//        System.out.println(sb1.getEmpId());
//        System.out.println(sb1.getEmpName());
//        System.out.println(sb1.getEmpSalary());
//        System.out.println(sb1.getEmpAddress());

//        System.out.println(sb2.getEmpId());

        sb3.getEmpInfo();
        sb4.getEmpInfo();
        System.out.println(sb_2.getEmpAddress());
        sb_2.getEmpInfo();
    }
}


