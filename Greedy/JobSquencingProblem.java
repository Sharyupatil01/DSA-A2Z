package Greedy;
import java.util.Scanner;






class Job{
     
    int id;
    int profit;
    int deadline;
    Job(int id, int profit,int deadline)
    {
        this.id=id;
        this.profit=profit;
        this.deadline=deadline;
    }

}


public class JobSquencingProblem {
    // to implement job squencing problem using greedy approoch 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of jobs: ");
        int n=sc.nextInt();
        Job jobs[]=new Job[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter job id, profit and deadline: ");
            int id=sc.nextInt();
            int profit=sc.nextInt();
            int deadline=sc.nextInt();
            jobs[i]=new Job(id,profit,deadline);
        }
        //sort jobs based on profit in descending order 
        java.util.Arrays.sort(jobs,(a,b)->b.profit - a.profit);
        int result[]=new int[n];
        boolean slot[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            for(int j=Math.min(n, jobs[i].deadline)-1;j>=0;j--)
            {
                if(slot[j]==false)
                {
                    slot[j]=true;
                    result[j]=i;
                    break;
                }
            }
        }
        int totalProfit=0;
        for(int i=0;i<n;i++)
        {
            if(slot[i]==true)
            {
                totalProfit+=jobs[result[i]].profit;
            }
        }
        System.out.println("Total profit is "+totalProfit);

        sc.close();
        //tc : O(nlogn) for sorting + O(n^2) for finding slots = O(n^2)
        //sc : O(n) for slot array and result array = O(n)





    }
    
}
