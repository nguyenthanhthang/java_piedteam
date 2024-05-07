package data;

public abstract class Shape {

    protected String owner;
    protected String color;

    public Shape(String owner, String color) {
        this.owner = owner;
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    public abstract void paint();

}

// tại sao Shape lại là abstract class?
// vì nó chứa abs method
//abs method là gì? là method không có body
//lỗ thủng của khuôn