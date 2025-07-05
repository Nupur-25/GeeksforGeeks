// User function Template for Java

class Solution {
    int maxProduct(int[] arr) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        int prod1=arr[n-1]*arr[n-2]*arr[n-3];
        int prod2=arr[0]*arr[1]*arr[n-1];
        return Math.max(prod1,prod2);
    }
}
