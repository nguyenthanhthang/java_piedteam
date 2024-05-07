package runtime;

import data.Disk;
import data.Rectangle;
import data.Shape;
import data.Square;

/*
    quản lý các hình khác nhau (ứng dụng astracb)
 */
public class Program {

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle("thang", "pink", 2, 4);
//        rec1.paint();
//        rec1.showMess();
        Square qua1 = new Square("phong", "red", 4);
 //       qua1.paint();
//        qua1.showMess();
        Disk dis1 = new Disk("hong", "blue", 4);
//        dis1.paint();
//        dis1.showMess();

        Shape ds[] = new Shape[4];
        ds[0] = new Rectangle("acb","tim", 2, 5);
        ds[1] = new Square("xyz","hong", 2);
        ds[2] = new Disk("mnb","vang", 2);
        ds[3] = new Rectangle("asd", "xanh", 10, 20);
        
//        for (Shape item : ds) {
//            item.paint();
//        }
        
        
        //Kỹ thuật anonymous: tạo object từ abs class
        
        
        //Drift | Parse Type: ép kiểu
        Rectangle r1 = new Rectangle("r1", "Pink", 2, 3);
        Square    s1 = new Square("s1", "puuper", 3);
        //trong thực tế, hình vuông củng được xem là hình chữ nhật
        Rectangle r2 = new Square("r2", "red", 2);
   //r2.showMess(); không được vì em là rectangle, chỉ đc quyền truy cập tới square
   
        Square tmp = (Square) r2;
        
        tmp.showMess();
        
        ((Square)r2).showMess();
        
    }
}
