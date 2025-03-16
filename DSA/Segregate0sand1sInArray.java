package DSA;
// You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array [Basically you have to sort the array]. Traverse array only once. 
public class Segregate0sand1sInArray {
    public int [] segregate(int [] arr){
        // int zeroIndices = 0;
        // int oneIndices = arr.length - 1; // Corrected initialization
        // for(int i = 0 ; i <= oneIndices ; i++){ // Traverse until oneIndices
        //     if(arr[i] == 0){
        //         arr[zeroIndices] = arr[i];
        //         zeroIndices += 1;
        //     }
        //     else if(arr[i] == 1){
        //         arr[oneIndices] = arr[i];
        //         oneIndices -= 1;
        //         i--; // Decrement i to recheck the swapped element
        //     }
        // }
        
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {0, 1, 0, 1, 0, 1, 0};
        Segregate0sand1sInArray s = new Segregate0sand1sInArray();
        int [] result = s.segregate(arr);
        for(int num : result){
            System.out.println(num);
        }
    }
}
