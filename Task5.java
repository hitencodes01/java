class Parent{
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
public class Task5 {
    public static void main(String[] args) {
        Parent objP = new Parent();
        Child objC = new Child();
        objP.display();
        objC.display();
    }
}
