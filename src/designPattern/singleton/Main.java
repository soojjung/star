package designPattern.singleton;

public class Main {
    public static void main(String[] arv) {
        System.out.println("start");

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        int[] a = new int[3];
        int[] b = new int[5];

        if (obj1 == obj2) {
            System.out.println("obj1 == obj2. obj1과 obj2는 같은 인스턴스입니다.");
        } else {
            System.out.println("obj1 != obj2");
        }
        System.out.println("End");
    }

}
