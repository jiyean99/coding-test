import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        // 파일을 확장자 별로 정리하여 몇개씩 있는지 알려줘
        // 보기 편하게 확장자들을 사전순으로 정렬해줘
        // -> key와 value를 가진 map 자료형을 사용하고, Treemap을 통해 정렬 진행
        // n : 바탕화면에 있는 파일의 개수
        // input : 파일명들 입력 ex)sbrus.txt, spc.spc ...
        // output : icpc 2, spc 2, txt 3 ...

        // key -> 확장자명
        // value -> 파일의 개수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> file_map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            // TODO 이 때, "." 이후에 작성된 확장자만 map에 담아야함
            //  또한 해당 확장자가 있을 때는 value에 +1을 해야하고, 없을 때는 1 삽입
            StringTokenizer st = new StringTokenizer(br.readLine(), ".");
            String file_name = st.nextToken();
            String file_extension = st.nextToken(); // 확장자만 담고 있는 상태
            if (file_map.containsKey(file_extension)) {
                file_map.put(file_extension, file_map.get(file_extension) + 1);
            } else {
                file_map.put(file_extension, 1);
            }
        }

        for (String a : file_map.keySet()) {
            System.out.println(a + " " + file_map.get(a));
        }
    }
}
