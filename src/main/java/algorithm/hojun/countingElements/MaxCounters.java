package algorithm.hojun.countingElements;

public class MaxCounters {

    public int[] solution(int N, int[] A){
        // 빈 array는 들어오지 않는다.
        // array 1~100,000
        //
        int[] answer = new int[N];
        int maxCount = 0;


        for (int i = 0; i < A.length; i++) {
            if(A[i] >= 0 && N >=A[i]){
                answer[A[i]-1] = ++answer[A[i]-1];
                maxCount = maxCount < answer[A[i]-1] ? ++maxCount : maxCount;

            }else if(A[i] == N+1){
                for (int j = 0; j < answer.length; j++) {
                    answer[j] = maxCount;
                }
            }
        }
        return answer;
    }
}
