class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //brute approach 

        //time complexity -> 0(n*m) ->0(n^2)

        // int n=matrix.length;
        // int m=matrix[0].length;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<m;j++)
        //     {
        //         if(matrix[i][j]==target)
        //         {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //better approach  time complexity -> 0(nlogm)

       /* int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++)
        {
            if(binarySearch(matrix[i],target)){
                return true;
            }
        }
        return false;


    }
    public boolean binarySearch(int[] matrix , int target)
    {
        int low=0;
        int high=matrix.length-1;
        while(low<=high)
        {
            int mid=(low)+(high-low)/2;
            if(matrix[mid]==target)
            {
                return true;
            }
            else if(matrix[mid]>target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return false;*/

        //Optimal Approach 0(n+m)

         if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return false;
        }

        int row=0;
        int cols=matrix[0].length-1;
        while(row<=matrix.length-1 && cols>=0)
        {
            if(matrix[row][cols]==target)
            {
                return true;
            }
            else if(matrix[row][cols]>target)
            {
                cols--;
            }
            else
            {
                row++;
            }

        }
        return false;

    }
}