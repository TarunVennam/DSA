package Data_Structure.Kunal_Recursion.Level_1;

public class Nos_1toN {
    public static void main(String[] args) {
        fun(10);

    }
    static void fun(int n){
        if (n==0){
            return;
        }
        fun(n-1);
        System.out.print(n+" ");
    }
}
