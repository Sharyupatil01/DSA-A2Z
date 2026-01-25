package BasicsStriverSheet;

public class GreaterCommonFactor {
    public static void main(String args[])
    {
        int a=56;
        int b=98;
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println(a);

        //lcm 
        int lcm=(56*98)/a;
        System.out.println(lcm);

    }
}
