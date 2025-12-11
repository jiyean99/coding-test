class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
     int[] answer = new int[2];

        int sum_num = (numer1 * denom2) + (denom1 * numer2);
        System.out.println(sum_num);
        int sum_denom = denom1 * denom2;
        System.out.println(sum_denom);

        int a = 1;
        int min = Math.min(sum_num, sum_denom);

        for (int i = 1; i < min + 1; i++) {
            if (sum_num % i == 0 && sum_denom % i == 0) {
                a = i;
            }
        }

        int final_num = sum_num / a;
        int final_denom = sum_denom / a;

        answer[0] = final_num;
        answer[1] = final_denom;
        
        return answer;
    }
}