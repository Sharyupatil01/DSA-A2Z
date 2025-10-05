public class MissingNumber {
    public static void main(String args[])
    {
        int arr[]={9,6,4,2,3,5,7,0,1};
        int n=arr.length;
        int sum=(n*(n+1))/2;
        int sum2=0;
        for(int i=0;i<arr.length;i++)
        {
            sum2+=arr[i];
        }
       System.out.println("Missing number is "+(sum-sum2));
       
    }
}
