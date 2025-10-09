
import java.util.*;

class SpiralMatrix 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        int m=sc.nextInt();
        System.out.println("Enter the number of cols :");
        int n=sc.nextInt();
        int result[][]=new int[m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               result[i][j]=sc.nextInt();
            }
        }

        int top=0;
        int left=0;
        int right=n-1;
        int bottom=m-1;
        ArrayList<Integer> ans=new ArrayList<>();
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                ans.add(result[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                ans.add(result[i][right]);
            }
            right--;
            for(int i=right;i>=left;i--)
            {
                ans.add(result[bottom][i]);

            }
            bottom--;
            for(int i=bottom;i>=top;i--)
            {
                ans.add(result[i][left]);
            }
            left++;

        }
        System.out.println(ans);
        

    }
}