package question;
// Given an array, the task is to find average of that array. Average is the sum of array elements divided by the number of elements.

public class AverageOfArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        // int [] arr = {5, 3, 6, 7, 5, 3};
        int sum = 0 ;
        for(int num : arr){
            sum += num;
        }
        double length = arr.length;
        double avg = sum/length;
        System.out.format("%.4f", avg);

    }
}
