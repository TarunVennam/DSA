package Data_Structure.Kunal_Recursion.Level_2;

import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int [] arr = {1,3,4,20,6,7,12,20};
        System.out.println(Search(arr,20,0));
        System.out.println(SearchIndex(arr,20,0));
        System.out.println(SearchIndexLast(arr,20, arr.length-1));
        SearchAllIndex(arr,20,0);
        System.out.println(list);
    }
    static boolean Search(int[] arr,int target, int index){
        if (index==arr.length) {
            return false;
        }
        return arr[index]==target || Search(arr,target,index+1);
    }
    static int SearchIndex(int[] arr,int target, int index){
        if (index==arr.length) {
            return -1;
        }
        if (arr[index]==target ){
            return index;
        }
        else {
           return SearchIndex(arr,target,index+1);
        }
    }
    static int SearchIndexLast(int[] arr,int target, int index){
        if (index==0) {
            return -1;
        }
        if (arr[index]==target ){
            return index;
        }
        else {
            return SearchIndexLast(arr,target,index-1);
        }
    }
    // For Multiple occurence of target
    static ArrayList<Integer> list  = new ArrayList<>();
    static void SearchAllIndex(int[] arr,int target, int index){
        if (index== arr.length) {
            return;
        }
        if (arr[index]==target ){
            list.add(index);
        }
         SearchAllIndex(arr,target,index+1);
    }
}
