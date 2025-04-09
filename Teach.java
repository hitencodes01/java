abstract class Mammals{
    public abstract void Feeding();
}
class Human extends Mammals{
    @Override
    public void Feeding(){
        System.out.println("feeding their babies");
    }
}
public class Teach {
    public static void main(String[] args) {
        Human h = new Human();
        h.Feeding();
    }
}
