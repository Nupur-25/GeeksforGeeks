/*Given a list of words, S followed by two specific words, word1 and word2, the task is to find the minimum distance between the indices of these two words in the list.

Note: word1 and word2 are both in the list, and there can be multiple occurrences of words in the list.*/

// User function Template for Java

class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        int d1=-1;
        int d2=-1;
        int ans=Integer.MAX_VALUE;
        for(int i=0; i<s.size(); i++){
            if(s.get(i).equals(word1)){
                d1=i;
            }
            if(s.get(i).equals(word2)){
                d2=i;
            }
            if(d1!=-1 && d2!=-1){
                ans=Math.min(ans,Math.abs(d1-d2));
            }
        }
        return ans;
    }
};
