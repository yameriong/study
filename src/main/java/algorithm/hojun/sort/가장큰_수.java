package algorithm.hojun.sort;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 가장큰_수 {

  public String solution(int[] numbers){
    List<String> list = IntStream.of(numbers).boxed().collect(Collectors.toList()).stream().map(Object::toString)
                               .collect(Collectors.toList());
    list.sort((num1, num2) -> (num2+num1).compareTo(num1+num2));
    if(list.get(0).equals("0")){
      return "0";
    }
    return list.stream().collect(Collectors.joining(""));
  }
}
