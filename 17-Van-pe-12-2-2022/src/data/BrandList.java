package data;
//BrandList: người quản lý danh sách các "Hãng độ xe"

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import utils.Inputter;

public class BrandList {
    //danh sách cần quản lý
    ArrayList<Brand> brandList = new ArrayList<>();
    //method giúp quản lý
    public boolean loadFromFile(String url){
        File f = new File(url);
        try{
            //đọc file
            BufferedReader reader = new BufferedReader(new FileReader(f));
            String line = reader.readLine();
            while(line != null){
                //xử lý line ->obj -> lưu vào ds
                StringTokenizer st = new StringTokenizer(line, ",");
                //thu thập
                String id = st.nextToken().trim();
                String name = st.nextToken().trim();
                String str = st.nextToken().trim();
                //hash stage 2
                st = new StringTokenizer(str, ":");
                String sound = st.nextToken().trim();
                double price = Double.parseDouble(st.nextToken().trim());
                //đúc
                Brand nBrand = new Brand(id, name, sound, price);
                brandList.add(nBrand);//lưu
                line = reader.readLine();
            }  
            return true;
        }catch(Exception e){
            System.out.println("Brand file error " + e);
            return false;
        }
    }
    //hàm in danh sách
    public void listBrands(){
        if(brandList.isEmpty()){
            System.out.println("Brand List nothing to print");
            return;
        }
        //còn có danh sách thì
        System.out.println("__BrandList__");
        for (Brand brand : brandList) {
            System.out.println(brand);// brand tự gọi tótring nên ko cần gọi
        }
    }
    
    public int searchID (String keyId){
        for(int i = 0; i <= brandList.size() - 1; i++){
            if(brandList.get(i).getBrandID().equals(brandList)){
                return i;
            }
        }
        return -1;
    }

    //hàm thêm
    public void addBrand(){
        //id
        boolean isDup = false;
        String id;
        do{
            isDup = false;
            //mời nhập
            id = Inputter.getString("Input brand id: ", 
                    "That field is required");
            //check trùng
            for (Brand brand : brandList) {
                if(brand.getBrandID().equals(brand)){
                    isDup = true;
                    System.out.println("Id is duplicate");
                }
            }
        }while(isDup);
        //name, sound, price
        String name = Inputter.getString("Input brand name: ", 
               "That field is required");
        String sound = Inputter.getString("Input sound name: ", 
               "That field is required");
        
        //price phải là số dương
        double price;
        do{
            price = Inputter.getADouble("Input price: ", 
                    "That field is required");
            if(price < 0){
                System.out.println("Price must be positive real number");
            }
        }while(price < 0);
        
        //đúc
        Brand nbrand = new Brand(id, name, sound, price);
        brandList.add(nbrand);
        System.out.println("_Brand adding is successfull !!!");
    }   
    
    public void updateBrand(){
        String keyId = Inputter.getString("Input brand you wanna update", 
                "that field is required");
        int pos = this.searchID(keyId);//this ko ghi cug dc
        if(pos == -1){
            System.out.println("Not Found !!!");
        }else{
            System.out.println("Brand information before updating");
            System.out.println(brandList.get(pos));
            System.out.println("Updating...");
            //thu thập
            //name, sound, price
            String name = Inputter.getString("Input new brand name: ", 
                   "That field is required");
            String sound = Inputter.getString("Input new sound name: ", 
                   "That field is required");

            //price phải là số dương
            double price;
            do{
                price = Inputter.getADouble("Input new price: ", 
                        "That field is required");
                if(price < 0){
                    System.out.println("Price must be positive real number");
                }
            }while(price < 0);
            //set
            brandList.get(pos).setBrandName(name);
            brandList.get(pos).setSoundBrand(sound);
            brandList.get(pos).setPrice(price);
            System.out.println(" _Updating is successfull !!!");
            
        }
    }

}
