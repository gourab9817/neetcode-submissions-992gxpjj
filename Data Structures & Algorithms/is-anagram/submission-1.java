class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length() != t.length()){
        //     return false;
        // }
        //     char arr[]=s.toCharArray();
        //     Arrays.sort(arr);
        //     char arr2[]=t.toCharArray();
        //     Arrays.sort(arr2);
        //     if(Arrays.equals(arr,arr2)){
        //         return true;
        //     }
        // return false;

        if(s.length() != t.length()){
            return false;
        }
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int con:freq){
            if(con !=0) return false;
        }
        return true;
    }
}
