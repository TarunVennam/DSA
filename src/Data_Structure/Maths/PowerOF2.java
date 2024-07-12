package Data_Structure.Maths;

public class PowerOF2 {
    public static void main(String[] args) {
        int n = 100; // note fix for n =0
        boolean ans = (n & (n-1) )== 0;
        System.out.println(ans);
    }


}
