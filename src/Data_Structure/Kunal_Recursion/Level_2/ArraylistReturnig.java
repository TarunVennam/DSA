package Data_Structure.Kunal_Recursion.Level_2;

import java.util.ArrayList;

public class ArraylistReturnig {
    public static void main(String[] args) {
        int [] arr = {1,3,4,20,6,7,20,12,20};
        System.out.println(SearchAllIndex(arr,20,0,new ArrayList<>()));
    }
    static ArrayList<Integer> SearchAllIndex(int[] arr, int target, int index,ArrayList<Integer> list){
        if (index== arr.length) {
            return list;
        }
        if (arr[index]==target ){
            list.add(index);
        }
            return SearchAllIndex(arr, target, index + 1, list);
    }
}
