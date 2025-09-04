class Solution {
    public int findClosest(int x, int y, int z) {

        int disX2Z = Math.abs(z-x);
        int disY2Z = Math.abs(z-y);
        

        if(disX2Z < disY2Z) return 1;
        else if(disX2Z > disY2Z) return 2;
        return 0;
        
    }
}