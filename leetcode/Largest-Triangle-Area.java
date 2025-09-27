class Solution {
    public double largestTriangleArea(int[][] p) {
        double ans = 0;
        int n = p.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    int x1 = p[i][0], y1 = p[i][1];
                    int x2 = p[j][0], y2 = p[j][1];
                    int x3 = p[k][0], y3 = p[k][1];
                    double area = 0.5 * Math.abs(x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2));
                    ans = Math.max(ans, area);
                }
            }
        }
        return ans;
    }
}