import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 수 찾기
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int[] n_arr = new int[n];

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] m_arr = new int[m];

        for (int i = 0; i < n; i++) {
            n_arr[i] = Integer.parseInt(st1.nextToken());
        }
        for (int i = 0; i < m; i++) {
            m_arr[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(n_arr);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            boolean isMatch = false;
            int target = m_arr[i];
            int target_idx = Arrays.binarySearch(n_arr, target);
            if (target_idx >= 0) {
                isMatch = true;
            }
            sb.append(isMatch ? "1" : "0");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
