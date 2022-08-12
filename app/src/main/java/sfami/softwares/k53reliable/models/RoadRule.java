package sfami.softwares.k53reliable.models;

public class RoadRule {

    private final String name;
    private final String instruction;

    public RoadRule(String name, String where) {
        this.name = name;
        this.instruction = where;
    }

    public String getName() {
        return name;
    }

    public String getInstruction() {
        return instruction;
    }
}

