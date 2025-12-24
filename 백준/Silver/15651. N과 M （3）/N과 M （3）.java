import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] numbers;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        numbers = new int[M];
        
        backtracking(0);
        System.out.println(sb);
    }
    
    static void backtracking(int depth) {
        // 종료조건: M개 선택 완료
        if (depth == M) {
            for (int num : numbers) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        // 1~N 중 선택
        for (int i = 1; i <= N; i++) {
            numbers[depth] = i;
            backtracking(depth + 1);
        }
    }
}
