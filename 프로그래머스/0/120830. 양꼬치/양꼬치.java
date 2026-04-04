class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            answer = (i * 12000) + ((k - (i / 10)) * 2000);
        }
        return answer;
    }
}