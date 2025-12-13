import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine()); // 층
            int n = Integer.parseInt(br.readLine()); // 호

            int result = residents(k, n);
            System.out.println(result);
        }
    }

    public static int residents(int k, int n) {
        if (k == 0) {
            return n; // 0층 n호에는 n명
        }
        if (n == 0) {
            return 0; // 0호는 없음
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += residents(k - 1, i);
        }
        return sum;
    }
}
