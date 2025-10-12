package DSA_A2Z.OOPSinJava;

class Employee 
{
      private String name;
      private int id;
    Employee(String name, int id)
    {
        this.name=name;
        this.id=id;
    }
    public String getName()
    {
        return name;
    }
    public int getID()
    {
        return id;
    }

}


public class Encapsulation {
    public static void main(String args[])
    {
       Employee e=new Employee("Sharyu",1);
       System.out.println(e.getName());
       System.out.println(e.getID());
      // e.name="SHARRYU"; not modificable 
    }
}
