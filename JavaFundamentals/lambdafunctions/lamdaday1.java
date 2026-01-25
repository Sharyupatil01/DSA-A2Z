package JavaFundamentals.lambdafunctions;
@FunctionalInterface
interface lambda1{
    void display();
}
// class test implements lambda1{
//     public void display()
//     {
//         System.out.println("Hello lamda function");
//     }
// }

public class lamdaday1 {
    //Simple example of lamda function 
    public static void main(String args[])
    {

        // Runnable r = ()->{
        //     System.out.println("Hello lamda function");
        // };
        // // r.run();
        // lambda1 12=new lamda1(
        //     public void display(
        //     {
        //         System.out.println("Hello lamda function");
        //     }
        // );

        lambda1 l = ()->{
            System.out.println("Hello lamda function");
        };
        l.display();


    }
}
