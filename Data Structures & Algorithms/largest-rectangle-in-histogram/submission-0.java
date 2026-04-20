class Solution {
    public int largestRectangleArea(int[] he) {
        int n=he.length;
        // int count=1;
        int max=0;
        for(int i=0;i<n;i++){
            int height=he[i];
            int a=i+1;
            int b=i-1;
            int count=1;
           
            while(a<n){
                if(he[a]<he[i]){
                    break;
                }else{
                    count++;
                }
                a++;
            }
            while(b>=0){
                if(he[b]<he[i]){
                    break;
                }else{
                    count++;
                }
                b--;
            }
            int area=height*count;
            max=Math.max(area,max);
        }
        return max;
    }
}