package algorithm.hojun.countingElements;

import java.util.*;

public class FrogRiverOne {
    public int solution(int X, int[] A){
        // A[]안에 X이하의 값이 있어야한다.
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X) {
                set.add(A[i]);
                if (set.size() == X){
                    return i;
                }
            }
        }
        return -1;
    }
}
