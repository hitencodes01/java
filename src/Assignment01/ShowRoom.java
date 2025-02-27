package Assignment01;

import java.util.Scanner;

public class ShowRoom {
    String name;
    long mobNo;
    double cost , dis , amount;
    public ShowRoom(double cost){
       this.cost = cost;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter customer name : ");
        name = sc.next();
        System.out.print("enter customer mob No : ");
        mobNo = sc.nextLong();
        sc.close();
    }
    public double calculate(){
        if(cost<=10000){
            amount = calculateDiscount(cost,5);
        }
        else if(cost>10000 && cost >= 20000){
            amount = calculateDiscount(cost,10);
        }
        else if(cost>20000 && cost >= 35000){
            amount = calculateDiscount(cost,15);
        }
        else if(cost > 35000){
            amount = calculateDiscount(cost,20);
        }
        return amount;
    }
    public double calculateDiscount(double cost , double dis){
        this.dis = dis;
        return cost - (cost/100)*dis;
    }
    public void display(){
        System.out.println("following are customer information");
        System.out.printf("Mr/Mrs %s Mob No %d has to paid %.2f after %.0f%% discount",name,mobNo,amount,dis);
    }
    public static void main(String[] args) {
        ShowRoom sr = new ShowRoom(24000);
        sr.input();
        sr.calculate();
        sr.display();
    }
}
