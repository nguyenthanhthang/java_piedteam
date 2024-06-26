package runtime;

import data.Pet;
import data.PetManagement;
import java.util.Scanner;
import jdk.nashorn.internal.parser.Lexer;
import ui.Menu;
import utils.Inputter;

/**
 * Viết 1 chương trình quản lý thú cưng (DOG | CAT) 1. Thêm mới 1 con cún 2.
 * Thêm mới 1 con mèo 3. in ra danh sách thú cưng 4. tìm kiếm thú cưng theo tên
 * 5. update thú cưng theo id 6. remove thú cưng theo id 7. sắp xếp thú cưng
 * theo trọng lượng 8. save file and quit
 *
 * khi thêm mới id của pet k được trùng với id ở trong danh sách id của pet phải
 * thỏa theo format "D001| C001" một con Pet có nhửng thuộc tính owner , color,
 * weight
 *
 * Dog: necklace Cat: ribbon
 *
 * yêu cầu chung: nhập chuẩn | nhập bậy bạ là chữi
 */
public class Program {

    public static void main(String[] args) {

        //pm.initData();
        PetManagement pm = new PetManagement();
    
        String url = "D:\\PIEDTEAM\\JAVA\\16-petCareSystem\\petListDoc.txt";
        pm.loadFromFile(url);
        Menu menu = new Menu("Pet Care System Menu <3");
        menu.addNewOption("Add new dog");
        menu.addNewOption("Add new cat");
        menu.addNewOption("print pet list");
        menu.addNewOption("search pet by id");
        menu.addNewOption("update pet by id");
        menu.addNewOption("remove pet by id");
        menu.addNewOption("sort pet list order by weight");
        menu.addNewOption("save file and quit");

        int choice;
        while (true) {
            menu.print();
            choice = menu.getchoice();
            switch (choice) {
                case 1: {
                    pm.addNewDog();
                    break;
                }
                case 2: {
                    pm.addNewCat();
                    break;
                }
                case 3: {
                    pm.showPetList();
                    break;
                }
                case 4: {
                    pm.searchPetById();
                    break;
                }
                case 5: {
                    pm.updatePetById();
                    break;
                }
                case 6: {
                    pm.removePetById();
                    break;
                }
                case 7: {
                    pm.sortPetListByWeight();
                    break;
                }
                case 8: {
                    pm.saveToFile(url);
                    System.out.println("See you again");
                    return;
                }
            }
        }
    }

}
