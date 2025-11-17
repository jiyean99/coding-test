import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split(" "); // split 함수를 이용하여 공백으로 잘라서 배열로 담겠다는 뜻
        int first = Integer.parseInt(arr[0]);
        int second = Integer.parseInt(arr[1]);
        System.out.println(first * second);
    }
}
