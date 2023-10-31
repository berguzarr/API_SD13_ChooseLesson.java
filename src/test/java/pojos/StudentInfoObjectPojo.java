package pojos;

public class StudentInfoObjectPojo{


    public int id;
    public double midtermExam;
    public double finalExam;
    public int absentee;
    public String infoNote;
    public String lessonName;
    public int creditScore;
    public String educationTerm;
    public StudentInfoStudentResponse studentResponse;
    public boolean compulsory;

    public StudentInfoObjectPojo() {
    }

    public StudentInfoObjectPojo(int id, double midtermExam, double finalExam, int absentee, String infoNote, String lessonName, int creditScore, String educationTerm, StudentInfoStudentResponse studentResponse, boolean compulsory) {
        this.id = id;
        this.midtermExam = midtermExam;
        this.finalExam = finalExam;
        this.absentee = absentee;
        this.infoNote = infoNote;
        this.lessonName = lessonName;
        this.creditScore = creditScore;
        this.educationTerm = educationTerm;
        this.studentResponse = studentResponse;
        this.compulsory = compulsory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMidtermExam() {
        return midtermExam;
    }

    public void setMidtermExam(double midtermExam) {
        this.midtermExam = midtermExam;
    }

    public double getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(double finalExam) {
        this.finalExam = finalExam;
    }

    public int getAbsentee() {
        return absentee;
    }

    public void setAbsentee(int absentee) {
        this.absentee = absentee;
    }

    public String getInfoNote() {
        return infoNote;
    }

    public void setInfoNote(String infoNote) {
        this.infoNote = infoNote;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public String getEducationTerm() {
        return educationTerm;
    }

    public void setEducationTerm(String educationTerm) {
        this.educationTerm = educationTerm;
    }

    public StudentInfoStudentResponse getStudentResponse() {
        return studentResponse;
    }

    public void setStudentResponse(StudentInfoStudentResponse studentResponse) {
        this.studentResponse = studentResponse;
    }

    public boolean isCompulsory() {
        return compulsory;
    }

    public void setCompulsory(boolean compulsory) {
        this.compulsory = compulsory;
    }

    @Override
    public String toString() {
        return "StudentInfoObjectPojo{" +
                "id=" + id +
                ", midtermExam=" + midtermExam +
                ", finalExam=" + finalExam +
                ", absentee=" + absentee +
                ", infoNote='" + infoNote + '\'' +
                ", lessonName='" + lessonName + '\'' +
                ", creditScore=" + creditScore +
                ", educationTerm='" + educationTerm + '\'' +
                ", studentResponse=" + studentResponse +
                ", compulsory=" + compulsory +
                '}';
    }
}
