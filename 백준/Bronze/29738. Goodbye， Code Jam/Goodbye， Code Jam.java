import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            String result;
            
            if (N <= 25) {
                result = "World Finals";
            } else if (N <= 1000) {
                result = "Round 3";
            } else if (N <= 4500) {
                result = "Round 2";
            } else {
                result = "Round 1";
            }
            
            System.out.println("Case #" + t + ": " + result);
        }
        sc.close();
    }
}
