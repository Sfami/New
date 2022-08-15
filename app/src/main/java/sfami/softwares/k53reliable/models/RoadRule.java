package sfami.softwares.k53reliable.models;

public class RoadRule {

    private final String name;
    private final String instruction;

    public RoadRule(String name, String instruction) {
        this.name = name;
        this.instruction = instruction;
    }

    public String getName() {
        return name;
    }

    public String getInstruction() {
        return instruction;
    }
}

