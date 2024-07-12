package Data_Structure.TwoPointer;

public class SortArray {
    static void SwapInArray(int []arr, int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }
    static void ZerosAndOnes(int[] arr){
        int n = arr.length;
        int left = 0, right = n-1;
        while (left<right){
            if(arr[left]== 1 && arr[right]==0){
                SwapInArray(arr,left,right);
                left++;
                right--;
            }
            if (arr[left]==0){
                left++;
            }
            if (arr[right]==1) right--;
        }
    }
    static void printArray(int [] arr){
        for (int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr ={1,0,1,0,1,0,1,0,1,0};
        System.out.println("Orignal Array");
        printArray(arr);
        ZerosAndOnes(arr);
        System.out.println("Sorted Array");
        printArray(arr);
    }
}
