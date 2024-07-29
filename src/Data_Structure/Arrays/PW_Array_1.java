package Data_Structure;

import java.util.Arrays;

class Array {


    void SearchinArray(){
        int arr[] ={ 3, 6,  89 , 69 , 99 ,34,69};
        int x = 69;
        int ans = -1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                ans = i;
             break;
            }
        }
        if (ans==-1){
            System.out.println("Not Found");
        }
        else System.out.println("Found "+x+" in "+ans+" this Index");
    }
    void Max(){
        int Maxarr[] ={ 3, 6,  89 , 69 , 99 ,34};
        int ans =0;
        for (int i=0 ; i<Maxarr.length;i++){
            if (Maxarr[i]>ans){
                ans = Maxarr[i];
            }
        }
        System.out.println("Max element"+ans);
    }
    void Multi(){
        int Arr[][] = {{1,2, 6 },{3,87,64},{ 6, 55, 99}, {86, 54, 78}};
        for (int i=0 ; i<Arr.length;i++){
            for (int j=0 ; j<Arr[i].length;j++){
                System.out.println(Arr[i][j]);
            }
        }
    }
    void  Sum (){
        int arr [] = { 2, 56 , 78 , 90 , 87};
        int sum = 0;
        for (int i = 0 ; i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}

public class PW_Array_1 {
    public static void main(String[] args) {
       int  []age = {55 , 4 ,5, 66, 6 };
        //Array literals
        int arr[] = {1 , 2, 3 , 5};
        for (int x : arr){
            System.out.println(x);
        }
        System.out.println("Hello World");
       Array obj = new Array();
         obj.Multi();
//        System.out.println(arr.length);
//        System.out.println(age.length);
//        System.out.println(Arrays.stream(arr).min());
//        System.out.println("Smallest element of Array"+Arrays.stream(age).min());
//        System.out.println("Sum of Array"+Arrays.stream(arr).sum());
        System.out.println("Sum");
        obj.Sum();
        obj.Max();
        System.out.println("Search in Index");
        obj.SearchinArray();
    }
}
