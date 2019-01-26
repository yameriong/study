package algorithm.jeon.codility;

import java.util.Arrays;

//commit test
public class PermCheck {

    public static void main(String args[]) {
        int case1[] = {4,1,3,2};
        int case2[] = {4,1,3};

        System.out.println("case 1 resut : " + solution(case1));
        System.out.println("case 2 resut : " + solution(case2));
    }
    public static int solution(int[] A) {

        // write your code in Java SE 8
        Arrays.sort(A);

        for(int i = 0 ; i < A.length ; i++) {
            if(A[i] != (i + 1))
                return 0;
        }
        return 1;

    }
}
