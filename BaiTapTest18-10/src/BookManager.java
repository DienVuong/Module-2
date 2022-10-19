public class BookManager {

    public static void main(String[] args) {
        ProgrammingBook[] programmingBooks = new ProgrammingBook[5];
        programmingBooks[0] = new ProgrammingBook("P1", "Lập Trình Và Cuộc Sống", 99000, "Jeff Atwood", "Java", "main");
        programmingBooks[1] = new ProgrammingBook("P2", "Giáo Trình Kỹ Thuật Lập Trình C Căn Bản Và Nâng Cao", 120000, " – Phạm Văn Ất", "C++", "main");
        programmingBooks[2] = new ProgrammingBook("P3", "Java: A Beginner’s Guide", 15000, "Sixth Edition", "Java", "main");
        programmingBooks[3] = new ProgrammingBook("P4", "Programming Pearls", 99000, "Jon Bentley", "Java", "main");
        programmingBooks[4] = new ProgrammingBook("P5", "Learning Python", 88000, "Mark Lutz", "Java", "main");

        FictionBook[] fictionBooks = new FictionBook[5];
        fictionBooks[0] = new FictionBook("F1", "Harry Potter Và Thế Giới Phép", 118000, "William Irwin", "Vien tuong1");
        fictionBooks[1] = new FictionBook("F2", "Tiệm Cắt Tóc Lúc Nửa Đêm", 70000, "Kousuke Sawamura", "Vien tuong1");
        fictionBooks[2] = new FictionBook("F3", "Harry Potter Và Đứa Trẻ Bị", 138000, "J.K.Rowling", "Vien tuong1");
        fictionBooks[3] = new FictionBook("F4", "Việt Ma Tân Lục - Quyển 1", 118000, "Nhóm 4.0", "Vien tuong1");
        fictionBooks[4] = new FictionBook("F5", "Việt Ma Tân Lục - Quyển 2", 118000, "Nhóm 4.0", "Vien tuong2");
//tổng số tiền cua sách
        double sum = sumPriceFictionBook(fictionBooks) + sumPriceProgrammingBook(programmingBooks);
        System.out.println("Tổng số tiên của danh sách:" + sum);
        System.out.println("---------------------------");
//  số sách có language là Java
        double count1 = findLanguageJava(programmingBooks);
        System.out.println("số sách có language Java: " + count1);
        System.out.println("----------------------");
//        số sách co category là viễn tưởng
        double count2 = findCategoryVienTuong(fictionBooks);
        System.out.println("Số sách có Category Vien tưởng 1: " + count2);
        System.out.println("------------------");
//        số sách Fiction có giá dưới 100000
        double count3 = countFictionPriceLess100(fictionBooks);
        System.out.println("số sách có giá dưới 100000: " +count3);

    }

    public static double sumPriceProgrammingBook(ProgrammingBook[] programmingBooks) {
        double sum = 0;
        for (int i = 0; i < programmingBooks.length; i++) {
            sum += programmingBooks[i].getPrice();
        }
        return sum;

    }

    public static double sumPriceFictionBook(FictionBook[] fictionBooks) {
        double sum = 0;
        for (int i = 0; i < fictionBooks.length; i++) {
            sum += fictionBooks[i].getPrice();
        }
        return sum;
    }
    public static double findLanguageJava(ProgrammingBook[] programmingBooks){
        int count1 = 0;
        for(int i = 0; i < programmingBooks.length; i++){
            if(programmingBooks[i].getLanguage().equals("Java")){
                count1 ++;
            }
        }
        return count1;
    }

    public static double findCategoryVienTuong(FictionBook[] fictionBooks){
        double count2 = 0;
        for( int i = 0; i < fictionBooks.length; i++){
                if(fictionBooks[i].getCategory().equals("Vien tuong1")){
                    count2 ++;
                }
        }
            return count2;

    }
    public static double countFictionPriceLess100(FictionBook[] fictionBooks){
        double count3 = 0;
        for( int i = 0; i < fictionBooks.length; i++){
            if( fictionBooks[i].getPrice() < 100000){
                count3 ++;
            }
        }
        return count3;
    }
}

