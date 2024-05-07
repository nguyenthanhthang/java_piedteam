package data;

import java.util.Random;

public class Monkey extends Herbivore {

    public static final double RECEPTIVE = 70;

    public Monkey(String name, int yob, double weigth) {
        super(name, yob, weigth);
    }

    @Override
    public double study() {
        return new Random().nextDouble() * RECEPTIVE;
    }

    @Override
    public void showLearningOutComes() {
        String mess = String.format("%-20s|%-10s|%4d|%6.2f|%6.2f",
                     "Monkey", getName(), getYob(), getWeigth(), study());
        System.out.println(mess);
    }

}
