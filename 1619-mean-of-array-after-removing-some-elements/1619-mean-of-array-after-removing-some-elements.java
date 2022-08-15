class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        
        int fivePercent = (int) (arr.length * 0.05);
        int total = 0;
        double count = arr.length - fivePercent * 2;
        
        for(int i = fivePercent; i < arr.length - fivePercent; i++){
            total += arr[i];
        }
        
        return total / count;
    }
}