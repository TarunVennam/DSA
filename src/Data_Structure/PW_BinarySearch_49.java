package Data_Structure;

import java.util.Scanner;

public class PW_BinarySearch_49 {
    static boolean BinarySearch(int[] arr, int target){
       int n = arr.length;
       int st = 0 , end = n-1;
       while (st<=end){
           int mid = (st+end)/2;
           if (target == arr[mid]) {
               return true;
           } else if (target < arr[mid]) {
               end = mid -1;
           } else {
               st = mid+1;
               }
           }
        return false;
    }

    static boolean RecursiveBinarySearch(int arr [],int st,int end, int target){
        if (st>end) return false;  // base case
        int mid = (st+end)/2;
        if(target==arr[mid]){
            return true;
        } else if (target < arr[mid]) {
            return RecursiveBinarySearch(arr, st, mid-1, target);  // SUBProblems
        }else {
            return RecursiveBinarySearch(arr, mid +1, end, target);  // SUBProblems
        }
        /*
        Better Way to find Mid is
        Mid = st + (end-st)/2;
         */

    }
    public static void main(String[] args) {
        int arr [] = { 3, 23 , 30 , 45 , 50 ,78 ,88, 95,100};
//        System.out.println("Enter the Values to Search");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        System.out.println(BinarySearch(arr,5));
        int target = 0;
        while (target != 10){
            System.out.printf(" %d is exists in arr %b \n", target,RecursiveBinarySearch(arr,0, arr.length -1,target));
            target++;
        }
    }
}
