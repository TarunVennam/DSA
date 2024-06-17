package Data_Structure.LinkedList;


public class Implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }

    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if (head ==null){
                head = temp;
            }
            else {
                tail.next= temp;
            }
            tail = temp;
        }
        void display(){
             Node temp = head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            int count = 0;
            Node temp = head;
            while (temp!= null){
                count++;
                temp = temp.next;
            }
            return count;
        }

        void insertAtBegining(int val){
            Node temp = new Node(val);
            if (head==null){
//                head=tail= temp;
                insertAtEnd(val);
            }
            else {
                temp.next = head;
                head = temp;
            }
        }
        void insertAtNode(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            if (idx==size()){
                insertAtEnd(val);
                return;
            } else if (idx==0) {
                insertAtBegining(val);
                return;
            } else if (idx<0 || idx> size()) {
                System.out.println("Wrong index");
                return;
            }
            for (int i = 0; i <idx-1 ; i++) {
                temp = temp.next;
            }
            t.next= temp.next;
            temp.next = t;
        }
        int getAt(int idx){
            Node temp = head;
            if (idx<0 || idx >size()){
                System.out.println("Wrong Index");
                return -1;
            }
            for (int i = 0; i <idx ; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
        void deleteAtIndex(int idx){
            Node temp = head;
            if (idx==0) {
                head = head.next;
                return;
            } else if (idx==size()-1) {
                tail = temp;
                return;
            }
            for (int i = 0; i <idx-1 ; i++) {
                temp = temp.next;
            }
            temp.next= temp.next.next;

        }

    }
    public static void main(String[] args) {
//        LinkedList list = new LinkedList<>();
//        list.add(2);
//        list.add(45);
//        System.out.println(list.getLast());
        linkedlist list = new linkedlist();
        list.insertAtEnd(5);
        list.insertAtEnd(15);
        System.out.println(list.size());
        list.insertAtBegining(3);
        list.insertAtNode(2,34);
        list.display();
        list.insertAtNode(0,50);
        list.display();
        System.out.println(list.getAt(3));
//        System.out.println(list.getAt(76));
        list.deleteAtIndex(4);
        list.display();
        System.out.println(list.tail.data);

    }
}
