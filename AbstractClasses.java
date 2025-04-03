abstract class Animal{
    String name;
    Animal(String name){
        this.name = name;
    }
    public abstract void makeSound();
    public void sleeping(){
        System.out.println("hmmmmm....sleeping");
    }
}
class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println("barking");
    }
}
class Cat extends Animal{
    Cat(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println("meowing");
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        Dog maggie = new Dog("maggie");
        maggie.makeSound();
        System.out.println(maggie.name);
        maggie.sleeping();
        Cat fluffy = new Cat("fluffy");
        fluffy.makeSound();
        System.out.println(fluffy.name);
        fluffy.sleeping();
    }
}
