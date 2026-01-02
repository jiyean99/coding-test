import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 도시수(지방수)

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n]; // 도시(지방)별 예산 요청

        int maxByCity = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (maxByCity < arr[i]) {
                maxByCity = arr[i];
            }
        }

        Arrays.sort(arr);

        int limit = Integer.parseInt(br.readLine()); // 총예산

        int startIdx = 1;
        int endIdx = maxByCity;

        int answer = 0;
        while (startIdx <= endIdx) {
            int mid = (startIdx + endIdx) / 2;
            int total = 0;
            for (int i = 0; i < arr.length; i++) {
                total += (Math.min(mid, arr[i]));
            }

            if (total > limit) {
                endIdx = mid - 1;
            } else if (total < limit) {
                startIdx = mid + 1;
                answer = mid;
            } else {
                answer = mid;
                break;
            }


        }


        System.out.println(answer);

    }
}
