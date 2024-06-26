package Data_Structure.Stacks;

import java.util.Stack;

public class DisplayStack {
    public static void displaystackReverse(Stack<Integer> s){
        if (s.size()==0) return;
        int top = s.pop();
        System.out.print(top+" ");
        displaystackReverse(s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
//        Stack<Integer> rt =new Stack<>();
//        while (st.size()>0){
//            rt.push(st.pop());
//        }
//        while (rt.size()>0){
//            int x = rt.pop();
//            System.out.print(" "+ x);
//            st.push(x);
//        }

        // Using Array
        int n = st.size();
        int arr[] = new int[n];
        for (int i = n-1; i >=0 ; i--) {
          arr[i] = st.pop();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }
        System.out.println(st);
        displaystackReverse(st);
        System.out.println(st);
    }
}
