public class GetterSetter {

    static class Employee{
        private int empId;
        private float empSalary;

        void setId(int id){
            empId = id;
        }
        void setSalary(float salary){
            empSalary = salary;
        }
        int getId(){
            return empId;
        }
        float getSalary(){
            return empSalary;
        }
    }
    public static void main(String[] args) {
        Employee hiten = new Employee();
        hiten.setId(001);
        hiten.setSalary(69000.98f);
        System.out.println(hiten.getId());
        System.out.println(hiten.getSalary());
    }
}
