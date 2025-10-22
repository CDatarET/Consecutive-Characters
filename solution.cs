public class Solution {
    public int MaxPower(string s) {
        int max = 0;
        int c = 1;
        for(int i = 0; i < s.Length - 1; i++){
            if(s[i] == s[i + 1]){
                c++;
            }
            else{
                if(c >= max){
                    max = c;
                }
                c = 1;
            }
        }

        return(Math.Max(max, c));
    }
}
