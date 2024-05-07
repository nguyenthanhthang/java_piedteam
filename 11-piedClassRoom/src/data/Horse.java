package data;

import com.sun.javafx.scene.traversal.WeightedClosestCorner;
import java.util.Random;

/*
extends:
    +) thừa hưởng những gì cha có
    +) khôi phục lại những gì đã cho cha giữ
    +) không cần làm lại những gì tiền bối đã làm tốt rồi

*/
public class Horse extends Herbivore{
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
        
        return new Random().nextDouble()*RECEPTIVE;
    }

    @Override
    public void showLearningOutComes() {
        String mess = String.format("%-20s|%-10s|%4d|%6.2f|%6.2f|%s",
                                    "Horse", getName(), getYob(), getWeigth(), study(), colorSaddle);
        System.out.println(mess);
    }
    
}
