package FormatException;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap x");
        int x = scanner.nextInt();
        System.out.println("nhap y");
        int y = scanner.nextInt();
          calc(x,y);
    }

    public static void calc(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Toong x + y = " + a);
            System.out.println("Toong x - y = " + b);
            System.out.println("Toong x * y = " + c);
            System.out.println("Toong x / y = " + d);
        } catch (Exception e) {
            System.out.println("xay ra ngoai le " + e.getMessage());
        }
    }
}
