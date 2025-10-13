package OOPSinJava.Polymorphism;


class Parent{
    int add(int a,int b)
    {
        return a+b;
    }
    double add(double a, double b)
    {
        return a+b;
    }
    String add(String a,String b)
    {
       System.out.println("String addition");
        return a+b;
    }

}
public class MethodOverloading {
    public static void main(String args[])
    {
        Parent p=new Parent();
       System.out.println(p.add(1,2)); 
        System.out.println(p.add(1.0,2.0));
        System.out.println(p.add("1","2"));
        
        }
}
