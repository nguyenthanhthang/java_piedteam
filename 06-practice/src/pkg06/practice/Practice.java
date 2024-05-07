package pkg06.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pattern p = Pattern.compile("^[a-zA-Z0-9 ]+$");
        while (true) {
            System.out.print("input: ");
            String txt = sc.nextLine();
            System.out.println("output: " + txt);
            if(p.matcher(txt).find()){
                System.out.println("ok");
                break;
            }else{
                System.out.println("noooooooooooo"); 
           }
        }
    }

}
