package pl.kurs.task1;

public abstract class Figura {

    static int counter = 1;

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    public abstract void counter();

    public static Circle makeACircle(double r) throws NegativeParameterException {
        if (r < 0) {
            throw new NegativeParameterException("Negative parameter");
        }
        return new Circle(r);
    }

    public static Rectangle makeARectangle(double a, double b) throws NegativeParameterException{
        if (a < 0 || b < 0) {
            throw new NegativeParameterException("Negative parameter");
        }
        return new Rectangle(a,b);
    }

    public static Square makeASquare(double a) throws NegativeParameterException {
        if (a < 0) {
            throw new NegativeParameterException("Negative parameter");
        }
        return new Square(a);
    }
}
