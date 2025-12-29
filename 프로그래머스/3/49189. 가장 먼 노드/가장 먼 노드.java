import java.util.*;

class Solution {
    static List<List<Integer>> adjList = new ArrayList<>();
    static boolean[] visited;
    
    public int solution(int n, int[][] edge) {
for (int i = 0; i < n + 1; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < edge.length; i++) {
            int nodeA = edge[i][0];
            int nodeB = edge[i][1];
            adjList.get(nodeA).add(nodeB);
            adjList.get(nodeB).add(nodeA);
        }
        for (List<Integer> list : adjList) {
            list.sort(Comparator.naturalOrder());
        }
        int[] distance = bfs(n);

        int maxDistance = -1;
        
        for (int i = 1; i <= n; i++) {
            maxDistance = Math.max(maxDistance, distance[i]);
        }

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (distance[i] == maxDistance) answer++;
        }
        
        return answer;

    }
    
    public static int[] bfs(int start) {
        int[] distance = new int[start + 1];
        Arrays.fill(distance, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        distance[1] = 0;

        while (!q.isEmpty()) {
            int current = q.poll();
            for (int next : adjList.get(current)) {
                if (distance[next] == -1) {
                    distance[next] = distance[current] + 1;
                    q.add(next);
                }
            }
        }
        return distance;
    }
}