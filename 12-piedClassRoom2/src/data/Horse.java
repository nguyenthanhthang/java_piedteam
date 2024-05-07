package data;

import com.sun.javafx.scene.traversal.WeightedClosestCorner;
import java.util.Random;

/*
extends:
    +) thừa hưởng những gì cha có
    +) khôi phục lại những gì đã cho cha giữ
    +) không cần làm lại những gì tiền bối đã làm tốt rồi

 */
public class Horse extends Herbivore implements StudyEnthusiasts {

    private String colorSaddle;
    private static final double RECEPTIVE = 30;

    public Horse(String name, int yob, double weigth, String colorSaddle) {
        super(name, yob, weigth);
        this.colorSaddle = colorSaddle;
    }

    public String getColorSaddle() {
        return colorSaddle;
    }

    @Override
    public double study() {

        return new Random().nextDouble() * RECEPTIVE;
    }

    @Override
    public void showLearningOutComes() {
        String mess = String.format("%-20s|%-10s|%4d|%6.2f|%6.2f|%s",
                     "Horse", getName(), getYob(), getWeigth(), study(), colorSaddle);
        System.out.println(mess);
    }

    @Override
    public double studyHard() {
        return study() * 1.5;
    }

    @Override
    public void showProfile() {
        String show = String.format("%-20s|%-10s|%4d|%6.2f|%6.2f|%-10s",
                     "Horse", getName(), getYob(), getWeigth(), studyHard(), colorSaddle);
        System.out.println(show);
    }
}
