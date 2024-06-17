package Data_Structure.String;

import java.util.Scanner;

public class StringBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "bbc";
        System.out.println(str);
        String st = sc.nextLine();
        System.out.println(st);
        System.out.println(st.length());
        System.out.println(str.charAt(0));

        System.out.println(str.indexOf('r'));
        // Compare to
        System.out.println(str.compareTo(st));
    }
}
