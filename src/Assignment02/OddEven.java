package Assignment02;

import java.util.Scanner;
import myProject.InputArray;

public class OddEven {
    int even = 0;
    int odd = 0 ;
    public void toCalculate(int [] arr){
        for(int num : arr){
            if(num%2==0){
                even = even + num;
            }
            else{
                odd = odd + num;
            }
        }
    }
    public void displaySum(){
        System.out.println("sum of even numbers = "+even);
        System.out.println("sum of odd numbers = "+odd);
    }
    int [] evenArr = new int[10];
    int [] oddArr = new int[10];
    int evenIndex = 0;
    int oddIndex = 0; 
    public void separate(int [] arr) {
        for(int num : arr){
            if(num%2==0){
                evenArr[evenIndex] = num;
                evenIndex++;
            }
            else{
                oddArr[oddIndex] = num ;
                oddIndex++;
            }
        }
    }
    public void display(){
        System.out.println("even array");
        for(int num : evenArr){
            System.out.printf("%d\t",num);
        }
        System.out.println();
        System.out.println("odd array");
        for(int num : oddArr){
            System.out.printf("%d\t",num);
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            InputArray ir = new InputArray();
            int [] arr = ir.getInput(20);
            OddEven oe = new OddEven();
            oe.toCalculate(arr);
            oe.displaySum();
            oe.separate(arr);
            oe.display();
            sc.close();
        }
    }
}
