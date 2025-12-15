import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        char[] ch = s.toCharArray();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(') {
                st.add(ch[i]);
            } else {
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                } else {
                    answer = false;
                    break;
                }
            }
        }
        if (!st.isEmpty()) {
            answer = false;
        }

        return answer;
    }
}