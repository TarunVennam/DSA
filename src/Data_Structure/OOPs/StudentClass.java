package Data_Structure.OOPs;


  class Employee{
      int id;
      String name;
      int Salary;
      public void printdetails(){
          System.out.println("My id is : "+id);
          System.out.println("and My name is : "+name);
      }

      public int getSalary() {
          return Salary;
      }
  }
public class StudentClass {
    public static void main(String[] args) {
        System.out.println("Custom class");
        Employee emp = new Employee(); // Instantiating Object
        emp.id = 12;
        emp.name = "HarryBhai";
        emp.Salary = 34;
        int salary = emp.getSalary();
        System.out.println(emp.id);
        System.out.println(emp.name);

        emp.printdetails();
        System.out.println(salary);

    }
}
