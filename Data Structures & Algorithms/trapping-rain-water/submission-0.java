class Solution {
    public int trap(int[] arr) {
        int left=0;
        int right=0;
        int cal=0;
        int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            left = Math.max(left, arr[i]);   // update first
    arr1[i] = left;
        }
        
        int arr2[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            right = Math.max(right, arr[i]);   // update first
            arr2[i] = right;
        }

        for(int i=0;i<arr.length;i++){
            int x=Math.min(arr1[i],arr2[i])-arr[i];
            if(x>0){
                cal+=x;
            }
        }       
        return cal;
    }
}