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
public class Task6 {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
    }
}
// here we get the output as
// I am the child 
// beacuse Method resolution happens at runtime, not compile-time.
