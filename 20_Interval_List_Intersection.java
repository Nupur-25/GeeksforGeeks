class Solution {
    public List<List<Integer>> findIntersection(List<List<Integer>> arr1,
                                                List<List<Integer>> arr2) {
                                                    List<List<Integer>> ans = new ArrayList<>();
                                                    int ptr1=0;
                                                    int ptr2=0;
                                                    while(ptr1<arr1.size() && ptr2<arr2.size()){
                                                        List<Integer> interval1 = arr1.get(ptr1);
                                                        List<Integer> interval2 = arr2.get(ptr2);
                                                        int start1 = interval1.get(0);
                                                        int end1 = interval1.get(1);
                                                        int start2 = interval2.get(0);
                                                        int end2 = interval2.get(1);
                                                        int cSP = Math.max(start1,start2);
                                                        int cEP = Math.min(end1,end2);
                                                        if(cSP<=cEP){
                                                            ans.add(Arrays.asList(cSP,cEP));
                                                        }
                                                        if(end1<end2){
                                                            ptr1++;
                                                        }
                                                        else{
                                                            ptr2++;
                                                        }
                                                    }
                                                    return ans;
                                                }
}
