package myProject;
import java.util.Scanner;

public class Exercise{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("enter the marks of maths :");
            float a = sc.nextFloat();
            System.out.print("enter the marks of english :");
            float b = sc.nextFloat();
            System.out.print("enter the marks of hindi :");
            float c = sc.nextFloat();
            System.out.print("enter the marks of science :");
            float d = sc.nextFloat();
            System.out.print("enter the marks of sst :");
            float e = sc.nextFloat();
            float per = (a+b+c+d+e)/5;
            System.out.println("percentage = "+per+"%");
            System.out.println(String.format("percentage = %f", per));
        }
    }
}