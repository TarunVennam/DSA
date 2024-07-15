package Data_Structure.Maths;

public class NewtonSquareRoot {
    // Finding square root using Newton Rapshon Method
    public static void main(String[] args) {
        System.out.println(Sqrt(40));

    }
    static double Sqrt(double n){
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x +(n/x));
            if (Math.abs(root-x)<0.00001){// for absolute value we use 0.000001 or we can use 1 also
                break;
            }
            x = root;
        }
        return root;
    }
}
