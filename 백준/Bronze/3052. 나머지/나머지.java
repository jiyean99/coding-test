import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] remain = new boolean[42];

        for(int i=0; i<10; i++){
            int n = Integer.parseInt(br.readLine());
            remain[n%42] = true;
        }

        int count = 0;
        for (int i = 0; i < 42; i++) {
            if(remain[i]) count++;
        }

        System.out.println(count);
    }
}