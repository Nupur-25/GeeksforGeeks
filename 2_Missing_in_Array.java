class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length;
        int sum=0;
        for(int i=0; i<n; i++){
            sum = sum+arr[i];
        }
        long actualSum= ((long)(n+1)*(n+2))/2;
        long misNo = actualSum-sum;
        return (int)misNo;
    }
}
