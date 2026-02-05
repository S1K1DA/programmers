import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int n : arr) {
            if (n % divisor == 0) {
                list.add(n);
            }
        }

        if (list.isEmpty()) {
            return new int[] { -1 };
        }

        Collections.sort(list);

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
