package arrays;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10);
            System.out.print(numArr[i]);
        }
        System.out.println();
        System.out.println("numArr : " + Arrays.toString(numArr));

        for (int i = 0; i < numArr.length; i++) {
            counter[numArr[i]]++;
        }
        System.out.println("counter: " + Arrays.toString(counter));

        for (int i = 0; i < numArr.length; i++) {
            System.out.println(i + "의 개수 :" + counter[i]);
        }


        // 1. 중복 제거
        // counter 에서 0보다 큰 값들이 있는 인덱스들
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > 0) {
                System.out.print(i);
            }
        }
        System.out.println();


        // 2. 정렬 - 정렬 알고리즘이나 함수 사용 x
        // counter 에서 0보다 큰 값들의 인덱스들을 counter[i]만큼 반복한다.
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > 0) {
                System.out.print(String.valueOf(i).repeat(counter[i]));
//                for (int j = 0; j < counter[i]; j++) {
//                    System.out.print(i);
//                }
            }
        }

        System.out.println();

    }
}
