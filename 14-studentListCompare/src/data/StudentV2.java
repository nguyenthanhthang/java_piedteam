/*
StudentV2: là cái khuôn chuyên dùng để đúc ra các sinh viên
có tính ganh đua đố kỵ.

Comparable: là hội những người có tính đố kỵ, sinh viên đang bình thường
nếu tham gia vô hội sẽ có tính thích ganh đua. Còn ganh đua về cái gì thì chưa rõ

Comparable: là 1 interface có một method duy nhất là compareTo
 */
package data;

public class StudentV2 implements Comparable<StudentV2>{

    //props
    private String id;
    private String fname;
    private String lname;
    private double score;

    //constructor
    public StudentV2(String id, String fname, String lname, double score) {
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

    @Override
    public int compareTo(StudentV2 that) {
        //this so với that
        if(this.getId().compareTo(that.getId()) > 0){
            return 1;
        }
        return -1;
    }

}
