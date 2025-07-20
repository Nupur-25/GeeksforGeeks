/*Given an unsorted array arr[] of size n, containing elements from the range 1 to n, it is known that one number in this range is missing, and another number occurs twice in the array, find both the duplicate number and the missing number.*/

// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n=arr.length;
        int[] freq = new int[n+1];
        int repeat=0;
        int missing=0;
        for(int i=0; i<n; i++){
            freq[arr[i]]++;
        }
        for(int i=1; i<n+1; i++){
            if(freq[i]==0){
                missing=i;
            }
            else if(freq[i]==2){
                repeat=i;
            }
        }
        ans.add(repeat);
        ans.add(missing);
        return ans;
    }
}
