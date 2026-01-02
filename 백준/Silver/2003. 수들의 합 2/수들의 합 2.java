import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int startIdx = 0;
        int endIdx = 0;
        int sum = arr[startIdx];

        while (startIdx <= endIdx && endIdx < arr.length) {
            if (sum == target) {
                count++;
                endIdx++;
                if (arr.length == endIdx) break;
                sum += arr[endIdx];
            } else if (sum < target) {
                endIdx++;
                if (arr.length == endIdx) break;
                sum += arr[endIdx];
            } else if (sum > target) {
                sum -= arr[startIdx];
                startIdx++;
                if (startIdx > endIdx) {
                    endIdx++;
                    if (arr.length == endIdx) break;
                    sum += arr[endIdx];
                }
            }
        }
        
        System.out.println(count);
    }
}
