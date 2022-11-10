package pl.kurs.task1;

import java.util.Objects;

public class Circle extends Figura{

    private double PI = Math.PI;

    private double r;
    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * r;
    }

    @Override
    public double calculateArea() {
        return PI * Math.pow(r, 2);
    }

    @Override
    public void counter() {
        System.out.print("Figura nr " + counter++);
    }

    @Override
    public String toString() {
        counter();
        return ": Koło o " +
                "promieniu " + r + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.r, r) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r);
    }
}
