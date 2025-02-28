package Assignment01;

import java.util.Scanner;

public class Task9 {

    public boolean pronic(int a) {
        boolean x = false;
       for(int i = 1 ; i <= a ; i++){
        if(i*(i+1)==a){
            x = true;
        }
       }
       return x;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){  
            System.out.print("enter number to check is it pronic or not ? : ");
            int n = sc.nextInt();
            Task9 t9 = new Task9();
            boolean x = t9.pronic(n);
            if(x==true){System.out.println("number is pronic " + n);}
            else{System.out.println("not pronic");}
            sc.close();
        }
    }
}
