import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        int N = Integer.parseInt(br.readLine());
        
        if (N == 1) {
            System.out.println(1);
            return;
        }
        
        int count = 1;
        int room = 1;
        
        while (room < N) {
            room += 6 * count;
            count++;
        }
        
        System.out.println(count);
    }
}
