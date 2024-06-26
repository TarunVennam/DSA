package Data_Structure.queue;

public class LinkedListImplemtation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class LLQueue{
        Node head = null;
        Node tail = null;
        int size = 0;
        public void add(int x){
            Node temp = new Node(x);
            if (size==0){
                head = tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
          public int remove(){
              if (size==0){
                  System.out.println("Queue is Empty");
                  return -1;
              }
            Node temp = head;
            head = head.next;
            return temp.data;
        }
        public int peek(){
            if (size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            size--;
            return head.data;
        }
      public void display(){
            if (size==0){
                System.out.println("Queue is Empty");
                return;
            }
            Node temp = head;
          while (temp!=null){
              System.out.print(temp.data+" ");
              temp = temp.next;
          }
          System.out.println();
      }

    }
    public static void main(String[] args) {
        LLQueue q = new LLQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        System.out.println(q.remove());
        q.display();
        System.out.println(q.peek());


    }
}
