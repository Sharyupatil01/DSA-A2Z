package Array.Medium;

public class TimeToBuyAndSellStock {
    public static void main(String args[])
    {
        int arr[]={7,1,5,3,6,4};
        int min=Integer.MAX_VALUE;
        int result=0;
        for(int i=0;i<arr.length;i++)
        {
            min=Math.min(min,arr[i]);
            result=Math.max(result,arr[i]-min);
        }
        System.out.println("Maximum Profit Result:"+ result);
    }

}
