class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=i; j<arr.length; j++){
                sum= sum+arr[j];
                if(sum==target){
                    ans.add(i+1);
                    ans.add(j+1);
                    return ans;
                }
                else if(sum>target){
                    break;
                }
            }
        }
        ans.add(-1);
        return ans;
    }
}
