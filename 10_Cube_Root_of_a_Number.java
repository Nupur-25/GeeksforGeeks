// User function Template for Java

class Solution {
    static int cubeRoot(int n) {
        // code here
        float res = (float)Math.pow(n,(1.0/3));
        int floorVal = (int)Math.floor(res);
        return floorVal;
    }
};
