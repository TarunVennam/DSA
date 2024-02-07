package Data_Structure;

import java.util.ArrayList;

public class ArrayList_28 {
    public static void main(String[] args) {
        //Wrapper Classes
        Integer i = Integer.valueOf(4);
        System.out.println(i);
        Float f = Float.valueOf(4.22f);
        System.out.println(f);

        ArrayList<Integer> list = new ArrayList<>();
        // Add new Element
        list.add(10);
        list.add(12);
        list.add(5);

        //get an Element in index
        System.out.println(list.get(0));

//        // Print With Loop
//        for (int j = 0; j < list.size(); j++) {
//            System.out.println(list.get(j));
//
//        }
        // Print Arraylist Directly
        System.out.println(list);

        // Adding Element at Index i
        list.add(2,45);
        System.out.println(list);

        // Modifying Element at Index i
        list.set(1,30);
        System.out.println(list);

        //Remove Element at Index i
        list.remove(2);
        System.out.println(list);

        System.out.println("removing an Element e");
        list.remove(Integer.valueOf(30));
        System.out.println(list);

        System.out.println("Check Element is Exist or not");
        System.out.println(list.contains(15));
        System.out.println(list.contains(10));

        // If you don't specify class , you can put anything inside Arraylist
        ArrayList list1 = new ArrayList<>();
        list1.add("Harry");
        list1.add(20);
        list1.add("jsd");
        list1.add(89.99);
        System.out.println(list1);

    }
}
