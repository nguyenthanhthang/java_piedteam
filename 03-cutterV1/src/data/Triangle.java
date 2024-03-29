package data;

//Triangle là cái khuôn (class) chuyên dùng để đúc ra các bức tượng tam giác (object)
//có thể nói rằng, tất cả các hình tam giác đều được tạo ra từ cái khuôn này
public class Triangle {

    //props
    protected double edgeA;
    protected double edgeB;
    protected double edgeC;

    //không nên tạo thuộc tính chu vi và diện tích
    //1. nếu mình tạo ra nó thì người dùg có thể set giá trị lên nó
    // và tất nhiên có thể set sai
    //2. cái gì có thể tự tính được bằng những cái trước đó thì khôg nên lưu.
    public Triangle() {
    }

    public Triangle(double edgeA, double edgeB, double edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }

    public double getEdgeA() {
        return edgeA;
    }

    public double getEdgeB() {
        return edgeB;
    }

    public double getEdgeC() {
        return edgeC;
    }

    //method
    double getPerimeter() {
        return edgeA + edgeB + edgeC;
    }

    double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - edgeA) * (p - edgeB) * (p - edgeC));
    }
    public void showInfor(){
        String str = String.format("Triangle     |%5.2f|%5.2f|%5.2f|%5.2f|%5.2f",
                                                edgeA, edgeB, edgeC, getPerimeter(), getArea());
        System.out.println(str);
    }
}
