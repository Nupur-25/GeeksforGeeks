class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int n=arr.length;
        int maxCount=0;
        int count=1;
        for(int i=1; i<n; i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                maxCount=Math.max(maxCount,count);
                count=1;
            }
        }
        return Math.max(maxCount,count);
    }
}
