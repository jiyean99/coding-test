import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split(" ");

        double first = Double.parseDouble(arr[0]);
        double second = Double.parseDouble(arr[1]);
        if(first > second){
            System.out.println(">");
        } else if (first == second) {
            System.out.println("==");
        } else {
            System.out.println("<");
        }
    }
}
