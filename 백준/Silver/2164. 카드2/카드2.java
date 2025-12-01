import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> dq = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            dq.add(i+1);
        }

        while (dq.size() > 1){
            dq.remove();
            int num = dq.removeFirst();
            dq.add(num);
        }

        System.out.println(dq.getFirst());
    }
}
