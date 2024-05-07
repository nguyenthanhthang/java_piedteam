/*
StudyEnthusiasts: những người đam mê học tập.

Nếu bác thợ săn học bình thường thì lúc nào củng lâm le "phò mã".
Nhưng nếu bác join hội StudyEnthusiasts thì bác sẽ thừa hưởng ý từ hội này
từ đó bác học lầm học lốn, đéo quan tâm "phò mã" nữa.
(then chốt là bị ràng buộc method từ StudyEnthusiasts)

Xét đối tượng Horse: nếu bình thường thì vừa học vừa hú hí.
Nhưng tương tự như Hunter, Horse củng join vào hội StudyEnthusiasts, từ đó
THỪA HƯỞNG Ý CHÍ từ hội,
thế là học bất chấp súng chỉa đầu.

--> StudyEnthusiasts: nó lưu trữ ý chí ham học, bỏ lại tất cả, để all in học.
Ai củng có thể tham gia vào đây, một khi join vào là sẽ thừa hưởng ý chí.

Những ai là thành viên của hội thì sẽ có một điểm chung: đam mê học.
*/


/*
Lý thuyết về interface: là một class chỉ quan tâm đến method mà thôi, không quan
đến prop.

*/
package data;

public interface StudyEnthusiasts {
    
    //Nếu cố tình tạo 1 prop: thì nó sẽ là  đồ dùng chung.
    //int X = 33;
    
    //final == const lúc tạo ra phải có giá trị
    //mà trong interface tất cả props đều là static final
    //=> không cần phễu để rót giá trị vào ngăn
    //interface sẽ có 1 phễu mặc định ( phễu rỗng)
    //ko có props nên củng không có getter và setter
    
    
    //tất cả các methods trong interface đều là abstract methods, dù
    //có ghi abstract hay không thì nó củng ngầm tự nhận là abstract.
   public double studyHard();
   public void showProfile();
   
   //Lưu ý: thực tế thì trong 1 interface chỉ nên chứa 1 methods.
   // ở trên để ví dụ thôi
   
   //ý nghĩa sử dụng của interface: là cái cớ để gom nhóm các đối tượng đéo
   //có liên quan quần què gì với nhau cả.
}
