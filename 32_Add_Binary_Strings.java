/*Given two binary strings s1 and s2 consisting of only 0s and 1s. Find the resultant string after adding the two Binary Strings.
Note: The input strings may contain leading zeros but the output string should not have any leading zeros.*/

// User function Template for Java

class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        StringBuilder ans=new StringBuilder();
        // code here
        int sum=0;
        int count=0;
        int i=s1.length()-1;
        int j=s2.length()-1;
      while (i >= 0 && j >= 0) {
    if (s1.charAt(i) == '1' && s2.charAt(j) == '1' && count == 0) {
        ans.append(0);
        count = 1;
    } else if (s1.charAt(i) == '1' && s2.charAt(j) == '1' && count == 1) {
        ans.append(1);
        count = 1;
    } else if (s1.charAt(i) == '0' && s2.charAt(j) == '1' && count == 0) {
        ans.append(1);
        count = 0;
    } else if (s1.charAt(i) == '1' && s2.charAt(j) == '0' && count == 0) {
        ans.append(1);
        count = 0;
    } else if ((s1.charAt(i) == '1' && s2.charAt(j) == '0' && count == 1)
            || (s1.charAt(i) == '0' && s2.charAt(j) == '1' && count == 1)) {
        ans.append(0);
        count = 1;
    } else if (s1.charAt(i) == '0' && s2.charAt(j) == '0' && count == 1) {
        ans.append(1);
        count = 0;
    } else if (s1.charAt(i) == '0' && s2.charAt(j) == '0' && count == 0) {
        ans.append(0);
        count = 0;
    }
    i--;
    j--;
}

   while (i >= 0) {
    if (s1.charAt(i) == '1' && count == 0) {
        ans.append(1);
        count = 0;
    } else if (s1.charAt(i) == '1' && count == 1) {
        ans.append(0);
        count = 1;
    } else if (s1.charAt(i) == '0' && count == 1) {
        ans.append(1);
        count = 0;
    } else {
        ans.append(0);
        count = 0;
    }
    i--;
}

         while (j >= 0) {
    if (s2.charAt(j) == '1' && count == 0) {
        ans.append(1);
        count = 0;
    } else if (s2.charAt(j) == '1' && count == 1) {
        ans.append(0);
        count = 1;
    } else if (s2.charAt(j) == '0' && count == 1) {
        ans.append(1);
        count = 0;
    } else {
        ans.append(0);
        count = 0;
    }
    j--;
}
 if (count == 1) {
            ans.append(1);
        }

        ans.reverse();
        while(ans.length()>1 && ans.charAt(0)=='0'){
     ans.deleteCharAt(0);
 }
        return ans.toString();
    }
}
