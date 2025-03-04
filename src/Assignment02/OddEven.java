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
    public void display(){
        System.out.println("sum of even numbers = "+even);
        System.out.println("sum of odd numbers = "+odd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputArray ir = new InputArray();
        int [] arr = ir.getInput(20);
        OddEven oe = new OddEven();
        oe.toCalculate(arr);
        oe.display();
    }
}
