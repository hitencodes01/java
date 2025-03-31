// Using @Override Annotation (Ensuring correct overriding)

class Parent{
    // public void displayParent(){
    public void display(){
        System.out.println("I am the parent");
    }
}
class Child extends Parent{
    @Override
    public void display(){
        System.out.println("I am the child");
    }
}
public class Task7 {
    public static void main(String[] args) {
        Parent objP = new Parent();
        Child objC = new Child();
        objP.display();
        objC.display();
    }
}
