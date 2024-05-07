package runtime;

import data.Person;
import data.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*

quản lý danh sách sinh viên
menu gồm cac chức năng cơ bản
    1. nhập vào 1 sinh viên
    2.hiển thị info
    3. hiển thị max min score
    4. find by id
    5. sort asc
    6. prrint học bổng desc
    7. exit

Person Class:
    bao gồm name, gender, yob,
    có phễu có đối số, và không đối số
    có getter, ko đc settter
    showinfor()
    inputinfor()

Student class
    enxtend person
    thêm id, gpa, email
    2 phễu
    getter, ko setter
    showinfor()
 */
public class Program {

    public static void main(String[] args) {

        //muốn quản lý sinh viên thì luôn cần mảng chứa sinh viên
        //mảng arraylist là mảng đặc biệt, có khả năng co dãn
        ArrayList<Student> studentsList = new ArrayList<>();
        int choose;
        Scanner sc = new Scanner(System.in);

        do {
            showMenu();
            System.out.println("chọn 1 cái đi bro!!");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1: {
                    System.out.println("thêm sinh diên");
                    Student newStu = new Student();
                    newStu.inputInfor();
                    studentsList.add(newStu);

                    break;
                }
                case 2: {
                    System.out.println("Thông tin danh sách sinh viên");
                    if (studentsList.isEmpty()) {
                        System.out.println("nothing bro!");
                        break;
                    }
                    for (Student item : studentsList) {
                        item.showInfor();
                    }

                    break;
                }
                case 3: {
                    System.out.println("Tìm sinh diên giỏi và cùi bắp nhất");
                    double maxPoint = studentsList.get(0).getGpa();
                    double minPoint = studentsList.get(0).getGpa();

                    for (Student student : studentsList) {
                        if (student.getGpa() > maxPoint) {
                            maxPoint = student.getGpa();
                        }

                        if (student.getGpa() < minPoint) {
                            minPoint = student.getGpa();
                        }

                    }
                    System.out.println("thằng giỏi nhất nè");
                    for (Student student : studentsList) {
                        if (student.getGpa() == maxPoint) {
                            student.showInfor();
                        }

                    }
                    System.out.println("thằng gà nè: ");
                    for (Student student1 : studentsList) {
                        if (student1.getGpa() == minPoint) {
                            student1.showInfor();
                        }
                        break;
                    }
                }

                case 4: {
                    System.out.println("tìm kiếm theo mã số sinh viên");
                    System.out.println("Nhập mã sinh viên cần tìm: ");
                    String keyId = sc.nextLine();
                    boolean isFind = false;
                    for (Student student : studentsList) {
                        if(student.getId().equals(keyId)){
                            student.showInfor();
                            isFind = true;
                        }
                    }
                    if(!isFind) {
                        System.out.println("Không có sinh viên nào!");
                    }
                    break;
                }
                case 5: {
                    System.out.println("Sắp xếp theo tên");
                    //studentList là một mảng rất xịn của java, mảng đi kèm một bộ công cụ giúp
                    //thao tác với chiếc mảng: collections
                                                        // trọng tài
                    Collections.sort(studentsList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            if(o1.getName().compareTo(o2.getName()) > 0){
                                return 1;// swap
                            }
                            return -1;
                        }
                    });
                    
                    System.out.println("sau khi sắp xếp: ");
                    for (Student student : studentsList) {
                        student.showInfor();                        
                    }
                    
                    
                    break;
                }
                case 6: {
                    System.out.println("In ra những đứa có học bổng");
                    
                    Collections.sort(studentsList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            if(o1.getGpa() > o2.getGpa()){
                                return 1;
                            }else{
                                return -1;
                            }
                        }
                    });
                    Collections.reverse(studentsList);
                    //hiển thị sv có điểm > 8 là xong
                    for (Student student : studentsList) {
                        if(student.isScholarship()) student.showInfor();
                    }
                    break;
                }
                case 7: {
                    System.out.println("ĐI NẤU ĂN");
                    break;
                }
                default: {
                    System.out.println("nhap 1-7");
                    break;
                }
            }

        } while (choose != 7);

    }

    public static void showMenu() {
        System.out.println("Student Management App");
        System.out.println("1. nhập vào 1 sinh viên");
        System.out.println("2. hiển thị info");
        System.out.println("3. hiển thị max min score");
        System.out.println("4. find by id");
        System.out.println("5. sort asc");
        System.out.println("6. prrint học bổng desc");
        System.out.println("7. exit");
    }

}
