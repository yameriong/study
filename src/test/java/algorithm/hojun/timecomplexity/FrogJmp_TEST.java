package algorithm.hojun.timecomplexity;

import static junit.framework.TestCase.assertEquals;

import algorithm.hojun.sort.가장큰_수;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class FrogJmp_TEST {
  FrogJmp b = new FrogJmp();

  int X = 10;
  int Y = 85;
  int D = 30;

  @Test
  public void solution() {
    assertEquals(3,b.solution(X,Y,D));
  }
}
