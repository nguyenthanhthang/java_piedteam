
package data;

//cái khuôn (class) chuyên đúc ra ngôi sao | ca sĩ nổi tiếng (object)//khứa nào củng chui ra từ cái khuôn này
public class Star {
    //properties-props-field-attribute: thuộc tính
    public  String name;
    public int yob;
    public static String gender;
    public String hotSong;
    
    
    
    //method | function : phương thức
    
    //constructor: cái phễu
    // phải public
    
    //this: this là đại diện cho class chứa nó

    
    public  Star (String name, int yob, String gender, String hotSong){
        this.name = name;
        this.yob = yob;
        this.gender = gender;
        this.hotSong = hotSong;
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHotSong() {
        return hotSong;
    }

    public void setHotSong(String hotSong) {
        this.hotSong = hotSong;
    }

    
    public void showInfor() {
        System.out.println("Tôi tên là " + name +
                     "|Giới tính " + gender +
                     "|Sinh năm " + yob +
                     "|hotsong " + hotSong);
    }
    
}

