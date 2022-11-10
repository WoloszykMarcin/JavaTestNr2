package pl.kurs.task2;

public class Runner {
    public static void main(String[] args) {

        long start1 = System.nanoTime();
        StringBuilder builder = new StringBuilder("0");
        for (int i = 1; i < 1000 ; i++) {
            builder.append(" ");
            builder.append(i);
        }
        String numbers = builder.toString();
        long stop1 = System.nanoTime();
        long result1 = stop1 - start1;

        // w przypadku użycia StringBuilder'a zmiany dokonują się na jednym obiekcie (StringBuilder jest mutable / mozna wykonywać operacje na obiekcie i go modyfikować) (nie tworzymy z każdą iteracją nowego obiektu) - dlatego czas wykonania działania jest krótszy

        System.out.println(numbers);
        System.out.println("Czas wykonania iteracji przy użyciu StringBuilder'a: " + result1);

        long start2 = System.nanoTime();
        String numbers2 = "0";
        for (int i = 1; i < 1000; i++) {
            numbers2 = numbers2 + " " + i;
        }
        long stop2 = System.nanoTime();
        long result2 = stop2 - start2;

        // podczas zwykłej konkatenacji z użyciem literału pod spodem działa String Builder (z każdą iteracją tworzy się nowy obiekt StringBuilder wraz z metodą append()) (Stringi są immutable / niezmienne)

        System.out.println(numbers2);
        System.out.println("Czas wykonania iteracji przy użyciu zwykłej kontaktenacji: " + result2);
        System.out.println(result2 / result1 + " x dłużej wykonuje się iteracja bez użycia StringBuilder'a");
    }
}
