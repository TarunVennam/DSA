package Data_Structure.Kunal_Recursion.Level_2;

public class sortedArray {
    public static void main(String[] args) {
        // Array is sorted or not
        int [] arr = {1,3,4,6,7,12,20};
        System.out.println(sortedornot(arr,0));
    }
    static boolean sortedornot(int[] arr , int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] <= arr[index+1] && sortedornot(arr,index+1);
    }
}
