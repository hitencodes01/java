package myProject;
public class Constructor {
    static class MyEmployees{
        private int id = 0;
        private String name = "";

        public MyEmployees(int empId , String empName){
            id = empId;
            name = empName;
        }
        // constructor overloading
        public MyEmployees(){
            id = 001;
            name = "xyz";
        }

        public int getId(){
            return id;
        }
        public String getName(){
            return name;
        }
    }
    public static void main(String[] args) {
        // MyEmployees hiten = new MyEmployees(1, "hiten");
        MyEmployees hiten = new MyEmployees();
        System.out.println(hiten.getId());
        System.out.println(hiten.getName());   
    }
}
