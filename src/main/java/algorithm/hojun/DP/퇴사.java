package algorithm.hojun.DP;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


public class 퇴사 {
    public int solution(int X, int[] A, int[] B) {
        //N max 15
        //T max 5
        //p max 1000
        // 3 + 1 + 2 = 6  Max N = n-1

        // 2중 반복문 처리해서 t의 값이 합이 n-1인 것만 뽑고 pi/ti 했을때 가장 높은값을 찾으면 끝
        // N+1째는 회사에 없다 그래서 7+1

        /*List<Propit> list = new ArrayList<>();

        for (int i = 0; i < X; i++) {
            if(X + A[i] > X){
                break;
            }
            int a = A[i];
            int b = B[i];
            Integer value = b/a;
            final Propit propit = new Propit();
            propit.setT(A[i]);
            propit.setP(B[i]);
            propit.setPit(value.intValue());
            list.add(propit);
        }




        // max 값을 출력하면 끝





        return 0;
    }

    class Propit {
        int T;
        int P;
        Integer Pit;

        public int getT() {
            return T;
        }

        public void setT(int t) {
            T = t;
        }

        public int getP() {
            return P;
        }

        public void setP(int p) {
            P = p;
        }

        public Integer getPit() {
            return Pit;
        }

        public void setPit(Integer pit) {
            Pit = pit;
        }
    }*/
        return 0;
    }

}
