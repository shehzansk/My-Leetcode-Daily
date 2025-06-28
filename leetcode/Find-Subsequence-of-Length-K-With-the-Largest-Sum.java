class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[][] fq = new int[n][2];

        for(int i =0; i<n; i++){
            fq[i][0] = i;
            fq[i][1] = nums[i];
        } 

        Arrays.sort(fq, (a, b) -> Integer.compare(b[1] , a[1]));
        Arrays.sort(fq, 0, k, (a, b) -> Integer.compare(a[0] , b[0]));

        int[] result = new int[k];

        for(int i =0; i<k; i++){
            result[i] = fq[i][1];
        }



        return result;
    }
}
