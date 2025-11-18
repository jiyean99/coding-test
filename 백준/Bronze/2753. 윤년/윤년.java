import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());

//        윤년
//        year이 4의배수이면서, 100이 배수가 아닐때 || 400의 배수일 때
        boolean isYunYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        if (isYunYear) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
