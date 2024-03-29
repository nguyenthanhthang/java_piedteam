

package runtime;

import data.Star;


public class Program {
    
    public static void main(String[] args) {
        Star mtp = new Star("son tung", 1994, "nam", "con mua ngang qua");
        Star cpu = new Star("chipu", 1993, "nu", "chiec o");
        Star gay = new Star("linh ly", 1991, "bong chua", "quen roi");
        
        Star ngoctrinh = new Star("Trần Thị Ngọc Trinh", 1989, "Nữ", "eo56");
        Star diep = new Star("Lê Hồ Điệp", 1999,"nam", "Thích code");
        
//        mtp.showInfor();
//        cpu.showInfor();
//        gay.showInfor();
        ngoctrinh.showInfor();
        diep.showInfor();
   
    }
}
/*
-------modifer: bộ nghĩa---------
   1.----access modifier-----
    + public: phạm vi truy cập rộng nhất, gọi ở đâu củng được, ai củng nhìn thấy
    + private: phạm vi truy cập thấp nhất, không ai truy cập được, chỉ có mình nó xài thôi
    + default: trong cùng package ai củng có thể truy cập được
    + protected: phạm vi  truy cập giống public nhưng phải (extends) con kế thừa cha thì mới sử dụng được.

    ---extends---
-->class có khả năng kế thừa, nhận cha con 
**quy tắc bất hiếu** : cha all in cho con, nhưg con cho cha cái nịt.


    2.----non-access modifier-----
    
        +final
            final class: class vô sinh
            final biến: biến thành hằng số
            final method: không @override được

        +static
            prop, method mà có static thì các object không được nhân bảng,
            mà phải xài chung với nhau.
            lúc này prop, method của khuôn.

        +abstract: trừu tượng
              1 class có những abstract method thì đó là abstract class
              nhưng 1 abstract class thì không nhất thiết phải chứa abstract method

ex:
abstract class Cha{
    
    abstract method:  thành công ()
    abstract method:  yêu ()
    }



    
-------------------------------------------------------------------------------------------------



---------class-------
nguyên tắc quản lý dữ liệu
ta phải đưa mọi thứ về cùng mảng thì mới quản lý được nhưng mảng chỉ 
chơi với những thằng  cùng kiểu
vậy nên ta bốc ra 2 đối tượng (object) bất kỳ và tìm điểm chung nó,
từ điểm chung này ta suy luận ra bộ khuôn (class)

và nói rằng dựa vào class ta có thẻ tạo ra rất nhiều object như vậy
nên chúng là 1 nhà, cùng 1 loại, cùng 1 khuôn tạo ra, về cùng 1 mảng

*/