import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        // 명예의 전당 인원 수 : k
        // 일수 : score.length
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            pq.add(score[i]);
            if (pq.size() > k) {
                pq.poll();
            }
            answer[i] = pq.peek();
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}