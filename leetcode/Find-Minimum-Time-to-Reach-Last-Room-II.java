class Solution {
    public int minTimeToReach(int[][] moveTime) {
        int n = moveTime.length, m = moveTime[0].length;
        int[][] dp = new int[n][m];
        for (int[] row : dp) Arrays.fill(row, Integer.MAX_VALUE);

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, 0, 0});

        int[][] dirs = {{1,0},{0,1},{-1,0},{0,-1}};
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int time = cur[0], r = cur[1], c = cur[2];

            if (time >= dp[r][c]) continue;
            dp[r][c] = time;
            if (r == n - 1 && c == m - 1) return time;

            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                    int cost = (r + c) % 2 + 1;
                    int wait = Math.max(time, moveTime[nr][nc]);
                    int total = wait + cost;
                    if (total < dp[nr][nc]) {
                        pq.offer(new int[]{total, nr, nc});
                    }
                }
            }
        }
        return -1;
    }
}