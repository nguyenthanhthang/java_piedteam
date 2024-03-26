package runtime;

public class program {
    public static void main(String[] args) {
        //comment: ghi chú
        //Java có 2 dạng dữ liệu
        //1.Primitive datatype: kiểu dữ liệu nguyên thuỷ
        //  dùng 1 lượng nhỏ bộ nhớ để biểu diễn giá trị
        //nó đã rất nhỏ, không thể chia nhỏ ra nữa
        //convention: cammelCase: cú pháp con lạc đà
        //8 kiểu:
        //1 - byte   (1byte)     số nguyên rất rất nhỏ
        //2 - short  (2byte)     số nguyên rất nhỏ
        //3 - int    (4byte)     số nguyên nhỏ
        //4 - long   (8byte)     số nguyên lớn
        //5 - float  (4byte)     số thực
        //6 - double (8byte)     số thực lơn
        //7 - char   (2byte)     ký tự có dấu unicode
        //8 - boolean(1bit)      dùng để lưu TRUE/FALSE nên chỉ cần 1bit
        //bên C char lưu bằng 1 byte để lưu 256 ký tự trong bảng mã assci
        //đối vs java thì 2 byte(1 byte dùng để lưu chữ 1 byte dùng để 
        //lưu dấu)
        
        char c = 65; // 'A'
        System.out.println("Biến C chứa " + c);
        System.out.printf("\nBiến C chứa %c", c);
        
        //ta có kiểu dữ liệu mới là byte
        //byte là số nguyên cực nhỏ
        //-128 --> 127
        byte numByte = 127;
        System.out.println("numByte ne: " + numByte);
        
        int numInt = 12345;
        float numFloat = 123.45F;
        //đối với số thực, java ưu tiên hiểu là double
        float numF;//? 0.0F
        
        double numDouble = 123.45;
        
        //numInt = numByte
        //numByte = numInt
        //không thể nhét cái gì quá lớn vào cái gì quá nhỏ được
        
        
        //2.Object datatype | reference datatype:
        //Kiểu dữ liệu do người dùng tự định nghĩa(mô tả)
        //mô tả từ các primitive datatype
        //tạo ra kiểu dữ liệu mới Student(yob-int, name-char-String, mark-float)
        
        
        //hacking primitive
        long numLong = 10_000_000_000L;
        //prefix: tiền tố
        int num1 = 0xFA;//0x: hex
        num1 = 076;//0: octal
        
        //Operator: toán tử
        //trong java có ít nhất 10 loại toán tử
        //Arithmetic: toán tử toán hạng
        //+ - * / % ++ --
        //+= -= *= /= %=
        int a = 10;
        int b = a++ - ++a + --a - a--;
        //Assigment: phép gán
        b = a;
        //comparision: phép so sánh
        //> < >= <= == !=
        
        //Logic: And(&&) Or(||) 
        // & và |
        //&&: tìm false
        //||: tìm true
        
        //toán tử 3 ngôi
        int numA = 2;
        int numB = 5;
        int numC = numA > numB ? 7: 9;//numC ?
        
        //String
        //comma: phẩy
        //Unary: một ngôi
        //Relational: toán tử quan hệ
        
        //shift bit: dịch bit
        // >>  <<
        //đẩy xuống thì rớt | đẩy vào thì bù 0
        int numE = 8;
        numE = numE << 2;
        //x >> n => 2/(2^n)
        //x << n => x*(2^n)
        
        //bitwise: toán tử bit(& | ^ ~)
        //&: giống phép nhân
        //|: tìm 1
        //^: có 2 số khác nhau thì 1 giống nhau thì 0
        //~; phủ định
    }
}
