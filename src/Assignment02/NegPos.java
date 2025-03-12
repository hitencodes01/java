package Assignment02;

import myProject.InputArray;

public class NegPos {

    public static void main(String[] args) {
        InputArray ia = new InputArray();
        System.out.println("enter positive and negative number");
        int [] arr = ia.getInput(10);
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]<0){
                if(arr[i-1]>0){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
