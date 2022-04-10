package sfami.softwares.k53reliable;

import java.io.Serializable;

public class MyRoadRuleData implements Serializable {

    private String ruleTitle, ruleInstruction;
    private Integer ruleImage;

    public MyRoadRuleData(Rule rule) {
        this.ruleTitle = rule.title;
        this.ruleInstruction = rule.instruction;
        this.ruleImage = rule.image;
    }

    public String getRuleTitle() {
        return ruleTitle;
    }

    public void setRuleTitle(String ruleTitle) {
        this.ruleTitle = ruleTitle;
    }

    public String getRuleInstruction() {
        return ruleInstruction;
    }

    public void setRuleInstruction(String ruleInstruction) {
        this.ruleInstruction = ruleInstruction;
    }

    public Integer getRuleImage() {
        return ruleImage;
    }

    public void setRuleImage(Integer movieImage) {
        this.ruleImage = ruleImage;
    }



}