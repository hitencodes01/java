package Assignment01;

import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {5,7,9,11,15,20,30,45,89,97};
        System.out.print("enter element to search in array : ");
        int n = sc.nextInt();
        boolean let = false;
        for(int i = 0 ; i< arr.length ; i++){
            if (arr[i] == n){
                System.out.printf("Element %d found at %d index",n , i);
                let = true;
            }
        }
        if(let == false){
            System.out.printf("the %d element does not found",n);
        }
    }
}
