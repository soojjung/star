public class ArrayMid {
    public static void main(String[] args) {
        // 문제: 세 개의 정수를 받아서 셋 중에 가운데 크기의 값을 반환하는 mid()를 작성하고 Test 하시오.
        // print(mid(1,2,3)); // 2
        // print(mid(2,1,3)); // 2
        // print(mid(1,1,1)); // 1

        System.out.println(mid(2, 10, 8));
    }

    static int mid(int x, int y, int z) {
        // 조건문으로 가장 작은 값을 정하고, 나머지 둘 중에 작은 값을 리턴
        if (x <= y && x <= z) {
            return y > z ? z : y;
        } else if (y <= x && y <= z) {
            return x > z ? z : x;
        } else {
            return x > y ? y : x;
        }
    }
}
