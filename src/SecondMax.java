
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
    public int[] takeInput(int x){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[x];
        for(int i = 0; i< arr.length;i++){
            System.out.print("enter the value to initialised in array : ");
            arr[i] = sc.nextInt(); 
        }
        sc.close();
        return arr;
    }
    public static void main(String [] args){
        SecondMax sm = new SecondMax();
        Scanner sc = new Scanner(System.in);
        RemoveFromArray rm = new RemoveFromArray();
        System.out.print("enter the sixe of array : ");
        int x = sc.nextInt();
        int [] arr = sm.takeInput(x);
        int y = sm.secondMaxElement(arr);
        int [] newArr = rm.delete(arr, y);
        int z  = sm.secondMaxElement(newArr);
        System.out.println(z);
        sc.close();
    }
}
