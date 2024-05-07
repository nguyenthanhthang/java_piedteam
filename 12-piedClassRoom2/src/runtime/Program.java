package runtime;

import data.Herbivore;
import data.Horse;
import data.Hunter;
import data.Monkey;
import data.StudyEnthusiasts;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        Monkey m1 = new Monkey("Rafiki", 1998, 210);
        Monkey m2 = new Monkey("abu", 1994, 30);
        Monkey m3 = new Monkey("cucu", 2002, 100);
        Horse h1 = new Horse("Rarity", 2015, 9, "none");
        Herbivore h2 = new Horse("Roach", 2019, 170, "pink");
        Hunter hun1 = new Hunter("thầy tu mù", 1999, 63, "kufung");

        ArrayList<StudyEnthusiasts> stuList = new ArrayList<>();
        stuList.add(h1);
        stuList.add((Horse) h2);
        stuList.add(hun1);

        //anonymous
        //một đối tượng mới (con lười: Sloth)
        //cách 1: tạo mới bằng class Herbivore:
        //--> nhược điểm: ko nhét đc vào stuList, vì ko nằm trong hội.
        //cách 2: tạo class Sloth và cho Sloth implêmnt 
        //--> nhược điểm: gom đũa cả đám Sloth, không hợp lý
        //cách 3: tạo con lười bằng interface StudtyEnthusiasts
        StudyEnthusiasts xxx = new StudyEnthusiasts() {
            @Override
            public double studyHard() {
                return 80 * 1.5;
            }

            @Override
            public void showProfile() {
                String show = String.format("%-20s|%-10s|%4d|%6.2f|%6.2f",
                             "xxx", "luoi", 2130,5.4 , studyHard());
                System.out.println(show);
            }
        };
            stuList.add(xxx);
        
        for (StudyEnthusiasts stu : stuList) {
            stu.showProfile();
        }

    }

}
