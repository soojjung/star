package oop;

import java.util.Arrays;

public class Exercise7_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new MyTv());
        b.buy(new Computer());
        b.buy(new MyTv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}

class Buyer {
    int INIT_MONEY = 1000;
    int money = INIT_MONEY;
    Product[] cart = new Product[3];
    int i = 0;

    void buy(Product p) {

    }

    void add(Product p) {

    }

    void summary() {
        System.out.println("구입한 물건:" + Arrays.toString(cart));
        System.out.println("사용한 금액:" + (INIT_MONEY - money));
        System.out.println("남은 금액:" + money);
    }
}

class Product {
    int price;

    Product(int price) {
        this.price = price;
    }
}

class MyTv extends Product {
    MyTv() {
        super(100);
    }

    public String toString() {
        return "MyTv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}
