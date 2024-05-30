package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import utils.Inputter;

/*
CarList: là anh quản lý danh  sách các chiếc xe carList
    thì ảnh có: danh sách các chiếc xe carList
            có: 1 anh quản lý danh sách các "dòng xe" brandList
 */
public class CarList {

    ArrayList<Car> carList = new ArrayList<>();
    BrandList brandList;// anh quản lý brandList tên là brandList
    //constructor

    public CarList(BrandList brandList) {
        this.brandList = brandList;
    }

    public boolean loadFromFile(String url) {
        File f = new File(url);
        try {
            //xử lý file
            BufferedReader reader = new BufferedReader(new FileReader(f));
            String line = reader.readLine();
            while (line != null) {
                //xử lý dòng
                StringTokenizer st = new StringTokenizer(line, ",");
                String cid = st.nextToken().trim();
                String bid = st.nextToken().trim();
                String color = st.nextToken().trim();
                String fid = st.nextToken().trim();
                String eid = st.nextToken().trim();

                //dùng bid tìm brand tương ứng
                int pos = brandList.searchID(bid);
                Brand brand = brandList.brandList.get(pos);
                Car nCar = new Car(cid, brand, color, fid, eid);
                carList.add(nCar);
                line = reader.readLine();
            }

            //nếu ok thì
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    //hàm in danh sách

    public void listCar() {
        if (carList.isEmpty()) {
            System.out.println("Car List nothing to print");
            return;
        }
        //còn có danh sách thì
        System.out.println("____CarList____");
        for (Car car : carList) {
            System.out.println(car.screenString());
        }
        Collections.sort(carList);
    }

    //hàm tìm vị trí theo carID
    public int searchID(String carID) {
        for (int i = 0; i <= carList.size() - 1; i++) {
            if (carList.get(i).equals(carID)) {
                return i;
            }
        }
        return -1;
    }

    //hàm tìm vị trí theo frameID
    public int searchFrame(String frameID) {
        for (int i = 0; i <= carList.size() - 1; i++) {
            if (carList.get(i).getFrameID().equals(frameID)) {
                return i;
            }
        }
        return -1;
    }

    //hàm tìm vị trí theo frameID
    public int searchEngine(String engineID) {
        for (int i = 0; i <= carList.size() - 1; i++) {
            if (carList.get(i).getEngineID().equals(engineID)) {
                return i;
            }
        }
        return -1;
    }

    //hàm thêm 1 chiếc xe: addCar()
    public void addCar() {
        //thu thập
        //id cấm trùng
        boolean isDup;
        String carID;
        do {
            isDup = false; //resert tin là không bị trùng
            carID = Inputter.getString("Input carId: ",
                         "that's field is required");

            int pos = searchID(carID);
            if (pos != -1) {
                System.out.println("carId has been used!");
                isDup = true;
            }
        } while (isDup);// còn trùng là còn nhập lại

        //nhập brand bằng menu
        Brand Brand = brandList.getUserChoice();

        String color = Inputter.getString("Input color: ",
                     "that's field is required");

        //-----------------------------------------------
        //frameID theo format và cấm trùng
        String frameID;
        do {
            isDup = false; //resert tin là không bị trùng
            frameID = Inputter.getString("Input frameID: ",
                         "that's field is required");

            int pos = searchFrame(frameID);
            if (pos != -1) {
                System.out.println("frameID has been used!");
                isDup = true;
            }
        } while (isDup);// còn trùng là còn nhập lại

        //---------------------------------------
        //frameID theo format và cấm trùng
        String engineID;
        do {
            isDup = false; //resert tin là không bị trùng
            engineID = Inputter.getString("Input engineID: ",
                         "that's field is required");

            int pos = searchEngine(engineID);
            if (pos != -1) {
                System.out.println("engineID has been used!");
                isDup = true;
            }
        } while (isDup);// còn trùng là còn nhập lại

        //tạo car
        Car car = new Car(carID, Brand, color, frameID, engineID);
        carList.add(car);
        System.out.println("Car addding is successfull!!");
    }

    public void printBasedBrandName() {
        //nhập một phần BrandName cần tìm
        String key = Inputter.getString("Input a part of BrandName: ",
                     "That's field is required");

        //duyệt qua các chiếc xe, xe nào mà brandName có chứa key
        //thì in ra
        int count = 0;
        for (Car car : carList) {
            if (car.getBrand().getBrandName().contains(key)) {
                System.out.println(car.screenString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No car is detected");
        }
    }

    public boolean removeCar() {
        String keyId = Inputter.getString("Input carId you wanna remove",
                     "That's field is required!!");

        int pos = searchID(keyId);
        Car car = pos == -1 ? null : carList.get(pos);
        if (car == null) {
            System.out.println("not found");
            return false;
        } else {
            System.out.println("Car information: ");
            System.out.println(car.screenString());
            carList.remove(pos);
            System.out.println("Car removing is successing!!");
            return true;
        }
    }

    public boolean updateCar() {
        String keyId = Inputter.getString("Input carId you wanna update",
                     "That's field is required!!");

        int pos = searchID(keyId);
        Car car = pos == -1 ? null : carList.get(pos);
        if (car == null) {
            System.out.println("not found");
            return false;
        } else {
            System.out.println("Car information: ");
            System.out.println(car.screenString());

            //tien hanh thu thap thong tin moi
            //nhập brand bằng menu
            Brand Brand = brandList.getUserChoice();

            String color = Inputter.getString("Input color: ",
                         "that's field is required");

            //-----------------------------------------------
            //frameID theo format và cấm trùng
            boolean isDup;
            String frameID;
            do {
                isDup = false; //resert tin là không bị trùng
                frameID = Inputter.getString("Input frameID: ",
                             "that's field is required");

                 pos = searchFrame(frameID);
                if (pos != -1) {
                    System.out.println("frameID has been used!");
                    isDup = true;
                }
            } while (isDup);// còn trùng là còn nhập lại

            //---------------------------------------
            //frameID theo format và cấm trùng
            String engineID;
            do {
                isDup = false; //resert tin là không bị trùng
                engineID = Inputter.getString("Input engineID: ",
                             "that's field is required");

                 pos = searchEngine(engineID);
                if (pos != -1) {
                    System.out.println("engineID has been used!");
                    isDup = true;
                }
            } while (isDup);// còn trùng là còn nhập lại

            //set
            
            car.setBrand(Brand);
            car.setColor(color);
            car.setFrameID(frameID);
            car.setEngineID(engineID);
            System.out.println("Car updating is successing!!");
            return true;
        }
    }
     public boolean saveToFile(String url){
        File f = new File(url);
        try {
            OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f));
            for (Car car : carList) {
                writer.write(car.toString());
                writer.write("\n");
            }
            writer.flush();
            
            return true;
            
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return false;
        }
    }
}
