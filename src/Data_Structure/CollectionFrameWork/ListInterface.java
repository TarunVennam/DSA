package Data_Structure.CollectionFrameWork;

import java.util.ArrayList;

public class ListInterface {
    static void Arraylist(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        System.out.println(l);
        System.out.println(l.get(2));
    }
    public static void main(String[] args) {
        Arraylist();

    }
}
