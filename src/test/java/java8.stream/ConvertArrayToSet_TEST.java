package java8.stream;

import static junit.framework.TestCase.assertEquals;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;


@Slf4j
public class ConvertArrayToSet_TEST {
  ConvertArrayToSet b = new ConvertArrayToSet();

  Integer num1[] = {2,10,6,2,102,23,1423,11,23,21413,22,11,22,33,545,112,3322,112,0,4,-12,32};
  String[] str1 = {"a","b","bb","ccccc","c","f","d","DD"};



  @Test
  public void solution() {

    List<Integer> a = b.convertArrayToSet(num1);
    Collections.sort(a, (o1,o2)-> o1-o2);

    List<String> c = b.convertArrayToSet(str1);
    Collections.sort(c, Comparator.naturalOrder());

    assertEquals("[2,6,10]",a);

  }
}
