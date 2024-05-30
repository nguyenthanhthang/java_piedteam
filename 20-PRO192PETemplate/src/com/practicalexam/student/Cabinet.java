package com.practicalexam.student;

import com.practicalexam.student.data.Student;
import utils.Inputter;

/**
 *
 * @author FPT University - HCMC Java OOP Practical Exam Template
 */
public class Cabinet {

    //StartList - do not remove this comment!!!
    int count = 0;
    Student ds[] = new Student[10];

    // Declare ArrayList or Array here
    //EndList - do not remove this comment!!!
    public void add() {
        // Print the object details after adding

        //thu thập
        boolean isDup;
        String id;
        do {
            isDup = false;
            id = Inputter.getString("nhap MSSV ", "khong bo tronhg!!");
            isDup = checkDuplicatedId(id);
            if (isDup) {
                System.out.println("id bi trung roi");
            }
        } while (isDup);

        String name = Inputter.getString("nhap ten sv: ", "khong dc bo trong");
        int point = Inputter.getAnInteger("nhap diem sv", "diem phai tu 0 - 10", 0, 10);

        //tạo
        Student nStudent = new Student(id, name, point);
        //nhet
        ds[count] = nStudent;
        count++;
        System.out.println("Danh sach sinh vien");
        for (int i = 0; i < count; i++) {
            ds[i].Show();
        }
    }

    public boolean checkDuplicatedId(String id) {
        // Your code here

        for (int i = 0; i <= count - 1; i++) {
            if (ds[i].getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public void update() {
        // Print the object details after updating name/model and price
        String keyId = Inputter.getString("Nhap MSSV can cap nhat: ", "MSSV khong de trong");

        //từ keyId tìm vị trí
        int pos = -1;
        for (int i = 0; i < count; i++) {
            if (ds[i].getId().equals(keyId)) {
                pos = i;
            }
        }
        if (pos == -1) {
            System.out.println("khong tim thay sinh vien!!");
        } else {
            System.out.println("thong tin sinh vien truoc khi cap nhat");
            ds[pos].Show();
            System.out.println("dang cap nhat....");
            String name = Inputter.getString("nhap ten moi:", "khong bo trong");

            int point = Inputter.getAnInteger("diem moi: ", "khog duoc bo trong");

            //set
            ds[pos].setName(name);
            ds[pos].setPoint(point);
            System.out.println("cap nhat thong tin sinh vien thanh cong");
        }
        //in ra ket qua
        System.out.println("Danh sach sinh vien: ");
        for (int i = 0; i < count; i++) {
            ds[i].Show();
        }

    }

    public void search() {
        // Print the object details after searching
        // Print the object details after updating name/model and price
        String keyId = Inputter.getString("Nhap MSSV can tim:  ", "MSSV khong de trong");

        //từ keyId tìm vị trí
        int pos = -1;
        for (int i = 0; i < count; i++) {
            if (ds[i].getId().equals(keyId)) {
                pos = i;
            }
        }
        if (pos == -1) {
            System.out.println("khong tim thay sinh vien!!");
        } else {
            System.out.println("thong tin sinh vien:");
            ds[pos].Show();

        }
    }

    public void remove() {
        // Print the list after removing
// Print the object details after searching
        // Print the object details after updating name/model and price
        String keyId = Inputter.getString("Nhap MSSV can tim:  ", "MSSV khong de trong");

        //từ keyId tìm vị trí
        int pos = -1;
        for (int i = 0; i < count; i++) {
            if (ds[i].getId().equals(keyId)) {
                pos = i;
            }
        }
        if (pos == -1) {
            System.out.println("khong tim thay sinh vien!!");
        } else {
            System.out.println("thong tin sinh vien:");
            ds[pos].Show();
            //xoa
            for (int i = pos; i < count; i++) {
                ds[i] = ds[i + 1];
            }
            count--;
            System.out.println("da xoa thanh cong");
        }
    }

    public void sort() {
        // Print the object details after sorting
        for(int i = 0; i <= count - 1; i++){
            for(int j = i + 1; j < count; j++){
                if(ds[i].getPoint() > ds[j].getPoint()){
                Student tmp = ds[i];
                ds[i] = ds[j];
                ds[j] = tmp;
                }
            }
        }
    }

}
