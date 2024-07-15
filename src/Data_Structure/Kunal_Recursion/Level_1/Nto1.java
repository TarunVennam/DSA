package Data_Structure.Kunal_Recursion.Level_1;

public class Nto1 {
    public static void main(String[] args) {
        fun(20);

    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        fun(n-1);
    }
}
