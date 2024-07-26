package Data_Structure.Patterns;

public class triangle {
    /*
    *
    * *
    * * *
    * * * *
    * * * * *
     */
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <=row ; ++i) {
            for (int j = 1; j <=i ; ++j) {
                System.out.print("*");
            }
            System.out.println( );
        }
        System.out.println();
        reverse(5);
    }
    static void reverse(int rows){
        for (int i = rows; i >=1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.printf("*");
            }
            System.out.println( );
        }
    }
}
