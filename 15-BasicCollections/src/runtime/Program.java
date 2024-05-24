package runtime;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Program {

    public static void main(String[] args) {
        playWithArrrayList();
        playWithQueue();
    }

    public static void playWithArrrayList() {
        /*
        ArrayList là một mảng đặc biệt và là class triển khai của interface list.
        
        ArrayList rất giống array primitive (mảng cùi ở bên C) nhưng arrayPrimitive
        không co giản được. Còn ArrayList lại là mảng động (co giản).
         */

        //tạo thử mảng cùi
        int[] arrPrimitive = new int[10]; // thiếu 10 là bug ngay.
        // muốn thêm củg ko đc, xài ít củng lỗi. 
        //arrPrimitive sẽ lưu được gì? primitive datatype
        //                             object datatype
        //                             Wrapper class | String

        //tạo thử mảng bằng ArrayList
        //ArrayList: lại là một mảng có khả năng co giãn, nhưng nó chỉ chơi được
        //với object.
        ArrayList<Integer> arrInList = new ArrayList<>();
        //các collection (bao gồm ArrayList) thì không chơi với primitive datatype.
        //Nên phải dùng Wrapper Class tương ứng
        //ngoài ra ta có thể khai báo thế này củng được
        List<Integer> arrInListV2 = new ArrayList<>();
        //khai cha new con
        //các methods của arrayList
        //add(value): thêm 1 value vào trong List.
        arrInList.add(new Integer(3));//vì mình lưu Integer không phải int.
        arrInList.add(new Integer(2));
        arrInList.add(4); //đc vì có auto-unboxing

        System.out.println(arrInList);// [3,2,4]// arrInList.toString()
        //.clear(): xoá hết các pt trong mảng
        arrInList.clear();// xoá sạch
        System.out.println(arrInList);// mảng rỗng []

        //.addd(index, value): nhét value vào vị trí index
        arrInList.add(0, 3);
        arrInList.add(1, 5);
        arrInList.add(2, 4);
        arrInList.add(1, 4);

        System.out.println(arrInList);
        //.addAll(index,list) thêm list vào index

        //giả xử, anh cần phải truy xuất mảng bằng mảng cùi, rồi 
        //sau đó muốn quay lại xài mảng ArrayList để có thể có giãn thì phải làm sao
        Integer arrDemo[] = {3, 5, 7};
        // giờ mình chuyển mảng cùi thành xịn
        //Arrays: là class chứa method hỗ trợ cho array.
        //Arrays.asList(ds): biến array thành list
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arrDemo));
        //arrList là phiên bản ArrayList của arrDemo
        //arrList sẽ co giản đc, nhưng truy xuất chậm
        //.toArray(): biến từ List về lại arrayPrimitive
        //1. tạo mảng cùi trước
        Integer numList[] = new Integer[arrList.size()];
        //dùng size của mảng xịn để tạo array Primitive  vì nó cần kíck thước
        //lúc khởi tạo
        //2. nạp giá trị từ mảng xịn vào arrayPrimitive
        arrList.toArray(numList);// numList được nạp giá trị từ arrList
        //3. xem kết quả thu được
        System.out.println(""); // ko ddc

        //.get(index): lấy ra 'xem'pt ở vị trí index trong list
        //arrList[3,5,7]
        System.out.println(arrList.get(1));

        //.set(index, value): 'gán' | thay thế giá trị ở vị trí index bằng value
        //muốn đổi số 5 thành số 9
        arrList.set(1, 9); //đổi 5 thành 9
        //arrList [3,9,7];
        //thử thách swap 3 và 7, chỉ dùng get và set
        Integer a = arrList.get(0);
        arrList.set(0, arrList.get(2));
        arrList.set(2, a);

        //iterable: tính khả lập (khả duyệt)
        //iterator: là một object có khả năng định nghĩa được trình tự
        //và giá trị có thể trả ra cho lần gọi tiếp theo
        //mô tả những gì diễn ra trong fore
        //khi mà mình muốn fore thằng arrList, anh sẽ tạo ra iterator từ arrlist
        Iterator<Integer> it = arrList.iterator(); // kêu arrList cung cấp
        //1 iterator để anh duyệt
        //it là iterator của arrList và fore sẽ dùng it để duyệt thay vì dùng
        //for từ 0 đến size - 1
        System.out.println(it.hasNext());// còn thì true | hết  thì false
        System.out.println(it.next());// lấy ra pt tiếp theo 7.
        System.out.println(it.next());// lấy ra pt tiếp theo 9.
        System.out.println(it.next());// lấy ra pt tiếp theo 3.

        //.remove(index): xoá pt nằm ở vị trí index trong list
        //arrList[7,9,3]: muốn xoá số 9
        arrList.remove(1);

        //arrList[7,3];
        //.removeAll(list): xoá hết các pt trong list
        arrList.add(5);
        arrList.add(9);
        arrList.add(2);
        arrList.add(12);

        //arrList[7,3,5,9,2,12]
        //arrIntListV2[9,12]
        arrList.removeAll(arrInListV2);
        System.out.println(arrList);

        //.size(): Lấy kíck  thước
        //.clone(): tạo ra 1 list mới có cùng pt và cùng kíck thước, dung lượng
        ArrayList<Integer> demoClone = (ArrayList) arrList.clone();
        //clone là shallow copy: copy nhưng chưa cắt hết dây mơ rễ má
        //deep copy: cắt hết dây mơ rễ má

        //.contain(key): tìm Key trong danh sách (boolean)
        //.notifyCapacity(): thông tin giới hạn lưu trữ.
        //.isEmpty(): có trống hay không (boolean).
        //.indexOf(key): tìm key ở vị trí nào.
        //.trimToSize(): thu nhỏ kíck thước thật.
    }

    public static void playWithQueue() {
        Queue<Integer> numList = new LinkedList<>();
        //khai cha new con
        //.add(value): nhét pt vào tail của danh sách (true|illegal exception)
        numList.add(3);// không có .add(index, value) vì nếu xài là chen hàng
        //.offer(): nhét pt vào tail của danh sách (true|false)
        numList.offer(1);
        numList.offer(5);
        numList.offer(4);
        //numList: head [3,1,5,4] tail
        //vẫn giữ được thứ tự truyền vào vì linkedlist thuộc list
        //hàng đợi thì không có get (index) => khôg đc phép lấy ra 1 bth
        //bất kỳ trong hàng đợi

        //.element(): lấy ra xem pt đầu tiên ở head (pt|nullPointer exception)
        numList.element(); // lấy ra số 3

        //.peek(): nhìn trộm, lấy ra 'xem' pt đầu tiên ở head(pt|null)
        numList.peek(); // lấy ra 3

        //.remove(): xoá pt ở vị trí head và return pt đã xoá => mình lấy ra 
        //đc, để xử lý
        numList.remove(); //xoá số 3 và ném 3 ra ngoài
        numList.remove(); //xoá số 1 và ném ra ngoài
        //.poll(): lấy pt đầu tiên của head ra khỏi danh sách (pt|null)
        numList.poll();// lấy 5 ra khỏi danh sách
        //[4]

        //nhét thêm vài số vào lại
        numList.offer(5);
        numList.offer(1);
        numList.offer(2);
        
        //thường thì khi dùng Queue khôg quan tâm trong chứa gì cả
        //k quan tâm số lượng bao nhiêu, chỉ quan tâm là thằng tiếp theo
        //còn hay không, ko thì kết thúc
        //mô phỏng xử lý hàng đợi
        while (true){
            Integer tmp = numList.poll();
            if (tmp == null) break;
            //do something
            System.out.println("Ahihi" + tmp + "là đứa bị xử tiếp theo");
    }

           //PRIORITY QUEUE: hàng đợi ưu tiên (min heap)
           Queue<Integer> numListV2 = new PriorityQueue<>();
           numListV2.offer(3);
           numListV2.offer(1);
           numListV2.offer(5);
           numListV2.offer(9);
           numListV2.offer(2);
           
           //rút poll()
           numListV2.poll(); // rút 1
           numListV2.poll(); // rút 2
           numListV2.poll(); // rút 3
           numListV2.poll(); // rút 5
           numListV2.poll(); // rút 9

           System.out.println(numListV2);

           
        
    }
    public static void playWithDeque(){
        //demo Dequeue thông qua ArrayDequeue
        Deque<Integer> numList = new ArrayDeque<>();
        //.add, offer nhét rear
        numList.add(3);
        numList.add(5);
        numList.offer(1);
        //.offerFirst, addFirst nhét ở font
        numList.offerFirst(9);
        numList.addFirst(7);
        //offerLast, addLast nhét ở rear
        numList.offerLast(6);
        numList.addLast(8);
        
        System.out.println(numList);//font[7, 9, 3, 5, 1, 6, 8]rear
        
        //nếu anh dùng arrayDeque như 1 linkedList thì
        //anh chỉ dùng method nào thôi
        //head(đầu ra)       |      rear(nhận vào)
        //thêm: .addLass     và   .offerLast
        //lấy : .getFirst    và   .peakFirst
        //xóa : .removeFirst và   .pollFirst
        
        //nếu anh dùng arrayDequeue như 1 stack thì sao
        //thêm: .addLass     và   .offerLast
        //lấy : .getLass    và   .peakLass
        //xóa : .removeLass và   .pollLass
    }
}
