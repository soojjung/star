package oop;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < CARD_NUM / 2; j++) {
                int k = j + i * 10;
                int num = j + 1;
                boolean isKwang = i == 0 && (num == 1 || num == 3 || num == 8);
                cards[k] = new SutdaCard(num, isKwang);
            }
        }
    }

    public void shuffle() {
        System.out.print(this.cards);
    }

    public SutdaCard pick() {
        return new SutdaCard();
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

public class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.println(deck.cards[i] + ",");
        }

        deck.shuffle();
    }
}
