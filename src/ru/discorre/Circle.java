package ru.discorre;

public class Circle {
    double radius;
    int degree;

    public Circle(double r, int d) {
        if (r <= 0) {
            throw new IllegalArgumentException("Такой окружности не существует.");
        }
        this.radius = r;
        this.degree = d;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getAreaOfACircle() {
        return Math.PI * radius * radius;
    }

    public double getAreaOfACircularSector() {
        return getAreaOfACircle() * ((double) degree / 360);
    }
}
