class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();

        for (String token : tokens) {
            if ("+".equals(token) || "-".equals(token) || "/".equals(token) || "*".equals(token)) {
                String operator = token;
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                if ("+".equals(operator)) {
                    stack.push(String.valueOf(a + b));
                } else if ("-".equals(operator)) {
                    stack.push(String.valueOf(a - b));
                } else if ("/".equals(operator)) {
                    stack.push(String.valueOf(a / b));
                } else if ("*".equals(operator)) {
                    stack.push(String.valueOf(a * b));
                }
                continue;
            }
            stack.push(token);
        }

        return Integer.parseInt(stack.pop());
    }
}