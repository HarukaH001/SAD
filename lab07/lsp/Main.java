package lsp;

public class Main {

    private static final int width = 4;
    private static final int height = 5;

    public static void main(String[] args) {
        Rectangle reg = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + reg.getWidth());
        System.out.println("Height = " + reg.getHeight());
        System.out.println("Area = " + reg.getArea());

        Square sq = new Square(5);
        sq.setWidth(width);
        sq.setHeight(height);
        System.out.println("====   Square  ====");
        System.out.println("Width = " + sq.getWidth());
        System.out.println("Height = " + sq.getHeight());
        System.out.println("Area = " + sq.getArea());
    }
}