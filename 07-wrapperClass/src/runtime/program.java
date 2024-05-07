
package runtime;

public class program {
    public static void main(String[] args) {
        int a = 10; //primitive datatype, 4 byte trong ram
        //a là một đơn vị siêu nhỏ, nhỏ đến mức không thể tách nhỏ được nữa
        //a. chấm khôg có xổ ra gì cả
        
        //wrapperClass
        
        Integer b = new Integer(10);
        //lấy 1 cái class tên là Integer(core = 10)
        //new Integer(10) tạo ra một vùng nhớ lưu trữ ở heap
        //và vùng nhớ này rất lớn
        //b là một biến con trỏ nằm ở stack, đang trỏ vào vùng nhớ có core là 10
        //so về kick thước thì a < b
        //nên anh không khuyến khích lưu trữ số nguyên bằng wrapperClass
        //gói một con số int = 10 vào 1 cái object ==> boxing
        //boxing xảy ra khi Wrapper = primitive
        // => gán primitive vào wrapperClass
        System.out.println("a nè " + a);
        System.out.println("b nè " + b);
        System.out.println("b nè " + b.toString()); // auto unboxing

        
        int c = b; // auto unboxing, mở object b ra lất core là 10
                   // sau đó gán 10 đó cho c
        System.out.println("c nè " + c);
        //c không có chấm được
        //ngoài ra ra có thể tạo object từ wrapperClâss nhưu sau
        Integer d = 2000;
        //wrapper = primitive boxing
        //gói con 2000 vào 1 object Integer
        
        System.out.println("d  " + d);// .toString()
        
        //comparision
        
        d = 2000;
        b = 2000;
        a = 2000;
        
        System.out.println(b==d ? "true" : "false"); // false: 2 ojbect không  chơi với nhau đc,
                                                    // nó sẽ so sánh 2 địa chỉ ( không auto unboxing đc)
                       System.out.println(d.equals(b));// phải sử dụng equals va compareTo
        System.out.println(a==d ? "true" : "false");// bình thường
    }
}
