package baitap;

import java.util.Scanner;

public class DogSystem {
    Scanner scanner = new Scanner(System.in);
    DogManager dogManager = new DogManager();

    public void menu(){
        do {
            System.out.println("Mennu");
            System.out.println("1. Tạo danh sách Dog:");
            System.out.println("2. Sửa thông tin Dog theo ID:");
            System.out.println("3. Xóa 1 đối tượng Dog theo ID:");
            System.out.println("4. Hiển thị thông tin đối tượng Dog theo ID:");
            System.out.println("5. Hiển thị thông tin danh sách Dog:");
            System.out.println("6. Hiển thị thông tin Dog có Cân nặng lớn hơn 2:");
            System.out.println("Nhập lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    dogManager.addDog();
                    break;
                case 2:
                    dogManager.updateDogById();
                    break;
                case 3:
                    dogManager.removeDogById();
                case 4:
                    dogManager.showDogById();
                    break;
                case 5:
                    dogManager.showDog();
                    break;
                case 6:
                    dogManager.showDogByWeight();
                    break;
                default:
                    System.out.println("Mời bạn lựa chọn lại");

            }
        } while (true);
    }

}
