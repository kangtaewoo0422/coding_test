class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int coffee = 5500;
        int a = 0;
        int b = 0;
        for (int i = 0; i < money; i++) {
            a = money / coffee;
            b = money % coffee;
            answer[0] = a;
            answer[1] = b;
        }
        return answer;
    }
}