package Data_Structure.OOPs;

class MyMainEmployee{
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public MyMainEmployee(){
        id = 45;
        name = "Your_Name_Here";
    }
    public MyMainEmployee(String Myname, int i){
        id = i;
        name = Myname;
    }

    int id;
    String name;

}
public class Constructs {
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee("CodeWithHarry", 58);

        System.out.println(harry.getName());
        System.out.println(harry.getId());

    }
}
