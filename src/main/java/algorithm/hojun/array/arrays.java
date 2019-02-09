package algorithm.hojun.array;


import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class arrays {
  public int solution(int[] A){
    int answer = 0;

    if (A.length <= 0){
      return answer;
    }

    Map<Integer,Integer> map = new HashMap<>();

    for(int i : A){
      if (map.containsKey(i)){
        map.put(i, map.get(i) + 1);
      }else {
        map.put(i, 1);
      }
    }
    map = map.entrySet()
        .stream()
        .filter(maps -> maps.getValue() == 1)
        .collect(Collectors.toMap(maps -> maps.getKey(), maps -> maps.getValue()));
    return map.keySet().stream().findFirst().get();
  }
}
