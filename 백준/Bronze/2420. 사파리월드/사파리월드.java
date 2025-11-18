import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] arr = input.split(" ");

        Long nPop = Long.parseLong(arr[0]);
        Long mPop = Long.parseLong(arr[1]);

        System.out.println(Math.abs(nPop - mPop));

    }
}
