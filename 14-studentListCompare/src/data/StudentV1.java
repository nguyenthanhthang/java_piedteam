/*
StudentV1: là cái khuôn chuyên dùng để đúc ra các sinh viên bình thường
về không hề có tính ganh đua đố kỵ
 */
package data;

public class StudentV1 {

    //props
    private String id;
    private String fname;
    private String lname;
    private double score;

    //constructor
    public StudentV1(String id, String fname, String lname, double score) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public double getScore() {
        return score;
    }
    
    public void showInfor(){
        String str = String.format("%-15s|%-15s|%-15s|%5.2f", 
                                       id, fname, lname,score);
        System.out.println(str);
    }

}
