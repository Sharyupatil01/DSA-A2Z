package OOPSinJava;


class Employee 
{
    Employee(String role)
    {
        System.out.println("PARRENT CLASS CONSTRUCTOR");
    }
    public void display()
    {
        System.out.println("PARRENT CLASS METHOD");
    }
}
class Manager extends Employee{
    Manager(String role)
    {
        super(role);//called the parent class constructor 
        System.out.println("CHILD CLASS CONSTRUCTOR");
    }
    public void display()
    {
        super.display();//called the parent class method
        System.out.println("CHILD CLASS METHOD");
    }

}
public class Inheritence {
    public static void main(String args[])
    {
        Manager m=new Manager("MANAGER");
        m.display();
        
    }
}
