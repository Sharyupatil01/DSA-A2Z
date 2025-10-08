public class TransposeMatrix {
    public static void main(String args[])
    {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int m=arr.length;
        int n=arr[0].length;
        int transpose[][]=new int[n][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                transpose[j][i]=arr[i][j];
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
    }
}
