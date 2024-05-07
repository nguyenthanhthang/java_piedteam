package runtime;

import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        //I-regex
        //Regex | regular expression | Pattern | Biểu thức chính quy

        String str = "SE1234567";
        //học  viết
        //1. regex kiểm tra có phân biệt hoa thường
      //  checkString("nAme", "name");
        //2. có thể bật chế độ không quan tâm hoa thường
      //  checkString("nAme", "(?i)name");
        //3. một ký tự bất kỳ: . (trừ enter)
      //  checkString("may", "m.y");
        //4. lập lại kí tự trước đó từ 0 đến nhiều lần: "*"
     //   checkString("my", "m*y");
        //5. group: ()
     //   checkString("mery", "m(er)*y");

        //6. phần tử bất kì trong set[...]
        //^m[ae]y$ : may, mey
        //^m[^ae]y$ phủ định
        //7. tập hợp chữ
        //[a-z]: 1 kí tự từ a - z
        //[A-Z]: 1 kí tự từ A - Z
        //[A-Za-z]: 1 kí tự chữ thường | hoa
        //8.tập hợp số:
        //[0-9]: 1 kí tự từ 0 - 9
        //9. giới hạn kí tự
        //{3}: lập lại 3 lần
        //{2,}; lập lại từ 2 lần trờ lên
        //{2,4}: lập lại từ 2 đến 4 lần
        //{0,}: *
        //{1,}: +
        //{0,1}: ?
        //10. hoặc | kết hợp với ()
        //11. shorthand: viết tắt
        //1. \w:[a-zA-z0-9] \W: phủ định
        //2. \d: [0-9]      \D
        //3. \s: space      \S
        //tryHard:
        //regex về tiền tệ: 100 000 000
        //regex về email:
        //regex về mã số sinh viên
        //regex tìm khoảg cách thừa
        //--------------------------------
        //try catch
        //erorr compilation: lỗi trong quá trình biên dịhc code
        //erorr runtime: lỗi trong quá trình người sử dụng
        //Scanner: đảm nhiệm trách nhiệm cho các hàm nhập giá trị
        Scanner sc = new Scanner(System.in);
        int age;
        try {
            System.out.println("age = ");
            age = sc.nextInt();
            if(age < 10 || age > 30){
                throw new Exception ();
            }

        } catch (Exception e) {
            System.out.println("ngu");
        }

        System.out.println("áđá");

    }

    public static void checkString(String str, String regex) {
        System.out.println(str.matches(regex));

    }

}
