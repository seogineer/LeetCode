class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){ return 0; }
        if(s.length() == 1){ return 1; }
        
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(answer > s.length() - (i + 1)){
                break;
            }
            
            List<Character> list = new LinkedList<>();
            for(int j = i; j < s.length(); j++){
                if(list.contains(s.charAt(j))){
                    if(answer < list.size()){
                        answer = list.size();
                    }
                    break;
                } else {
                    list.add(s.charAt(j));

                    if(j == s.length() - 1){
                        answer = Math.max(answer, list.size());
                    }
                }    
            }
        }
        
        return answer;
    }
}