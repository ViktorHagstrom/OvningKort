public class Main {

    public static void main(String[] args) {

        // Övning 13.6

        // Klöver 7
        Kort c1 = Kort.getInstance(Kort.CLUBS, 7);
        // Spader dam
        Kort c2 = Kort.getInstance(Kort.SPADES, Kort.QUEEN);

        Kort.print(c1);
        Kort.print(c2);

        Kort c3 = Kort.getRandomInstance();
        Kort.print(c3);

    }


}
