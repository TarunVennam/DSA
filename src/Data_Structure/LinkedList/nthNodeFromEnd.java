package Data_Structure.LinkedList;

public class nthNodeFromEnd {
    public static Node nthNode(Node head , int n){
        int size = 0;
        Node temp = head;
        while (temp!= null){
            size++;
            temp = temp.next;
        }

        int m = size - n + 1;
        temp = head;
        for (int i = 0; i <m-1; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public static Node nthNode2(Node head , int n){
        Node fast = head;
        Node slow = head;
        for (int i = 0; i <n ; i++) {
            fast = fast.next;
        }
        while (fast!= null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void deleteAtFromEnd1(Node head , int n){
        Node fast = head;
        Node slow = head;
        for (int i = 0; i <n; i++) {
            fast = fast.next;
        }
        while (fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

    }
    public static void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
      Node a = new Node(100);
      Node b = new Node(13);
      Node c = new Node(4);
      Node d = new Node(5);
      Node e = new Node(12);
      Node f = new Node(10);
      a.next = b;
      b.next = c;
      c.next = d;
      d.next = e;
      e.next = f;
//      Node temp = nthNode(a,3);
//        System.out.println(temp.data);
//      Node q = nthNode2(a,3);
//        System.out.println(q.data);
        display(a);
        deleteAtFromEnd1(a,3);
        display(a);


    }
}
