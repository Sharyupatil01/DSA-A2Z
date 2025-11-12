import java.util.*;



class RemoveDuplicateFromArray
{
    public static void main(String args[])
    {
        int arr[]={1,2,2,4,3,5,5,3};
        List<Integer> ans=new ArrayList<>();
        HashSet<Integer> hash=new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {
            if(hash.contains(arr[i]))
            {
                ans.add(arr[i]);
            }
            else{
                hash.add(arr[i]);

            }

        }
        System.out.println("ANSWER");
        for(int i=0;i<ans.size();i++)
        {
            System.out.println(ans.get(i));
        }
    }
}

