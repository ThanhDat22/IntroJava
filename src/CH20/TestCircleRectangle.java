package CH20;

public class TestCircleRectangle {
    public static void main(String[] args) {

        // Test circle
        GeometricObject circle = new Circle(1);
        System.out.println(circle.toString());
        System.out.printf("The area is: %.2f\n", circle.getArea());
        System.out.printf("The perimeter is: %.2f\n", circle.getPerimeter());
        System.out.println("-----------------------------------------------------------------------");

        // Test rectangle
        GeometricObject rectangle = new Rectangle(2, 4);
        System.out.println();
        System.out.println(rectangle.toString());
        System.out.printf("The area is: %.2f\n", rectangle.getArea());
        System.out.printf("The perimeter is: %.2f\n", rectangle.getPerimeter());
    }
}
