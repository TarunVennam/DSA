package Data_Structure.Kunal_Recursion.Recursive_Patterns;

import java.util.Arrays;

public class Triangle_1 {
    public static void main(String[] args) {
//        RPatterns(5,0);
          int[] arr = {4,2,89,3};
          selectionsort(arr, arr.length, 0,0);
        System.out.println(Arrays.toString(arr));

    }
    static void RPatterns(int row,int column){
        if(row==0){
            return;
        }

        if (column<row){
            System.out.print("* ");
            RPatterns(row,column+1);
        }else {
            System.out.println();
            RPatterns(row-1,0);
        }
    }
    static void selectionsort(int[] arr,int row,int column, int max){
        if(row==0){
            return;
        }
        if (column<row){
            if (arr[column]>arr[max]){
             selectionsort(arr,row,column+1,column);
            }
            else {
                selectionsort(arr,row,column+1,max);
            }
        }else {
            int temp =arr[max];
            arr[max] = arr[row-1];
            arr[row-1] = temp;
            selectionsort(arr,row-1,0,0);
        }
    }
    static void bubble(int[] arr,int row,int column){
        if(row==0){
            return;
        }

        if (column<row){
            if (arr[column]>arr[column+1]){
                int temp = arr[column];
                arr[column] = arr[column+1];
                arr[column+1] = temp;
            }
            bubble(arr,row,column+1);
        }else {
            bubble(arr,row-1,0);
        }
    }
}
