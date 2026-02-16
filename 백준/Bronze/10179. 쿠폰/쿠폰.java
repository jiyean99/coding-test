import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            double price = Double.parseDouble(br.readLine());
            double discount = price * 0.8;  // 20% 할인
            
            // $ + 소수점 둘째자리까지 출력
            System.out.printf("$%.2f%n", discount);
        }
    }
}
