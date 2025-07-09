package oop;

class A {
    A() {
        System.out.println("A 생성자");
    }
}

class B extends A {
    B() {
        super();                // ← 바로 위 클래스(A)의 생성자 호출
        System.out.println("B 생성자");
    }
}

class C extends B {
    C() {
        super();                // ← 바로 위 클래스(B)의 생성자 호출
        System.out.println("C 생성자");
    }
}

public class Main {
    public static void main(String[] args) {
        new C();
    }
}