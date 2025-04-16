
import java.util.Scanner;

class FindMin {

    int[] arr;

    public FindMin(int[] arr) {
        this.arr = arr;
    }

    public int find() {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}

class FindMax {

    public int find(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

public class Min_Max {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.print("enter the size of the array : ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("enter in array : ");
                arr[i] = sc.nextInt();
            }
            FindMax max = new FindMax();
            System.out.println(max.find(arr));
            FindMin min = new FindMin(arr);
            System.out.println(min.find());
            sc.close();
        }
    }
}
