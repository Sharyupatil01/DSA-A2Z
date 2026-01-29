package BinarySearch.BinarySearchOn2DArray;

//brute force approach 
//TC : O(n*m)
//SC : O(1)

//optimal approach 
//TC : O(n log m)
//SC : O(1)

public class MaximumNoOf1sinRow {
    public static void main(String args[])
    {
        int arr[][]={{
            0,0,0,1,1},
            {0,0,1,1,1},
            {0,1,1,1,1},
            {0,0,0,0,1}};

        //brute approach 

        // int n=arr.length;
        // int m=arr[0].length;
        
        // int maxCount=0;
        // int index=-1;
        // for(int i=0;i<n;i++)
        // {
              // int count=0;
        //     for(int j=0;j<m;j++)
        //     {
        //           count+=arr[i][j];
        //     }

        //     if(count>maxCount)
        //     {
        //         maxCount=count;
        //         index=i;
        //     }


        // }
        // System.out.println("Row with maximum 1s are "+ index);

        //optimal approach 

        int n=arr.length;
        
        int maxcount=0;
        int index=-1;
        for(int i=0;i<n;i++)
        {
            int count=arr[0].length-lowerbound(arr[i],arr[0].length,1);
            if(count>maxcount)
            {
                maxcount=count;
                index=i;
            }
        }
        System.out.println(index);
        System.out.println(maxcount);





        

    }
    public static  int lowerbound(int arr[] , int m , int k)
    {
        int low=0;
        int high=m-1;
        int ans=m;
        while(low<=high)
        {
            int mid=(low)+(high-low)/2;
            if(arr[mid]==1)
            {
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
