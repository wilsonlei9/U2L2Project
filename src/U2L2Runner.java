public class U2L2Runner {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(150, 200);
        Rectangle rect2 = new Rectangle(100);
        Rectangle rect3 = new Rectangle();

        int rectPerimeter = (rect.getLength()*2) + (rect.getWidth()*2);

        rect.setWidth(125);
        rect2.setWidth(125);
        rect2.setLength(125);
        rect3.setWidth(125);

        rect.printRectangleInfo();
        System.out.println("The perimeter of this rectangle is " +  rectPerimeter);
        rect2.printRectangleInfo();
        System.out.println();
        rect3.printRectangleInfo();
    }
}
