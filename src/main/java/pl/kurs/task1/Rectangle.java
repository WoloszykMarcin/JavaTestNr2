package pl.kurs.task1;

import java.util.Objects;

public class Rectangle extends Figura{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public void counter() {
        System.out.print("Figura nr " + counter++);
    }

    @Override
    public String toString() {
        counter();
        return ": Prostokąt o " +
                "bokach " + a + " x " + b + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.a, a) == 0 && Double.compare(rectangle.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
