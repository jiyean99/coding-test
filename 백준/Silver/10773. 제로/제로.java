import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int k = Integer.parseInt(br.readLine()); 

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 1; i <= k; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                if (!dq.isEmpty()) {
                    dq.removeLast();
                }
            } else {
                dq.addLast(num);
            }
        }
        int sum = 0;
        while (!dq.isEmpty()) {
            sum += dq.removeLast(); 
        }

        System.out.println(sum);
    }
}
