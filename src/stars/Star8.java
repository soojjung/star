package stars;

public class Star8 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(" ".repeat(4 - i) + "*".repeat(i * 2 + 1));
        }
    }
}
