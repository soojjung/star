package arrays;

public class ArrayBingo {

    public static void main(String[] args) {
        // 문제: 5x5 배열을 받아서 빙고 갯수를 반환하는 bingoCnt() 작성하시오.
        int[][] bingoArr = {{1, 0, 0, 0, 0}, {1, 1, 1, 1, 1}, {1, 0, 0, 0, 0}, {1, 0, 0, 0, 0}, {1, 0, 0, 0, 0}};
        System.out.println("cnt: " + bingoCnt(bingoArr));
    }

    static int bingoCnt(int[][] bingoArr) {
        int cnt = 0;

        // 가로로 모두 같은 숫자가 있으면 cnt++;
        // 세로로 모두 같은 숫자가 있으면 cnt++;
        // 대각선으로 모두 같은 숫자가 있으면 cnt++;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (bingoArr[i][j] == 0) {
                    break;
                }
                if (j == 4) {
                    cnt++;
                }
            }
        }

        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                if (bingoArr[i][j] == 0) {
                    break;
                }
                if (i == 4) {
                    cnt++;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            if (bingoArr[i][i] == 0) {
                break;
            }
            if (i == 4) {
                cnt++;
            }
        }

        for (int i = 0; i < 5; i++) {
            if (bingoArr[i][4 - i] == 0) {
                break;
            }
            if (i == 4) {
                cnt++;
            }
        }

        return cnt;
    }
}
