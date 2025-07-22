package oop;

public class Exercise7_18 {

    public static void main(String[] args) {
        Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};

        for (int i = 0; i < arr.length; i++) {
            action(arr[i]);
        }
    }

    static void action(Robot r) {
        switch (r) {
            case DanceRobot d -> d.dance();
            case SingRobot s -> s.sing();
            case DrawRobot d -> d.draw();
            default -> System.out.println("알 수 없는 로봇입니다.");
        }
    }

    static class Robot {
    }

    static class DanceRobot extends Robot {
        void dance() {
            System.out.println("춤을 춥니다.");
        }
    }

    static class SingRobot extends Robot {
        void sing() {
            System.out.println("노래를 합니다.");
        }
    }

    static class DrawRobot extends Robot {
        void draw() {
            System.out.println("그림을 그립니다.");
        }
    }
}