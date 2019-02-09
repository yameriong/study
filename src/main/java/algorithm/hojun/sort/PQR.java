package algorithm.hojun.sort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PQR {
    public int solution(int[] A){
        //int[]를 Set에 넣어 중복제거함
        Integer[] integers = Arrays.stream(A).boxed().toArray(Integer[]::new);
        Set<Integer> set = new HashSet<>(Arrays.asList(integers));

        Arrays.sort(A);
        for (int i = A.length; i < A.length-3; i--) {

        }
        return set.size();
    }
}
