class Solution {
    public int maxPower(String s) {
        int max = 0;
        int c = 1;
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                c++;
            }
            else{
                if(c >= max){
                    max = c;
                }
                c = 1;
            }
        }

        return(Math.max(max, c));
    }
}
