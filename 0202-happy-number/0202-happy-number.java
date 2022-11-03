class Solution {
    public boolean isHappy(int n) {
        List<Double> list = new ArrayList<>();
        boolean isHappyNumber = false;
        String input = String.valueOf(n);
        while (true) {
            String[] arr = input.split("");
            
            double sum = 0;
            for(int i = 0; i < arr.length; i++){
                sum += Math.pow(Integer.parseInt(arr[i]), 2);
            }
            
            if(list.contains(sum)){
                break;
            }
            list.add(sum);
            
            if(sum == 1 || sum % (int) Math.pow(10, String.valueOf(sum).length() - 1) == 0){
                isHappyNumber = true;
                break;
            }
            input = String.valueOf((int) sum);
        }
        
        return isHappyNumber;
    }
}