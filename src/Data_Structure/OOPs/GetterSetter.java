package Data_Structure.OOPs;

class MyEmployee{
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }

}
public class GetterSetter {
    public static void main(String[] args) {
     MyEmployee harry = new MyEmployee();
     harry.setName("Code with Harry");
     harry.setId(39);
        System.out.println(harry.getName());
        System.out.println(harry.getId());
    }
}
