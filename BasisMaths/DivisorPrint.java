package BasisMaths;
import java.util.ArrayList;

public class DivisorPrint {
    public static void main(String args[])
    {
        int n=36;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                list.add(i);

                if(i!=n/i)
                {
                    list.add(n/i);
                }
            }

        }
        System.out.println(list);


    }
}
