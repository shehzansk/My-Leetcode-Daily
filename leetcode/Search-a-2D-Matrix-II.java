class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] row : matrix) {
            if (target >= row[0] && target <= row[row.length - 1]) {
                int l = 0, r = row.length - 1;
                while (l <= r) {
                    int mid = l + (r - l) / 2;
                    if (row[mid] == target) return true;
                    else if (row[mid] < target) l = mid + 1;
                    else r = mid - 1;
                }
            }
        }
        return false;
    }
}
