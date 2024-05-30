package utils;

//Inputter là một cái khuôn, nhưng không dùng để đúc object
import java.util.Scanner;

//Mục đích: lưu những methods cần thiết cho project
public class Inputter {

    //toàn bộ methods dùng non-access: static --> để chỉ có 1 phiên bản duy nhất
    //chỉ duy nhất class này sở hữu.
    public static Scanner sc = new Scanner(System.in);

    //method ép người dùng nhập số nguyên chuẩn 
    public static int getAnInteger(String inpMsg, String errMsg) {

        while (true) {
            System.out.print(inpMsg);// hiển thị câu mời nhập
            try {
                int number = Integer.parseInt(sc.nextLine());
                return number;
            } catch (Exception e) {
                System.out.println(errMsg);
            }
        }
    }

    //method ép nhập số nguyên chuẩn nhưng phải ở trong khoảng yêu cầu
    public static int getAnInteger(String inpMsg, String errMsg,
                 int lowerBound, int upperBound) {

        if (lowerBound > upperBound) {
            int tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }

        while (true) {
            System.out.println(inpMsg);
            try {
                int number = Integer.parseInt(sc.nextLine());
                if (number < lowerBound || number > upperBound) {
                    throw new Exception();
                }
                return number;
            } catch (Exception e) {
                System.out.println(errMsg);
            }
        }
    }
    //method ép người dùng nhập số thực
    public static double getADouble(String inpMsg, String errMsg) {

        while (true) {
            System.out.print(inpMsg);// hiển thị câu mời nhập
            try {
                double number = Double.parseDouble(sc.nextLine());
                return number;
            } catch (Exception e) {
                System.out.println(errMsg);
            }
        }
    }

    //method ép nhập số thực nhưng phải ở trong khoảng yêu cầu
    public static double getADouble(String inpMsg, String errMsg,
                 int lowerBound, int upperBound) {

        if (lowerBound > upperBound) {
            int tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }

        while (true) {
            System.out.println(inpMsg);
            try {
                double number = Double.parseDouble(sc.nextLine());
                if (number < lowerBound || number > upperBound) {
                    throw new Exception();
                }
                return number;
            } catch (Exception e) {
                System.out.println(errMsg);
            }
        }
    }
    
    //method ép người dùng nhập chuỗi, không được để trống
    public static String getString (String inpMsg, String errMsg){
        while(true){
            System.out.println(inpMsg);
            try {
                String str = sc.nextLine();
                if(str.isEmpty()){
                    throw new Exception();
                }
                return str;
            } catch (Exception e) {
                System.out.println(errMsg);
            }
        }
    }
    
    //method ép người dùng nhập chuỗi, không được để trống và theo Regex
    public static String getString (String inpMsg, String errMsg, String regex){
        while(true){
            System.out.println(inpMsg);
            try {
                String str = sc.nextLine();
                if(str.isEmpty() || !str.matches(regex)){
                    throw new Exception();
                }
                return str;
            } catch (Exception e) {
                System.out.println(errMsg);
            }
        }
    }
    //hàm nhập ngày tháng năm theo format. TỰ NGHIÊN CÚ
}
