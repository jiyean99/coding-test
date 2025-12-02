import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 깔리는 카드 수
        int m = Integer.parseInt(st.nextToken()); // 만들어야 하는 수

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        // {5.6.7.8.9}
        // 5 : 6789중에 2장을 뽑아야하는 상황
        // 6 : 789 중에 하나를 반드시 뽑도록 (n-1)

        int sum = 0;
        int answer = 0;
        for(int i=0; i<n-2; i++){ //3장의 카드 중 1장을 고정하기 위해 2 감소
            for(int j=i+1; j<n-1; j++){ // j는 반드시 i의 다음 index에 해당되는 카드를 고정
                for (int k=j+1; k<n; k++){
                    sum = arr[i]+arr[j]+arr[k];

                    if ((sum <= m) && (answer <= sum)){
                         // sum = 18 < 21 (o)
                        //6+7+8=21 = 21
                        answer=sum;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
