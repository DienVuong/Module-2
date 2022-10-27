package TriangleException;

import java.util.Scanner;

public class TriangleException{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh 1 cua tam giac: ");
        double side1 = scanner.nextDouble();
        System.out.println("Nhap canh 2 cua tam giac: ");
        double side2 = scanner.nextDouble();
        System.out.println("Nhap canh 3 cua tam giac: ");
        double side3 = scanner.nextDouble();
        TriangleException triangleException = new TriangleException();
        triangleException.check(side1,side2, side3);


    }

    public void check(double side1, double side2, double side3)  {
        try {
            if (side1 + side2 < side3 || side2 + side3 < side1 || side1 + side3 < side2) {
                throw new ArithmeticException("loi tam giac khong hop le");
            } else {
                System.out.println(" tam giac hop le");
            }
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
