
package runtime;

import java.util.StringTokenizer;

public class Program {

   
    public static void main(String[] args) {
       //cho mình 1 cái class tên là String, xem String là object luôn
       
       String lastName = new String ("Thắng");// heap
       
       String tmp = lastName;
       
       String firstName = "Nguyễn"; //Pool củng nằmg trong heap
       
       //String là một object immutable
       //mọi thao tác, hành động tương tác với String sẽ không làm
       //String thay đổi, mà chỉ tạo ra String mới
       lastName=lastName.concat(firstName);
        System.out.println(tmp);
        System.out.println(lastName);
        
        
        //StringBuffer, String Builder
        //2 thằng nàylà chuỗi nhưng lại là mutable
        //mutable là object có  thể chỉnh sữa
        
        StringBuilder lastName2 = new StringBuilder("Thắng");
        StringBuilder tmp2 = lastName2;
        StringBuilder firstName2 = new StringBuilder("Nguyễn");
        
        lastName2.append(firstName2);
        System.out.println("lastname2: " + lastName2);
        System.out.println("tmp2 "+ tmp2);
        
        //StringTokenizer: làm split
        
        String infor = "SE123|Điệp Đẹp Trai|2004|9.9";
        StringTokenizer st = new StringTokenizer(infor, "|");
        
        System.out.println(st.countTokens());
        System.out.println(st.hasMoreTokens());
        
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        
        System.out.println(st.countTokens());
        System.out.println(st.hasMoreTokens());
        System.out.println(infor);
        
       // checkStringMethod ();
        playWithStringComparision();
    }
    
    public static void checkStringMethod(){
        //khi dùng method với String thì phải để ý return
        //vì String là immutable nên method của nó thường return về 1 string kết quả
        String str1 = "Điệp ";
        String str2 = "Đẹp Trai ";

        
        //str1.concat(str2) vô nghĩa
        str1= str1.concat(str2).concat("hihi").toUpperCase();
        System.out.println(str1);
        
        //tìm chuỗi trong chuỗi
        str1 = "Điệp đẹp trai";
        str2 = "đẹp";
        
        System.out.println(str1.indexOf(str2)); //5
        
        System.out.println(str1.charAt(9));// 't'
        
        System.out.println(str1.contains(str2));//true
    }
    
    
    public static void playWithStringComparision(){
        
        String s0 = new String("BÉ HỨA HỌC HÀNH CHĂM NGOAN");
        String s1 = "BÉ HỨA HỌC HÀNH CHĂM NGOAN";//pool
        String s2 = "BÉ HỨA HỌC HÀNH CHĂM NGOAN";//pool
        String s3 = "bé hứa học hành chăm ngoan";//pool
        String s4 = new String("BÉ HỨA HỌC HÀNH CHĂM NGOAN");
        String s5 = new String("BÉ HỨA HỌC HÀNH CHĂM NGOAN");
        
        
         System.out.println(s0 == s1);//false
        //so sánh object là so sánh địa chỉ
        //s1 và s2 khác nhau địa chỉ
        
        System.out.println(s1 == s2);//true
        //vẫn là so địa chỉ
        
        System.out.println(s2 == s3);//false
        
        System.out.println(s3 == s4);//false
        
        System.out.println(s4 == s5);//false
        
        //vậy muốn so sánh về giá trị
        // .equal()   .compareTo()
 }
}

   