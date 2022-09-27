public class U2L2Runner {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(150, 200);
        Rectangle rect2 = new Rectangle(100);
        Rectangle rect3 = new Rectangle();

        rect.setWidth(125);
        rect2.setWidth(125);
        rect2.setLength(125);
        rect3.setWidth(125);

        rect.printRectangleInfo();
        System.out.println("The perimeter of this rectangle is " + rect.calculatePerimeter());
        System.out.println();
        rect2.printRectangleInfo();
        System.out.println("The perimeter of this rectangle is " + rect2.calculatePerimeter());
        System.out.println();
        rect3.printRectangleInfo();
        System.out.println("The perimeter of this rectangle is " + rect3.calculatePerimeter());
        System.out.println();
        System.out.print("The total perimeter is ");
        System.out.print(rect.calculatePerimeter() + rect2.calculatePerimeter() + rect3.calculatePerimeter());
        System.out.println(" feet");
        System.out.print("The total area is ");
        System.out.print(rect.calculateArea() + rect2.calculateArea() + rect3.calculateArea());
        System.out.print(" square feet");
    }
}
