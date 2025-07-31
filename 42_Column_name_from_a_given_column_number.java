/*Given a positive integer, return its corresponding column title as appear in an Excel sheet.
Excel columns has a pattern like A, B, C, … ,Z, AA, AB, AC,…. ,AZ, BA, BB, … ZZ, AAA, AAB ….. etc. In other words, column 1 is named as “A”, column 2 as “B”, column 27 as “AA” and so on.

Example 1:

Input:
N = 28
Output: 
AB
Explanation: 1 to 26 are A to Z.
Then, 27 is AA and 28 = AB.
Example 2:

Input: 
N = 13
Output: 
M
Explanation: M is the 13th character of
alphabet.
Example 3:

Input:
N = 5473578
Output: 
KYJZF
Your Task:
You don't need to read input or print anything. Your task is to complete the function colName() which takes the column number N as input and returns the column name represented as a string.*/

// User function Template for Java

class Solution {
    String colName(long n) {
        // your code here
        StringBuilder res = new StringBuilder();
        while(n!=0){
            long rem = n%26;
            if(rem==0){
                res.append('Z');
                n=(n/26)-1;
            }
            else{
                res.append((char)((rem-1)+'A'));
                n=n/26;
            }
        }
        return res.reverse().toString();
    }
}
