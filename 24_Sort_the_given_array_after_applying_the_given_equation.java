class Solution {
    public ArrayList<Integer> sortArray(int[] arr, int A, int B, int C) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n=arr.length;
        for(int i=0; i<n; i++){
            int trans = A*(arr[i]*arr[i])+B*arr[i]+C;
            ans.add(trans);
        }
        Collections.sort(ans);
        return ans;
    }
}
