// User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        int ans = arr[n-1]-arr[0];
        int sm = arr[0]+k;
        int lr = arr[n-1]-k;
        int min=0;
        int max=0;
        for(int i=0; i<n-1; i++){
            min=Math.min(sm,arr[i+1]-k);
            max=Math.max(lr,arr[i]+k);
            if(min<0){
                continue;
            }
            ans = Math.min(ans,max-min);
        }
        return ans;
    }
}
