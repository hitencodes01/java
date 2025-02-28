package Assignment01;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char [] arr = str.toCharArray();
        for(char ch : arr){
            // System.out.println(ch);
            if(ch==' '){
                int x = str.indexOf(ch);
                System.out.println(x);
            }
        }
        }
    }

