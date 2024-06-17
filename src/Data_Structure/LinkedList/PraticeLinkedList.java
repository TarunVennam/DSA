package Data_Structure.LinkedList;

public class PraticeLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class Linkedlist{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){
            Node temp = new Node(val);

            if (head==null){
                head = temp;
            }
            else {
                tail.next = temp;
            }
            tail = temp;
        }
        void insertAtBegining(int val){
            Node temp = new Node(val);
            if (head==null){
                insertAtEnd(val);
            }
            else {
                temp.next = head;
                head = temp;
            }
        }
        void insertAtIndex(int val,int idx){
            Node t = new Node(val);
            Node temp = head;
            if (idx == size()){
                insertAtEnd(val);
            }
            else if (idx==0){
                insertAtBegining(val);
            }
            else if (idx<0 || idx>size()){
                System.out.println("Wrong Index");
            }
            else {
                for (int i = 0; i < idx-1 ; i++) {
                    temp = temp.next;
                }
                t.next = temp.next;
                temp.next = t;
            }

        }
        int  size(){
            int count = 0;
            Node temp = head;
            while (temp!= null){
                count++;
                temp = temp.next;
            }
            return count;
        }

        void display(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int getAt(int idx){
            Node temp = head;
            if (idx<0 || idx>size()){
                System.out.println("Wrong Index");
                return -1;
            }
            for (int i = 0; i <idx ; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx){   // Some Error
            Node temp = head;
            if (idx==0){
                head = head.next;
                return;
            } else if (idx==size()) {
                tail = temp;
                return;
            }
                for (int i = 0; i <idx-1 ; i++) {
                    temp = temp.next;
                }
                temp.next =temp.next.next;
        }
    }
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.insertAtEnd(100);
        list.insertAtEnd(10);
        list.insertAtBegining(7);
        list.display();
        System.out.println(list.size());
        list.insertAtIndex(15,1);
        list.display();
//        System.out.println(list.getAt(3));
        list.deleteAt(3);
        list.display();
        System.out.println(list.head.data);
        System.out.println(list.tail.data);
//        System.out.println(list.size);
    }
}
