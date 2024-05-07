package data;

public abstract class Herbivore {
    //Prop
    private String name;
    private int yob;
    private double weigth;
    
    
    //Constructor
    public Herbivore() {
    }

    public Herbivore(String name, int yob, double weigth) {
        this.name = name;
        this.yob = yob;
        this.weigth = weigth;
    }
    //Getter
    public String getName() {
        return name;
    }

    public int getYob() {
        return yob;
    }

    public double getWeigth() {
        return weigth;
    }

    //showInfor

    @Override
    public String toString() {
        String intro = String.format("%-10s: %-10s|%4d|%6.2f|", 
                                      "Herbivore",name, yob, weigth);
        return intro;
    }
    
    //method
    
    public abstract double study();
    public abstract void  showLearningOutComes();
}
