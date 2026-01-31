class Solution {
    public String frequencySort(String s) {
        char [] str=s.toCharArray();
        HashMap<Character,Integer> hash=new HashMap<>();

        for(char ch : str)
        {
            hash.put(ch, hash.getOrDefault(ch,0)+1);
        }
        ArrayList<Character> list=new ArrayList<>(hash.keySet());
        Collections.sort(list, (a,b)-> hash.get(b)-hash.get(a));

        StringBuilder sb=new StringBuilder();
        for(char ch : list)
        {
            for(int i=0;i<hash.get(ch);i++)
            {
                sb.append(ch);
            }
        }
        return sb.toString();

        
    }
}