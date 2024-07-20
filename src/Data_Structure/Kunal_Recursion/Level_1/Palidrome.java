package Data_Structure.Kunal_Recursion.Level_1;

public class Palidrome {
    public static void main(String[] args) {
//        System.out.println(ispalidrome(123321));

    }

    static int sum = 0;
    static void rev(int n){
        if (n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        rev(n/10);
    }
}
