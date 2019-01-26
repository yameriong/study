package algorithm.hojun.countingElements;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@Slf4j
public class PermCheck_Test {
    PermCheck b = new PermCheck();
    int[] A = {4,1,3,2};
    int[] B = {100000,99999,99998,99996};
    int[] C = {1};
    int[] D = {1000000000};
    int[] E = {1,3};
    int[] F = {3,5,6};
    int[] G = {1,1,1};
    //100000-99997 = 3
    //100000-99996 = 4
    //6-3= 3+1 4 4
    //6-3= 3+1 4 3
    @Test
    public void solution() {
        assertEquals(1,b.solution(A));
        assertEquals(0,b.solution(B));
        assertEquals(1,b.solution(C));
        assertEquals(1,b.solution(D));
        assertEquals(0,b.solution(E));
        assertEquals(0,b.solution(F));
        assertEquals(1,b.solution(G));
    }
}

