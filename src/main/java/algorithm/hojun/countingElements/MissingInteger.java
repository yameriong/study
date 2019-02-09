package algorithm.hojun.countingElements;


import java.util.*;

public class MissingInteger {
    //중복 가능한 array에서 순열에 빈 수가 있으면 빈수를 출력하고
    //순열인 경우 마지막 수를 더하고
    //전부 음수가 있으면 1을 리턴한다.
    public int solution(int[] A){
        int lastNum = 1;
        Arrays.sort(A);
        for (int number:A) {
            if(number>0 && number != (lastNum -1)){
                if( number == lastNum){
                    lastNum++;
                }else {
                    break;
                }

            }
        }
        return lastNum;
    }
}
