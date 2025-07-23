/*You are given a string S. Every sub-string of identical letters is replaced by a single instance of that letter followed by the hexadecimal representation of the number of occurrences of that letter. Then, the string thus obtained is further encrypted by reversing it [ See the sample for more clarity ]. Print the Encrypted String.

Note: All Hexadecimal letters should be converted to Lowercase letters.*/

// User function Template for Java

class Solution {
    static String encryptString(String S) {
        // code here
        StringBuilder str = new StringBuilder();
        char ch=S.charAt(S.length()-1);
        int count=1;
        for(int i=S.length()-2; i>=0; i--){
            if(S.charAt(i)==ch){
                count++;
            }
            else{
                str.append(Integer.toHexString(count)).append(ch);
                ch=S.charAt(i);
                count=1;
            }
        }
        str.append(Integer.toHexString(count)).append(ch);
        return str.toString();
    }
};
