
package data;

import java.util.Scanner;

public class Person {
    //prop
    private String name;
    private String gender;
    private  int yob;
    
    
    //constructer
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
    
    public  void inputInfor () {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("enter name: ");
        this.name = sc.nextLine();
        
        System.out.print("enter gender: ");
        this.gender = sc.nextLine();
        
        System.out.print("enter yob: ");
        this.yob = sc.nextInt();
        
    }

    public void showInfor (){
        String str = String.format("Infor: %-10s|%-10s|%d", name, gender, yob);
        System.out.print(str);
    }




    
    
    
    
    
    
    
}
/*
Person Class:
    bao gồm name, gender, yob,
    có phễu có đối số, và không đối số
    có getter, ko đc settter
    showinfor()
    inputinfor()
*/