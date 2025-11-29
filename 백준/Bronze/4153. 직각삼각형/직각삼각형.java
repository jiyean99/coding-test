import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] sides = new int[3];
            sides[0] = Integer.parseInt(st.nextToken());
            sides[1] = Integer.parseInt(st.nextToken());
            sides[2] = Integer.parseInt(st.nextToken());

            if (sides[0] == 0 && sides[1] == 0 && sides[2] == 0)
                break;

            Arrays.sort(sides);

            int a = sides[0];
            int b = sides[1];
            int c = sides[2];

            if (c * c == a * a + b * b) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
