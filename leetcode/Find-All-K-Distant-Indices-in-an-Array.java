class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> st  = new HashSet<>();
        int n = nums.length;

        List<Integer> fq = new ArrayList<>();


        for(int i=0 ;i<n; i++){
            if(nums[i] == key){
                fq.add(i);
            }
        }
        // int j = 0;

        for(int i=0; i<n; i++){
            for(int f:fq){
                if(Math.abs(i-f) <=k){
                    st.add(i);
                }
            }
        }

        List<Integer> ans = new ArrayList<>(st);
        Collections.sort(ans);
        return ans;
    }
}