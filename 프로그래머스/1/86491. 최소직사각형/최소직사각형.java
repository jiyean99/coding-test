import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int width = 0; //가로 -> 무조건 긴거
        int height = 0; //세로 -> 무조건 짧은거
        int answer = 0;

        int min_width = Integer.MIN_VALUE;
        int min_height = Integer.MIN_VALUE;

        for (int i = 0; i < sizes.length; i++) {
            int a = sizes[i][0];
            int b = sizes[i][1];
            width = a > b ? a : b;
            height = a > b ? b : a;
            if(min_width < width){
                min_width= width;
            }
            if(min_height < height){
                min_height= height;
            }
        }

        answer = min_width * min_height;
        return answer;
    }
}