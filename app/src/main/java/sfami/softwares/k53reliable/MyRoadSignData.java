package sfami.softwares.k53reliable;

import java.io.Serializable;

public class MyRoadSignData implements Serializable {

    private String signName, signDescriptions, signPurpose, signAction, signWhere;
    private Integer signImage;

    public MyRoadSignData(Sign sign) {
        this.signName = sign.name;
        this.signDescriptions = sign.description;
        this.signPurpose = sign.purpose;
        this.signAction = sign.action;
        this.signWhere = sign.where;
        this.signImage = sign.sign;
    }


    public String getSignName() {
        return signName;
    }

    public void setSignName(String signName) {
        this.signName = signName;
    }

    public String getSignDescriptions() {
        return signDescriptions;
    }

    public void setSignDescriptions(String signDescriptions) {
        this.signDescriptions = signDescriptions;
    }

    public String getSignPurpose() {
        return signPurpose;
    }

    public void setSignPurpose(String signPurpose) {
        this.signPurpose = signPurpose;
    }

    public Integer getSignImage() {
        return signImage;
    }

    public void setSignImage(Integer movieImage) {
        this.signImage = signImage;
    }

    public String getSignAction() {
        return signAction;
    }

    public void setSignAction(String signName) {
        this.signAction = signAction;
    }

    public String getSignWhere() {
        return signWhere;
    }

    public void setSignWhere(String signName) {
        this.signWhere = signWhere;
    }

}