package Data_Structure.Maths;

public class noOfDigits {
    // Kunal Question no 10
    public static void main(String[] args) {
        int n = 3568;
        int b = 10;
        int ans = (int) (Math.log(n)/Math.log(b) )+ 1;
        System.out.println(ans);
    }
}
