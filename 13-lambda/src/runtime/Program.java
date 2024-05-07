package runtime;
//1 file java có thể chứa nhiều class nhưng chỉ có class 
//trùng tên với file là đc public
//Human là 1 innerClass
public class Program {

    public static void main(String[] args) {
        
        //demo
        Math m1 = (a, b)->{
            return a + b;
        };
        System.out.println(m1.add(2,5));
        
        //thêm type cho argument
        Math m2 = (int a,int b)->{
            return a + b;
        };
        System.out.println(m1.add(2,5));
        
        //nếu body chỉ có 1 lệnh thì ko cần return 
        
        Math m3 = (int a,int b)->(a + b);
        System.out.println(m1.add(2,5));
    }
    
}
//lambda chỉ xuất hiện ở các phiên bản sau SE8
//nhiệm vụ lớn nhất của lambda là viết code tạo object từ 
//interface nhanh hơn anonymours
//2 ưu điểm: cung cấp liền bản thực hiện chức năng, code it hơn

//sytax: (argument-list)->(body)
//nếu body có 1 dòng lệnh thì ko cần return 

//tại sao interface chuẩn là chỉ có 1 function ? vì lambda chỉ bổ sung
//code cho 1 method mà thôi, nếu có 2 cái method thì k biết bổ 
//sung code cái function nào -> từ phiên bản SE9 ngta
//thêm @FuntionalInterface  

interface Human{
    public void show();
}

interface Math{
    public int add(int a, int b);
}


//lý thuyết
//1.modifier có mấy loại
//      access modifier và non-access modifier

//2.default trong modifier là gì?
//      default nằm trong access modifier
//      prop mà default thì các thằng trong cùng packege sẽ truy xuất được

//3.supper là gì?
//      new cha hoặc truy cập vào vùng nhớ cha

//4. this là gì ?
//      this là ám chỉ object được tạo ra từ class đang chứa this
//(định nghĩ này ko đúng trong js - this ám chỉ object đang gọi method chứa this)

//5. abstract method là gì ?
//      method ko có body(k có code bên trong)

//6. abstract class là gì ?
//      abstract class là class chứa abs method hoăc ko
//nhưng mà 1 class mà có abs method thì 100% là abs class

//7. khác nhau giữa interface và abstract class ?
/*      abstract class: có prop, method, abst method
        interface : ko có prop chung, chỉ có prop, static public final
        method chỉ có abs
        method nếu có body phải static(tức là xài chung)
interface có thể dùng làm lambda
*/      

//8. ý nghĩ của kế thừa ?
//      giúp class con khôi phục lại trạng thái ban đầu trước khi có cha
//      những gì người đi trc đã làm tốt rồi thì kế thừa và phát triển
//          không cần làm lại , code ít đi, tránh trùng lặp

//9. object con so với object cha như nào ?
//      object con to hơn object cha
//      con = cha + code của riêng con (override, impplements, method riêng)

//10. so sánh 2 object phải làm sao ?
//      == là so địa chỉ
//      .equalTo | .compareTo (Wrapper, String)
//      comparator, comparable(interface) dùng để so hai object

//11. string pool là gì ?
//      tạo String str = "ahihi" là đang tạo vào string pool
//      nếu tạo string mà cùng giá trị thì 2 cùng chỏ 1 nàng
//  => giúp giảm thiểu bộ nhớ , kết hợp với việc String và immatale
//  giúp cho ko bị hiện tượng anh làm em chịu (đổ domino)

//12. cho ví dụ thể hiện tính đa hình ?
//      override , hàm cùng tên khác cách sài, overload

//13. phân biệt override và overload đi ?
//      overide chỉ xuẩt hiện trong mối quan hệ cha con, khi con độ lại hàm của cha
//      overload thì khi hàm cùng tên khác parameter

//14. cho biết đoạn code này đúng không "float a = 10.5";
//      sai, vì java ưu tiên số thực là double nên nó xem 10.5 là double ko bỏ
//     vào a(float) đc , thay bằng 10.5F

//15. default value của boolean là gì ?
//       là false

//16. interface chuẩn là như thế nào ?
//       interface chỉ có 1 method duy nhất

//17. lambda là gì , ý nghĩ ?
//       viết code tạo object từ interface nhanh hơn anonymours
//       2 ưu điểm: cung cấp liền bản thực hiện chức năng, code it hơn

//18. extends khác gì cho với implement ?
//    -"Extends" được sử dụng để chỉ định một lớp con kế thừa các thuộc tính 
//    và phương thức của lớp cha. Tức là, lớp con được xây dựng dựa trên lớp cha
//    và có thể mở rộng chức năng của lớp cha hoặc định nghĩa lại chúng.
//    -Trong khi đó, "implements" được sử dụng để chỉ định rằng một lớp cần triển 
//    khai các phương thức của một interface. Interface chỉ định các phương thức 
//    mà lớp cần triển khai và không có cài đặt cho chúng.

//19. implement và implements khác gì nhau ?
/*
    implements là keyword để liên kết class với interface
    implement  là hành dộng bổ sung code cho abs method
*/

//20. giải thích tại sao supper lại là lệnh đầu tiên của cst ?
/*
    new con = new cha + code riêng con
    nên muốn tạo con, phải tạo cha trước -> supper ở đầu
*/

//21. kể tên 4 thuộc tính của ngôn ngữ oop
//đóng gói: 
//kế thừa:
//đa hình:
//trừu tượng:

//22. kể xong rồi thì biết các thuộc tính trên đại diện là gì ?
//đóng gói: modifierr
//kế thừa: extends
//đa hình: overload và override
//trừu tượng: abs method , abs class

//23. java là đơn hay đa kế thừa , có mấy loại kế thừa ?
//java là đơn kế thừa (extends)
//nhưng mà java cũng có đa kế thừa (implement interface)

//24. static là gì, giải thích đi ?
//static là : tĩnh
//ko phân bản cho các bản thể(intance)

//25. final ở props, khác gì so với final ở method và final ỏ class ?
//final class: ko cho ai nhận cha
//final props: hằng số
//final method: kế thừa k dc override

//26. nếu con kế thừa cha và có override method của cha và hàm riêng 
//        thì khi nó khai con new con , nó sài hàm nào
//              thì xài hàm con, override

//        khai cha new cha xài hàm nào
//              thì chỉ sài của cha        

//        khai cha new con xài được hàm nào 
//             xài k đc hàm của riêng con, nhưng mà xài override

//27. khác nhau giữa comparator và comparable là gì ?
//   comparator               comparable
//      compare               compareTo
//      K ảnh hưởng class     implement vào class
//                  cách xài .sort
//  cho nhiều chiều sort      sort theo 1 chiều đã implement

//28. tạo object bằng abstract class hay interface thì phải làm sao ?
//2 cách: 
//1. dùng class trung gian để implement các abs method

//2. anonymous hoặc lambda(cho interface thôi)
//29. anonymous là gì ?
//   khi ta muốn tạo object từ abs class hay interface mà ko muốn 
//   thông qua clas trung gian thì dùng anonymous

//30. List là gì ?

//31. ArrayList và LinkedList cái nào có tốc độ truy xuất nhanh hơn ?
//ArrayList
//------ cái nào có tốc độ thêm / xóa nhanh hơn
//LinkedList