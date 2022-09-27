import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many pieces of lumber do you need?");
        int board = s.nextInt();
        System.out.println("How many windows do you need?");
        int windows = s.nextInt();
        System.out.println("What is the tax rate for your area?");
        double taxRate = s.nextDouble();

        ConstructionPricer home1 = new ConstructionPricer(11.50, 25.75, taxRate/100);
        System.out.println("Total Materials Cost: " + home1.materialsCost(board, windows));
        System.out.println("Grand Total After Tax: " + home1.totalWithTax(home1.materialsCost(board, windows)));
    }
}