import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // 대문자인 경우 소문자로 변환
            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
            // 소문자인 경우 대문자로 변환
            else if (Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            }
        }
        System.out.println(sb);
    }
}
