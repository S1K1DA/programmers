class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);     // 자릿수 길이 확인용
        int[] answer = new int[s.length()];
        int index = 0;

        while (n > 0) {
            answer[index] = (int)(n % 10);
            n /= 10;
            index++;
        }
        return answer;
    }
}
