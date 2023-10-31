package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RegisterPojo {
    private StudentObjectPojo object;
    private String message;
    private String httpStatus;

    public RegisterPojo() {
    }

    public RegisterPojo(StudentObjectPojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public StudentObjectPojo getObject() {
        return object;
    }

    public String getMessage() {
        return message;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setObject(StudentObjectPojo object) {
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
        return "RegisterPojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
