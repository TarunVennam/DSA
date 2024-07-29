package Data_Structure.Patterns.Kunal;

public class Kunal_Patterns {
    // From Kunal kushwaha Assignment
    public static void main(String[] args) {
//        star(5);
        patterns31(5);

    }
    static void patterns31Random(int n){
        n = 2*n;
        for (int row = 0; row <=n; row++) {
            for (int column = 0; column <=n ; column++) {
                int atEveryIndex = Math.min(Math.min(row,column),Math.min(n-row,n-column));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
    static void patterns31(int n){
        int orignalN = n;
        n = 2*n;
        for (int row = 0; row <=n; row++) {
            for (int column = 0; column <=n ; column++) {
                int atEveryIndex = orignalN- Math.min(Math.min(row,column),Math.min(n-row,n-column));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
    static void patterns30(int n){
        for (int row = 0; row <=n ; row++) {
            for (int space = 0; space <n-row ; space++) {
                System.out.print(" ");
            }
            for (int column = row; column >=1 ; column--) {
                System.out.print(column );
            }
            for (int column = 2; column <=row ; column++) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
    static void patterns17(int n){
        for (int row = 0; row <=2*n ; row++) {
            int c = row > n ? 2*n - row : row;
            for (int space = 0; space <n-c ; space++) {
                System.out.print("  ");
            }
            for (int column = c; column >=1 ; column--) {
                System.out.print(column+" ");
            }
            for (int column = 2; column <=c ; column++) {
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }
    static void star(int n){
        for (int row = 1; row <=n ; row++) {
         // for every row run the column
            for (int column = 1; column <=row ; column++) {
                System.out.print("*"+" ");
            }
            // when one row printed , we need to add newline
            System.out.println();
        }
    }
    static void pattern1(int n){
        for (int row = 1; row <=n ; row++) {
            for (int column = 1; column <=n; column++) {
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
    static void pattern3(int n){
        for (int row = 1; row <=n ; row++) {
            for (int column = row; column <=n ; column++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int row = 1; row <=n ; row++) {
            for (int column = 1; column <=row ; column++) {
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int row = 1; row <=2*n-1 ; row++) {
            int totalColsInRow = row > n ? 2*n - row - 1 : row;
            for (int column = 0; column < totalColsInRow; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for (int row = 1; row <=2*n-1 ; row++) {
            int totalColsInRow = row > n ? 2*n - row - 1 : row;
            int noOfSpaces = n-totalColsInRow;
            for (int spaace = 0; spaace <noOfSpaces ; spaace++) {
                System.out.print(" ");
            }
            for (int column = 0; column < totalColsInRow; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
