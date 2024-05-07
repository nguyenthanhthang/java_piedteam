package runtime;

import data.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            showMenu();
            System.out.println("pick one optionse form 1-7..");
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1: {
                    System.out.println("1.Thêm sinh viên mới vào danh sách ");
                    Student newStudent = new Student();
                    newStudent.inputIn4();

                    studentList.add(newStudent);

                    break;
                }
                case 2: {
                    System.out.println("2.Show danh sách sinh viên");
                    for (Student student : studentList) {
                        student.showIn4();
                    }

                    break;
                }
                case 3: {
                    System.out.println("3.In ra sinh viên cao|thấp điểm nhất");

                    float max = studentList.get(0).getGpa();
                    float min = studentList.get(0).getGpa();

                    for (Student student : studentList) {
                        if (student.getGpa() > max) {
                            max = student.getGpa();
                        }
                        if (student.getGpa() < min) {
                            min = student.getGpa();
                        }
                    }
                    System.out.println("hoc sinh co diem cao nhat:");
                    for (Student student1 : studentList) {
                        if (student1.getGpa() == max) {
                            student1.showIn4();
                        }
                    }
                    System.out.println("hoc sinh co diem thap nhat:");
                    for (Student student2 : studentList) {
                        if (student2.getGpa() == min) {
                            student2.showIn4();
                        }
                    }
                    break;
                }

                case 4: {
                    System.out.println("Nhap ma so sinh vien can tim");
                    String key = sc.nextLine(); 
                    Boolean isFind = false;
                    
                    for (Student student : studentList) {
                        if(student.getId().equals(key)){
                            student.showIn4();
                            isFind = true;
                        }
                    }
                    if(!isFind){
                        System.out.println("khong tim thay");
                    }
                    break;
                }
                case 5: {
                    System.out.println("5.Sắp xếp danh sách theo tên asc");
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            if(o1.getName().compareTo(o2.getName()) > 0){
                                return 1;
                            }
                            return -1;
                        }
                    });
                    
                    
                    for (Student student : studentList) {
                        student.showIn4();
                   }
                    break;
                }
                case 6: {
                    System.out.println("In ra danh sách siên viên có học bỏng desc");
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            if(o1.getGpa() > o2.getGpa()){
                                return 1;
                            }
                            return -1;
                        }
                    });
                    break;
                }
                case 7: {
                    System.out.println("seee youuu later");
                    break;
                }
                default:
                    System.out.println("ahihihi");
            }
        } while (choose != 7);
    }

    public static void showMenu() {
        System.out.println("1.Thêm sinh viên mới vào danh sách   2.Show danh sách sinh viên");
        System.out.println("3.In ra sinh viên cao|thấp điểm nhất 4.Tìm kiếm theo mã sinh viên");
        System.out.println("5.Sắp xếp danh sách theo tên asc     6.In ra danh sách siên viên có học bỏng desc");
        System.out.println("7.Quit");
    }
}
