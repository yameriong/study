package algorithm.hojun.array;


import java.util.LinkedList;

public class CyclicRotation {
  public int[] solution(int[] A, int K){

    if (A.length<1 || K == 0){
      return A;
    }

    LinkedList<Integer> linkedList = new LinkedList<>();
    for (int currentInt : A) {
      linkedList.add(currentInt);
    }
    for (int i = 0; i < K; i++) {
      linkedList.push(linkedList.getLast());
      linkedList.removeLast();
    }
    return linkedList.stream().mapToInt(i->i).toArray();
  }
}
