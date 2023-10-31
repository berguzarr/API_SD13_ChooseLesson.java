package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactPojo {
    private ContactContentPojo object;
    private String message;
    private String httpStatus;

    private ContactPojo() {
    }

    public ContactPojo(ContactContentPojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public ContactContentPojo getObject() {
        return object;
    }

    public String getMessage() {
        return message;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setObject(ContactContentPojo object) {
        this.object = object;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    @Override
    public String toString() {
        return "ContactPojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
