import java.util.HashMap;

public class CountNoOfSubArrays {
    public static void main(String args[])
    {
        int arr[]={1,2,3};
        int k=3;
        int count=0;
        int sum=0;
        HashMap<Integer,Integer> hash=new HashMap<>();
        hash.put(0,1);
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(hash.containsKey(sum-k))
            {
                count+=hash.get(sum-k);
            }
            hash.put(sum,hash.getOrDefault(sum,0)+1);
        }
        System.out.println("Result is : "+count);
    }
}
