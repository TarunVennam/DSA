package Data_Structure;

public class Insertionsort {
    static void InsertionSort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j =i;
            while (j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

    }
    static void InsertionSort2(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j >0 && arr[j]<arr[j-1]; j--) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {8,79 ,6,35,45,20,5};

//        InsertionSort(arr);
        InsertionSort2(arr);

        for (int i :arr){
            System.out.printf(i+" ");
        }

    }
}
