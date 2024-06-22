package Data_Structure.Stacks;

import java.util.Stack;

public class BasicOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(45);
        st.push(14);
        st.push(76);

        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("Size of stack is :"+ st.size());

    }
}

