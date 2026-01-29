class Solution {
    public int[] findPeakGrid(int[][] mat) {
        // int [] ans=new int[2];
        //revise the approach ***^^^^

        int n=mat.length;
        int m=mat[0].length;
        int low=0;
        int high=m-1;
        while(low<=high)
        {
            int mid=(low)+(high-low)/2;
            int max_row=max_Row(mat,mid);
            boolean isLeftBig=mid>0 && mat[max_row][mid-1]>mat[max_row][mid];
            boolean isRightBig=mid<m-1 && mat[max_row][mid+1]>mat[max_row][mid];

            if(isLeftBig)
            {
                high=mid-1;
            }
            else if(isRightBig)
            {
               low=mid+1;
            }
            else
            {
                return new int []{max_row,mid};
            }
        }
        return new int[]{-1,-1};
    }
    public int max_Row(int[][] mat , int mid_col)
    {
        int maxRow=0;
        for(int i=0;i<mat.length;i++)
        {
            if(mat[i][mid_col]>mat[maxRow][mid_col])
            {
                maxRow=i;
            }
        }
        return maxRow;
    }
}