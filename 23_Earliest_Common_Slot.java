// User function Template for Java
class Solution {
    public int[] commonSlot(List<int[]> a, List<int[]> b, int d) {
        // code here
        int ptr1=0;
        int ptr2=0;;
        while(ptr1<a.size() && ptr2<b.size()){
            int[] interval1 = a.get(ptr1);
            int[] interval2 = b.get(ptr2);
            int start=Math.max(interval1[0],interval2[0]);
            int end=Math.min(interval1[1],interval2[1]);
            if(end-start>=d){
                return new int[]{start,start+d};
            }
            if(interval1[1]< interval2[1]){
                ptr1++;
            }
            else{
                ptr2++;
            }
        }
        return new int[0];
    }
}
