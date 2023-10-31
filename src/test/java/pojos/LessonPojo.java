package pojos;

public class LessonPojo {

    private int lessonId;
    private String lessonName;
    private String creditScore;
    private boolean compulsory;

    public LessonPojo() {}

    public LessonPojo(int lessonId, String lessonName, String creditScore, boolean compulsory) {
        this.lessonId = lessonId;
        this.lessonName = lessonName;
        this.creditScore = creditScore;
        this.compulsory = compulsory;
    }

    public int getLessonId() {
        return this.lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public String getLessonName() {
        return this.lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getCreditScore() {
        return this.creditScore;
    }

    public void setCreditScore(String creditScore) {
        this.creditScore = creditScore;
    }

    public boolean isCompulsory() {
        return this.compulsory;
    }

    public void setCompulsory(boolean compulsory) {
        this.compulsory = compulsory;
    }

    @Override
    public String toString() {
        return "LessonPojo{" +
                "lessonId=" + lessonId +
                ", lessonName='" + lessonName + '\'' +
                ", creditScore=" + creditScore +
                ", compulsory=" + compulsory +
                '}';
    }
}
