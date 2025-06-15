class Solution {
    public int maxDiff(int num) {
        String str = Integer.toString(num);

        StringBuilder maxsb = new StringBuilder(str);
        StringBuilder minsb = new StringBuilder(str);
        
        char x = '9';

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '9') {   
                continue;
            };
            x = str.charAt(i);
            break;
        }

        for(int i=0; i<maxsb.length(); i++){
            if(maxsb.charAt(i) == x){
                maxsb.setCharAt(i, '9');
            }
        }

        boolean flag = false;

        x = '1';

        for(int i=0; i<str.length(); i++){
            if((str.charAt(i) == '1') || str.charAt(i) == '0') {
                continue;
            }
            if( i != 0 ) flag = true;
            x = str.charAt(i);
            break;
        }

        for(int i=0; i<minsb.length(); i++){
            if(minsb.charAt(i) == x){
                if(flag) minsb.setCharAt(i, '0');
                else minsb.setCharAt(i, '1');
            }
        }
        
        // System.out.print(maxsb);
        // System.out.print(minsb);

        int max = Integer.parseInt(maxsb.toString());
        int min = Integer.parseInt(minsb.toString());


        return max-min;
    }
}