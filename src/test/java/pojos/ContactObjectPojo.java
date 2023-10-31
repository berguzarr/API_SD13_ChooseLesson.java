package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactObjectPojo {
    private String date;
    private String email;
    private String message;
    private String name;
    private String subject;


    public ContactObjectPojo() {
    }

    public ContactObjectPojo(String date, String email, String message, String name, String subject) {
        this.date = date;
        this.email = email;
        this.message = message;
        this.name = name;
        this.subject = subject;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return this.date;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return this.subject;
    }

    @Override
    public String toString() {
        return "Object{" +
                "date='" + date + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

}
