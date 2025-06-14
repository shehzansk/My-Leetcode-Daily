class Solution {
    public int minMaxDifference(int num) {
        
        String str1 = Integer.toString(num);
        String str2 = Integer.toString(num);

        char charTR = '\0';

        StringBuilder sb = new StringBuilder(str1);

        for(int i = 0; i<sb.length(); i++){
            if(sb.charAt(i) != '9'){
                charTR = sb.charAt(i);
                sb.setCharAt(i,'9');
                break;
            }
        }

        for(int i = 0; i<sb.length(); i++){
            if(sb.charAt(i) == charTR){
                sb.setCharAt(i,'9');
            }
        }

        StringBuilder sb2 = new StringBuilder(str1);

        // for min
        charTR = sb2.charAt(0);
       
        for(int i = 0; i<sb2.length(); i++){
            if(sb2.charAt(i) == charTR){
                sb2.setCharAt(i,'0');
            }
        }






        int max = Integer.parseInt(sb.toString());
        int min = Integer.parseInt(sb2.toString());

        return max - min;
    }
}