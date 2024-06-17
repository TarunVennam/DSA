package Data_Structure.LinkedList;

public class Base_LinkedList {
    public static void display(Node head){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.data +" ");
            temp = temp.next;

        }
    }
    public static void DisplayRecursive(Node head){// printing data using Recursive method
        if (head==null) return;
            System.out.print(head.data + " ");
            DisplayRecursive(head.next);
    }
    public static void DisplayRecursiveReverse(Node head){// printing data using Recursive method
        if (head==null) return;
            DisplayRecursiveReverse(head.next);  //   Use For Reverse LinkedList
            System.out.print(head.data + " ");
    }

    public static int Length(Node head){   // Length of List
        int count = 0;
        while (head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static class Node{   // Creating Node
        int data;  // Value
        Node next; // Address of next Node
        Node(int data){
            this.data = data;
        }

    }
    public static void main(String[] args) {
        Node a = new Node(5);
//        System.out.println(a.next);
        Node b = new Node(6);
        Node c = new Node(17);
        Node d = new Node(46);
        Node e = new Node(80);
        Node f = new Node(22);
        // 5 -> 6-> 17->46
        a.next = b;
        b.next = c;
        c.next = d;     // 5 -> 6-> 17->46
        d.next = e;
        e.next = f;
        //        System.out.println(a.next);

        // Printing LinkedList Data
        Node temp =a;
//        for (int i = 1; i <=6 ; i++) {
//            System.out.print(temp.data+" ");  // This way of printing is not best
//            temp = temp.next;
//        }
//        while (temp!= null){
//            System.out.print(temp.data +" ");
//           temp = temp.next;
//        }
        display(a);
        System.out.println( );
        DisplayRecursive(a);
        System.out.println();
        DisplayRecursiveReverse(a);
        System.out.println();
        System.out.println(Length(c));  // Length of List


    }
}
