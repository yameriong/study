package algorithm.hojun.array;

import static junit.framework.TestCase.assertEquals;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class CyclicRotation_TEST {
  CyclicRotation b = new CyclicRotation();

  int num1[] = {3, 8, 9, 7, 6};
  int num2[] = {9, 7, 6, 3, 8};

  @Test
  public void solution() {
    assertEquals(num2,b.solution(num1,3));
  }
}
