class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int maxleft=0;
        for(int i=0;i<left.length;i++)

        {
            maxleft=Math.max(maxleft,left[i]);
        }
        int maxright=0;
        for(int i=0;i<right.length;i++)
        {
            maxright=Math.max(maxright,n-right[i]);


        }
        return Math.max(maxright,maxleft);
    }
}