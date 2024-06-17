package Data_Structure.OOPs;

 class base{
     public int getX() {
         return x;
     }

     public void setX(int x) {
         System.out.println("I am setting X");
         this.x = x;
     }

     int x;
     void printme(){
         System.out.println("I am Constructor");
     }
 }
 class derived extends base{
     public int getY() {
         return y;
     }

     public void setY(int y) {
         this.y = y;
     }

     int y;
 }
public class inheritance {
    public static void main(String[] args) {
        // Creating object of base class
        base b = new base();
        b.setX(4);
        System.out.println(b.getX());
        // creating object of derived class
        derived d = new derived();
        d.setX(43);
        System.out.println(d.getX());

    }
}
