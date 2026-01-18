import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            String age = st.nextToken();
            String name = st.nextToken();
            list.add(new String[]{age, name, String.valueOf(i)});  // 인덱스 추가
        }
        Collections.sort(list, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int age1 = Integer.parseInt(o1[0]);
                int age2 = Integer.parseInt(o2[0]);
                if (age1 != age2) {
                    return age1 - age2;
                }
                return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String[] person : list) {
            sb.append(person[0]).append(' ').append(person[1]).append('\n');
        }
        System.out.print(sb);
    }
}
