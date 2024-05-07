package data;

import static data.Monkey.RECEPTIVE;
import java.util.Random;


public class Hunter implements StudyEnthusiasts {
    private String name;
    private int yob;
    private double weight;
    private String gear;
    public static final double RECEPTIVE = 50;

    public Hunter(String name, int yob, double weight, String gear) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
        this.gear = gear;
    }
    
    
    
    public double study() {
        return new Random().nextDouble() * RECEPTIVE;
    }

    
    public void showLearningOutComes() {
        String mess = String.format("%-20s|%-10s|%4d|%6.2f|%6.2f|%-10s",
                     "Hunter", name, yob, weight, study(), gear);
        System.out.println(mess);
    }

    @Override
    public double studyHard() {
        return study()*1.5;
    }

    @Override
    public void showProfile() {
        String show = String.format("%-20s|%-10s|%4d|%6.2f|%6.2f|%-10s",
                                    "Hunter", name, yob, weight, studyHard(),gear);
        System.out.println(show);
    }
}
