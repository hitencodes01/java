package Assignment02;

import java.util.Scanner;

public class BinarySearch {
    Scanner ac = new Scanner(System.in);
    public boolean  binaryResult(int n){
        int [] arr = new int[10];
        for(int i = 0 ; i < 10 ; i++){
            arr[i] = ac.nextInt();
        }
        int low = 0;
        int i = 0;
        boolean result = false;
        int high = arr.length-1;
        int mid = (low+high)/2;
        while(low<=high){
        if(arr[mid] == n){
            result = true ;
            System.out.println("ok "+mid);
            break;
        }
        else{
            if(n<arr[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter to search : ");
        int toSearch = sc.nextInt();
        BinarySearch bs = new BinarySearch();
        // boolean endResult = bs.binaryResult(toSearch);
        if(bs.binaryResult(toSearch)){
            System.out.println("find");
        }

    }
}
