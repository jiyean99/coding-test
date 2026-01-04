class Solution {
    public int solution(int n) {
        int answer = 0;

        int startIdx = 1;
        int endIdx = 1;
        int sum = 1;

        while (endIdx <= n) {
            if (sum == n) {
                answer++;
                sum -= startIdx;
                startIdx++;
            } else if (sum < n) {
                endIdx++;
                sum += endIdx;
            } else {
                sum -= startIdx;
                startIdx++;
            }
        }
        return answer;
    }
}