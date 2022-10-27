package Comparable_Comparator;


public class Student {
    private String name;
    private Integer age;
    private String address;

    public Student(){

    }
    public Student(String name, Integer age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public int compareTo( Student student){
        return this.getName().compareTo(student.getName());
    }

}
