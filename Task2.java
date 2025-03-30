class Shape{
    void display(){
        System.out.println("This is a Shape");
    }
}
class Circle extends Shape{
    void display(){
        super.display();
        System.out.println("This is a circle");
    }
}
public class Task2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
    }
}
