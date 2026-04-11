class Solution {
    public int maxArea(int[] arr) {
        int n=arr.length;
        int max=0;
        int area=0;
        int i=0,j=n-1;
        while(i<j){
            area=Math.min(arr[i],arr[j])*(j-i);
            max=Math.max(max,area);
            if(arr[i]>arr[j]){
                j--;
            }else {
                i++;
            }
            
        }
        return max;
    }
}