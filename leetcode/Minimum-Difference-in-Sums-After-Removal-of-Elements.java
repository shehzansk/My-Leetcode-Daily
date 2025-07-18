class Solution {

    public long minimumDifference(int[] nums) {
        int n=nums.length/3;
        // if(n==1) return Math.min(nums[0]-nums[2], Math.min(nums[1]-nums[2], nums[0]-nums[1]));
        long[] pref = new long[n+1];
        long[] suff = new long[n+1];
        PriorityQueue<Integer> pq1 = new PriorityQueue<>((a, b)->b-a);
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        long prefSum = 0;
        long suffSum=0;
        for(int i=0;i<n;i++){
            prefSum += nums[i];
            pq1.offer(nums[i]);
        }
        pref[0] = prefSum;
        for(int i=3*n-1;i>=2*n;i--){
            suffSum += nums[i];
            pq2.offer(nums[i]);
        }
        suff[n]=suffSum;
        for(int i=n;i<2*n;i++){
            prefSum += nums[i];
            pq1.offer(nums[i]);
            prefSum -= pq1.poll();
            pref[i-n+1] = prefSum;
        }
        for(int i=2*n-1;i>=n;i--){
            suffSum += nums[i];
            pq2.offer(nums[i]);
            suffSum -= pq2.poll();
            suff[i-n] = suffSum;
        }
        long ans = Long.MAX_VALUE;
        for(int i=0;i<=n;i++){
            // System.out.println(pref[i]+" "+suff[i]);
            ans = Math.min(ans, pref[i]-suff[i]);
        }
        return ans;




    }
}