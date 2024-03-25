package Data_Structure;

import java.util.Arrays;

public class PW_21_Array {
     static int[] Rotate(int [] arr,int k){
         int n = arr.length;;
         k = k%n;
         int [] ans = new int[n];
         int j= 0;
         for (int i = n-k; i <n ; i++) {
             ans[j++] = arr[i];
         }
         for (int i = 0; i <n-k ; i++) {
             ans[j++] = arr[i];
         }
         return ans;
     }

     static int [] RotateInPlace(int [] arr,int k){
           int n = arr.length;
           k = k % n;
           ReverseForRatate(arr,0,n-k-1);
           ReverseForRatate(arr,n-k,n-1);
           ReverseForRatate(arr,0,n-1);
           return arr;
     }
     static void ReverseForRatate(int [] arr, int i, int j){
         while (i<j) {
             SwapInArray(arr, i, j);
             i++;
             j--;
         }
     }
    static int [] ReverseArray(int [] arr){
        int ans[] = new int[arr.length];
        int j = 0;
        for (int i = ans.length-1; i >=0 ; i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }
    static void PrintArray(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    static void Swap(int a, int b){
//        int temp = a;
        System.out.println("Orignal value of a and b before Swap");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Orignal value of a and b after Swap");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }
    static void SwapWithoutTemp(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Orignal value of a and b after Swap");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }

    static void ReverseArrayUsingSwap(int [] arr){
        int i =0 , j= arr.length-1;
        while (i<j) {
            SwapInArray(arr, i, j);
            i++;
            j--;
        }
    }
    static void SwapInArray(int []arr, int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        int arr[] = {1,2,3,4,5,6};
//        Swap(a,b);
//        SwapWithoutTemp(a,b);
//        int [] ans = ReverseArray(arr);
//        PrintArray(ans);
//        System.out.println("Reverse Array Using Swap Method");
//       ReverseArrayUsingSwap(arr);
//       PrintArray(arr);
        System.out.println("Rotating Array");
       int [] Rotate = Rotate(arr,2);
       PrintArray(Rotate);
       int [] RotateInPlace=  RotateInPlace(arr,10);
        PrintArray(RotateInPlace);
    }
}
