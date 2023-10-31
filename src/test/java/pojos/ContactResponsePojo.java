package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactResponsePojo{

    private ContactContentPojo content;
    private int numberOfElements;
    private int totalPages;


    public ContactResponsePojo(){}

    public ContactResponsePojo(ContactContentPojo content, int numberOfElements, int totalPages){

        this.content = content;

        this.numberOfElements = numberOfElements;

        this.totalPages = totalPages;

    }

    public void setContent(ContactContentPojo content){

        this.content = content;

    }
    public ContactContentPojo getContent(){

        return this.content;

    }


    public void setNumberOfElements(int numberOfElements){

        this.numberOfElements = numberOfElements;

    }

    public int getNumberOfElements(){

        return this.numberOfElements;

    }


    public void setTotalPages(int totalPages){

        this.totalPages = totalPages;

    }

    public int getTotalPages(){

        return this.totalPages;

    }

    @Override
    public String toString() {
        return "ContactResponsePojo{" +
                "content=" + content +
                ", numberOfElements=" + numberOfElements +
                ", totalPages=" + totalPages +
                '}';
    }

}

