import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int c = Integer.parseInt(br.readLine());

            int quarter = c / 25;
            c %= 25;

            int dime = c / 10;
            c %= 10;

            int nickel = c / 5;
            c %= 5;

            int penny = c;

            sb.append(quarter).append(' ')
              .append(dime).append(' ')
              .append(nickel).append(' ')
              .append(penny).append('\n');
        }

        System.out.print(sb.toString());
    }
}
