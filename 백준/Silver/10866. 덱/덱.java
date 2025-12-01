import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Deque<String> dq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            if (arr[0].equals("push_front")) {
                dq.addFirst(arr[1]);
            } else if (arr[0].equals("push_back")) {
                dq.addLast(arr[1]);
            } else if (arr[0].equals("pop_front")) {
                System.out.println(dq.isEmpty() ? -1 : dq.removeFirst());
            } else if (arr[0].equals("pop_back")) {
                System.out.println(dq.isEmpty() ? -1 : dq.removeLast());
            } else if (arr[0].equals("size")) {
                System.out.println(dq.size());
            } else if (arr[0].equals("empty")) {
                System.out.println(dq.isEmpty() ? 1 : 0);
            } else if (arr[0].equals("front")) {
                System.out.println(dq.isEmpty() ? -1 : dq.getFirst());
            } else if (arr[0].equals("back")) {
                System.out.println(dq.isEmpty() ? -1 : dq.getLast());
            }
        }
    }
}
