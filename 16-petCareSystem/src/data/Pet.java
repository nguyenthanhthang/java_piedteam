package data;

public abstract class Pet {
    //Prop
    protected String id;
    protected String owner;
    protected String color;
    protected double weight;

    //Constructor

    public Pet(String id, String owner, String color, double weight) {
        this.id = id;
        this.owner = owner;
        this.color = color;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public String getOwner() {
        return owner;
    }

    public double getWeight() {
        return weight;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
    //method showInfor
    abstract public void showInfor();
}
