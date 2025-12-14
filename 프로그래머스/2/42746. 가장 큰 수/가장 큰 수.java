import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] str_nums = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            str_nums[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str_nums, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder sb = new StringBuilder();
        for (String s : str_nums) {
            sb.append(s);
        }

        answer = sb.toString();
        // ✅ 선행 0 처리
        answer = answer.replaceFirst("^0+", "");
        
        // ✅ 빈 배열 처리
        return answer.isEmpty() ? "0" : answer;
    }
}