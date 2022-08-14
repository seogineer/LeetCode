class Solution {
    private static HashMap<Character, String> dials = new HashMap<Character, String>();
    
    public List<String> letterCombinations(String digits) {
        dialsSetting();
        
        List<String> answer = new ArrayList<>();
        
        if(digits.length() == 0){
            return answer;
        }
        
        backTracking(answer, new StringBuilder(), digits, 0);
        return answer;
    }
    
    private void backTracking(List<String> ans, StringBuilder sb, String digits, int start){
        if(start == digits.length()){
            ans.add(sb.toString());
            return;
        }
        
        String letters = dials.get(digits.charAt(start));
        for(int j = 0; j < letters.length(); j++){
            sb.append(letters.charAt(j));
            backTracking(ans, sb, digits, start + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    
    private void dialsSetting(){
        dials.put('2', "abc");
        dials.put('3', "def");
        dials.put('4', "ghi");
        dials.put('5', "jkl");
        dials.put('6', "mno");
        dials.put('7', "pqrs");
        dials.put('8', "tuv");
        dials.put('9', "wxyz");
    }
}