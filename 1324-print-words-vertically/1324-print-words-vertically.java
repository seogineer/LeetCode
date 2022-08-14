class Solution {
    public List<String> printVertically(String s) {
        List<String> verticalWords = new ArrayList<>();
        String[] arr = s.split(" ");
        
        int index = 0;
        while(true){
            StringBuilder sb = new StringBuilder();
            
            List<Boolean> check = new ArrayList<>();
            for(int i = 0; i < arr.length; i++){
                if(arr[i].length() - 1 < index){
                    check.add(false);
                    sb.append(" ");
                } else {
                    check.add(true);
                    sb.append(arr[i].charAt(index));
                }
            }
            
            if(!check.contains(true)){
                break;
            }
            
            verticalWords.add(removeTrailingSpaces(sb));
            index++;
        }
        
        return verticalWords;
    }
    
    private String removeTrailingSpaces(StringBuilder sb){
        for(int j = sb.length() - 1; j >= 0; j--){
            if(sb.charAt(j) == ' '){
                sb.deleteCharAt(j);
            } else {
                break;
            }
        }
        return sb.toString();
    }
}