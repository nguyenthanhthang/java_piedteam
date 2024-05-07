
package data;
public class Disk {
    
    private String color;
    private double radius;
    public static final double PI = 3.14;

    public Disk(String color, double radious) {
        this.color = color;
        this.radius = radious;
    }

    public String getColor() {
        return color;
    }

    public double getRadious() {
        return radius;
    }

       public double getPerimeter() {
        return 2 * PI * radius;
    }

    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    public void paint() {
        String str = String.format("Disk    |%5.2f|%5.2f|%5.2f|",
                     radius, getPerimeter(), getArea());
        System.out.println(str);
    }
}
