package Array.Medium.LeetcodeWeekly;
import java.util.HashSet;

public class KeepMultiplyingFoundValuesbyTwo {
    public static void main(String args[])
    {
        int arr[]={5,3,6,1,12};
        int original=3;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        int result=1;
        while(set.contains(result*original))
        {
            result=result*2;
        }
        System.out.println(result*original);
    }

}
