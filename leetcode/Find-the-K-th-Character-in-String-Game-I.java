class Solution {
    public char kthCharacter(int k) {
        StringBuilder s = new StringBuilder();
        s.append("a");

        while(s.length()<k){
            String temp = "";
            for(int i =0; i<s.length(); i++){
                char ch = s.charAt(i);
                ch++;
                temp += ""+ch;
            }

            s.append(temp);
        }    

        return s.charAt(k-1);
    }
}