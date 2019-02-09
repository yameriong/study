package algorithm.hojun.countingElements;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@Slf4j
public class FrogRiverOne_Test {
    FrogRiverOne b = new FrogRiverOne();
    int[] A = {1,3,1,4,2,3,5,4};

    @Test
    public void solution() {
        assertEquals(6,b.solution(5,A));
    }
}

