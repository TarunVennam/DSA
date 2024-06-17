package Data_Structure.String;

public class SubString {
    public static void main(String[] args) {
        String str =  "abcd";
//        System.out.println(str.substring(0,4));
        /// Printing all subString
        for (int i = 0; i < 4; i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
}
