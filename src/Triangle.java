public class Triangle {
    double side1;
    double side2;
    double side3;

    public Triangle(double s1, double s2, double s3) {
        // Проверяем, что все стороны положительны
        if (s1 <= 0 || s2 <= 0 || s3 <= 0) {
            throw new IllegalArgumentException("Все стороны треугольника должны быть положительными числами.");
        }

        // Проверяем неравенство треугольника
        if (!(s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1)) {
            throw new IllegalArgumentException("Треугольник с такими сторонами не существует.");
        }


    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public boolean isIsosceles() {
        return side1 == side2 || side1 == side3 || side2 == side3;
    }
}