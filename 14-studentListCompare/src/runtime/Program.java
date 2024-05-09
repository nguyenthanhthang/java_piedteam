package runtime;

import data.StudentV1;
import data.StudentV2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
nếu muốn so sánh 2 object thì phải làm sao?
==: so về mặt địa chỉ.
.equalTo(): boolean          compareTo(): int

*) equalTo và compare chỉ có thể dùng để so sánh các object được tạo ra  từ
wrapper class và string

*) nhưng nếu phải so sánh 2 sinh viên (2object phức tạp) thì equalTO và compareTo
sẽ không làm được. Vì sinh viên được mô tả bằng nhiều prop phức tạp. Không thể nói
ai hơn ai liền được, phải quy về 1 hệ quy chiếu khác, so sánh dựa trên 1 tiêu chí
nhất định: tuổi, tiền, đẹp trai...

*) nếu mình là mảng primitive  thì mình sẽ phải sắp xếp sinh viên bằng cách
bình thường (chạy 2 for các thứ).

*) nếu mình có 1 mảng đặc biệt (ArrayList là thuộc Collection) thì mình có thể
xài cơ chế Collections.sort()
        ==> comparable: tính đố kỵ      và      comparator: anh trọng tài.


 */
public class Program {

    public static void main(String[] args) {
        //sortV1();
        sortV2();
    }

    public static void sortV1() {
        //tạo ra danh sách sinh viên để chuẩn bị sắp xếp
        ArrayList<StudentV1> stuList = new ArrayList<>();

        stuList.add(new StudentV1("SE001", "Lê", "An", 5));
        stuList.add(new StudentV1("SE003", "Nguyễn", "Bình", 7.5));
        stuList.add(new StudentV1("SE002", "Lý", "Cường", 9.6));
        stuList.add(new StudentV1("SE005", "Trần", "Cường", 8.8));
        stuList.add(new StudentV1("SE004", "Võ", "Em", 4.4));
        
        /*
        stuList là mảng chứa các studentV1 bình thường và không có tính đố kỵ
        điều này dẫn đến việc nếu đám sinh viên khôg có tính đố kỵ thì bỏ vào
        cùng 1 tập hợp sẽ ko có sợ so sánh và sắp xếp.
        
        mảng sẽ khôg tự sắp xếp được, lúc này ta sẽ cần đến 1 anh trọng tài
        Comparator(anh trọng tài):
            - về mặt hiểu: anh trọng tài là một người có nhiệm vụ phải so sánh hai đối tượng
                bất kỳ. Nhưng phải chỉ cho ảnh cái tiêu chí mà mình muốn so sánh.
            - về mặt code: Comparator là một interface có 1 method duy nhất là compare
                và compare khôg có code bên trong, cần mình implement vào.
                từ đó return 1 nếu win, còn lose thì -1.
        */

    }
    
    public static void sortV2(){
        ArrayList<StudentV2> stuList = new ArrayList<>();

        stuList.add(new StudentV2("SE001", "Lê", "An", 5));
        stuList.add(new StudentV2("SE003", "Nguyễn", "Bình", 7.5));
        stuList.add(new StudentV2("SE002", "Lý", "Cường", 9.6));
        stuList.add(new StudentV2("SE005", "Trần", "Cường", 8.8));
        stuList.add(new StudentV2("SE004", "Võ", "Em", 4.4));
        //stulist là nhữg đứa có tính đố kỵ, chúng tự so sánh nhau qua id
        //không cần anh trọng tài nữua
        Collections.sort(stuList);
    }
                                       // <generic>
    Comparator ordById = new Comparator<StudentV1>() {
        @Override
        public int compare(StudentV1 t1, StudentV1 t2) {
            if (t1.getId().compareTo(t2.getId()) > 0){
                return 1;// t1 lớn hơn
            }
            return -1;// t1 bé hơn
        }
    };
    //khi đã có anh trọng tài thì mình nhét ảnh vào stuList
 //Collections.sort(stuList, ordById);

}
/*
trong java không có hàm (function)
chỉ có method: nhưng method thì có thể bị instance
nếu class mà tạo object thì object đó sẽ có 1 instance của method
vậy nên mothod khôg phù hợp để làm function, vì định nghĩa function là tạo 1 lần
sử dụng được ở nhiều nơi.
--> giải pháp: thêm static vào method: như vậy method đó không thuộc sỡ hữu
của các object mà thuộc sở hữu của class. Không instance nữa, tất cả object
phải thông qua class để xài chung method này
--> dependency injection.

Vậy thì nếu mình có một mảng ko có tính đố kỵ, mình cần có 1 anh trọng tài giúp mình 
so sánh, sau đó bỏ vào  danh sách sinh viên thông qua Collections.sort() để
xếp sắp.
 */

//tiến hành tạo comparator (trọng tài)


