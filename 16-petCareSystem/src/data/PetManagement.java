package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;
import org.jcp.xml.dsig.internal.dom.Utils;
import utils.Inputter;

/*
PetManagement: 1 cái khuôn dùng để đúc ra anh quản lý danh sách thú cưng.
PetManagement phải có: danh sách thú cưng petList
PetManagement phải có 1 đống hàm giúp xử lý petList
trong đống đó chắc chắn có: hàm thêm, xoá, sửa, tìm, sort.
    
 */
public class PetManagement {

    /*
    1. in ra danh sách thú cưng
    2. sắp xếp thú cưng theo trọng lượng
    3. tìm kiếm thú cưng theo tên
    4. update thú cưng theo id
    4. remove thú cưng theo id
    5. Thêm mới 1 con cún
    5. Thêm mới 1 con mèo
    6. save file and quit
     */
    //tạo cái tủ đựng bằng arrayList
    ArrayList<Pet> petList = new ArrayList<>();

    //tạo initData(): nhét vào 2 chó 2 mèo để test code.
    public void initData() {
        petList.add(new Dog("D001", "Tuấn", "Red", 6.5, "I love you"));
        petList.add(new Dog("D002", "Toàn", "ỶeLâu", 2.6, "yellow"));
        petList.add(new Cat("C001", "Tùng", "Nâu", 4.2, "Mỹ Diệu"));
        petList.add(new Cat("C001", "Thông", "Tím", 5.2, "Thông Tim"));

    }

    //1. in ra danh sách thú cưng | ShowPetList()
    public void showPetList() {
        if (petList.isEmpty()) {
            System.out.println("Nothing to print!");
            return;
        }
        System.out.println("-----PetList-----");
        for (Pet item : petList) {
            item.showInfor();
        }
    }

    //2. sắp xếp thú cưng theo trọng lượng | sortPetListByWeight()
    public void sortPetListByWeight() {
        //a. tạo anh trọng tài 'orderByWeight'
        Comparator<Pet> orderByWeight = new Comparator<Pet>() {
            @Override
            public int compare(Pet t1, Pet t2) {
                //return t1.getWeight() > t2.getWeight() ? 1 : -1;
                return (int) (t1.getWeight() - t2.getWeight());
            }
        };
        //b. cài anh trọng tài vào danh sách
        Collections.sort(petList, orderByWeight);
    }

    //3. tìm kiếm thú cưng theo tên
    //a.nhận vào id, trả về vị trí
    //b.nhận vào id, trả ra con pet
    //c.xin id, không trả ra, thông báo thôi
    //a.nhận vào id, trả về vị trí
    public int searchPetIndexById(String keyId) {
        for (int i = 0; i <= petList.size() - 1; i++) {
            if (petList.get(i).getId().equals(keyId)) {
                return i;
            }
        }
        return -1;
    }

    //b.nhận vào id, trả ra con pet
    public Pet searchPetById(String keyId) {
        int pos = this.searchPetIndexById(keyId);
        return pos == -1 ? null : petList.get(pos);
    }
    //c.xin id, không trả ra, thông báo thôi

    public void searchPetById() {
        String keyId = Inputter.getString("enter your id you wanna find: ",
                     "That field is required!!");

        Pet pet = this.searchPetById(keyId);
        if (pet == null) {
            System.out.println("not found");
        } else {
            System.out.println("--------information pet-------");
            pet.showInfor();
        }
    }

    //hàm removePetById():
    public void removePetById() {
        String keyId = Inputter.getString("enter your id you wanna remove: ",
                     "That field is required!!");

        Pet pet = this.searchPetById(keyId);
        if (pet == null) {
            System.out.println("not found");
        } else {
            System.out.println("--------information pet-------");
            pet.showInfor();
            petList.remove(pet);
            System.out.println("Removing is successfull!");
        }
    }

    //method Updates
    public void updatePetById() {
        String keyId = Inputter.getString("enter your id you wanna update: ",
                     "That field is required!!");

        Pet pet = this.searchPetById(keyId);
        if (pet == null) {
            System.out.println("not found");
        } else {
            System.out.println("--------information pet before updating-------");
            pet.showInfor();
            System.out.println("Updating....");
            //update cái gì: owner, color, weight , (ko đc úp id)
            //dog thì thêm necklace
            //cat thì thêm ribbon
            String newOnwer = Inputter.getString("Input owner: ",
                         "That field is required!!");

            String newColor = Inputter.getString("Input color: ",
                         "That field is required!!");

            double newWeight = Inputter.getADouble("Input weight: ",
                         "That field is required!!", 1, 100);

            pet.setOwner(newOnwer);
            pet.setColor(newColor);
            pet.setWeight(newWeight);

            //check dog or cat
            if (pet instanceof Dog) {
                String newNecklace = Inputter.getString("Input necklace: ",
                             "That field is required!!");
                ((Dog) pet).setNecklace(newNecklace);
            } else {
                String newRiboon = Inputter.getString("Input ribbon: ",
                             "That field is required!!");
                ((Cat) pet).setRibbon(newRiboon);
            }
            System.out.println("updating is successfull!");
        }
    }

    //method addNewDog(): thêm một con chó
    public void addNewDog() {
        //thu thập thông tin để đúc con chó
        boolean isDup;
        String id;
        do {
            isDup = false;
            id = Inputter.getString("Input your Dog's id: ",
                         "Your id isn't matched DXXX!!",
                         "[dD]\\d{3}").toUpperCase();
            Pet pet = searchPetById(id);
            if (pet != null) {
                isDup = true;
                System.out.println("Id has been used");
            }
        } while (isDup);
        String Onwer = Inputter.getString("Input owner: ",
                     "That field is required!!");

        String Color = Inputter.getString("Input color: ",
                     "That field is required!!");

        double Weight = Inputter.getADouble("Input weight: ",
                     "That field is required!!", 1, 100);
        
        String Necklace = Inputter.getString("Input necklace: ",
                             "That field is required!!");
        
        //tạo
        Dog nDog = new Dog(id, Onwer, Color, Weight, Necklace);
        petList.add(nDog);
        System.out.println("Adding is successfull!!");
    }
    
    //method addNewCat(): thêm một con mèo
        public void addNewCat() {
        //thu thập thông tin để đúc con chó
        boolean isDup;
        String id;
        do {
            isDup = false;
            id = Inputter.getString("Input your Cat's id: ",
                         "Your id isn't matched CXXX!!",
                         "[Cc]\\d{3}").toUpperCase();
            Pet pet = searchPetById(id);
            if (pet != null) {
                isDup = true;
                System.out.println("Id has been used");
            }
        } while (isDup);
        String Onwer = Inputter.getString("Input owner: ",
                     "That field is required!!");

        String Color = Inputter.getString("Input color: ",
                     "That field is required!!");

        double Weight = Inputter.getADouble("Input weight: ",
                     "That field is required!!", 1, 100);
        
        String Riboon = Inputter.getString("Input ribbon: ",
                             "That field is required!!");
        
        //tạo
        Cat nCat = new Cat(id, Onwer, Color, Weight, Riboon);
        petList.add(nCat);
        System.out.println("Adding is successfull!!");
    }
        
        //mehtod đọc file
        public boolean loadFromFile(String url){
            File f = new File(url);// biến url thành object File
            try {
                //xử lý file
                BufferedReader reader = new BufferedReader(new FileReader(f));
                String line = reader.readLine(); // đọc dòng đầu tiên và lưu
                while(line != null){
                    //nếu có dòng thì xử lý
                    StringTokenizer st = new StringTokenizer(line,"|");
                    String id = st.nextToken().trim();
                    String owner = st.nextToken().trim();
                    String color = st.nextToken().trim();
                    double weight = Double.parseDouble(st.nextToken().trim());
                    String special = st.nextToken().trim();
                    //phân tích id phù hợp để xác định necklace or ribbon
                    Pet pet; //  tạo pet rỗng
                    if(id.matches("[dD]\\d{3}")){
                        pet = new Dog(id, owner, color, weight, special);
                    }else {
                        pet = new Cat(id, owner, color, weight, special);
                    }
                    petList.add(pet);
                    line = reader.readLine();
                }
                
                //xử lý ok thì trả về True
                return true;   
            } catch (Exception e) {
                System.out.println(e);
                return false;
            }
            
        }
        //method lưu file
        public boolean saveToFile(String url){
            File f = new File(url);
            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f));
                for (Pet pet : petList) {
                    writer.write(pet.toString());
                    writer.write("\n");
                    
                }
                writer.flush();// save file trước khi đóng
                return true;
            } catch (Exception e) {
                System.out.println("luu file that bai " + e);
                return false;
            }
        }
}
