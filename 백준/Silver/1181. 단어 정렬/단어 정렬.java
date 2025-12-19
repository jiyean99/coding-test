import java.io.*;
import java.util.*;

// 단어 정렬
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < t; i++) {
            set.add(br.readLine());
        }

        List<String> myList = new ArrayList<>(set);

        Collections.sort(myList, (o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2); // 사전순
            }
            return o1.length() - o2.length(); // 길이순
        });

        StringBuilder sb = new StringBuilder();
        for (String s : myList) {
            sb.append(s).append('\n');
        }
        System.out.print(sb.toString());
    }
}
