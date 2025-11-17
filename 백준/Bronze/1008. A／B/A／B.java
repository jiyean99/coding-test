import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split(" ");

        int first = Integer.parseInt(arr[0]);
        int second = Integer.parseInt(arr[1]);

        double result = (double) first / second;
        System.out.println(result);
    }
}
