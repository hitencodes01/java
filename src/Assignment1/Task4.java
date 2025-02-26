package Assignment1;

import java.util.Scanner;

public class Task4 {
    public boolean  prime(int num){
        boolean x = true;
        if(num<2){
            x = false;
            return x;
        }
        else{
            for(int i= 2 ; i < num ; i++){
                if(num%i==0){
                    x = false;
                    return x;
                }
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task4 tt = new Task4();
        System.out.println("Enter the number to check it is prime or automorphic: ");
        int num = sc.nextInt();
        boolean check = tt.prime(num);
        if(check){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
