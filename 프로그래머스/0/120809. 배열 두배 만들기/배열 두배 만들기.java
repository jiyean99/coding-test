class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        int idx = 0;
        for (int a : numbers) {
            answer[idx] = a*2;
            idx++;
        }
        
        return answer;
    }
}