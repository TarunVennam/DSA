package Data_Structure.Stacks;

public class LinkedListImplemtation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val= val;
        }
    }
    public static class LLStack{
       private Node head = null;
       private int size =0;
       void push(int x){
           Node temp = new Node(x);
           temp.next = head;
            head= temp;
           size++;
       }
       void displayRec(Node h){
           if (h ==null) return;
           displayRec(h.next);
           System.out.print(h.val+" ");
       }
       void display(){
           displayRec(head);
       }
       void displayRev(){
           Node temp = head;
           while (temp!=null){
               System.out.print(temp.val+" ");
               temp = temp.next;
           }
           System.out.println();
       }
       int size(){
           return size;
       }
       int pop(){
           if (head==null){
               System.out.println("Stack is Empty");
               return -1;
           }
           int x = head.val;
           head = head.next;
           return x;
       }
       int peek(){
           if (head==null){
               System.out.println("Stack is Empty");
               return -1;
           }
           return head.val;
       }
    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
//        System.out.println(st.IsEmpty());
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(3);
        st.push(3);
//        System.out.println(st.size());
        st.display();
//        System.out.println(st.peek());
//        st.display();
//        System.out.println(st.pop());
//        st.display();
    }
}
