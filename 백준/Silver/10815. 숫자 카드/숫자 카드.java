import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // n : 상근이가 갖고있는 숫자카드 개수
        // cards: 상근이 숫자 카드의 정수 리스트
        // m : 상근이 카드 검증 목적의 카드 개수
        // check_cards : 상근이 카드 검증 목적의 카드의 정수 리스트
        // output : 갖고있으면 1, 없으면 0 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // int[] cards = new int[n]; TODO 갖고 있는 카드의 경우는 순서가 보장될 필요가 없으므로 해시셋에 담아 검증을 작업

        Set<Integer> cards = new HashSet<>();
        StringTokenizer card_token = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cards.add(Integer.parseInt(card_token.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer check_token = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            if (cards.contains(Integer.parseInt(check_token.nextToken()))) {
                sb.append(1);
            } else {
                sb.append(0);
            }
            if (i != (m-1)) {
                sb.append(" ");

            }
        }
        System.out.println(sb);
    }
}
