package data;

import java.util.Scanner;

public class Student extends Person {

    private String id;
    private float gpa;
    private String email;

    public Student(String name, String gender, int yob,
                 String id, float gpa, String email) {
        super(name, gender, yob);
        this.id = id;
        this.gpa = gpa;
        this.email = email;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public String getEmail() {
        return email;
    }

    //setter thong minh
    //su dung boolen check true false
    public boolean setId(String id) {
        if (id.length() <= 0) {
            System.err.println("Không được để trống");
            return false;
        }

        if (!id.matches("^SE\\d{7}$")) {
            System.err.println("format id: SEddddddd, d là số");
            return false;
        }
        //nếu không vào if nào ở trên - vượt qua các tầng validate (xác thực)
        // thì mình sẽ gán giá trị vào object và return  true.

        this.id = id;
        return true;
    }

    public boolean setGpa(float gpa) {
        if (gpa < 0 || gpa > 10) {
            System.err.println("GPA không hợp lệ!!");
            return false;
        }
        this.gpa = gpa;
        return true;
    }

    public boolean setEmail(String email) {
        if (email.length() == 0) {
            System.out.println("Email không được bỏ trống!!");
        }

        if (!email.contains("@")) {
            System.out.println("@ đâu thằng lon??");
            return false;
        }
        this.email = email;
        return true;
    }

    @Override
    public void showInfor() {
        super.showInfor();
        String str = String.format("|%-10s|%f|%-20s\n", 
                                     id,gpa,email);
        System.out.printf(str);
    }

    @Override
    public void inputInfor() {
        Scanner sc = new Scanner(System.in);

        super.inputInfor();
//
//        while (true) {
//            System.out.print("enter id: ");
//            String inpId = sc.nextLine();
//            boolean isValid = this.setId(inpId);
//            if (isValid) {
//                break;
//            }
//        }

        System.out.print("enter id: ");
        while (!setId(sc.nextLine()));

        System.out.print("enter gpa: ");
        while (!setGpa(Float.parseFloat(sc.nextLine())));

        System.out.print("enter email: ");
        while (!setEmail(sc.nextLine()));
    }
    
    public boolean isScholarship(){
        return this.getGpa() > 8;
    }
}


/*
Student class
    enxtend person
    thêm id, gpa, email
    2 phễu
    getter, ko setter
    showinfor()
 */
