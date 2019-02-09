package algorithm.hojun.countingElements;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@Slf4j
public class MissingInteger_Test {
    MissingInteger b = new MissingInteger();
    int[] A = {1, 3, 6, 4, 1, 2};
    int[] B = {1, 2, 3};
    int[] C = {-1,-3};
    int[] D = {-1,-2,-3,1};

    @Test
    public void solution() {

        assertEquals(5,b.solution(A));
        assertEquals(4,b.solution(B));
        assertEquals(1,b.solution(C));
        assertEquals(0,b.solution(D));
    }
}

