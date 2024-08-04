package Data_Structure.Maths.Practice;

public class ArmStrong {
    public static void main(String[] args) {
        System.out.println(armstrong(371));
    }
    static boolean armstrong(int n){
        int sum = 0;
        int temp = n;
        while (temp>0){
            int digit = temp%10;
            sum = sum +(digit*digit*digit);
            temp = temp/10;
        }
        return sum==n;
    }
}
