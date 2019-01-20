package algorithm.jeon.binSearch;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * 바이너리 서치 알고리즘
 * *조건 : 정렬되어있는 배열에서 사용가능
 */
@Slf4j
public class BinSearch {

    @Test
    public void test() {
        int arr[] = {1,3,5,6,7,20,25,30,42,50};
        int key = 42;


        log.info(""+binSearch1(arr, key));

    }
    public int binSearch1(int[] arr, int key) {

        int pl =0, pc, pr = arr.length - 1;

        do {
            pc = (pl + pr) / 2;
            if(arr[pc] == key) {
                return pc;
            } else if (arr[pc] < key) {
                pl = pc + 1;
            } else if (arr[pc] > key){
                pr = pc - 1;
            }
        }while(pl <= pr);

        return -1;
    }

}
