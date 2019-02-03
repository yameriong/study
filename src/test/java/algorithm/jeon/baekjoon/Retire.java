package algorithm.jeon.baekjoon;

import java.util.Scanner;

public class Retire {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int q[][] = new int[num][2];
        for(int i = 0 ; i < num ; i++) {
            q[i][0] = Integer.parseInt(sc.next());
            q[i][1] = Integer.parseInt(sc.next());
        }

        System.out.println(solution(q, 0, num));
    }

    static int solution(int q[][], int startDay, int total) {
        int max = 0;
        int pay = 0;

        for(int d = startDay ; d < total ; d++) {
            //작업 소요일이 남은것보다 많으면 안됨
            int wd = q[d][0]; //작업소요일
            if(wd + d > total)
                pay = 0;
            else
                pay = q[d][1] + solution(q, d + wd , total); //페이 + 남은 일수의 돈번거 중에 큰거
            max = max < pay ? pay : max;
        }
        return max;
    }
}
