import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr); // 오름차
        
        StringBuilder sb = new StringBuilder(new String(arr));
        sb.reverse(); // 내림차
        
        return Long.parseLong(sb.toString());
    }
}