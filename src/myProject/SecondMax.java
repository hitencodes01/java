package myProject;

import java.util.Scanner;

public class SecondMax {
    public int secondMaxElement(int [] arr){
        int secondMaxValue = arr[0];
        for(int i = 0; i< arr.length;i++){
            if(arr[i]>secondMaxValue){
                secondMaxValue = arr[i];
            }
        }
        return secondMaxValue;
    }

    public static void main(String [] args){
        SecondMax sm = new SecondMax();
        Scanner sc = new Scanner(System.in);
        RemoveFromArray rm = new RemoveFromArray();
        InputArray in = new InputArray();
        System.out.print("enter the sixe of array : ");
        int x = sc.nextInt();
        // int [] arr = sm.takeInput(x);
        int [] arr = in.getInput(x);
        int y = sm.secondMaxElement(arr);
        int [] newArr = rm.delete(arr, y);
        int z  = sm.secondMaxElement(newArr);
        System.out.println(z);
        sc.close();
    }
}
