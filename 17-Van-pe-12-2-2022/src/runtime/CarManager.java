package runtime;

import data.BrandList;

public class CarManager {
    public static void main(String[] args) {
        String brandUrl = "D:\\PIEDTEAM\\JAVA\\17-Van-pe-12-2-2022\\brands.txt"; 
        BrandList bl = new BrandList();
        bl.loadFromFile(brandUrl);
        bl.listBrands();//in ra
        bl.addBrand();//thêm
        bl.updateBrand();//cập nhật
        bl.listBrands();//ghi lại
    }
}
