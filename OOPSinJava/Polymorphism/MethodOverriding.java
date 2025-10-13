package OOPSinJava.Polymorphism;


class parent 
{
    parent()

    {
        System.out.println("Parent class constructor");
    }
    
    //cannot override the final and static methods of the parent class
    public void setLength()
     {
         System.out.println("Parent class method");
     }
}
class child extends parent 
{
     child()
     {
         System.out.println("Child class constructor");
     }
    @Override
    public void setLength()
    {
        System.out.println("Child class method");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        parent p = new child();
        p.setLength();
        parent p1=new child();
        
    }
}
