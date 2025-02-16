class Solution {
    public int romanToInt(String s) {
        int total = 0;
        char prev = '0';
        char current;
        for (int i = s.length() - 1; i >= 0; i--) {
            current = s.charAt(i);
            if (i < s.length() - 1) {
                prev = s.charAt(i + 1);
            }
            
            if (current == 'I' && prev == 'V') {
                total -= 1;
            } else if (current == 'I' && prev == 'X') {
                total -= 1;
            } else if (current == 'I') {
                total += 1;
            } else if (current == 'V') {
                total += 5;
            } else if (current == 'X' && prev == 'L') {
                total -= 10;
            } else if (current == 'X' && prev == 'C') {
                total -= 10;
            } else if (current == 'X') {
                total += 10;
            } else if (current == 'L') {
                total += 50;
            } else if (current == 'C' && prev == 'D') {
                total -= 100;
            } else if (current == 'C' && prev == 'M') {
                total -= 100;
            } else if (current == 'C') {
                total += 100;
            } else if (current == 'D') {
                total += 500;
            } else if (current == 'M') {
                total += 1000;
            }
        }
        return total;
    }
}