package Data_Structure.Maths;

public class NoOfSet {
    // leetcode 191
    // Question no 14
    public static void main(String[] args) {
        int n = 45;
        System.out.println(setbit(n));
    }

    private static int setbit(int n) {
        int count = 0;
        while (n>0){
            count++;
            n -= (n&(-n));
//            n&= n-1;
        }
        return count;
    }
}
