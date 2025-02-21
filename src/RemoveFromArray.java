public class RemoveFromArray {
    public int[] delete(int [] arr , int element){
        int desiredToRemove = element;
        int count =0;
        for (int i =0 ; i < arr.length ; i++){
            if(arr[i] == desiredToRemove){
                count++;
            }
        }
        if(count == 0){
            return arr ;
        }
        int[] newArr = new int[arr.length - count];
        int index = 0;
        for(int i =0 ; i<arr.length ; i++){
            if (arr[i] != desiredToRemove){
                newArr[index] = arr[i];
                index++;
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        RemoveFromArray rm = new RemoveFromArray();
        int[] x =  rm.delete(arr,4);
        for(int i = 0 ; i < x.length ; i++){
            System.out.println(x[i]);
        }
    }
}
