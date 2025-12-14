import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
    /*
    nums = [3,1,2,3,2]  (총 5마리)
    p_num = 5/2 = 2     (최대 2마리 가져갈 수 있음)

    HashSet = {1,2,3}  → size() = 3 (종류 3개 존재)

    결과: min(3, 2) = 2
            → "2마리 가져가도 최대 2종류 확보 가능"
     */

        int p_num = nums.length / 2; // 가져갈 수 있는 폰켓몬수
        int answer = 0;

        Set<Integer> my_p = new HashSet<>();
        for (int a : nums) {
            my_p.add(a);
        }

        int my_p_size = my_p.size();
        if (my_p_size > p_num) {
            answer = p_num;
        } else {
            answer = my_p_size;
        }
        return answer;
    }
}