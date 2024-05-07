
//1.tạo object bằng cách:
//      1. thu nhập giá trị + constuctor đầy đủ
//      2. constructor rỗng + hàm inputInfor
//        để tạo object rỗng, ,và xin giá trị sau
package data;

import java.util.Scanner;

public class Person {
    
    //Prop
    private String name;
    private String gender;
    private int yob;
    
    //constructor
    public Person() {
    }

    public Person(String name, String gender, int yob) {
        this.name = name;
        this.gender = gender;
        this.yob = yob;
    }
    
    //getter
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getYob() {
        return yob;
    }
    //method
    public void showIn4(){
        String str = String.format("Information:  |%10s|%10s|%5d", name, gender, yob);
        System.out.println(str);
    
    }
    
    public void inputIn4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name: ");
        this.name=sc.nextLine();
        System.out.println("enter gender: ");
        this.gender=sc.nextLine();
        System.out.println("enter yob: ");
        this.yob=sc.nextInt();
   }
}
