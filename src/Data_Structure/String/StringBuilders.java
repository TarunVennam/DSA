package Data_Structure.String;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        str.append(" World");
        System.out.println(str);
        str.setCharAt(4,'y');
        System.out.println(str);

        // String Insert
        str.insert(2,"y");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
    }
}
