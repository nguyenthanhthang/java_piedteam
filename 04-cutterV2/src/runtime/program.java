package runtime;
// bé Na muốn quản lý tiếp
// muốn lưu hình vuông và hình chữ nhật

import data.Disk;
import data.Retangle;
import data.Square;

//hình chữ nhật (color, các cạnh)
public class program {

    public static void main(String[] args) {
        Retangle rec = new Retangle("pink", 2, 4);
        Retangle rec1 = new Retangle("black", 3, 6);
        Retangle rec2 = new Retangle("white", 5, 9);
       // rec.showInf();
        Square sque = new Square("yellow", 4);
        //sque.showInf();

        Retangle ds[] = new Retangle[3];
        ds[0] = rec;
        ds[1] = rec1;
        ds[2] = rec2;
        
        
//        for (int i = 0; i < ds.length; i++){
//            ds[i].showInf();
            
        for (Retangle item : ds) {
            item.paint();
        }
        
        Disk d1 = new Disk("pink", 3);
        Disk d2 = new Disk("yellow", 5);
        Disk d3 = new Disk("red", 1);
        
        Disk dss[] = new Disk [3];
        dss[0] = d1;
        dss[1] = d2;
        dss[2] = d3;
        
        for (Disk item : dss) {
            item.paint();
        }
        

    }
}

//khai cha new con thì ok
// ngược lại thì thua
//disk: hình tròn
