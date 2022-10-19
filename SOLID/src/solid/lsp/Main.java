package solid.lsp;

public class Main {

    private static final int width = 7;
    private static final int height = 4;
    private static final int side = 10;

    public static void main(String[] args) {
        Shape reg1 = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + reg1.getArea());

        Shape reg2 = new Square(side);
        System.out.println("====   Square  ====");
        System.out.println("Side = " + ((Square)reg2).getSide());
        System.out.println("Area = " + reg2.getArea());
    }
}
