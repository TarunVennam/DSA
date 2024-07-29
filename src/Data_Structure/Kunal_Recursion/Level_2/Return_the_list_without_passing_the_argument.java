package Data_Structure.Kunal_Recursion.Level_2;

import java.util.ArrayList;

public class Return_the_list_without_passing_the_argument {
    public static void main(String[] args) {
        int [] arr = {1,3,4,20,6,7,20,12,20};
        System.out.println(Arraysearch(arr,20,0));

    }
    static ArrayList<Integer> Arraysearch(int[] arr, int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index==arr.length){
            return list;
        }
        // this will contains answer for that function call only
        if (arr[index]==target ){
            list.add(index);
        }
        ArrayList<Integer> ansFromAboveCall= Arraysearch(arr,target,index+1);
        list.addAll(ansFromAboveCall);
        return list;
    }
}
