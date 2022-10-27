package baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class DogManager {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Dog> lists = new ArrayList<>();

    public void addDog(){
        System.out.println("Nhập Id của Dog: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên của Dog: ");
        String name = scanner.nextLine();
        System.out.println("Nhâp số tuổi của Dog: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cân nặng của Dog: ");
        double weight = Double.parseDouble(scanner.nextLine());

        lists.add(new Dog(id,name,age,weight));

    }

    public void updateDogById(){
        System.out.println("Nhập Id Dog cần sửa");
        int id = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < lists.size(); i++){
            if(id == lists.get(i).getId()){
                System.out.println("Nhập Id mới");
                int id1 = Integer.parseInt(scanner.nextLine());
                lists.get(i).setId(id1);

                System.out.println("Nhập tên Dog mới:");
                String name1 = scanner.nextLine();
                lists.get(i).setName(name1);

                System.out.println("Nhập tuổi của Dog mới:");
                int age1 = Integer.parseInt(scanner.nextLine());
                lists.get(i).setAge(age1);

                System.out.println("Nhập cân nặng của Dog mới:");
                double weight1 = Double.parseDouble(scanner.nextLine());
                lists.get(i).setWeight(weight1);

            }
        }

    }

    public void removeDogById(){
        System.out.println("Nhập id của Dog cần xóa:");
        int id2 = Integer.parseInt(scanner.nextLine());
        for(int i = 0 ; i < lists.size(); i++){
            if(id2 == lists.get(i).getId()){
                lists.remove(i);
            }
        }
    }

    public void showDog(){
        for(Dog dog : lists){
            System.out.println(dog);
        }
    }

    public void showDogById(){
        System.out.println("Nhập Id của Dog cần hiển thị");
        int id = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < lists.size(); i++){
            if(id == lists.get(i).getId()){
                System.out.println(lists.get(i));
            }
        }

    }

    public void showDogByWeight(){
        for(int i = 0; i < lists.size(); i++){
            if(lists.get(i).getWeight() > 2){
                System.out.println(lists.get(i));
            }
        }
    }


}
