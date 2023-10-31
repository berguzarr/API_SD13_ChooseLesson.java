package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LessonProgramObjectPojo {


    private String day;
    private int educationTermId;
    private List<Integer> lessonIdList;
    private String startTime;
    private String stopTime;


    public LessonProgramObjectPojo() {
    }

    public LessonProgramObjectPojo(String day, int educationTermId, List<Integer> lessonIdList, String startTime, String stopTime) {

        this.day = day;

        this.educationTermId = educationTermId;

        this.lessonIdList = lessonIdList;

        this.startTime = startTime;

        this.stopTime = stopTime;

    }

    public void setDay(String day) {

        this.day = day;

    }

    public String getDay() {

        return this.day;

    }

    public void setEducationTermId(int educationTermId) {

        this.educationTermId = educationTermId;

    }

    public int getEducationTermId() {

        return this.educationTermId;

    }

    public void setLessonIdList(List<Integer> lessonIdList) {

        this.lessonIdList = lessonIdList;

    }

    public List<Integer> getLessonIdList() {

        return this.lessonIdList;

    }

    public void setStartTime(String startTime) {

        this.startTime = startTime;

    }

    public String getStartTime() {

        return this.startTime;

    }

    public void setStopTime(String stopTime) {

        this.stopTime = stopTime;

    }

    public String getStopTime() {

        return this.stopTime;

    }

    @Override
    public String toString() {
        return "LessonProgramPojo{" +
                "day='" + day + '\'' +
                ", educationTermId=" + educationTermId +
                ", lessonIdList=" + lessonIdList +
                ", startTime='" + startTime + '\'' +
                ", stopTime='" + stopTime + '\'' +
                '}';
    }
}




























