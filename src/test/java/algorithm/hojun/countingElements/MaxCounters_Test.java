package algorithm.hojun.countingElements;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@Slf4j
public class MaxCounters_Test {
    MaxCounters b = new MaxCounters();
    int[] A = {3,4,4,6,1,4,4};

    int[] ans = {3,2,2,4,2};
    @Test
    public void solution() {
        assertEquals(ans,b.solution(5,A));
    }
}

