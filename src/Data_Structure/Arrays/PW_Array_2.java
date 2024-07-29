package Data_Structure;

import java.util.Arrays;
import java.util.Scanner;


public class PW_Array_2 {

      static int[] ArrayLastandFirst(int[] arr){
          Arrays.sort(arr);
          int [] ans = {arr[0],arr[arr.length-1]};
          return ans;
      }

      // Count no of Element Strictly greater than value of x
      static void GreaterThanX(int arr[],int x){
          int count = 0;
          for (int i = 0; i < arr.length; i++) {
              if (arr[i]>x){
                  count ++;
              }
          }
          System.out.println(count);
      }

      // Array is Sorted or not

    static boolean SortedorNot(int arr[]){
         boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<arr[i-1]){
                check = false;
                break;
            }
        }
       return check;
    }

     // last Occurences of element in Array
    static void lastOccurences(int arr[],int x){
        int lastindex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x){
                lastindex = i;
            }
        }
        System.out.println(lastindex);
    }

    // no of Occurences of element in Array
    static  void CountOccurences(int arr [], int x){
        int count = 0;
        for (int j : arr) {
            if (j == x) {
                count++;
            }
        }
        System.out.println(count);
    }

    static void PrintArray(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int arr[] = new int[5];
        int arr [] = {1,3 , 4 ,5,6};
        System.out.println("Original Array arr");
        PrintArray(arr);

        int [] arr_2 = arr;
        System.out.println("Copied Array of arr");
//        PrintArray(arr_2);
//        arr_2[1]= 7;
//        arr_2[4]=10;
//        System.out.println("Original arr after changing arr_2 ");
//        PrintArray(arr);
//        System.out.println("copied arr after changing arr_2 ");
//        PrintArray(arr_2);
//
//        // From New Feature
//        int [] arr_3 = arr.clone();
//        PrintArray(arr_3);
//        arr_3[1] = 56;
//        arr_3[4]= 30;
//        System.out.println("After Change");
//        PrintArray(arr);
//        System.out.println("arr_3");
//        PrintArray(arr_3);

        //CopyOf feature
        int []arr_4 = Arrays.copyOf(arr,arr.length);
        PrintArray(arr_4);
        System.out.println("CopyOfRange");
        //CopyOfRange
        int []arr_5 = Arrays.copyOfRange(arr,0,4);
        PrintArray(arr_5);

        int Arr[] = {1, 20 , 56 , 56, 30 ,26};
        CountOccurences(Arr,30);

        System.out.println(" last Occurences of element in Array");
        lastOccurences(Arr,56);

        System.out.println("Count no of Element Strictly greater than value of x");
        GreaterThanX(Arr,56);

        System.out.println(" Count no of Element Strictly greater than value of x "+SortedorNot(Arr));
        int [] ans = ArrayLastandFirst(Arr);
        System.out.println("Smallest "+ans[0]);
        System.out.println("Largest"+ans[1]);

    }

}
