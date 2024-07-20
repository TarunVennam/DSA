package Data_Structure.Kunal_Recursion.Level_1;

public class sum_of_digits {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(sumofdigits(n));

    }
    static int sumofdigits(int n){
        if (n==0){
            return 0;
        }
        return (n%10 +sumofdigits(n/10));
    }
}
