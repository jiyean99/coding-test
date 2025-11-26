import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            System.out.println(input.charAt(0) + "" + input.charAt(input.length() - 1));
        }
    }
}
