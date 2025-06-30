import java.util.Arrays;

public class ArrayCompare {
    public static void main(String[] args) {
        // 문제: 1~9로 된 3자리수(중복x) 2개를 비교하여 결과로 "1S2B" 형식으로 출력하시오.

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 5, 3};
        int s = 0;  // 같은 위치, 같은 숫자 s++
        int b = 0;  // 다른 위치, 같은 숫자 b++

        // 1. 두 배열을 비교
        // arr1을 for loop 돌려
        // arr2의 각 요소들과 비교하는데
        // 값이 같고 인덱스도 같으면 s++
        // 값은 같은데 인덱스는 다르면 b++
        // 값 같은거 없으면 아무일도 일어나지 않음

        // 2. 결과를 출력
        // System.out.println(s + "S" + b + "B");

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (i == j && arr1[i] == arr2[j]) {
                    s++;
                } else if (i != j && arr1[i] == arr2[j]) {
                    b++;
                }
            }
        }
        System.out.println(s + "S" + b + "B");
    }
}
