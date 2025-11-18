import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int xValue = Integer.parseInt(br.readLine());
        int yValue = Integer.parseInt(br.readLine());

        boolean firstQuadrant = xValue > 0 && yValue > 0;
        boolean secondQuadrant = xValue < 0 && yValue > 0;
        boolean thirdQuadrant = xValue < 0 && yValue < 0;

        if (firstQuadrant) {
            System.out.println(1);
        } else if (secondQuadrant) {
            System.out.println(2);
        } else if (thirdQuadrant) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }

    }
}
