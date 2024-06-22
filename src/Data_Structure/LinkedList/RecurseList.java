package Data_Structure.LinkedList;

public class RecurseList {
    public static class Node{
        int val;
        Node next;
         Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void Reversedisplay(Node head){  // Usimg Recursion
         if (head==null) return;
            Reversedisplay(head.next);
            System.out.print(head.val+" ");
    }
    public static Node ReverseList(Node head){
        if (head.next==null) return head;
        Node Newhead = ReverseList(head.next);
        head.next.next = head;
        head.next = null;
        return Newhead;
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);
       a.next = b;
       b.next = c;
       c.next = d;
       d.next = e;
       display(a);
//       Reversedisplay(a);
       a = ReverseList(a);
       display(a);
    }
}
