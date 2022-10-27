import java.util.Scanner;
import java.util.ArrayList;

public class BookSystem {
    private final BookManager bookManager;
    private final Scanner scanner;
    public BookSystem(){
        this.bookManager = new BookManager();
        this.scanner = new Scanner(System.in);
    }
    public void menuBookManager(){
        do{
            System.out.println("MENU");
            System.out.println("1. Tao sach");
            System.out.println("2. tinh tong tien");
            System.out.println("3. dem sach java");
            System.out.println("4. dem sach vien tuong 1");
            System.out.println("5. dem sach Fiction ca gia < 100");
            System.out.println("6. hien thi tat ca danh sach");
            System.out.println("0. thoat");
            System.out.println("moi nhap lua chon");
            int choice1 = Integer.parseInt(scanner.nextLine());
            switch (choice1){
                case 1:
                    menuCreadBook();
                    break;
                case 2:
                    bookManager.sumPrice();
                    break;
                case 3:
                    bookManager.countProgrammingBookByLanguage();
                    break;
                case 4:
                    bookManager.countFictionBookByCategory();
                    break;
                case 5:
                    bookManager.countFictionBookByPrice();
                    break;
                case 6:
                    bookManager.display();
                    break;
                case 0:
                    System.exit(0);
            }
        }while (true);
    }
    private void menuCreadBook(){
        int choice2;
        do{
            System.out.println("chon loai sach muon tao");
            System.out.println("1. sach thong thuong");
            System.out.println("2. sach lap trinh");
            System.out.println("3. sach khoa hoc");
            System.out.println("0. thoat");
            choice2 = Integer.parseInt(scanner.nextLine());
            if(choice2 == 0){
                break;
            }
            bookManager.addBook(choice2, scanner);
        }while (true);
    }
}
