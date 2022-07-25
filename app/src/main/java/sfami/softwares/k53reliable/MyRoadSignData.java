package sfami.softwares.k53reliable;

import java.io.Serializable;

public class MyRoadSignData implements Serializable {

    private String name,where, purpose, action, description;
    private Integer image;

    public MyRoadSignData(Sign sign) {
        this.name = sign.name;
        this.description = sign.description;
        this.purpose = sign.purpose;
        this.action = sign.action;
        this.where = sign.where;
        this.image = sign.sign;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer movieImage) {
        this.image = image;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String signName) {
        this.action = action;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String signName) {
        this.where = where;
    }

}