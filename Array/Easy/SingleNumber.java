public record SingleNumber() {
    public static void main(String args[])
    {
        int arr[]={2,2,1};
        int result=arr[0];
        for(int i=1;i<arr.length;i++)
        {

            result^=arr[i];
        }
        System.out.println("Single number "+ result);
    }
}
