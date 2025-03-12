package Assignment02;

import java.util.Scanner;

public class EquableTriangle {
    Scanner sc = new Scanner(System.in);
    public void isEquable(){
        System.out.print("enter sides of triangle : ");
        int  perimeter;
        int area;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        perimeter = a+b+c;
        int l = Math.max(a, Math.max(b, c));
        if(a<l && b<l){
            area = (a*b)/2;
            if(area==perimeter){
                System.out.println("equiable");
            }
        }
    }
    
    public static void main(String[] args) {
     EquableTriangle et = new EquableTriangle();
     et.isEquable();   
    }
}
