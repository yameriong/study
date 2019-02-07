package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertArrayToSet {
  public <T> List<T> convertArrayToSet ( T array[]){
    return Arrays.asList(array).parallelStream().distinct().collect(Collectors.toList());
  }
}
