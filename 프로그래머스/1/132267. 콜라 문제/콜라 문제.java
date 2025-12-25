class Solution {
    public int solution(int a, int b, int n) {
        return recur(a, b, n, 0);
    }
    
    public int recur(int a, int b, int n, int result){
        if(n < a){
            return result;
        }
        
        int change = (n / a) * b;
        n = (n % a) + change;
        
        return recur(a, b, n, result + change);
    } 
}