package ru.discorre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueLoop = true;
        boolean continueLoop2 = true;

        System.out.println("Выберите тип фигуры (прямоугольник / треугольник / окружность):");

        while (continueLoop) {

            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("прямоугольник")) {
                System.out.println("Введите ширину прямоугольника:");
                double width = scanner.nextDouble();
                System.out.println("Введите высоту прямоугольника:");
                double height = scanner.nextDouble();

                Rectangle rectangle = new Rectangle(width, height);

                System.out.println("Площадь прямоугольника: " + rectangle.getArea());
                System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());
                System.out.println("Длина диагонали прямоугольника: " + rectangle.getDiagonalLength());
                break;
                /*System.out.println("Выберите, что вы хотите получить (площадь / периметр / длина диагонали):");
                String parameterrect = scanner.next();

                switch (parameterrect.toLowerCase()) {
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
                }*/
            } else if (choice.equalsIgnoreCase("треугольник")) {
                System.out.println("Введите длину первой стороны треугольника:");
                double side1 = scanner.nextDouble();
                System.out.println("Введите длину второй стороны треугольника:");
                double side2 = scanner.nextDouble();
                System.out.println("Введите длину третьей стороны треугольника:");
                double side3 = scanner.nextDouble();

                Triangle triangle = new Triangle(side1, side2, side3);
                System.out.println("Площадь треугольника: " + triangle.getArea());
                System.out.println("Периметр треугольника: " + triangle.getPerimeter());
                System.out.println("Является ли треугольник равнобедренным: " + triangle.isIsosceles());
                /*System.out.println("Выберите, что вы хотите получить (площадь / периметр / равнобедренность):");
                String parametertri = scanner.next();

                switch (parametertri.toLowerCase()) {
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
                }*/

            } else if (choice.equalsIgnoreCase("окружность")) {
                System.out.println("Введите радиус окружности: ");
                double radius = scanner.nextDouble();
                System.out.println("Введите угол сектора окружности: ");
                int degree = scanner.nextInt();

                Circle circle = new Circle(radius, degree);
                System.out.println("Длина окружности: " + circle.getCircumference());
                System.out.println("Площадь круга: " + circle.getAreaOfACircle());
                System.out.println("Площадь кругового сектора: " + circle.getAreaOfACircularSector());
                /*System.out.println("Выберите, что вы хотите получить (длина / площадь / площадь сектора):");
                String parametrcirc = scanner.next();
                switch (parametrcirc.toLowerCase()){
                    case "длина":
                        System.out.println("Длина окружности: " + circle.getCircumference());
                        break;
                    case "площадь":
                        System.out.println("Площадь круга: " + circle.getAreaOfACircle());
                        break;
                    case "площадь сектора":
                        System.out.println("Площадь кругового сектора: " + circle.getAreaOfACircularSector());
                    default:
                        System.out.println("Неверный выбор параметра.");
                }*/

            } else {
                System.out.println("Неправильный выбор. Пожалуйста, введите 'прямоугольник' или 'треугольник' или 'окружность'.");

            }


        }
        scanner.close();
    }
}
