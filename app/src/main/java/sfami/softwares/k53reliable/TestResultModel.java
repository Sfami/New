package sfami.softwares.k53reliable;

import java.util.ArrayList;

public class TestResultModel {

    private Integer id;
    private String testName;
    private Integer score;
    private Integer total;
    private String data;
    private String answers;

    public TestResultModel(Integer id, String testName, Integer score, Integer total, String data, String answers) {
        this.id = id;
        this.testName = testName;
        this.score = score;
        this.total = total;
        this.data = data;
        this.answers = answers;
    }


    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "TestResultModel{" +
                "testName='" + testName + '\'' +
                ", score=" + score +
                ", total=" + total +
                '}';
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }
}
