class Solution {
    static final int M = 1_000_000_007;
    long pw(long a, long b) {
        long r = 1;
        while (b > 0) {
            if ((b & 1) == 1) r = r * a % M;
            a = a * a % M;
            b >>= 1;
        }
        return r;
    }
    public int countGoodArrays(int n, int m, int k) {
        if (k > n - 1) return 0;
        long[] f = new long[n + 1], iv = new long[n + 1];
        f[0] = 1;
        for (int i = 1; i <= n; i++) f[i] = f[i - 1] * i % M;
        iv[n] = pw(f[n], M - 2);
        for (int i = n; i > 0; i--) iv[i - 1] = iv[i] * i % M;
        long c = f[n - 1] * iv[k] % M * iv[n - 1 - k] % M;
        long p = pw(m - 1, n - 1 - k);
        return (int)(m * c % M * p % M);
    }
}
