package Data_Structure.Maths;

public class RangeXOR {
    public static void main(String[] args) {
        // range of XOR a,b = xor(b) ^ xor(a-1)
        int a = 3;
        int b = 9;

        int ans = xor(b) ^ xor(a-1);
        System.out.println(ans);
        // For checking because this method has drawback of Time limit
        int ans2 =0;
        for (int i = a; i <=b ; i++) {
            ans2^= i;
        }
        System.out.println(ans2);
    }

    private static int xor(int a) {
        if (a % 4==0){
            return a;
        }
        if (a % 4==1){
            return 1;
        }
        if (a % 4==2){
            return a+1;
        }
        return 0;

    }
}
