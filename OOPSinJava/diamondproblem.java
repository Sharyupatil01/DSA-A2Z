package OOPSinJava;


interface A 
{
    default void show()
    {
        System.out.println("FROM A ");
    }

}
interface B extends A{
    @Override
    default void show() {
        {
            System.out.println("From b");
        }
    }
}
interface C extends A 
{
    @Override
    default void show() {
        {
            System.out.println("From c");
        }
    }
}w
interface D implements B,C 
{
    
    default void show() {
        {
            System.out.println("From D");
        }
    }
}
public class diamondproblem {
    
}
