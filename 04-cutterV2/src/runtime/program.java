
package runtime;
// bé Na muốn quản lý tiếp
// muốn lưu hình vuông và hình chữ nhật

import data.Retangle;
import data.Square;

//hình chữ nhật (color, các cạnh)

public class program {
    public static void main(String[] args) {
        Retangle rec = new Retangle("pink", 2, 4);
        rec.showInf();
        Square sque = new Square("yellow", 4);
        sque.showInf();
    }
}
