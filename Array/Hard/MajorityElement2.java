import java.util.*;
public class MajorityElement2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
    
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer> result=new ArrayList<>();
        for(Map.Entry<Integer,Integer> hm:hash.entrySet())
        {
            if(hm.getValue()>arr.length/3)
            {
                result.add(hm.getKey());
            }
        }
        System.out.println("Result :"+ result);

    }
}