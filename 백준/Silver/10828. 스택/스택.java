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
            if(arr[0].equals("push")){
                dq.addFirst(arr[1]);
            } else if(arr[0].equals("pop")){
                System.out.println(dq.isEmpty() ? -1 : dq.removeFirst());
            } else if(arr[0].equals("size")){
                System.out.println(dq.size());
            }else if(arr[0].equals("empty")){
                System.out.println(dq.isEmpty() ? 1 : 0);
            }else if(arr[0].equals("top")){
                System.out.println(dq.isEmpty() ? -1 : dq.getFirst());
            }
        }
    }
}
