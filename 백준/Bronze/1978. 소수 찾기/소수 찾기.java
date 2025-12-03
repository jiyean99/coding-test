import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 첫 줄: 수의 개수 N
        StringTokenizer st = new StringTokenizer(br.readLine()); // 두 번째 줄: N개의 수

        int count = 0;
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            boolean isPrime = true;

            if(num < 2) continue;

            for(int j = 2; j * j <= num; j++) {
                if(num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) count++;
        }
        System.out.println(count);
    }
}
