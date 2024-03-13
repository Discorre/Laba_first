package ru.discorre;

public class Rectangle {
    double width;
    double height;

    public Rectangle(double w, double h) {
        // Проверяем, что все стороны положительны
        if (w <= 0 || h <= 0) {
            throw new IllegalArgumentException("Все стороны прямоугольника должны быть положительными числами.");
        }
        width = w;
        height = h;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getArea() {
        return width * height;
    }

    public double getDiagonalLength() {
        return Math.sqrt(width * width + height * height);
    }
}
