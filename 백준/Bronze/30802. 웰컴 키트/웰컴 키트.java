import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] sizes = new int[6];

        for(int i = 0; i < 6; i++) {
            sizes[i] = Integer.parseInt(st.nextToken());
        }


        st = new StringTokenizer(br.readLine());
        int  t = Integer.parseInt(st.nextToken());
        int  p = Integer.parseInt(st.nextToken());

        int shirtBundles = 0;
        for(int i : sizes) {
            shirtBundles += (i + t - 1) / t;
        }

        System.out.println(shirtBundles);
        System.out.println((n / p) + " " + (n % p));
    }
}
