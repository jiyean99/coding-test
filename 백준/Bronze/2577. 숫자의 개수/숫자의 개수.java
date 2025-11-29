import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        long value = (long)a*b*c;
        String st = Long.toString(value);

        int[] count = new int[10];

        for(int i = 0; i < st.length(); i++){
            char ch = st.charAt(i);
            int n = ch - '0';
            count[n]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }

    }
}