package algorithm.hojun.array;

import static junit.framework.TestCase.assertEquals;

import algorithm.hojun.sort.가장큰_수;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class arrays_TEST {
  arrays b = new arrays();

  int num1[] = {9,3,3,9,7,9};
  int num2[] = {9,9,9,9,7,9};
  int num3[] = {1,1,1,1,2,2,1,1,1,2,2,1,1,1,2,2,1,1,1,2,2,1,1,1,2,2,1,1,1,2,2,1,1,1,2,2,1,1,1,2,2,1,1,1,2,2,1,1,1,2,2,1,1,1,2,2,1,1,1,2,2,1,1,1,2,2,1,1,1,2,2,1,1,1,2,2,1,1,1,2,2,1,1,1,2,2,1,1,1,2,2,1,1,1,2,2,1,1,1,2,2,1,1,1,2,2,1,1,1,2,2,1,1,1,2,2,1,1,1,2,2,1,1,1,2,2,1,1,1,2,2,1,1,1,2,2,7};


  @Test
  public void solution() {
    assertEquals(7,b.solution(num1));
    assertEquals(7,b.solution(num2));
    assertEquals(7,b.solution(num3));
  }
}
