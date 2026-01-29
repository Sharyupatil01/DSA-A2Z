import java.util.*;

class SearchIn2DMatrix
{
    
    public static boolean search(int matrix[][], int target, int n , int m)
    
    {
        int left=0;
        int right=n*m-1;
        while(left<=right)
        {
            int mid=(left)+(right-left)/2;
            int mid_value=matrix[mid/m][mid%m];
            if(mid_value==target)
            {
                return true;
            }
            else if(mid_value>target)
            {
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return false;
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int matrix[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<m;j++)
		    {
		        matrix[i][j]=sc.nextInt();
		    }
		}
		int target=sc.nextInt();
		
		if(search(matrix , target , n , m))
		{
		    System.out.println("YES");
		}
		else{
		     System.out.println("NO");
		}
		

	}
}
