package Data_Structure;

import java.util.Scanner;

public class PW_20_Array {
    static int pairSum(int arr[],int target){
        int ans= 0;
        for (int i = 0; i <arr.length ; i++) {// first number
            for (int j = i+1; j <arr.length ; j++) {//Second number
                if (arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }
    static int tripletSum(int arr[] ,int target){
        int ans= 0;
        for (int i = 0; i <arr.length ; i++) {// first number
            for (int j = i+1; j <arr.length ; j++) {//Second number
                for (int k = j+1; k <arr.length ; k++) {
                    if (arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    static int uniqueElement(int arr[]){

        for (int i = 0; i <arr.length ; i++) {
            for (int j =i+1; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    arr[i] =-1;
                    arr[j]=-1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>0){
                ans = arr[i];
            }
        }
        return ans;
    }

    static int findMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static int findSecondMax(int arr[]){
        int max = findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
      int SecondMax= findMax(arr);
        return SecondMax;
    }
    static int firstrepeatedElement(int arr[]){
        int ans = -1;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return ans;
    }  static int lastrepeatedElement(int arr[]){
        int ans = -1;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    ans = arr[i];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
//        int arr[] = {1,3, 4,7, 6};
        int arr1[] = {1,2,3,4,2,1,3};
//        System.out.println(pairSum(arr,8));
//        System.out.println("Sum of Triple");
//        System.out.println(tripletSum(arr,11));
//        System.out.println("Unique Element in Array");
//        System.out.println(uniqueElement(arr1));
        System.out.println("Finding Max Element in Array");
        System.out.println(findMax(arr));
        System.out.println("Finding Second Max Element in Array");
        System.out.println(findSecondMax(arr));
        System.out.println("First Repeated Element in Array");
        System.out.println(firstrepeatedElement(arr));
        System.out.println("Last Repeated Element in Array");
        System.out.println(lastrepeatedElement(arr));


    }
}
