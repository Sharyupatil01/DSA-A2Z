import java.util.Scanner;

public class TrappingWater 
{


    public static int solution(int [] heights)
    {
       int[]left=new int[heights.length];
       int [] right=new int[heights.length];
       
       left[0]=heights[0];
       for(int i=1;i<heights.length;i++)
       {
         left[i]=Math.max(left[i-1],heights[i]);
       }
       right[heights.length-1]=heights[heights.length-1];
       for(int i=heights.length-2;i>=0;i--)
       {
         right[i]=Math.max(right[i+1],heights[i]);
       }
       int trappedWater=0;
       for(int i=0;i<heights.length;i++)
       {
        trappedWater+=Math.min(left[i],right[i])* heights[i];


       }
       return trappedWater;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] heights=new int[n];
        for(int i=0;i<n;i++)
        {
            heights[i]=sc.nextInt();
        }
        System.out.println(solution(heights));
        sc.close();
        

    }
}