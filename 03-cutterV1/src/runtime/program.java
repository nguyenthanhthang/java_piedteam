package runtime;
//Bé Na học lớp 5
//Bé Na cần lưu rất nhiều hình tam giác có đủ loại

import data.RightTriangle;
import data.Triangle;


public class program {
    
    
    public static void main(String[] args) {
        Triangle tr1 = new Triangle(3,4,5);
        //tr1.showInfor();
        RightTriangle tr2 = new RightTriangle(3, 4);
        tr2.showInfor();
        
    }
    
}

//ta có 2 class cha và con
//==> class con kế thừa class cha
//thì có nghĩa là con sẽ kế thừa hết tất cả những gì cha có
//Class con >  Class cha
//trong Constructor của con, thì nó gọi constructor của cha
//bằng từ khoá super
//==> tức là muốn tạo con thì phải tạo cha trước
// trong con có cha
//==> con lớn hơn cha

//override: là hiện tượng chỉ xuất hiện trong mối quan hệ cha con (is a)
// khi mà thằng con muốn độ lại method của thằg cha
// nó tạo ra 1 method có tên giống với method của cha
//(giống | khác parameter và body)

//overload: hiện tượng diễn ra không mối quan hệ
// khi mà method này trùng tên method kia và khác parameter