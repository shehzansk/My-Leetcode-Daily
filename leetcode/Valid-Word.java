class Solution {
    public boolean isValid(String word) {
        int n = word.length();
        if(n < 3) return false;

        String vowel = "aeiou";
        boolean vowelflag = false;
        boolean consonantflag = false;


        word = word.toLowerCase();

        for(int i = 0; i<n; i++){
            if(!(word.charAt(i) >= '0' && word.charAt(i) <='9') &&
                !(word.charAt(i)>='a' && word.charAt(i) <='z')){
                return false;
            }
            if (vowel.indexOf(word.charAt(i)) != -1) {
                vowelflag = true;
            }
            else if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                consonantflag = true;
            }
        } 


        return vowelflag&&consonantflag;
        
    }
}