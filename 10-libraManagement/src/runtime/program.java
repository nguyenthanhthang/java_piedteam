package runtime;

import data.author;
import data.book;
import java.util.ArrayList;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {

        ArrayList<author> auList = new ArrayList<>();
        ArrayList<book> boList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        initData(auList, boList);

        int choose;

        do {
            showMenu();
            System.out.println("vui long nhap lua chon: ");
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1: {
                    System.out.println("them 1 cuon sach");
                    book newbook = new book ();
                    newbook.inputInfor();
                    
                    boolean isFind = false;
                    for (book author : boList) {
                        if(author.getNickName().equals(newbook.getNickName())){
                            isFind = true;
                        }
                    }
                    if(!isFind){
                        author newAuthor = new author(newbook.getNickName());
                        newAuthor.inputInfor();
                        auList.add(newAuthor);
                    }
                    boList.add(newbook);
                    break;
                }

                case 2: {
                    System.out.println("In ra danh sach cac cuon sach");
                    boolean isFind = false;
                    for (book book : boList) {
                        book.showInfor();
                        isFind = true;
                    }
                    if(!isFind) System.out.println("khong co cuon nao!");

                    break;
                }

                case 3: {
                    System.out.println("them moi mot tac gia");
                    author newAuthor = new author();
                    newAuthor.inputInfor(auList);
                    auList.add(newAuthor);
                    break;
                }
                case 4: {
                    System.out.println("tim kiem sach theo nickname");
                    System.out.println("enter nickname of author");
                    String keyId = sc.nextLine();
                    boolean isFind = false;
                    for (book book : boList) {
                        if(book.getNickName().equals(keyId))
                            book.showInfor();
                            isFind = true;
                    }
                    
                    if(!isFind) System.out.println("khong tim thay");
                    break;
                }
                case 5: {
                    System.out.println("cook");
                    break;
                }
                default:{
                    System.out.println("phai nhap tu 1 -5 ");
                    break;
                }

            }

        } while (choose != 5);
    }

    public static void initData(ArrayList<author> auList,
                 ArrayList<book> boList) {
        auList.add(new author("Ngo Kien Huy", "Huynl", 1999));
        auList.add(new author("Nguyen Thanh Thang", "Thangnt", 1999));
        auList.add(new author("con chim be be", "cc", 1999));

        boList.add(new book("Mai Mai la het tien", "19-01-2003", "Thangnt"));
        boList.add(new book("kim chi nam", "24-12-2002", "cc"));
        boList.add(new book("tao dong tien", "19-07-2003", "Huynl"));
    }

    public static void showMenu() {
        System.out.println("---Menu---");
        System.out.println("1.Thêm sách mới    | 2.Hiển thị danh sách các sách");
        System.out.println("3.Thêm tác giả mới | 4.Tìm sách theo nickName");
        System.out.println("5.Thoát");

    }
}

/*
tạo chương trình quản lý thư viện
gồm 2 class sau
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
Book
    bookName createAt nickName
    tạo có đối số và k có đồi số
    tạo getter anh setter
    tạo hàm input//nếu mà sách này có tác giả mà 
    có tên trong danh sách tác giả thì bỏ qua
    nếu tác giả của cuốn sách mà chưa có tồn tại trong ds
    thì thêm mới
program:
    menu
    1.Nhập thông tin sách in ra màn hình
    2.Hiển thị thông tin sách ra màn hình
    3.Nhập thông tin tác giả
    4.Tìm kiếm sách theo bút danh
    5.Thoát
 */
