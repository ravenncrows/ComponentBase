package ComponentBase.role;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by waiti on 5/1/2016.
 */
@Entity
@Document
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String roleName;

    public Role (String roleName) {
        this.roleName = roleName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
