import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип фигуры (rectangle / triangle):");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("rectangle")) {
            System.out.println("Введите ширину прямоугольника:");
            double width = scanner.nextDouble();
            System.out.println("Введите высоту прямоугольника:");
            double height = scanner.nextDouble();

            Rectangle rectangle = new Rectangle(width, height);
            System.out.println("Прямоугольник:");
            System.out.println("Периметр: " + rectangle.getPerimeter());
            System.out.println("Площадь: " + rectangle.getArea());
            System.out.println("Длина диагонали: " + rectangle.getDiagonalLength());
        } else if (choice.equalsIgnoreCase("triangle")) {
            System.out.println("Введите длину первой стороны треугольника:");
            double side1 = scanner.nextDouble();
            System.out.println("Введите длину второй стороны треугольника:");
            double side2 = scanner.nextDouble();
            System.out.println("Введите длину третьей стороны треугольника:");
            double side3 = scanner.nextDouble();

            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println("\nТреугольник:");
            System.out.println("Периметр: " + triangle.getPerimeter());
            System.out.println("Площадь: " + triangle.getArea());
            System.out.println("Является ли треугольник равнобедренным: " + triangle.isIsosceles());
        } else {
            System.out.println("Неправильный выбор. Пожалуйста, введите 'rectangle' или 'triangle'.");
        }

        scanner.close();
    }
}
