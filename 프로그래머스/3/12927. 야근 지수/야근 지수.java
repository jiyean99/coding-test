import java.util.Comparator;
import java.util.Queue;
import java.util.PriorityQueue;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        int totalWork = 0;
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < works.length; i++) {
            pq.add(works[i]);
            totalWork+=works[i];
        }
        if(totalWork < n){
            return 0;
        }
        for (int i = 0; i < n; i++) {
            int max = pq.peek() - 1;
            pq.poll();
            pq.add(max);
        }
        for (int a : pq) answer += (long) a * a;
        return answer;
    }
}