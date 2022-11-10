package pl.kurs.task1;

public class Runner {
    public static void main(String[] args) throws NegativeParameterException {
        Figura[] figury = {Figura.makeASquare(10),
                Figura.makeACircle(20),
                Figura.makeARectangle(10,20),
                Figura.makeASquare(15)};

        for(Figura f : figury) {
            System.out.println(f);
        }

        findFigureWithTheGreatestPerimeter(figury);
        findFigureWithTheGreatestArea(figury);

        for(Figura f : figury) {
            if (f.equals(Figura.makeARectangle(10, 20))) {
                System.out.println("tu powinno wejsc");
            }
        }

    }

    public static void findFigureWithTheGreatestPerimeter(Figura... figury) {
        double max = 0;
        int index = 0;
        for (int i = 0; i < figury.length; i++) {
            if (figury[i] != null && figury[i].calculatePerimeter() > max) {
                max = figury[i].calculatePerimeter();
                index = i;
            }
        }
        System.out.println("Figure with the greatest perimeter: " + "Figure with index " + index + " " + figury[index].getClass().getSimpleName());
    }

    public static void findFigureWithTheGreatestArea(Figura... figury) {
        double max = 0;
        int index = 0;
        for (int i = 0; i < figury.length; i++) {
            if (figury[i] != null && figury[i].calculateArea() > max) {
                max = figury[i].calculateArea();
                index = i;
            }
        }
        System.out.println("Figure with the greatest area: " + "Figure with index " + index + " " + figury[index].getClass().getSimpleName());
    }

}
