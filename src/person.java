import java.util.Scanner;

public class person {

    String name, adress;
    int age;

    public person(String name, String adress, int age){
        this.name=name;
        this.adress=adress;
        this.age=age;
    }

    public void displayInfo(){
        System.out.println("name: " + name);
        System.out.println("adress: " + adress);
        System.out.println("age: " + age);
    }

    public static void main(String[] args) {
       person person1= new person("Ariana", 20,"oradea");
       person person2= new person("Andreea", 23,"cluj");
       
       System.out.println("person1: ");
       person1.displayInfo();

        System.out.println("person2: ");
        person2.displayInfo();
    }
}
