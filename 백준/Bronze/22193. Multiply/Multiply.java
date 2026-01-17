import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int garbage1 = sc.nextInt();  // 첫 번째 수의 자릿수 
        int garbage2 = sc.nextInt();  // 두 번째 수의 자릿수 
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        System.out.println(A.multiply(B));
    }
}
