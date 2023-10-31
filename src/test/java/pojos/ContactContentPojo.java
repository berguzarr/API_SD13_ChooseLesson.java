package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.restassured.response.Response;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactContentPojo {
    private String date;
    private String email;
    private String message;
    private String name;
    private String subject;

    private int toplamMesajSayisi;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    private Response response;
    public int getToplamMesajSayisi() {
        return toplamMesajSayisi;
    }
    public void setToplamMesajSayisi(int toplamMesajSayisi) {
        this.toplamMesajSayisi = toplamMesajSayisi;
    }



    public ContactContentPojo(){}

    public ContactContentPojo(String date, String email, String message, String name, String subject){

        this.date = date;

        this.email = email;

        this.message = message;

        this.name = name;

        this.subject = subject;

    }

    public void setDate(String date){

        this.date = date;

    }

    public String getDate(){

        return this.date;

    }

    public void setEmail(String email){

        this.email = email;

    }

    public String getEmail(){

        return this.email;

    }

    public void setMessage(String message){

        this.message = message;

    }

    public String getMessage(){

        return this.message;

    }

    public void setName(String name){

        this.name = name;

    }

    public String getName(){

        return this.name;

    }

    public void setSubject(String subject){

        this.subject = subject;

    }

    public String getSubject(){

        return this.subject;

    }

    @Override
    public String toString() {
        return "ContactContentPojo{" +
                "date='" + date + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

}
