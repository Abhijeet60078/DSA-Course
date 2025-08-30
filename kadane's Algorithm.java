class Solution {
    int maxSubarraySum(int[] arr) {
        int maxi=arr[0];
        int curr=arr[0];
        for(int i=1;i<arr.length;i++){
            curr=Math.max(arr[i],arr[i]+curr);
            maxi=Math.max(curr,maxi);
        }
        return maxi;
        
        
        
        
        // Code here
        
    }
}
