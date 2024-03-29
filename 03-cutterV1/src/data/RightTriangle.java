package data;

//cha con là mối quan hệ "is a"
//RightTriangle is a Triangle
// con              cha
//1. những gì cha làm tốt rồi thì mình lấy xài, không viết lại
// extends: mở rộng
public class RightTriangle extends Triangle {

    public RightTriangle(double edgeA, double edgeB) {
        super(edgeA, edgeB, Math.sqrt(edgeA * edgeA + edgeB * edgeB));
    }

    //super: bề trên: New Triangle
    @Override
    public void showInfor() {
        String str = String.format("RightTriangle     |%5.2f|%5.2f|%5.2f|%5.2f|%5.2f",
                     edgeA, edgeB, edgeC, getPerimeter(), getArea());
        System.out.println(str);
    }

}
