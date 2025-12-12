import java.io.*;
import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
         Map<String, Integer> my_map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            if (!my_map.containsKey(clothes[i][1])) {
                my_map.put(clothes[i][1], 1);
            } else {
                my_map.put(clothes[i][1], my_map.get(clothes[i][1]) + 1);
            }
        }
        int answer = 1;

        for (String a : my_map.keySet()) {
            answer*=(my_map.get(a) + 1);
        }

        answer -= 1;
        
        return answer;
    }
}