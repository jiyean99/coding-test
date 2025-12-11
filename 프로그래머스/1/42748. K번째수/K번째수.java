import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
         int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            for (int j = 0; j < commands[i].length; j++) {
                int iValue = 0;
                int jValue = 0;
                int kValue = 0;
                iValue = commands[i][0] - 1;
                jValue = commands[i][1];
                kValue = commands[i][2] - 1;
                int[] copy_arr = Arrays.copyOfRange(array, iValue, jValue);
                Arrays.sort(copy_arr);
                answer[i] = copy_arr[kValue];
            }
        }
        return answer;
    }
}