interface Area{
    double pi = 3.14;
    double compute(double x , double y);
}
class Shape_Rectangele implements Area{
    @Override
    public double compute(double x , double y){
        // System.out.println("area of rectangle : " + x*y);
        return x*y;
    }
}
class Shape_Circle implements Area{
    @Override
    public double compute(double x, double y){
        // System.out.println("area of circle : " + pi*x*x);
        return pi*x*x;
    }
}

public class Interface_Sols {
    public static void main(String[] args) {
        Shape_Rectangele sr = new Shape_Rectangele();
        System.out.println(sr.compute(3, 4));
        Shape_Circle sc = new Shape_Circle();
        System.out.printf("%f0.6",(sc.compute(3, 4)));

    }
}
