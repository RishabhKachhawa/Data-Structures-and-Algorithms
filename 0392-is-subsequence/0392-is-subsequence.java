class Solution {
    public boolean isSubsequence(String s, String t) {
            int n = t.length();
            int m = s.length();

            if (s.length() == 0){
                return true;
            }
               

            int str = 0;
            int cheacker = 0;

            while(str<n){
                if(t.charAt(str) == s.charAt(cheacker)){
                    cheacker++;
                }
                str++;
                if(cheacker >= m){
                    return true;
                }
            }

            return false;
        
    }
}