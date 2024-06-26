package Data_Structure.Stacks;

public class ArrayImplemtation {
    public static class Stack{
         private int arr[] = new int[5];
         private int idx = 0;
         void push(int x){
             if (IsFull()){
                 System.out.println("Stack is full");
                 return;
             }

           arr[idx] = x;
           idx++;
         }
         int  pop(){
             if (idx==0){
                 System.out.println("Stack IsEmpty");
                 return -1;
             }
           int top = arr[idx-1];
             arr[idx-1] = 0;
             idx--;
             return top;
         }
         int peek(){
             if (idx==0){
                 System.out.println("Stack IsEmpty");
                 return -1;
             }
             return arr[idx-1];
         }
         void display(){
             for (int i = 0; i <idx ; i++) {
                 System.out.print(arr[i]+" ");
             }
             System.out.println();
         }
         int size(){
             return idx;
         }
         boolean IsEmpty(){
             if (idx==0) return true;
             else return false;
         }
         boolean IsFull(){
             if (idx==arr.length) return true;
             else return false;
         }
         int capacity(){
             return arr.length;
         }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.IsEmpty());
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(3);
        st.push(3);
        System.out.println(st.size());
        st.display();
        System.out.println(st.peek());
        st.display();
        System.out.println(st.pop());
       st.display();
        System.out.println(st.IsFull());
    }
}
