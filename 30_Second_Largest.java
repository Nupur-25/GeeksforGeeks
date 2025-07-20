/*Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.*/

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n= arr.length;
        int max=arr[n-1];
        for(int i=n-2; i>=0; i--){
            if(arr[i]!=max){
                return arr[i];
            }
        }
        return -1;
    }
}
