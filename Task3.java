class Animal{
    public Animal() {
        System.out.println("Animal constructor called");
    }   
}
class Dog extends Animal{
    public Dog() {
        System.out.println("Dog constructor called");
    }  
}
public class Task3 {
    public static void main(String[] args) {
        Dog labrador = new Dog();
    }
}
