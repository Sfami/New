package sfami.softwares.k53reliable.global;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import sfami.softwares.k53reliable.models.RoadRule;

public class GlobalElements {

    public static HashMap<String, String> getDatabasesMap() {
        HashMap<String, String> databasesMap = new HashMap<>();
        databasesMap.put("informationSigns", "INFORMATION_SIGNS");
        databasesMap.put("comprehensiveSigns", "COMPREHENSIVE_SIGNS");
        databasesMap.put("directionOfMovementSigns", "DIRECTION_OF_MOVEMENT_SIGNS");
        databasesMap.put("roadLayoutSigns", "ROAD_LAYOUT_SIGNS");
        databasesMap.put("regulatorySigns", "REGULATORY_SIGNS");
        databasesMap.put("temporarySigns", "TEMPORARY_SIGNS");
        databasesMap.put("trafficLights", "TRAFFIC_LIGHTS");
        databasesMap.put("secondarySigns", "SECONDARY_SIGNS");
        databasesMap.put("prohibitionSigns", "PROHIBITION_SIGNS");
        databasesMap.put("handSignals", "HAND_SIGNALS");
        databasesMap.put("symbolicSigns", "SYMBOLIC_SIGNS");
        databasesMap.put("routeMarkers", "ROUTE_MARKERS");
        databasesMap.put("commandSigns", "COMMAND_SIGNS");
        databasesMap.put("tempSigns", "TEMP_SIGNS");
        databasesMap.put("guidanceSigns", "GUIDANCE_SIGNS");
        databasesMap.put("regulatoryMarkings", "REGULATORY_MARKINGS");
        databasesMap.put("de-RestrictionSigns", "DE_RESTRICTION_SIGNS");
        databasesMap.put("controlSigns", "CONTROL_SIGNS");
        databasesMap.put("learnMenu", "LEARN_MENU");
        databasesMap.put("trafficSignals", "TRAFFIC_SIGNALS");
        databasesMap.put("infoSigns", "INFO_SIGNS");
        databasesMap.put("testMenu", "TEST_MENU");
        databasesMap.put("warningMarkings", "WARNING_MARKINGS");
        databasesMap.put("freewayDirectionSigns", "FREEWAY_DIRECTION_SIGNS");
        databasesMap.put("reservationSigns", "RESERVATION_SIGNS");
        databasesMap.put("roadMarkings", "ROAD_MARKINGS");
        databasesMap.put("guidanceMarkings", "GUIDANCE_MARKINGS");
        databasesMap.put("warningSigns", "WARNING_SIGNS");
        databasesMap.put("diagrammaticSigns", "DIAGRAMMATIC_SIGNS");
        databasesMap.put("roadRulesTest", "ROAD_RULES_TEST");
        databasesMap.put("roadSignsTest", "ROAD_SIGNS_TEST");
        databasesMap.put("controlsTest", "CONTROLS_TEST");
        databasesMap.put("k53Test", "K53_TEST");
        return databasesMap;
    }


    public static List<String> getAllRoadSignsMenusNames(){
        return Arrays.asList(
        "Road Layout Signs",
        "Direction Of Movement Signs",
        "Symbolic Signs",
        "Information Signs",
        "Route Markers",
        "Freeway Direction Signs",
        "Diagrammatic Signs",
        "Examples Of Temporary Signs",
        "Regulatory Markings",
        "Warning Markings",
        "Guidance Markings",
        "Traffic Lights",
        "Control hand signals for use by traffic officer.",
        "Control Signs",
        "Command Signs",
        "Prohibition Signs",
        "Reservation Signs",
        "Comprehensive Signs",
        "Secondary Signs",
        "De-Restriction Signs");
    }

    public static List<String> getAllMainMenuNames(){
        return Arrays.asList(
                "Road Signs",
                "Road Rules",
                "Controls");
    }

    public static List<String> getAllQuizMenuNames(){
        return Arrays.asList(
                "Controls Test",
                "Road Signs Test",
                "Road Rules Test",
                "K53 Test");
    }


    public static String rootApi = "https://sfamisoftwares.com/api-js/";

    public static String[] mainMenuJsonFiles = new String[]{
            "menu/learn-menu.json",
            "menu/test-menu.json"
    };


    public static String[] roadRulesJsonFiles = new String[]{
            "rules/rules.json"
    };

    public static String[] vehicleControlsJsonFiles = new String[]{
            "vehicle-controls/vehicle-controls.json"
    };


    public static List<String[]> getRoadSignsInformation() {
        List<String[]> information = new ArrayList<>();

        information.add(new String[]{"learnMenu", "LEARN_MENU", "menu/learn-menu.json"});
        information.add(new String[]{"testMenu", "TEST_MENU", "menu/test-menu.json"});

        information.add(new String[]{"roadLayoutSigns", "ROAD_LAYOUT_SIGNS", "signs/warning/road-layout-signs.json"});
        information.add(new String[]{"directionOfMovementSigns", "DIRECTION_OF_MOVEMENT_SIGNS", "signs/warning/direction-of-movement-signs.json"});
        information.add(new String[]{"symbolicSigns", "SYMBOLIC_SIGNS", "signs/warning/symbolic-signs.json"});

        information.add(new String[]{"routeMarkers", "ROUTE_MARKERS", "signs/guidance/route-markers.json"});
        information.add(new String[]{"freewayDirectionSigns", "FREEWAY_DIRECTION_SIGNS", "signs/guidance/freeway-direction-signs.json"});
        information.add(new String[]{"diagrammaticSigns", "DIAGRAMMATIC_SIGNS", "signs/guidance/diagrammatic-signs.json"});

        information.add(new String[]{"regulatoryMarkings", "REGULATORY_MARKINGS", "signs/road-markings/regulatory-markings.json"});
        information.add(new String[]{"warningMarkings", "WARNING_MARKINGS","signs/road-markings/warning-markings.json"});
        information.add(new String[]{"guidanceMarkings", "GUIDANCE_MARKINGS", "signs/road-markings/guidance-markings.json"});

        information.add(new String[]{"controlSigns", "CONTROL_SIGNS", "signs/regulatory/control-signs.json"});
        information.add(new String[]{"commandSigns", "COMMAND_SIGNS", "signs/regulatory/command-signs.json"});
        information.add(new String[]{"prohibitionSigns", "PROHIBITION_SIGNS", "signs/regulatory/prohibition-signs.json"});
        information.add(new String[]{"reservationSigns", "RESERVATION_SIGNS", "signs/regulatory/reservation-signs.json"});
        information.add(new String[]{"comprehensiveSigns", "COMPREHENSIVE_SIGNS", "signs/regulatory/comprehensive-signs.json"});
        information.add(new String[]{"secondarySigns", "SECONDARY_SIGNS", "signs/regulatory/secondary-signs.json"});
        information.add(new String[]{"de-RestrictionSigns", "DE_RESTRICTION_SIGNS", "signs/regulatory/de-restriction-signs.json"});

        information.add(new String[]{"handSignals", "HAND_SIGNALS", "signs/traffic-signals/hand-signals.json"});
        information.add(new String[]{"trafficLights", "TRAFFIC_LIGHTS", "signs/traffic-signals/traffic-lights.json"});

        information.add(new String[]{"informationSigns", "INFORMATION_SIGNS", "signs/information/ex-of-information-signs.json"});

        information.add(new String[]{"temporarySigns", "TEMPORARY_SIGNS", "signs/temporary/ex-of-temporary-signs.json"});

        information.add(new String[]{"warningSigns", "WARNING_SIGNS", "signs/menu/warning-signs.json"});
        information.add(new String[]{"guidanceSigns", "GUIDANCE_SIGNS", "signs/menu/guidance-signs.json"});
        information.add(new String[]{"roadMarkings", "ROAD_MARKINGS", "signs/menu/road-markings.json"});
        information.add(new String[]{"regulatorySigns", "REGULATORY_SIGNS", "signs/menu/regulatory-signs.json"});
        information.add(new String[]{"trafficSignals", "TRAFFIC_SIGNALS", "signs/menu/traffic-signals.json"});
        information.add(new String[]{"tempSigns", "TEMP_SIGNS", "signs/menu/temporary-signs.json"});
        information.add(new String[]{"infoSigns", "INFO_SIGNS", "signs/menu/information-signs.json"});

        return information;
    }


    public static List<String[]> getTestsInformation() {
        List<String[]> information = new ArrayList<>();

        information.add(new String[]{"roadRulesTest", "ROAD_RULES_TEST", "questions/road-rules-qs.json"});
        information.add(new String[]{"roadSignsTest", "ROAD_SIGNS_TEST", "questions/road-signs-qs.json"});
        information.add(new String[]{"controlsTest", "CONTROLS_TEST", "questions/vehicle-controls-qs.json"});
        information.add(new String[]{"k53Test", "K53_TEST", "no-json-for-this"});

        return information;
    }



    public static RoadRule[] dFAQs = new RoadRule[]{
            new RoadRule("Why you need a driver's licence.","To drive legally on South African roads, you need a driving licence. You must have a learner's licence before applying for a driving licence."),
            new RoadRule("How can I apply?","You can apply online for your driving test at https://online.natis.gov.za/#/\nIf you could not apply online, find the nearest driving test and confirm your test date."),
            new RoadRule("".replace("learner's", "driver's"),"Your learner's licence.\n"),
            new RoadRule("How many categories are available for a driver's license and the required age to apply?",""),
            new RoadRule("Which form am I required to fill for a Driver's license? (If you could not apply online).","You will complete Driver's license (DL1) form which is available at the DLTC.\nIf you are 65 years old or greater you should also complete a medical certificate form (MC) which will be available too at the DLTC."),
            new RoadRule("Other processes or requirement that will be needed from you at the DLTC?","Your fingerprints will be taken, you need to do an eye test at the DLTC or have a qualified optometrist to test your eyes and submit the form at the testing centre. After the application has been processed you will be provided with a date and time for your driving test."),
            new RoadRule("How will I be tested?","A qualified examiner will assess you.\nYou will be tested according to the K53 testing standard.\nYou will be tested to guarantee that you know and recognize the road traffic signs, knowledge of the rules of the road and the different signals which a driver of a vehicle is required to give when driving on a public road and are you capable of driving the type of vehicle specified on the (DL1) application form."),
            new RoadRule("Which document or material is required before the test.","Booking receipt\nID Document\nLearner's license"),
            new RoadRule("How long does it take to get my driver's licence?","If you pass your driving licence test you will be issued with a temporary driving licence after paying the issuing fee, you will use the temporary driving licence while you wait for the credit card format driving license.\nThe driving licence should be ready within 4 to 6 weeks.\nThe driving license centre will notify you via email, SMS or post when your license is ready for collection.\nWhen collecting your license card, you will need to produce your ID document.\nLicenses not collected within 120 days are destroyed."),
    };
    public static ArrayList<RoadRule> driversFAQs = new ArrayList<>(Arrays.asList(dFAQs));


    public static RoadRule[] lFAQs = new RoadRule[]{
            new RoadRule("Why you need a learner's licence.","A learner's licence is a permit that proves that you have basic knowledge of a motor vehicle and the rules of the road.\nIf you have a learner's licence you are only allowed to drive a vehicle when you are supervised and accompanied by a licensed driver."),
            new RoadRule("How long is a learner's licence valid for in South Africa.","A learner's licence is valid for 24 months and cannot be extended."),
            new RoadRule("How many categories are available for a learner's licence and the required age to apply.","Code 1: Motorcycle with or without a sidecar, quad-cycle, and tricycle. You must be 16 years or older for a motorcycle with an engine capacity of 125 cc or less, and 18 years or older for a motorcycle with an engine capacity of 125 cc or more.\nCode 2: Motor vehicles (minibus, goods vehicles) with a gross mass of 3500 kg or less, and must be 17 years or older to apply.\nCode 3: Motor Vehicles with a gross mass of 3500 kg or greater, and must be 18 years or older to apply."),
            new RoadRule("How can I apply?","Apply online for a learner's license at https://online.natis.gov.za/ . \nIf you were unable to apply online, find the nearest driving licensing test centre (DLTC) to book a test and confirm your test date."),
            new RoadRule("What are the required documents for a learner's licence application?","Identity (ID) Document\nBooking fee.\nTwo identical black-white or color photos (at least 2 photos).\nProof of postal and residential address."),
            new RoadRule("Which form am I required to fill for a learner's licence","You will complete learner's licence (LL1) form which is available at the DLTC. \nIf you are 65 years old or greater you should also complete a medical certificate form (MC) which will be available too at the DLTC."),
            new RoadRule("Other requirements that are needed from you at the DLCT.","You will be requested to do an eye test at the DLTC or have a qualified optometrist to test your eyes and submit the form at the testing centre."),
            new RoadRule("What must I study for a learner's licence test?","Rules of the Road\nVehicle and/or Motorcycle Controls\nRoad Signs and Road Markings\n"),
            new RoadRule("Which document or material is required before the test.","Booking receipt\nID Document\nPen and Pencil"),
            new RoadRule("How long does it take to get my learner's licence?","The learner's licence is issued the same day if you have passed and paid the relevant issuing fee."),
    };
    public static ArrayList<RoadRule> learnersFAQs = new ArrayList<>(Arrays.asList(lFAQs));



}
