package example6;

public class exam5 {
    public static void main(String[] args) {
        System.out.println(Card.width);
        System.out.println(Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        // c1.width = 50;
        // c1.height = 80;
        // c1, c2 둘다 크기 변경.
    }
}

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}