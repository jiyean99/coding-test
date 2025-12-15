import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

// 최소힙
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //연산의 개수
        // 자연수 -> 추가하는 연산
        // 0 -> 가장 작은 값 출력 후 배열에서 제거
        int answer = 0;
        Queue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (!pq.isEmpty()) {
                    answer = pq.poll();
                } else {
                    answer = 0;
                }
                System.out.println(answer);
            } else {
                pq.add(x);
            }
        }

    }
}
