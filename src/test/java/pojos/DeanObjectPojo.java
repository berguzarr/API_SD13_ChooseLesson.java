package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeanObjectPojo {     // Bu pojo class post ve update icin kullanilacaktir.

    private String birthDay;
    private String birthPlace;
    private String gender;
    private String name;
    private String phoneNumber;
    private String ssn;
    private String surname;
    private int userId;
    private String username;

    public DeanObjectPojo() {
    }
    public DeanObjectPojo(String birthDay, String birthPlace, String gender, String name, String phoneNumber, String ssn, String surname, int userId, String username) {
        this.birthDay = birthDay;
        this.birthPlace = birthPlace;
        this.gender = gender;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.ssn = ssn;
        this.surname = surname;
        this.userId = userId;
        this.username = username;
    }
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
    public String getBirthDay() {

        return this.birthDay;
    }
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }
    public String getBirthPlace() {

        return this.birthPlace;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return this.gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public String getSsn() {
        return this.ssn;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return this.surname;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getUserId() {
        return this.userId;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return this.username;
    }
    @Override
    public String toString() {
        return "DeanObjectPojo{" +
                "birthDay='" + birthDay + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", ssn='" + ssn + '\'' +
                ", surname='" + surname + '\'' +
                ", userId=" + userId +
                ", username='" + username + '\'' +
                '}';
    }

}
