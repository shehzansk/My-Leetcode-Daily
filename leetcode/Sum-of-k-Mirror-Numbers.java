class Solution {
    public boolean ispalin(long num) {
        long original = num, reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }
    
    public boolean palinbasek(long num, int k) {
        int[] digits = new int[64];
        int len = 0;
        while (num > 0) {
            digits[len++] = (int)(num % k);
            num /= k;
        }
        for (int i = 0, j = len - 1; i < j; i++, j--) {
            if (digits[i] != digits[j]) return false;
        }
        return true;
    }

    public long kMirror(int k, int n) {
        
        long sum = 0;
        long len = 1;

        while (n > 0) {
            for (int i = (int)Math.pow(10, len - 1); i < (int)Math.pow(10, len) && n > 0; i++) {
                String half = Integer.toString(i);
                StringBuilder rev = new StringBuilder(half).reverse();
                String full = half + rev.substring(1);
                long num = Long.parseLong(full);
                if (palinbasek(num, k)) {
                    sum += num;
                    n--;
                }
            }

            for (int i = (int)Math.pow(10, len - 1); i < (int)Math.pow(10, len) && n > 0; i++) {
                String half = Integer.toString(i);
                StringBuilder rev = new StringBuilder(half).reverse();
                String full = half + rev; 
                long num = Long.parseLong(full);
                if (palinbasek(num, k)) {
                    sum += num;
                    n--;
                }
            }

            len++;
        }

        return sum;
    }
}