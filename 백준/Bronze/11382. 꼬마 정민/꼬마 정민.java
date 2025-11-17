import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.trim().split("\\s+");

        long firstNum = Long.parseLong(arr[0]);
        long secondNum = Long.parseLong(arr[1]);
        long thirdNum = Long.parseLong(arr[2]);

        System.out.println(firstNum + secondNum + thirdNum);

    }
}
