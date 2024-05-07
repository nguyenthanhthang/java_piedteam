package runtime;

import data.Herbivore;
import data.Horse;
import data.Hunter;
import data.Monkey;
import java.util.ArrayList;
import javax.management.monitor.Monitor;

/*
bối cảnh: mình có một nhiệm vụ là phổ cập kiến thức cho muôn loài.
 */
public class Program {

    public static void main(String[] args) {
        Monkey m1 = new Monkey("Rafiki", 1998, 210);
        Monkey m2 = new Monkey("abu", 1994, 30);
        Monkey m3 = new Monkey("cucu", 2002, 100);
        Horse h1 = new Horse("Rarity", 2015, 9, "none");
        Herbivore h2 = new Horse("Roach", 2019, 170, "pink");

        ArrayList<Herbivore> list = new ArrayList<>();
        list.add(h1);
        list.add(h2);
        list.add(m1);
        list.add(m2);
        list.add(m3);

//        for (Herbivore stu : list) {
//
//            stu.showLearningOutComes();
//        }

        //anonymous
        Herbivore xxx = new Herbivore("hide", 2000, 4) {
            @Override
            public double study() {
                return 80;
            }

            @Override
            public void showLearningOutComes() {
                String mess = String.format("%-20s|%-10s|%4d|%6.2f|%6.2f",
                             "Hide", getName(), getYob(), getWeigth(), study());
                System.out.println(mess);
            }
        };
        list.add(xxx);
//        for (Herbivore stu : list) {
//
//            stu.showLearningOutComes();
//        }
        
        Hunter hun1 = new Hunter("Graves", 1980, 60, "shotgun");
        Hunter hun2 = new Hunter("Master YI", 1990, 70, "Vô cực kiếm");

        hun1.showLearningOutComes();
        hun2.showLearningOutComes();
        
    }
}
