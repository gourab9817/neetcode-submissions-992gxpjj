class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int count=0;
        int max=0;
        int i=0;
        while(i<s.length()){
            int p=i;
            while (p < s.length() && !set.contains(s.charAt(p))) {
                set.add(s.charAt(p));
                p++;
            }
            max=Math.max(max,p-i);
            count=0;
            i++;
            set.clear();


        }
        return max;
    }
}
