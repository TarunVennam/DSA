package Data_Structure.Patterns;

import java.util.Scanner;

public class trinagle3 {
    /*
        Enter the no of rows
        5

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * *
        * * *
        * *
        *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int rows = sc.nextInt();
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i = rows; i >=0 ; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
