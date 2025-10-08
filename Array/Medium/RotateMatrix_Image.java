public class RotateMatrix_Image {
    public static void main(String args[])
    {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=matrix.length;
        int m=matrix[0].length;
        int transpose[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                transpose[i][j]=matrix[j][i];
            }
        }
        for(int i=0;i<n;i++)
        {
            int left=0;
            int right=m-1;
            while(left<right)
            {
                int temp=transpose[i][left];
                transpose[i][left]=transpose[i][right];
                transpose[i][right]=temp;
                left++;
                right--;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
       //Rotate of matrix = transpose of matrix + Rotate 
       

    }
}
