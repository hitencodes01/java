package DSA;
// You are given an array arr[]. Your task is to count the number of even and odd elements. Return first odd count then even count.


public class CountOddEven {
    public int [] count(int [] arr){
       int  even = 0;
       int  odd = 0;
        for(int num:arr){
            if(num%2==0){
                even = even + 1;
            }
            else{
                odd = odd + 1;
            }
        }
        return new int[]{odd,even};
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        CountOddEven obj = new CountOddEven();
        int [] result = obj.count(arr);
        System.out.println("Odd count: "+result[0]);
        System.out.println("Even count: "+result[1]);
    }

}
