package Data_Structure.String;

import java.util.Scanner;

public class StringintChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abc";
        str = str + "xyz";
        str += "bbb";
        str += 'r';
        str += 10;

        System.out.println(str);
    }
}
