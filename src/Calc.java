
import java.util.Scanner;

class TwoOperand {

    int a;
    int b;
}

class Add extends TwoOperand {

    int toAdd() {
        return this.a + this.b;
    }
}

class Substract extends TwoOperand {

    int toSubstract() {
        return this.a - this.b;
    }
}

public class Calc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Add c = new Add();
        Substract d = new Substract();
        System.out.println("enter a and b");
        c.a = sc.nextInt();
        c.b = sc.nextInt();
        System.out.println(c.toAdd());
        System.out.println("enter a and b");
        d.a = sc.nextInt();
        d.b = sc.nextInt();
        System.out.println(d.toSubstract());
        sc.close();
    }
}
