import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // push: 나가기만 함
        // add: 덱으로도 풀기위해서 add로 써야함
        //pop은 remove로도 수행 가능함
        
        Deque<String> dq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            if (arr[0].equals("push")) {
                dq.add(arr[1]);
            } else if (arr[0].equals("pop")) {
                if (!dq.isEmpty()) {
                    System.out.println(dq.remove());
                } else {
                    System.out.println(-1);
                }
            } else if (arr[0].equals("size")) {
                System.out.println(dq.size());
            } else if (arr[0].equals("empty")) {
                System.out.println(dq.isEmpty() ? 1 : 0);
            } else if (arr[0].equals("front")) {
                if (!dq.isEmpty()) {
                    System.out.println(dq.getFirst());
                } else {
                    System.out.println(-1);
                }
            } else if (arr[0].equals("back")) {
                if (!dq.isEmpty()) {
                    System.out.println(dq.getLast());
                } else {
                    System.out.println(-1);
                }
            }
        }

    }
}
