class Solution {
    public boolean frequency(int freq[],int target[]){
        for(int i=0;i<128;i++){
            if(freq[i]<target[i]) return false;
        }
        return true;
}
    public String minWindow(String s, String t) {
        int n=s.length();
        int min=Integer.MAX_VALUE;
         int target[]=new int[128];
        for(int i=0;i<t.length();i++){
            target[t.charAt(i)]++;
        }
        int l=0;
        int start=-1;
        int freq[]=new int[128];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)]++;
            while(frequency(freq,target)){
                if(min>i-l+1 && frequency(freq,target)){
                    start=l;
                    min=Math.min(min,i-l+1);
                }
                freq[s.charAt(l)]--;
                l++;
            }
                   
        }
       return start == -1 ? "" : s.substring(start, start + min);
    }
}