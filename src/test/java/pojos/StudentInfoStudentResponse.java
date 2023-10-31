package pojos;

public class StudentInfoStudentResponse{

    public int userId;
    public String username;
    public int studentNumber;


    public StudentInfoStudentResponse() {
    }

    public StudentInfoStudentResponse(int userId, String username, int studentNumber) {
        this.userId = userId;
        this.username = username;
        this.studentNumber = studentNumber;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "StudentInfoStudentResponse{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", studentNumber=" + studentNumber +
                '}';
    }

}

