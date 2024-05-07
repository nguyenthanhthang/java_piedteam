package data;

import java.util.Scanner;

public class book {

    private String bookName;
    private String createAt;
    private String nickName;

    Scanner sc = new Scanner(System.in);

    public book() {
    }

    public book(String bookName, String createAt, String nickName) {
        this.bookName = bookName;
        this.createAt = createAt;
        this.nickName = nickName;
    }

    public String getBookName() {
        return bookName;
    }

    public String getCreateAt() {
        return createAt;
    }

    public String getNickName() {
        return nickName;
    }

    public void inputInfor() {
        System.out.println("enter bookName: ");
        this.bookName = sc.nextLine();

        System.out.println("enter createAt: ");
        this.createAt = sc.nextLine();

        System.out.println("enter nickName: ");
        this.nickName = sc.nextLine();

    }

    public void showInfor() {
        System.out.printf("%-30s|%-30s|%-30s\n", bookName, createAt, nickName);

    }
}
/*
Book
    bookName createAt nickName
    tạo có đối số và k có đồi số
    tạo getter, ko setter
    tạo hàm input//nếu mà sách này có tác giả mà 
    có tên trong danh sách tác giả thì bỏ qua
    nếu tác giả của cuốn sách mà chưa có tồn tại trong ds
    thì thêm mới
 */
