import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
    private final ArrayList<Book> books;

    public BookManager(){
        books = new ArrayList<>();
    }

    public void addBook(int choice, Scanner scanner){
        if(choice < 1 || choice > 3){
            System.out.println("lua chon khong phu hop, moi nhap lai");
        }else{
            System.out.println("nhap ma sach");
            String code = scanner.nextLine();
            System.out.println("nhap ten sach");
            String name = scanner.nextLine();
            System.out.println("nhap gia sach");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("nhap tac gia sach");
            String author = scanner.nextLine();
            if(choice == 1){
                books.add(new Book(code, name, price, author));
            }else if( choice ==2){
                System.out.println("nhap ngon ngu cua sach");
                String langguage = scanner.nextLine();
                System.out.println("nhap framework cua sach:");
                String franmework = scanner.nextLine();
                books.add(new ProgrammingBook(code,name, price, author, langguage, franmework));

            }else{
                System.out.println("nhap the loai cua sach");
                String category = scanner.nextLine();
                books.add(new FictionBook(code, name, price, author, category));
            }
        }

    }
    public void countProgrammingBookByLanguage(){
        int count = 0;
        for(Book book : books){
            if(book instanceof ProgrammingBook){
                if (((ProgrammingBook) book).getLanguage().equals("Java")) {
                    count++;
                }
            }
        }
        System.out.println("so sach lap trinh co ngon ngu Java la:" + count);
    }
    public void countFictionBookByCategory(){
        int count = 0;
        for(Book book : books){
            if(book instanceof FictionBook){
                if(((FictionBook) book).getCategory().equals("vien tuong 1")){
                    count++;
                }
            }
        }
        System.out.println("so sach vien tuong la :" + count);
    }
    public void countFictionBookByPrice(){
        int count = 0;
        for(Book book : books){
            if(book instanceof FictionBook){
                if(book.getPrice() < 100){
                    count++;
                }
            }
        }
        System.out.println("so sach gia tuong co gia duoi 100 la:" + count);

    }
    public void sumPrice(){
        double sumPrice = 0;
        for(Book book : books){
            sumPrice += book.getPrice();
        }
        System.out.println(" tong gia tien sach la:" + sumPrice);
    }
    public void display(){
        for(Book book : books){
            System.out.println(book);
        }
    }
}

