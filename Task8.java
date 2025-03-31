// Calling Parent Method using super (Avoiding method hiding)

class Parent{
    public void display(){
        System.out.println("I am the parent");
    }
}
class Child extends Parent{
    @Override
    public void display(){
        super.display();
        System.out.println("I am the child");
    }
}
public class Task8 {
    public static void main(String[] args) {
        Child objC = new Child();
        objC.display();
    }
}
