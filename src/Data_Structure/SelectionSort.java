package Data_Structure;

public class SelectionSort {
    static void SelectionSorting(int arr[]){
        int n = arr.length;
        for (int i = 0; i <n-1 ; i++) {
            int min_index = i;
            for (int j = i+1; j <n ; j++) {
                if (arr[j]< arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[i];
           arr[i] = arr[min_index];
           arr[min_index] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] ={4,5,68,0,3};

        SelectionSorting(arr);

        for (int i :arr){
            System.out.print(i +" ");
        }
    }
}
