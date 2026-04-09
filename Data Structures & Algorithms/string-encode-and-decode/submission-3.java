class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<strs.size();i++){
            sb.append(strs.get(i).length());
            sb.append('#');
            sb.append(strs.get(i));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        
        List<String> li=new ArrayList<>();
        int i=0;
        
        while (i<str.length()){
            int delimiterPos = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, delimiterPos));
            i = delimiterPos + 1;
            
            String s = str.substring(i, i + length);
            li.add(s);
            i += length;
        }
        return li;
    }
}