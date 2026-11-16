package inheritance;

public class Program {
    public static void main (String[] args) {
        Rectangle rect = new Rectangle(10,20);
        System.out.println(rect.getArea());

        Square square = new Square(5, 5);

        System.out.println(square.getArea());
        square.setHeight(10);
        System.out.println(square.getArea());
    }
}