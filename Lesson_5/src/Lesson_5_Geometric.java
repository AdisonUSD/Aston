public class Lesson_5_Geometric {
    public static void main(String[] args) {

        Circle circle = new Circle(5.0, "Красный", "Черный");
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Синий", "Зеленый");
        Triangle triangle = new Triangle(3.0, 4.0, 5.0, "Желтый", "Коричневый");
        printShapeInfo(circle);
        printShapeInfo(rectangle);
        printShapeInfo(triangle);
    }

    private static void printShapeInfo(Shape shape) {
        System.out.println("Фигура:");
        System.out.println("Периметр: " + shape.calculatePerimeter());
        System.out.println("Площадь: " + shape.calculateArea());
        System.out.println("Цвет фона: " + shape.getFillColor());
        System.out.println("Цвет границ: " + shape.getBorderColor());
        System.out.println();
    }
}

