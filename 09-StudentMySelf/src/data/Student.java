package data;

import java.util.Scanner;

public class Student extends Person {

    private String id;
    private float gpa;
    private String email;

    public Student() {
    }

    public Student(String id, float gpa, String email, String name, String gender, int yob) {
        super(name, gender, yob);
        this.id = id;
        this.gpa = gpa;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public float getGpa() {
        return gpa;
    }

    public String getEmail() {
        return email;
    }

    //setter thông minh, tức là check valid
    public boolean setId(String id) {
        if (!id.isEmpty()) {
            this.id = id;
            return true;

        } else {
            System.out.println("khong dc de trong");
            return false;
        }

    }

    public boolean setGpa(float gpa) {
        if (gpa >= 0 && gpa <= 10) {
            this.gpa = gpa;
            return true;
        } else {
            System.out.println("not valid");
            return false;
        }
    }

    public boolean setEmail(String email) {
        if (!email.isEmpty() && email.contains("@")) {
            this.email = email;
            return true;
        } else {
            System.out.println("not valid");
            return false;
        }
    }
    
    
    public void inputIn4(){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("enter id:");
        while(!setId(sc.nextLine()));
        System.out.println("enter gpa:");
        while(!setGpa(Float.parseFloat(sc.nextLine())));
        System.out.println("enter email");
        while(!setEmail(sc.nextLine()));
    }

    @Override
    public void showIn4() {
        String str = String.format("Information:  |%10s|%10s|%5d|%10s|%10f|%10s", getName(), getGender(), getYob(), id, gpa, email);
        System.out.println(str);
    
    }

}
