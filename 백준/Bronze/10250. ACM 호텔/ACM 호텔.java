import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int roomNumFront;
            int roomNumBack;
            
            roomNumFront = (n % h == 0) ? h : (n % h);

            roomNumBack = (n % h == 0) ? (n / h) : (n / h + 1);

            System.out.printf("%d%02d\n", roomNumFront, roomNumBack);
        }
    }
}