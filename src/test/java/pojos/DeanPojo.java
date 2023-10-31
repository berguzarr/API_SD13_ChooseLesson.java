package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeanPojo {      // Bu pojo class post ve update icin kullanilacaktir.
    private String httpStatus;
    private String message;
    private DeanObjectPojo object;

    public DeanPojo() {
    }

    public DeanPojo(String httpStatus, String message, DeanObjectPojo object) {
        this.httpStatus = httpStatus;
        this.message = message;
        this.object = object;
    }
    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }
    public String getHttpStatus() {
        return this.httpStatus;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return this.message;
    }
    public void setObject(DeanObjectPojo object) {
        this.object = object;
    }
    public DeanObjectPojo getObject() {
        return this.object;
    }
    @Override
    public String toString() {
        return "DeanPojo{" +
                "httpStatus='" + httpStatus + '\'' +
                ", message='" + message + '\'' +
                ", object=" + object +
                '}';
    }
}

