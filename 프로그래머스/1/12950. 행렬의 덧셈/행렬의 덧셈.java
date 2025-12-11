class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {

       int[][] answer = new int[arr1.length][arr1[0].length];

        int arr1_value = 0;
        int arr2_value = 0;

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                arr1_value = arr1[i][j];
                arr2_value = arr2[i][j];
                answer[i][j] = arr1_value+arr2_value;
            }
        }
        return answer;
    }
}