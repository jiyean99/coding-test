import java.util.LinkedList;
import java.util.Queue;


class Solution {
    static boolean[][] visited;
    public int solution(int[][] maps) {
        int answer = -1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1});

        visited = new boolean[maps.length][maps[0].length];

        visited[0][0] = true;

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        loop1:
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();

            int x = temp[0];
            int y = temp[1];
            int r = temp[2];

            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + x;
                int ny = dy[i] + y;
                if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length) {
                    if (maps[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny, r + 1});
                        if (nx == maps.length - 1 && ny == maps[0].length - 1) {
                            answer = r + 1;
                            break loop1;
                        }
                    }
                }
            }
        }

        return answer;
    }
}