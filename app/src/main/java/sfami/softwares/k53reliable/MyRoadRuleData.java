package sfami.softwares.k53reliable;

import java.io.Serializable;

public class MyRoadRuleData implements Serializable {

    private String name, instruction;
    private Integer image;

    public MyRoadRuleData(Rule rule) {
        this.name = rule.title;
        this.instruction = rule.instruction;
        this.image = rule.image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer movieImage) {
        this.image = image;
    }



}