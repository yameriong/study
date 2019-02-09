package algorithm.hojun.sort;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class PQR_Test {

  @Test
  public void test(){
    int [] A = {-3,1,2,-2,5,6};
    Arrays.sort(A);
    int result = A[A.length-3] * A[A.length-2] * A[A.length-1];
    int tmp = A[0] * A[1] * A[A.length-1];
    log.debug("{}",(result < tmp) ? tmp : result);
  }
}
