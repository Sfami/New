package sfami.softwares.k53reliable.models;

public class TestResult {

    private Integer id;
    private String testName;
    private Integer score;
    private Integer total;
    private String answers;

    public TestResult(Integer id, String testName, Integer score, Integer total, String answers) {
        this.id = id;
        this.testName = testName;
        this.score = score;
        this.total = total;
        this.answers = answers;
    }

    public String getTestName() {
        return testName;
    }

    public Integer getScore() {
        return score;
    }

    public Integer getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "TestResultModel{" +
                "testName='" + testName + '\'' +
                ", score=" + score +
                ", total=" + total +
                '}';
    }

    public String getAnswers() {
        return answers;
    }

}
