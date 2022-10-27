package Tinhtongcacsotrongfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String demo){
        try{
            File file = new File("demo.txt");

            if( !file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum +=Integer.parseInt(line);
            }
            br.close();
            System.out.println("tong + " + sum);
        }
        catch (Exception e){
            System.out.println("file khong ton tai hoac noi dung co loi");
        }
    }

    public static void main(String[] args) {
        System.out.println("nhap duong dan file");
        Scanner scanner = new Scanner(System.in);
        String demo = scanner.nextLine();

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(demo);
    }
}
