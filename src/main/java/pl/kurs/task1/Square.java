package pl.kurs.task1;

import java.util.Objects;

public class Square extends Figura{
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * a;
    }

    @Override
    public double calculateArea() {
        return Math.pow(a, 2);
    }

    @Override
    public void counter() {
        System.out.print("Figura nr " + counter++);
    }

    @Override
    public String toString() {
        counter();
        return ": Kwadrat o " +
                "boku " + a + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.a, a) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
