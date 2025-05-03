class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {

        int top1 = tops[0];
        int down1 = bottoms[0];
        int tcount1 = 0, bcount1 = 0;
        int tcount2 = 0, bcount2 = 0;
        boolean possibleTop1 = true, possibleDown1 = true;



        for (int i = 0; i < tops.length; i++) {
            if (tops[i] != top1 && bottoms[i] != top1) possibleTop1 = false;
            if (tops[i] != down1 && bottoms[i] != down1) possibleDown1 = false;
            if (possibleTop1) {
                if (tops[i] != top1 && bottoms[i] == top1) tcount1++;
                else if (tops[i] == top1 && bottoms[i] != top1) bcount1++;
            }
            if (possibleDown1) {
                if (tops[i] != down1 && bottoms[i] == down1) tcount2++;
                else if (tops[i] == down1 && bottoms[i] != down1) bcount2++;
            }
        }
        if (possibleTop1) return Math.min(tcount1, bcount1);
        if (possibleDown1) return Math.min(tcount2, bcount2);
        return -1;
    }
}
