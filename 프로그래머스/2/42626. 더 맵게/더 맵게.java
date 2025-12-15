import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int[] scoville, int K) {
        Queue<Integer> pq = new PriorityQueue<>();
        for (int a : scoville) {
            pq.add(a);
        }

        int answer = 0;

        while (pq.peek() < K) {
            if (pq.size() < 2) {
                answer = -1;
            }
            if(answer==-1)break;
            int min_s = pq.poll() + (pq.poll() * 2);
            pq.add(min_s);
            answer++;
        }

        return answer;
    }
}