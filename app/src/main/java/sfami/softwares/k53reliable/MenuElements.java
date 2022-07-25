package sfami.softwares.k53reliable;

public class MenuElements {
    /*
     * Menu
     * */


    public static String roadSignsSignName = "Road Signs";
    public static String roadSignsDescription = "Learn about all the road signs controls that you will need to know to pass the K53 learner's test.";
    public static String roadSignsPurpose = "Stop";
    public static String roadSignsAction = "Stop";
    public static String roadSignsWhere = "Stop";
    public static Integer roadSignsImage = R.drawable.signs;
    public static Sign roadSignsSign = new Sign(roadSignsSignName, roadSignsDescription, roadSignsPurpose, roadSignsWhere, roadSignsAction, roadSignsImage);

    public static String roadRulesTitle = "Road Rules";
    public static String roadRulesDescription = "Learn about all the rules of the road that you will need to know to pass the K53 learner's test.";
    public static String roadRulesPurpose = "Stop";
    public static String roadRulesAction = "Stop";
    public static String roadRulesWhere = "Stop";
    public static Integer roadRulesImage = R.drawable.rules;
    public static Sign roadRulesSign = new Sign(roadRulesTitle, roadRulesDescription, roadRulesPurpose, roadRulesWhere, roadRulesAction, roadRulesImage);

    public static String controlsTitle = "Controls";
    public static String controlsDescription = "Learn about all the vehicle controls that you will need to know to pass the K53 learner's test.";
    public static String controlsPurpose = "Stop";
    public static String controlsAction = "Stop";
    public static String controlsWhere = "Stop";
    public static Integer controlsImage = R.drawable.controls;
    public static Sign controlsSign = new Sign(controlsTitle, controlsDescription, controlsPurpose, controlsWhere, controlsAction, controlsImage);

}
