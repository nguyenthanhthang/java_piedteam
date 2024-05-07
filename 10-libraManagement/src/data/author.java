package data;

import java.util.ArrayList;
import java.util.Scanner;

public class author {
    private String name;
    private String nickName;
    private int yob;
    
    Scanner sc = new Scanner (System.in);

    public author() {
    }

    public author(String name, String nickName, int yob) {
        this.name = name;
        this.nickName = nickName;
        this.yob = yob;
    }

    public author(String nickName) {
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }

    public int getYob() {
        return yob;
    }
    
    //hàm inputInfor() chỉ nhận name và yob
    
    public void inputInfor(){
        System.out.println("enter name: ");
        this.name = sc.nextLine();
        
        System.out.println("enter age: ");
        this.yob = Integer.parseInt(sc.nextLine());
    }
    
    //overload inputInfor()
    public void inputInfor(ArrayList<author> auList){
        System.out.println("enter nickname: ");
        while(true){
            String inputNickName = sc.nextLine();
            boolean isDup = false;
            for (author author : auList) {
                if(author.getNickName().equals(inputNickName)) isDup = true;
            }
            if(!isDup){
                this.nickName = inputNickName;
                break;
            }
        }
        this.inputInfor();
    }
    
    public void showInfor(){
        System.out.printf("%-30s|%-30s|%4d\n", name, nickName, yob);
    }
    
    
}

/*
Author
    name nickname old birthday;
    tạo phểu hàm không đối số
    tạo phểu có đối số 
    tạo phểu có đối số là nickname
    tạo getter không tạo setter
    tạo hàm nhập thông tin tác giả
    nhưng nếu tác giả đã tồn tại trong danh sách thì k cho
    ép nhập lại
    tạo hàm showInfor
*/