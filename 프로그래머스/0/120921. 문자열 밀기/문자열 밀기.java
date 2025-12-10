class Solution {
    public int solution(String A, String B) {
        StringBuilder sb = new StringBuilder(A);
        if (A.equals(B)) {
            return 0;
        }
        for (int i = 0; i < sb.length(); i++) {
            sb.insert(0, sb.charAt(sb.length() - 1));
            sb.deleteCharAt(sb.length() - 1);
            
            if (sb.toString().equals(B)) {
                return i+1;
            }
        }
        return -1;
    }
}