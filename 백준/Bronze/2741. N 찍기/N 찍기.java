import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int count = Integer.parseInt(input);

        for (int i = 0; i < count; i++) {
            System.out.println(i + 1);
        }

    }
}
