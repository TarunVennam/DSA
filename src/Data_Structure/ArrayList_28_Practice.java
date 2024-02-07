package Data_Structure;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_28_Practice {
    static void Reverse(ArrayList<Integer> list){
      int i = 0,j = list.size()-1;
      while (i<j){
          /*
          a = temp ;
          a = b;
          b= temp;
           */
          Integer temp = Integer.valueOf(list.get(i));
          list.set(i,list.get(j));
          list.set(j,temp);
          i++;
          j--;
      }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(10);
        list.add(15);
        list.add(6);
        list.add(40);
        list.add(20);
        System.out.println(list);
        Reverse(list);
        System.out.println("Reversen"+list);
        Collections.reverse(list);
        System.out.println("Reverse using Collection"+list);
        Collections.sort(list);
        System.out.println("Sort"+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending Order"+list);

        ArrayList<String> st = new ArrayList<>();
        st.add("Harry");
        st.add("Bhai");
        st.add("Coder");
        System.out.println("OG"+st);
        Collections.sort(st,Collections.reverseOrder());
        System.out.println("desc"+st);
    }
}
