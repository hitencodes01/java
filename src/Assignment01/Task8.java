package Assignment01;

import java.util.Scanner;

public class Task8{
    int [] arr = new int[15];
    Scanner sc = new Scanner(System.in);
    public int [] inputArray(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter in array");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public int [] sort(int [] arr){
        int temp;
        for(int i = 0 ; i < arr.length - 1 ; i++){
            for (int j = 0; j < arr.length -1 - i ; j++) {   
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Task8 t = new Task8();
        int [] arr = t.inputArray();
        int [] newarr = t .sort(arr);
        for(int num : newarr){
            System.out.println(num);
        }
    }
}
