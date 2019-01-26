package algorithm.hojun.countingElements;

import java.util.Arrays;

public class PermCheck {

    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);

        for (int i=0; i<A.length; i++) {
            if (checkPermutation(i, A[i])) {
                return 0;
            }
        }

        return 1;
    }

    private boolean checkPermutation(int i, int value) {
        if (i + 1 != value) {
            return true;
        }
        return false;
    }

}
