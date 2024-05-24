package ui;

import java.util.ArrayList;
import utils.Inputter;

/*
Menu: là 1 cái khuôn chuyên tạo ra các anh quản lý menu
có: danh sách các lựa chọn 'optionList'
có:  tên của menu 'title'
có: nhữung hàm thao tác với optionList
//thêm 1 option vào optionList
//hiển thị danh sách optionList
//hàm thu thập lựa chọn của người dùng
 */
public class Menu {

    public ArrayList<String> optionList = new ArrayList<>();
    public String title;

    public Menu(String title) {
        this.title = title;
    }
    //method addNewOption

    public void addNewOption(String nOption) {
        optionList.add(nOption);
    }

    //method print: in ra danh sách các option đã lưu(in như menu)
    public void print() {
        int count = 1;
        System.out.println("------" + title + "------");
        for (String op : optionList) {
            System.out.println(count + ".  " + op);
            count++;
        }
    }
    
    //getchoice
    public int getchoice() {
        int choice = Inputter.getAnInteger("Input your choice: ",
                     "your choice must to between 1 and " + optionList.size(),
                     1, optionList.size());
        return choice;
    }
}
