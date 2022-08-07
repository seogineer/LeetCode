class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> refer = new HashMap<String, Integer>();
        refer.put("I", 1);
        refer.put("V", 5);
        refer.put("X", 10);
        refer.put("L", 50);
        refer.put("C", 100);
        refer.put("D", 500);
        refer.put("M", 1000);
        refer.put("IV", 4);
        refer.put("IX", 9);
        refer.put("XL", 40);
        refer.put("XC", 90);
        refer.put("CD", 400);
        refer.put("CM", 900);
        
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            String letter = s.charAt(i) + "";
            String temp = "";
            
            if(i < s.length() - 1){
                temp = s.charAt(i + 1) + "";
            }
            
            if(letter.equals("C")){
                if(temp.equals("M")){
                    result += refer.get(letter + temp);
                    i++;
                    continue;
                }
                
                if(temp.equals("D")){
                    result += refer.get(letter + temp);
                    i++;
                    continue;
                }
            }
            
            if(letter.equals("X")){
                if(temp.equals("C")){
                    result += refer.get(letter + temp);
                    i++;
                    continue;
                }
                
                if(temp.equals("L")){
                    result += refer.get(letter + temp);
                    i++;
                    continue;
                }
            }
            
            if(letter.equals("I")){
                if(temp.equals("V")){
                    result += refer.get(letter + temp);
                    i++;
                    continue;
                }
                
                if(temp.equals("X")){
                    result += refer.get(letter + temp);
                    i++;
                    continue;
                }
            }
            
            result += refer.get(s.charAt(i) + "");
        }
        
        return result;
    }
}