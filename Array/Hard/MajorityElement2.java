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
    
        // HashMap<Integer,Integer> hash=new HashMap<>();
        // for(int i=0;i<arr.length;i++)
        // {
        //     hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);
        // }
        // ArrayList<Integer> result=new ArrayList<>();
        // for(Map.Entry<Integer,Integer> hm:hash.entrySet())
        // {
        //     if(hm.getValue()>arr.length/3)
        //     {
        //         result.add(hm.getKey());
        //     }
        // }
        // System.out.println("Result :"+ result);

        int  count1=0;
        int count2=0;
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(count1==0 && arr[i]!=ele2)
            {
                count1=1;
                ele1=arr[i];

            }
            else if (count2==0 && arr[i]!=ele1)
            {
                count2=1;
                ele2=arr[i];
            }
            else if(arr[i]==ele1)
            {
                count1=count1+1;
            }
            else if(arr[i]==ele2)
            {
                count2=count2+1;
            }
            else
            {
                count1=count1-1;
                count2=count2-1;
            }
        }
        count1=0;
        count2=0;
        for(int i=0;i<arr.length;i++)
        {
            if(ele1==arr[i])
            {
                count1++;
            }
            if(ele2==arr[i])
            {
                count2++;
            }
        }
        List<Integer> result=new ArrayList<>();
        if(count1>arr.length/3)
        {
            result.add(ele1);
        }
        if(count2>arr.length/3)
        {
            result.add(ele2);
        }
        System.out.println(result);
        

    }
}