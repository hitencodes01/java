package Assignment1;
import java.util.Scanner;

public class Task3 {
    public static int sino = 0;
    public void discount(){
        sino = sino + 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name : ");
        String name = sc.nextLine();
        System.out.print("enter ticket amount : ");
        int amount = sc.nextInt();
        if(amount>70000){
            int dis = 18;
            calculate(name,sino,amount,dis);
        }
        else if(amount > 55001 ){
            int dis = 16;
             calculate(name,sino,amount,dis);
        }
        else if( amount > 35001){
            int dis = 12;
             calculate(name,sino,amount,dis);
        }
        else if(amount > 25001){
            int dis = 10;
             calculate(name,sino,amount,dis);
        }
        else{
            int dis = 2;
             calculate(name,sino,amount,dis);
        }
    }
    public void calculate(String name, int sino , int amount , int dis){
        double netAmount = amount - (amount/100)*dis;
        System.out.printf("SI.no\tName\tTicket Charges\tDiscount\tNet Amount\n");
        System.out.printf("%d\t%s\t%d\t\t%d\t\t%.2f\n\n",sino,name,amount,dis,netAmount);
    }
    public static void main(String[] args) {
        Task3 t1 = new Task3();
        Task3 t2 = new Task3();
        Task3 t3 = new Task3();
        t1.discount();
        t2.discount();
        t3.discount();
    }
}
