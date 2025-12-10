import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 팰린드롬수
public class Main {
    public static void main(String[] args) throws IOException {
        // 팰린드롬 : 어디에서 읽어도 똑같은 문자열
        // ex)radar, sees 등
        // 팰린드롬수 : 어디에서 읽어도 똑같은 수열
        // ex)1991, 252 등

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // sb에 값을 넣는다.
        // sb에 들어온 값이 짝수면, 앞에 들어온 절반값을 뒤집었을 때 뒤에 절반값이 일치하면 yes
        // sb에 들어온 값이 홀수면, 가운데값을 제외한 절반값을 뒤집었을 때 가운데값을 제외한 절반값이 일치하면 yes
        // 그 외는 no

        boolean isP = false;
        while (true) {
            String input = br.readLine();
            if (input.equals("0")) break;
            if (input.length() % 2 == 0) {
                String halfSbBeforeReverse = input.substring(0, input.length() / 2);
                String halfSbAfter = input.substring(input.length() / 2, input.length());
                String reversed = new StringBuilder(halfSbBeforeReverse).reverse().toString();
                if (reversed.equals(halfSbAfter)) {
                    isP = true;
                } else {
                    isP = false;
                }
            } else {
                String halfSbBeforeReverse = input.substring(0, input.length() / 2);
                String halfSbAfter = input.substring(input.length() / 2 + 1, input.length());
                String reversed = new StringBuilder(halfSbBeforeReverse).reverse().toString();
                if (reversed.equals(halfSbAfter)) {
                    isP = true;
                } else {
                    isP = false;
                }
            }
            if (isP) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
