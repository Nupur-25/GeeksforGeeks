/*You have an inclusive interval [lower, upper] and a sorted array of unique integers arr[], all of which lie within this interval. A number x is considered missing if x is in the range [lower, upper] but not present in arr[]. Your task is to return the smallest set of sorted ranges that includes all missing numbers, ensuring no element from arr is within any range, and every missing number is covered exactly once.*/

// User function Template for Java
class Solution {
    public List<List<Integer>> missingRanges(int[] arr, int lower, int upper) {
        // code here
        List<List<Integer>> ans = new ArrayList<>();
        int n=arr.length;
        if(lower<arr[0]){
            ans.add(Arrays.asList(lower,arr[0]-1));
        }
        for(int i=0;i<n-1;i++){
            if(arr[i+1]-arr[i]>1){
                ans.add(Arrays.asList(arr[i]+1,arr[i+1]-1));
            }
        }
        if(upper>arr[n-1]){
            ans.add(Arrays.asList(arr[n-1]+1,upper));
        }
        return ans;
    }
}
