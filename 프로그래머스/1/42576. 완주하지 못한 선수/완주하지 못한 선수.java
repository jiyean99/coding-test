import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String,Integer> myMap = new HashMap<>();
        String answer = "";
        for(String s : participant){
            myMap.put(s,myMap.getOrDefault(s,0)+1);
        }
        for(String s : completion){
            myMap.put(s,myMap.getOrDefault(s,0)-1);
        }
        for(String s: myMap.keySet()){
            if(myMap.get(s)>0){
                return s;
            }
        }
        return answer;
    }
}