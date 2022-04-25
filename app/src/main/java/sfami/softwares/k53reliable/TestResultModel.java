package sfami.softwares.k53reliable;

public class TestResultModel {

    private Integer id;
    private String testName;
    private Integer score, total;

    public TestResultModel(Integer id, String testName, Integer score, Integer total) {
        this.id = id;
        this.testName = testName;
        this.score = score;
        this.total = total;
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
}
