package Data_Structure.queue;

public class CircularqueueInArray {
    public static class Cqa{
        int front = -1;
        int rear = -1;
        int size = 0;
        int arr[] = new int[100];
        public void add(int val) throws Exception {
            if (size==arr.length){
                throw new Exception("Queue is Full!");
            } else if (size==0) {
                front = rear = 0;
                arr[0] = val;
            } else if (rear< arr.length-1) {
                arr[++rear] = val;
            } else if (rear==arr.length-1) {
                rear = 0;
                arr[0] = val;
            }
            size++;
        }
        public int remove() throws Exception{
            if (size==0){
                throw new Exception("Queue is Empty");
            }
            else {
                int val = arr[front];
                if (front==arr.length-1) front=0;
                else front++;
                size--;
                return val;
            }
        }
        public int peek() throws Exception{
            if (size==0){
                throw new Exception("Queue is Empty!");
            }
            else return arr[front];
        }
        public void display() {
            if (size==0){
                System.out.println("Queue is Empty!");
                return ;
            } else if (front<=rear) {
                for (int i = front; i <=rear ; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            else { // Rear <== front
                for (int i = front; i <arr.length ; i++) {
                    System.out.print(arr[i]+" ");
                }
                for (int i = 0; i <=rear ; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
     Cqa q = new Cqa();
     q.display();
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
