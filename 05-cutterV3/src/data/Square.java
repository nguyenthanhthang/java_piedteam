
package data;


public class Square extends Rectangle {

    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge);
    }

    @Override
    public void paint() {
        String str = String.format("%-15s|%-10s|%-10s|%5.2f|%5.2f|%5.2f|%5.2f|",
                     "Square",getOwner(), getColor(), hight, width, getPerimeter(), getArea());
        System.out.println(str);
    }

    public void showMess(){
        System.out.println("hello square");
    }
    
    
}


