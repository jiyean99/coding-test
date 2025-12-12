import java.io.*;
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
       Map<String, Integer> my_map = new HashMap<>();

        String answer = "";

        for (String a : participant) {
            if (my_map.containsKey(a)) {
                my_map.put(a, my_map.get(a) + 1);
            } else {
                my_map.put(a, 1);
            }

        }
        for (String a : completion) {
            if (my_map.containsKey(a)){
                if (my_map.get(a) == 1) {
                    my_map.remove(a);
                } else {
                    my_map.put(a, my_map.get(a) - 1);
                }
            }
        }
        for (String a : my_map.keySet()) {
            answer = a;
        }
        return answer;
    }
}