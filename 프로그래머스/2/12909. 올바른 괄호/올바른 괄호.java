class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int i = 0;
        
        for(int j=0; j<s.length(); j++){
            char temp = s.charAt(j);
            if(s.charAt(0) == ')' || i < 0){
                return false;
            }
            if(temp == '('){
                i++;
            } else if (temp == ')'){
                i--;
            }
        }
        
        answer = i == 0 ? true : false;

        return answer;
    }
}