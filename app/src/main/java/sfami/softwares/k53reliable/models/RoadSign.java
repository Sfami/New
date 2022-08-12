package sfami.softwares.k53reliable.models;

import android.graphics.Bitmap;

import java.io.Serializable;

public class RoadSign implements Serializable {

    /***
     * Specifies the attributes for a Road Sign.
     * ***/

    int id;
    String name, where, purpose, action,description;
    Bitmap image;

    public RoadSign(int id, String name, String where, String purpose, String action, String description, Bitmap image) {
        this.id = id;
        this.name = name;
        this.where = where;
        this.action = action;
        this.purpose = purpose;
        this.description = description;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getWhere() {
        return where;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getAction() {
        return action;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }
}
