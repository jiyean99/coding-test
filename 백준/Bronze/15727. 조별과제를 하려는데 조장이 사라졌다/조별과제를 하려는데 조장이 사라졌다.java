import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int time = (L + 4) / 5;  // 최소 시간 계산
        System.out.println(time);
        br.close();
    }
}
