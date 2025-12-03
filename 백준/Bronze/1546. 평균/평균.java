import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] scores = new int[n]; // 점수 저장
        int m = 0;

        // 1. 점수 저장 + 최대값 찾기
        for(int i = 0; i < n; i++){
            scores[i] = Integer.parseInt(st.nextToken());
            if(scores[i] > m) m = scores[i];
        }

        // 2. 변환점수 계산
        double sum = 0;
        for(int score : scores){
            sum += (double)score / m * 100;
        }
        System.out.println(sum / n);
    }
}
