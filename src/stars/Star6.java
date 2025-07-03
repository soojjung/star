package stars;

public class Star6 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            System.out.println(" ".repeat(6 - i) + "*".repeat(i));
        }
    }
}
