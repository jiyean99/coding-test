import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// FizzBuzz
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 0; // 그냥 미지의 수

        String answer = "";

        boolean isNum = false;

        for (int i = 0; i < 3; i++) {
            String str = br.readLine();

            char ch = str.charAt(0);

            if (ch != 'F' && ch != 'B') {
                n = Integer.parseInt(str);
                isNum = true;
            }

            if (isNum) {
                n++;
            }
        }

        if (n % 3 == 0 && n % 5 == 0) {
            answer = "FizzBuzz";
        } else if (n % 3 == 0) {
            answer = "Fizz";
        } else if (n % 5 == 0) {
            answer = "Buzz";
        } else {
            answer = String.valueOf(n);
        }

        System.out.println(answer);
    }
}
