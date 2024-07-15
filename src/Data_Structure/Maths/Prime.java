package Data_Structure.Maths;

public class Prime {
    public static void main(String[] args) {
       int n = 20;
        for (int i = 1; i <=n ; i++) {
//            System.out.println(i + " " + inprime(i));
            if (inprime(i)==true) {
                System.out.println(i);
            }
        }

    }
    static boolean inprime(int n){
        if (n<=1){
            return false;
        }
        int C = 2;
        while (C * C <=n){
            if (n% C ==0){
                return false;
            }
            C++;
        }
        return true;
    }
}
