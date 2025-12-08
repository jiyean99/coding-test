import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(n);  // N부터 시작

        for (int i = n - 1; i >= 1; i--) {
            dq.offerFirst(i);  // i를 맨 앞에 추가
            for (int j = 0; j < i; j++) {
                dq.offerFirst(dq.pollLast());  // 뒤 → 앞 이동 i번
            }
        }

        // 결과 출력
        while (!dq.isEmpty()) {
            System.out.print(dq.pollFirst() + " ");
        }
        System.out.println();
    }
}
