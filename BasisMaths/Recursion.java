package BasisMaths;

public class Recursion {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4};
        int n=4;
        int ans=fact(n);
        int ans2=sum(n);
        System.out.println(ans);
        System.out.println(ans2);
        print1ton(n);
        System.err.println("");
        printnto1(n);
        reverse(arr,0,arr.length-1);
        System.out.println(".()");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
    //finding the factorial of a number using recursion

    static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*fact(n-1);
    }

    //finding the sum of first n natural numbers using recursion
    static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int prevsum=0;
        prevsum=sum(n-1);
        return n+prevsum;

    }

    //print 1 to n using recursion
    static void print1ton(int n)
    {
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        print1ton(n-1);
        System.out.println(n);
    }

    //print n to 1 using recursion
    static void printnto1(int n)
    {
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printnto1(n-1);
    }
    //reverse a array using recursion
    static void reverse(int arr[],int l,int r)
    {
        if(l>=r)
        {
            return;
        }
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        reverse(arr,l+1,r-1);
    }

}
