package com.practicalexam;

import java.util.Scanner;

import com.practicalexam.student.TemplateQuestion;

/**
 *
 * @author FPT University - HCMC Java OOP Practical Exam Template
 */
public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Menu here (if needed)

        System.out.println("1. them 1 sinh vien");
        System.out.println("2. tim kiem sinh vien");
        System.out.println("3. xoa sinh vien");
        System.out.println("4. cap nhat thong tin sinh vien");
        System.out.println("5. sap xep sinh vien");
        TemplateQuestion hello = new TemplateQuestion();
        // Your code here
        int choice = 0;
        do {

            // Menu here (if needed)
            // Your code here
            System.out.println("Nhap vao : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    hello.insert();
                    break;
                }
                case 2: {
                    
                    hello.search();
                    break;
                }
                case 3: {
                    hello.remove();
                    break;
                }
                case 4: {
                    hello.update();
                    break;
                }
                case 5: {
                    hello.sort();
                    break;
                }

                // Other case here!!!
            }
        } while (choice >= 1 && choice <= 5);  // Modify the condition to exit the loop!!!
    }

}
