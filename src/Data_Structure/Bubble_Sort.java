package Data_Structure;

public class Bubble_Sort {
    static  void bubbleSort(int [] a){ // Increasing Order
        int n = a.length;

        for (int i = 0; i <n ; i++) {
            boolean Flag = false;
            for (int j = 0; j <n-i-1 ; j++) {
                if (a[j]> a[j+1]){
                    int temp = a[j];
                    a[j] =  a[j+1];
                    a[j+1] = temp;
                    Flag = true;
                }
                if (Flag == false){
                    return;
                }
            }
        }
    }
//    static  void bubbleSortDecreasing(int [] a){ // Decreasing Order
//        int n = a.length;
//        for (int i = n; i <0 ; i--) {
//            boolean Flag = false;
//            for (int j = n; j <i+1 ; j--) {
//                if (a[j]> a[j+1]){
//                    int temp = a[j];
//                    a[j] =  a[j+1];
//                    a[j+1] = temp;
//                    Flag = true;
//                }
//                if (Flag == false){
//                    return;
//                }
//            }
//        }
//    }
    public static void main(String[] args) {
        int a[] = {6,4,9,3,8};
        int b [] = {2,1 ,3 ,4 ,5};

//        bubbleSort(a);
//        for (int i : a) {
//            System.out.print(i + " ");
//        }
        bubbleSort(b);
        for (int i : b) {
            System.out.print(i + " ");
        }
//        bubbleSortDecreasing(a);
//        for (int i : a) {
//            System.out.print(i + " ");
//        }
    }
}
