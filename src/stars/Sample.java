package stars;

public class Sample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j)
                    System.out.printf("[%d, %d]", i, j);
                else
                    System.out.print("      ");
            }
            System.out.println();
        }
    }
}
