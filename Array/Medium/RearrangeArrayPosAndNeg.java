package Array.Medium;

public class RearrangeArrayPosAndNeg {
    public static void main(String args[])
    {
        int arr[]={-1,4,2,5,6,7,-6,-8,-10,-9};
        int k=0;
        int j=1;
        int result[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
              result[k]=arr[i];
              k=k+2;
            }
            else{
                result[j]=arr[i];
                j=j+2;
            }
        }
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}
