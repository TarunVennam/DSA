package Data_Structure;

import java.util.Scanner;


public class Recursion {
    // Natural number from n to 1
    static void PrintDecrement(int n){
        if (n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        PrintDecrement(n-1);
    }
    static void PrintIncreament(int n){
        if (n==1){
            System.out.println(1);
            return;
        }
        PrintIncreament(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//       PrintIncreament(n);
        PrintDecrement(n);
    }
}
