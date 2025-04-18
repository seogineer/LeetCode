class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");
        for (String part : parts) {
            if ("".equals(part) || ".".equals(part)) {
                continue;
            }
            if ("..".equals(part)) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                continue;
            }
            stack.push(part);
        }
        StringBuilder sb = new StringBuilder();
        for (String part : stack) {
            sb.append("/").append(part);
        }
        return "".equals(sb.toString()) ? "/" : sb.toString();
    }
}