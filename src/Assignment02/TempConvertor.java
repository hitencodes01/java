package Assignment02;

import java.util.Scanner;

public class TempConvertor {
    Scanner sc = new Scanner(System.in);
    public double  celToFaren(){
        System.out.print("enter temperature in celcius: ");
        double tempInCel = sc.nextDouble();
        double tempInFaren = (9/5.0)*(tempInCel + 32);
        return tempInFaren;
    }
    public double  farenToCel(){
        System.out.print("enter temperature in farenheit : ");
        double tempInFaren = sc.nextDouble();
        double tempInCel = (5/9.0)*(tempInFaren - 32);
        return tempInCel;
    }
    public static void main(String[] args) {
        TempConvertor tc = new TempConvertor();
        System.out.printf("the temperature in farenheit is %d\n",(int)tc.celToFaren());  
        System.out.printf("the temperature in celsius is %d\n",(int)tc.farenToCel());  
    }

}
