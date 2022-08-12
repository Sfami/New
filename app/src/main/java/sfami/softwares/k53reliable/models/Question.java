package sfami.softwares.k53reliable.models;

import java.io.Serializable;

public class Question implements Serializable {

    private String question, correctAnsNo, option1, option2, option3, option4, imageUrl;

    public Question(String question, String correctAnsNo , String option1, String option2, String option3, String option4, String imageUrl) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.correctAnsNo = correctAnsNo;
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "QuestionModel{" +
                "question='" + question + '\'' +
                ", option1='" + option1 + '\'' +
                ", option2='" + option2 + '\'' +
                ", option3='" + option3 + '\'' +
                ", option4='" + option4 + '\'' +
                ", correctAnsNo=" + correctAnsNo +
                ", imageUrl=" + imageUrl +
                '}';
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getCorrectAnsNo() {
        return correctAnsNo;
    }

    public void setCorrectAnsNo(String correctAnsNo) {
        this.correctAnsNo = correctAnsNo;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String image) {
        this.imageUrl = image;
    }
}