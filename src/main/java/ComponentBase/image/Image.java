package ComponentBase.image;

/**
 * Created by panit on 5/11/2016.
 */

import javax.persistence.*;
import java.util.Date;


/**
 * Created by Dto on 3/29/2016.
 */
@Entity
public class Image {
    @Id
    private String id;

    String fileName;
    @Lob
    byte[] content;
    String contentType;

    @Temporal(TemporalType.TIME)
    Date created;

    public Image() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date create) {
        this.created = create;
    }

    public Image(String fileName, byte[] content, String contentType, Date created) {

        this.fileName = fileName;
        this.content = content;
        this.contentType = contentType;
        this.created = created;
    }
}
