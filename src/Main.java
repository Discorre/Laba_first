import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueLoop = true;
        boolean continueLoop2 = true;

        System.out.println("Выберите тип фигуры (прямоугольник / треугольник):");

        while (continueLoop) {

            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("прямоугольник")) {
                System.out.println("Введите ширину прямоугольника:");
                double width = scanner.nextDouble();
                System.out.println("Введите высоту прямоугольника:");
                double height = scanner.nextDouble();

                Rectangle rectangle = new Rectangle(width, height);
                System.out.println("Выберите, что вы хотите получить (площадь / периметр / длина диагонали):");
                String parameter = scanner.next();

                switch (parameter.toLowerCase()) {
                    case "площадь":
                        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
                        break;
                    case "периметр":
                        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());
                        break;
                    case "длина диагонали":
                        System.out.println("Длина диагонали прямоугольника: " + rectangle.getDiagonalLength());
                        break;
                    default:
                        System.out.println("Неверный выбор параметра.");
                }
            } else if (choice.equalsIgnoreCase("треугольник")) {
                System.out.println("Введите длину первой стороны треугольника:");
                double side1 = scanner.nextDouble();
                System.out.println("Введите длину второй стороны треугольника:");
                double side2 = scanner.nextDouble();
                System.out.println("Введите длину третьей стороны треугольника:");
                double side3 = scanner.nextDouble();

                Triangle triangle = new Triangle(side1, side2, side3);
                System.out.println("Выберите, что вы хотите получить (площадь / периметр / равнобедренность):");
                String parameter = scanner.next();

                switch (parameter.toLowerCase()) {
                    case "площадь":
                        System.out.println("Площадь треугольника: " + triangle.getArea());
                        break;
                    case "периметр":
                        System.out.println("Периметр треугольника: " + triangle.getPerimeter());
                        break;
                    case "равнобедренность":
                        System.out.println("Является ли треугольник равнобедренным: " + triangle.isIsosceles());
                        break;
                    default:
                        System.out.println("Неверный выбор параметра.");
                }

            } else {
                System.out.println("Неправильный выбор. Пожалуйста, введите 'прямоугольник' или 'треугольник'.");

            }


        }
        scanner.close();
    }
}
