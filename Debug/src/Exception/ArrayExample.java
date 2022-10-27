package Exception;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random random = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach phan tu cua mang");
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n vui long nhap chi so cua phan tu bat ky");
        int x = scanner.nextInt();
        try {
            System.out.println("gia tri cua phan tu co chi so 5" + x + "la " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("chi so vuot qua gioi hna cua mang");
        }
    }
}
