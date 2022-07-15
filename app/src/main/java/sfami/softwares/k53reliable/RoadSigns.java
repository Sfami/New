package sfami.softwares.k53reliable;

public class RoadSigns {
    /*
     * Signs
     * */

    public static String guidanceSignsSignName = "Guidance Signs";
    public static String guidanceSignsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String guidanceSignsPurpose = "Stop";
    public static String guidanceSignsWhere = "Stop";
    public static String guidanceSignsAction = "Stop";
    public static Integer guidanceSignsImage = R.drawable.guidance;
    public static Sign guidanceSignsSign = new Sign(guidanceSignsSignName, guidanceSignsDescription, guidanceSignsPurpose, guidanceSignsWhere, guidanceSignsAction, guidanceSignsImage);

    public static String temporarySignsSignName = "Temporary Signs";
    public static String temporarySignsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String temporarySignsPurpose = "Stop";
    public static String temporarySignsWhere = "Stop";
    public static String temporarySignsAction = "Stop";
    public static Integer temporarySignsImage = R.drawable.temporary;
    public static Sign temporarySignsSign = new Sign(temporarySignsSignName, temporarySignsDescription, temporarySignsPurpose, temporarySignsWhere, temporarySignsAction, temporarySignsImage);

    public static String roadMarkingsSignName = "Road Markings";
    public static String roadMarkingsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String roadMarkingsPurpose = "Stop";
    public static String roadMarkingsWhere = "Stop";
    public static String roadMarkingsAction = "Stop";
    public static Integer roadMarkingsImage = R.drawable.road_markings;
    public static Sign roadMarkingsSign = new Sign(roadMarkingsSignName, roadMarkingsDescription, roadMarkingsPurpose, roadMarkingsWhere, roadMarkingsAction, roadMarkingsImage);


    public static String locationSignsSignName = "Location Signs";
    public static String locationSignsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String locationSignsPurpose = "Stop";
    public static String locationSignsAction = "Stop";
    public static String locationSignsWhere = "Stop";
    public static Integer locationSignsImage = R.drawable.pedestrian_crossing;
    public static Sign locationSignsSign = new Sign(locationSignsSignName, locationSignsDescription, locationSignsPurpose, locationSignsWhere, locationSignsAction, locationSignsImage);

    /********************************************************************************************************************************************************************/

    public static String directionSignSymbolsSignName = "Direction Sign Symbols";
    public static String directionSignSymbolsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String directionSignSymbolsPurpose = "Stop";
    public static String directionSignSymbolsAction = "Stop";
    public static String directionSignSymbolsWhere = "Stop";
    public static Integer directionSignSymbolsImage = R.drawable.side_road;
    public static Sign directionSignSymbolsSign = new Sign(directionSignSymbolsSignName, directionSignSymbolsDescription, directionSignSymbolsPurpose, directionSignSymbolsWhere, directionSignSymbolsAction, directionSignSymbolsImage);

    /********************************************************************************************************************************************************************/

    public static String routeMarkersSignName = "Route Markers";
    public static String routeMarkersDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String routeMarkersPurpose = "Stop";
    public static String routeMarkersAction = "Stop";
    public static String routeMarkersWhere = "Stop";
    public static Integer routeMarkersImage = R.drawable.route_marker;
    public static Sign routeMarkersSign = new Sign(routeMarkersSignName, routeMarkersDescription, routeMarkersPurpose, routeMarkersWhere, routeMarkersAction, routeMarkersImage);

    public static String overheadDirectionSignName = "Overhead direction (GD12, GD13, GD15/16/17)";
    public static String overheadDirectionSignWhere = "On any road with more than one traffic lane, especially in rural areas.";
    public static String overheadDirectionSignPurpose = "To inform in advance which lane leads to a specific destination.";
    public static String overheadDirectionSignAction = "Move in good time to the correct lane that leads to your destination or route.";
    public static String overheadDirectionSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", overheadDirectionSignWhere, overheadDirectionSignPurpose, overheadDirectionSignAction);
    public static Integer overheadDirectionSignImage = R.drawable.overhead_direction;
    public static Sign overheadDirectionSign = new Sign(overheadDirectionSignName, overheadDirectionSignDescription, overheadDirectionSignPurpose, overheadDirectionSignWhere, overheadDirectionSignAction, overheadDirectionSignImage);

    public static String advanceTrailblazerSignName = "Advance trailblazer";
    public static String advanceTrailblazerSignWhere = "On the far left-hand corner of an intersection.";
    public static String advanceTrailblazerSignPurpose = "To point out the direction you must follow to reach the more important route.";
    public static String advanceTrailblazerSignAction = "Follow the traffic signs if you want to join the more important route and look out for the next trailblazer.";
    public static String advanceTrailblazerSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", advanceTrailblazerSignWhere, advanceTrailblazerSignPurpose, advanceTrailblazerSignAction);
    public static Integer advanceTrailblazerSignImage = R.drawable.advance_trailblazer;
    public static Sign advanceTrailblazerSign = new Sign(advanceTrailblazerSignName, advanceTrailblazerSignDescription, advanceTrailblazerSignPurpose, advanceTrailblazerSignWhere, advanceTrailblazerSignAction, advanceTrailblazerSignImage);

    public static String fingerBoardSignName = "Fingerboard";
    public static String fingerBoardSignWhere = "On the far left-hand corner of an intersection.";
    public static String fingerBoardSignPurpose = "To guide you to small locations or to destinations on less travelled routes.";
    public static String fingerBoardSignAction = "Slow down and look out for traffic that might not yield at the intersection.";
    public static String fingerBoardSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", fingerBoardSignWhere, fingerBoardSignWhere, fingerBoardSignAction);
    public static Integer fingerBoardSignImage = R.drawable.fingerboard;
    public static Sign fingerBoardSign = new Sign(fingerBoardSignName, fingerBoardSignDescription, fingerBoardSignPurpose, fingerBoardSignWhere, fingerBoardSignAction, fingerBoardSignImage);

    public static String stackTypeDirectionSignName = "Stack-type direction (GD1.112, TGD1.112)";
    public static String stackTypeDirectionSignWhere = fingerBoardSignWhere;
    public static String stackTypeDirectionSignPurpose = "To indicate the-\n" +
            "numbers of the routes leading from this intersection and\n" +
            "destinations that can be reached from this intersection.";
    public static String stackTypeDirectionSignAction = "Slow down and make sure you take the correct route. Also look out for other traffic at the intersection that might not yield.\n";
    public static String stackTypeDirectionSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", stackTypeDirectionSignWhere, stackTypeDirectionSignWhere, stackTypeDirectionSignAction);
    public static Integer stackTypeDirectionSignImage = R.drawable.stack_type;
    public static Sign stackTypeDirectionSign = new Sign(stackTypeDirectionSignName, stackTypeDirectionSignDescription, stackTypeDirectionSignPurpose, stackTypeDirectionSignWhere, stackTypeDirectionSignAction, stackTypeDirectionSignImage);

    /********************************************************************************************************************************************************************/

    public static String directionSignsSignName = "Freeway Direction Signs";
    public static String directionSignsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String directionSignsPurpose = "Stop";
    public static String directionSignsAction = "Stop";
    public static String directionSignsWhere = "Stop";
    public static Integer directionSignsImage = R.drawable.overhead_direction;
    public static Sign directionSignsSign = new Sign(directionSignsSignName, directionSignsDescription, directionSignsPurpose, directionSignsWhere, directionSignsAction, directionSignsImage);

    public static String advanceExitDirectionSignName = "Advance exit direction (GA2)";
    public static String advanceExitDirectionSignWhere = "On the left-hand side of a freeway, about 1 km before an off-ramp exit.";
    public static String advanceExitDirectionSignPurpose = "To indicate early on that there is an exit from the freeway to certain destinations ahead..";
    public static String advanceExitDirectionSignAction = "If you want to leave the freeway, move to the left hand lane in good time.";
    public static String advanceExitDirectionSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", advanceExitDirectionSignWhere, advanceExitDirectionSignWhere, advanceExitDirectionSignAction);
    public static Integer advanceExitDirectionSignImage = R.drawable.advance_exit_direction;
    public static Sign advanceExitDirectionSign = new Sign(advanceExitDirectionSignName, advanceExitDirectionSignDescription, advanceExitDirectionSignPurpose, advanceExitDirectionSignWhere, advanceExitDirectionSignAction, advanceExitDirectionSignImage);

    public static String exitDirectionSignName = "Exit direction GA3";
    public static String exitDirectionSignWhere = "On the left-hand side of a freeway and as close as possible to the off-ramp.";
    public static String exitDirectionSignPurpose = "To indicate exactly where the exit is.";
    public static String exitDirectionSignAction = "Only leave the freeway if you are in the left-hand lane.";
    public static String exitDirectionSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", exitDirectionSignWhere, exitDirectionSignWhere, exitDirectionSignAction);
    public static Integer exitDirectionSignImage = R.drawable.rest_stop;
    public static Sign exitDirectionSign = new Sign(exitDirectionSignName, exitDirectionSignDescription, exitDirectionSignPurpose, exitDirectionSignWhere, exitDirectionSignAction, exitDirectionSignImage);

    public static String exitSequenceSignName = "Exit sequence (GA8)";
    public static String exitSequenceSignWhere = "On the left-hand side of a freeway about 2km before the first exit indicated.";
    public static String exitSequenceSignPurpose = "To indicate in good time exits that is close together, all leading to the same town.";
    public static String exitSequenceSignAction = "Make sure which exit you need to take and move in good time to the correct lane to leave the freeway.";
    public static String exitSequenceSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", exitSequenceSignWhere, exitSequenceSignPurpose, exitSequenceSignAction);
    public static Integer exitSequenceSignImage = R.drawable.exit_sequence;
    public static Sign exitSequenceSign = new Sign(exitSequenceSignName, exitSequenceSignDescription, exitSequenceSignPurpose, exitSequenceSignWhere, exitSequenceSignAction, exitSequenceSignImage);

    public static String overheadFreewayDirectionSignName = "Overhead freeway direction (GC3U)";
    public static String overheadFreewayDirectionSignWhere = "On any freeway.";
    public static String overheadFreewayDirectionSignPurpose = "To indicate that the freeway splits ahead and that the lanes lead to different destinations as indicated.";
    public static String overheadFreewayDirectionSignAction = "Signal in time and make sure you are in the right-hand lane if you want to turn right to join the freeway.";
    public static String overheadFreewayDirectionSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", overheadFreewayDirectionSignWhere, overheadFreewayDirectionSignWhere, overheadFreewayDirectionSignAction);
    public static Integer overheadFreewayDirectionSignImage = R.drawable.overhead_direction;
    public static Sign overheadFreewayDirectionSign = new Sign(overheadFreewayDirectionSignName, overheadFreewayDirectionSignDescription, overheadFreewayDirectionSignPurpose, overheadFreewayDirectionSignWhere, overheadFreewayDirectionSignAction, overheadFreewayDirectionSignImage);

    public static String farSideAdvanceOnRampDirectionSignName = "Far-side advance on-ramp direction (GB3)";
    public static String farSideAdvanceOnRampDirectionSignWhere = "On the left-hand side of an ordinary road after a “Near-side on-ramp direction” sign.";
    public static String farSideAdvanceOnRampDirectionSignPurpose = "To indicate that the far-side on-ramp to a freeway access interchange, is some distance ahead and to indicate the route number and the destination that will be reached by turning onto that on-ramp.";
    public static String farSideAdvanceOnRampDirectionSignAction = "Slow down and move to the right-hand side of your traffic lane if you want to join the freeway.";
    public static String farSideAdvanceOnRampDirectionSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", farSideAdvanceOnRampDirectionSignWhere, farSideAdvanceOnRampDirectionSignWhere, farSideAdvanceOnRampDirectionSignAction);
    public static Integer farSideAdvanceOnRampDirectionSignImage = R.drawable.far_side_on_ramp_direction;
    public static Sign farSideAdvanceOnRampDirectionSign = new Sign(farSideAdvanceOnRampDirectionSignName, farSideAdvanceOnRampDirectionSignDescription, farSideAdvanceOnRampDirectionSignPurpose, farSideAdvanceOnRampDirectionSignWhere, farSideAdvanceOnRampDirectionSignAction, farSideAdvanceOnRampDirectionSignImage);

    /********************************************************************************************************************************************************************/

    public static String diagrammaticSignsSignName = "Diagrammatic Signs";
    public static String diagrammaticSignsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String diagrammaticSignsPurpose = "Stop";
    public static String diagrammaticSignsAction = "Stop";
    public static String diagrammaticSignsWhere = "Stop";
    public static Integer diagrammaticSignsImage = R.drawable.diagrammatic;
    public static Sign diagrammaticSignsSign = new Sign(diagrammaticSignsSignName, diagrammaticSignsDescription, diagrammaticSignsPurpose, diagrammaticSignsWhere, diagrammaticSignsAction, diagrammaticSignsImage);

    public static String lanesMergeSignName = "Minimum Speed Limit";
    public static String lanesMergeSignWhere = "Railway Crossings, Intersections, and Scholar Patrols";
    public static String lanesMergeSignPurpose = "Bring traffic to a stop.";
    public static String lanesMergeSignAction = "Bring vehicles to a stop behind the line. " +
            "When there is no stop line, the front of the vehicle must be in line with the stop sign. " +
            "You may not drive off before all the other vehicles which stopped before you have moved off in a three-way or four-way stop. " +
            "Continue only when it is safe.";
    public static String lanesMergeSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", lanesMergeSignWhere, lanesMergeSignWhere, lanesMergeSignAction);
    public static Integer lanesMergeSignImage = R.drawable.dual_roadway_ends;
    public static Sign lanesMergeSign = new Sign(lanesMergeSignName, lanesMergeSignDescription, lanesMergeSignPurpose, lanesMergeSignWhere, lanesMergeSignAction, lanesMergeSignImage);

    /********************************************************************************************************************************************************************/

    public static String tourismDirectionSignsSignName = "Tourism Direction Signs";
    public static String tourismDirectionSignsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String tourismDirectionSignsPurpose = "Stop";
    public static String tourismDirectionSignsAction = "Stop";
    public static String tourismDirectionSignsWhere = "Stop";
    public static Integer tourismDirectionSignsImage = R.drawable.pedestrian_crossing;
    public static Sign tourismDirectionSignsSign = new Sign(tourismDirectionSignsSignName, tourismDirectionSignsDescription, tourismDirectionSignsPurpose, tourismDirectionSignsWhere, tourismDirectionSignsAction, tourismDirectionSignsImage);


    public static String localDirectionSignsSignName = "Local Direction Signs";
    public static String localDirectionSignsDescription =String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String localDirectionSignsPurpose = "Stop";
    public static String localDirectionSignsAction = "Stop";
    public static String localDirectionSignsWhere = "Stop";
    public static Integer localDirectionSignsImage = R.drawable.prohibition;
    public static Sign localDirectionSignsSign = new Sign(localDirectionSignsSignName, localDirectionSignsDescription, localDirectionSignsPurpose, localDirectionSignsWhere, localDirectionSignsAction, localDirectionSignsImage);

    /********************************************************************************************************************************************************************/

    public static String signalsSignName = "Signals";
    public static String signalsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String signalsPurpose = "Stop";
    public static String signalsAction = "Stop";
    public static String signalsWhere = "Stop";
    public static Integer signalsImage = R.drawable.robot;
    public static Sign signalsSign = new Sign(signalsSignName, signalsDescription, signalsPurpose, signalsWhere, signalsAction, signalsImage);

    /********************************************************************************************************************************************************************/

    public static String trafficLightsSignName = "Traffic Lights";
    public static String trafficLightsSignWhere = "Railway Crossings, Intersections, and Scholar Patrols";
    public static String trafficLightsSignPurpose = "Bring traffic to a stop.";
    public static String trafficLightsSignAction = "Bring vehicles to a stop behind the line. " +
            "When there is no stop line, the front of the vehicle must be in line with the stop sign. " +
            "You may not drive off before all the other vehicles which stopped before you have moved off in a three-way or four-way stop. " +
            "Continue only when it is safe.";
    public static String trafficLightsSignDescription = String.format("Examples include:\n%s\n%s", "Steady red light", "Flashing green light");
    public static Integer trafficLightsSignImage = R.drawable.stop;
    public static Sign trafficLightsSign = new Sign(trafficLightsSignName, trafficLightsSignDescription, trafficLightsSignPurpose, trafficLightsSignWhere, trafficLightsSignAction, trafficLightsSignImage);

    /********************************************************************************************************************************************************************/

    public static String otherRegulatorySignalsSignName = "Control hand signals for use by traffic officers";
    public static String otherRegulatorySignalsSignWhere = trafficLightsSignWhere;
    public static String otherRegulatorySignalsSignPurpose = "To direct traffic in areas where there is high traffic congestion, at the scene of an accident or the normal traffic signals are not operational.";
    public static String otherRegulatorySignalsSignAction = "Driver must focus on the signals given by the officer, and strictly adhere to the signal given.\n" +
            "The traffic officer signals takes precedence over any other traffic signal.";

    public static String stopFrontSignalSignName = "Stop traffic approaching from the front";
    public static String stopFrontSignalSignWhere = otherRegulatorySignalsSignWhere;
    public static String stopFrontSignalSignPurpose = "Bring traffic to a stop.";
    public static String stopFrontSignalSignAction = otherRegulatorySignalsSignAction;
    public static String stopFrontSignalSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", stopFrontSignalSignWhere, stopFrontSignalSignPurpose, stopFrontSignalSignAction);
    public static Integer stopFrontSignalSignImage = R.drawable.signal_stop_front;
    public static Sign stopFrontSignalSign = new Sign(stopFrontSignalSignName, stopFrontSignalSignDescription, stopFrontSignalSignPurpose, stopFrontSignalSignWhere, stopFrontSignalSignAction, stopFrontSignalSignImage);

    public static String stopRearSignalSignName = "Stop";
    public static String stopRearSignalSignWhere = otherRegulatorySignalsSignWhere;
    public static String stopRearSignalSignPurpose = "Stop traffic approaching from the rear";
    public static String stopRearSignalSignAction = otherRegulatorySignalsSignAction;
    public static String stopRearSignalSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", stopRearSignalSignWhere, stopRearSignalSignPurpose, stopRearSignalSignAction);
    public static Integer stopRearSignalSignImage = R.drawable.signal_stop_rear;
    public static Sign stopRearSignalSign = new Sign(stopRearSignalSignName, stopRearSignalSignDescription, stopRearSignalSignPurpose, stopRearSignalSignWhere, stopRearSignalSignAction, stopRearSignalSignImage);

    public static String stopFrontAndRearSignalSignName = "Stop";
    public static String stopFrontAndRearSignalSignWhere = otherRegulatorySignalsSignWhere;
    public static String stopFrontAndRearSignalSignPurpose = "Stop traffic approaching from the front and rear";
    public static String stopFrontAndRearSignalSignAction = otherRegulatorySignalsSignAction;
    public static String stopFrontAndRearSignalSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", stopFrontAndRearSignalSignWhere, stopFrontAndRearSignalSignPurpose, stopFrontAndRearSignalSignAction);
    public static Integer stopFrontAndRearSignalSignImage = R.drawable.signal_stop_front_rear;
    public static Sign stopFrontAndRearSignalSign = new Sign(stopFrontAndRearSignalSignName, stopFrontAndRearSignalSignDescription, stopFrontAndRearSignalSignPurpose, stopFrontAndRearSignalSignWhere, stopFrontAndRearSignalSignAction, stopFrontAndRearSignalSignImage);

    public static String proceedSignalSignName = "Proceed";
    public static String proceedSignalSignWhere = trafficLightsSignWhere;
    public static String proceedSignalSignPurpose = "Indicates to the driver that he/she may proceed";
    public static String proceedSignalSignAction = otherRegulatorySignalsSignAction;
    public static String proceedSignalSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", proceedSignalSignWhere, proceedSignalSignPurpose, proceedSignalSignAction);
    public static Integer proceedSignalSignImage = R.drawable.signal_proceed1;
    public static Sign proceedSignalSign = new Sign(proceedSignalSignName, proceedSignalSignDescription, proceedSignalSignPurpose, proceedSignalSignWhere, proceedSignalSignAction, proceedSignalSignImage);

    public static String proceedFlagSignalSignName = "Proceed flag signal";
    public static String proceedFlagSignalSignWhere = trafficLightsSignWhere;
    public static String proceedFlagSignalSignPurpose = "To direct traffic in areas where there is road works ahead, herdsman leading cattle or other animals across or next to a roadway.";
    public static String proceedFlagSignalSignAction = "";
    public static String proceedFlagSignalSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", proceedFlagSignalSignWhere, proceedFlagSignalSignWhere, proceedFlagSignalSignAction);
    public static Integer proceedFlagSignalSignImage = R.drawable.flag_proceed;
    public static Sign proceedFlagSignalSign = new Sign(proceedFlagSignalSignName, proceedFlagSignalSignDescription, proceedFlagSignalSignPurpose, proceedFlagSignalSignWhere, proceedFlagSignalSignAction, proceedFlagSignalSignImage);

    public static String stopFlagSignalSignName = "Stop flag signal";
    public static String stopFlagSignalSignWhere = trafficLightsSignWhere;
    public static String stopFlagSignalSignPurpose = "To direct traffic in areas where there is road works ahead, herdsman leading cattle or other animals across or next to a roadway.";
    public static String stopFlagSignalSignAction = "";
    public static String stopFlagSignalSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", stopFlagSignalSignWhere, stopFlagSignalSignWhere, stopFlagSignalSignAction);
    public static Integer stopFlagSignalSignImage = R.drawable.flag_stop;
    public static Sign stopFlagSignalSign = new Sign(stopFlagSignalSignName, stopFlagSignalSignDescription, stopFlagSignalSignPurpose, stopFlagSignalSignWhere, stopFlagSignalSignAction, stopFlagSignalSignImage);

    public static String warningFlagSignalSignName = "Warning flag signal";
    public static String warningFlagSignalSignWhere = trafficLightsSignWhere;
    public static String warningFlagSignalSignPurpose = "Warns a road user to proceed slowly and be alert.";
    public static String warningFlagSignalSignAction = "";
    public static String warningFlagSignalSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", warningFlagSignalSignWhere, warningFlagSignalSignWhere, warningFlagSignalSignAction);
    public static Integer warningFlagSignalSignImage = R.drawable.flag_warning;
    public static Sign warningFlagSignalSign = new Sign(warningFlagSignalSignName, warningFlagSignalSignDescription, warningFlagSignalSignPurpose, warningFlagSignalSignWhere, warningFlagSignalSignAction, warningFlagSignalSignImage);



    public static String otherRegulatorySignalsSignDescription = String.format("Examples include:\n%s\n%s", stopFrontAndRearSignalSignName, proceedFlagSignalSignName);
    public static Integer otherRegulatorySignalsSignImage = R.drawable.proceed2;
    public static Sign otherRegulatorySignalsSign = new Sign(otherRegulatorySignalsSignName, otherRegulatorySignalsSignDescription, otherRegulatorySignalsSignPurpose, otherRegulatorySignalsSignWhere, otherRegulatorySignalsSignAction, otherRegulatorySignalsSignImage);

    /********************************************************************************************************************************************************************/

    public static String variableMessageSignsSignName = "Variable Message Signs";
    public static String variableMessageSignsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String variableMessageSignsPurpose = "Stop";
    public static String variableMessageSignsAction = "Stop";
    public static String variableMessageSignsWhere = "Stop";
    public static Integer variableMessageSignsImage = R.drawable.time_restriction;
    public static Sign variableMessageSignsSign = new Sign(variableMessageSignsSignName, variableMessageSignsDescription, variableMessageSignsPurpose, variableMessageSignsWhere, variableMessageSignsAction, variableMessageSignsImage);

    public static String regulatorySignName = "Regulatory";
    public static String regulatoryDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String regulatoryPurpose = "Stop";
    public static String regulatoryAction = "Stop";
    public static String regulatoryWhere = "Stop";
    public static Integer regulatoryImage = R.drawable.turn_left;
    public static Sign regulatorySign = new Sign(regulatorySignName, regulatoryDescription, regulatoryPurpose, regulatoryWhere, regulatoryAction, regulatoryImage);

    public static String warningSignName = "Warning";
    public static String warningDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String warningPurpose = "Stop";
    public static String warningAction = "Stop";
    public static String warningWhere = "Stop";
    public static Integer warningImage = R.drawable.road_markings;
    public static Sign warningSign = new Sign(warningSignName, warningDescription, warningPurpose, warningWhere, warningAction, warningImage);

    public static String guidanceSignName = "Guidance";
    public static String guidanceDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String guidancePurpose = "Stop";
    public static String guidanceAction = "Stop";
    public static String guidanceWhere = "Stop";
    public static Integer guidanceImage = R.drawable.road_markings;
    public static Sign guidanceSign = new Sign(guidanceSignName, guidanceDescription, guidancePurpose, guidanceWhere, guidanceAction, guidanceImage);

    public static String exclusiveUseSymbolsSignName = "Exclusive Use Symbols";
    public static String exclusiveUseSymbolsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String exclusiveUseSymbolsPurpose = "Stop";
    public static String exclusiveUseSymbolsAction = "Stop";
    public static String exclusiveUseSymbolsWhere = "Stop";
    public static Integer exclusiveUseSymbolsImage = R.drawable.temporary;
    public static Sign exclusiveUseSymbolsSign = new Sign(exclusiveUseSymbolsSignName, exclusiveUseSymbolsDescription, exclusiveUseSymbolsPurpose, exclusiveUseSymbolsWhere, exclusiveUseSymbolsAction, exclusiveUseSymbolsImage);


    public static String roadLayoutSignsSignName = "Road Layout Signs";
    public static String roadLayoutSignsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String roadLayoutSignsPurpose = "Stop";
    public static String roadLayoutSignsAction = "Stop";
    public static String roadLayoutSignsWhere = "Stop";
    public static Integer roadLayoutSignsImage = R.drawable.crossroads;
    public static Sign roadLayoutSignsSign = new Sign(roadLayoutSignsSignName, roadLayoutSignsDescription, roadLayoutSignsPurpose, roadLayoutSignsWhere, roadLayoutSignsAction, roadLayoutSignsImage);

    public static String directionOfMovementSignsSignName = "Direction of Movement Signs";
    public static String directionOfMovementSignsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String directionOfMovementSignsPurpose = "Stop";
    public static String directionOfMovementSignsAction = "Stop";
    public static String directionOfMovementSignsWhere = "Stop";
    public static Integer directionOfMovementSignsImage = R.drawable.gentle_curve;
    public static Sign directionOfMovementSignsSign = new Sign(directionOfMovementSignsSignName, directionOfMovementSignsDescription, directionOfMovementSignsPurpose, directionOfMovementSignsWhere, directionOfMovementSignsAction, directionOfMovementSignsImage);

    public static String symbolicSignsSignName = "Symbolic Signs";
    public static String symbolicSignsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String symbolicSignsPurpose = "Stop";
    public static String symbolicSignsAction = "Stop";
    public static String symbolicSignsWhere = "Stop";
    public static Integer symbolicSignsImage = R.drawable.robot_ahead;
    public static Sign symbolicSignsSign = new Sign(symbolicSignsSignName, symbolicSignsDescription, symbolicSignsPurpose, symbolicSignsWhere, symbolicSignsAction, symbolicSignsImage);

    public static String hazardMarkerSignsSignName = "Hazard Marker Signs";
    public static String hazardMarkerSignsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String hazardMarkerSignsPurpose = "Stop";
    public static String hazardMarkerSignsAction = "Stop";
    public static String hazardMarkerSignsWhere = "Stop";
    public static Integer hazardMarkerSignsImage = R.drawable.hazard;
    public static Sign hazardMarkerSignsSign = new Sign(hazardMarkerSignsSignName, hazardMarkerSignsDescription, hazardMarkerSignsPurpose, hazardMarkerSignsWhere, hazardMarkerSignsAction, hazardMarkerSignsImage);

    public static String informationSignsSignName = "Information Signs";
    public static String informationSignsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String informationSignsPurpose = "Stop";
    public static String informationSignsAction = "Stop";
    public static String informationSignsWhere = "Stop";
    public static Integer informationSignsImage = R.drawable.information;
    public static Sign informationSignsSign = new Sign(informationSignsSignName, informationSignsDescription, informationSignsPurpose, informationSignsWhere, informationSignsAction, informationSignsImage);


    public static String exampleOfTemporarySignsSignName = "Example of Temporary Signs";
    public static String exampleOfTemporarySignsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String exampleOfTemporarySignsPurpose = "Stop";
    public static String exampleOfTemporarySignsAction = "Stop";
    public static String exampleOfTemporarySignsWhere = "Stop";
    public static Integer exampleOfTemporarySignsImage = R.drawable.temporary;
    public static Sign exampleOfTemporarySignsSign = new Sign(exampleOfTemporarySignsSignName, exampleOfTemporarySignsDescription, exampleOfTemporarySignsPurpose, exampleOfTemporarySignsWhere, exampleOfTemporarySignsAction, exampleOfTemporarySignsImage);



    public static String regulatoryMarkingsSignName = "Regulatory Markings";
    public static String regulatoryMarkingsSignWhere = "Railway Crossings, Intersections, and Scholar Patrols";
    public static String regulatoryMarkingsSignPurpose = "Bring traffic to a stop.";
    public static String regulatoryMarkingsSignAction = "Bring vehicles to a stop behind the line. " +
            "When there is no stop line, the front of the vehicle must be in line with the stop sign. " +
            "You may not drive off before all the other vehicles which stopped before you have moved off in a three-way or four-way stop. " +
            "Continue only when it is safe.";
    public static String regulatoryMarkingsSignDescription =  String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static Integer regulatoryMarkingsSignImage = R.drawable.stop_line;
    public static Sign regulatoryMarkingsSign = new Sign(regulatoryMarkingsSignName, regulatoryMarkingsSignDescription, regulatoryMarkingsSignPurpose, regulatoryMarkingsSignWhere, regulatoryMarkingsSignAction, regulatoryMarkingsSignImage);

    public static String warningMarkingsSignName = "Warning Markings";
    public static String warningMarkingsSignWhere = "Railway Crossings, Intersections, and Scholar Patrols";
    public static String warningMarkingsSignPurpose = "Bring traffic to a stop.";
    public static String warningMarkingsSignAction = "Bring vehicles to a stop behind the line. " +
            "When there is no stop line, the front of the vehicle must be in line with the stop sign. " +
            "You may not drive off before all the other vehicles which stopped before you have moved off in a three-way or four-way stop. " +
            "Continue only when it is safe.";
    public static String warningMarkingsSignDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static Integer warningMarkingsSignImage = R.drawable.yield_lane;
    public static Sign warningMarkingsSign = new Sign(warningMarkingsSignName, warningMarkingsSignDescription, warningMarkingsSignPurpose, warningMarkingsSignWhere, warningMarkingsSignAction, warningMarkingsSignImage);

    public static String guidanceMarkingsSignName = "Guidance Markings";
    public static String guidanceMarkingsSignWhere = "Railway Crossings, Intersections, and Scholar Patrols";
    public static String guidanceMarkingsSignPurpose = "Bring traffic to a stop.";
    public static String guidanceMarkingsSignAction = "Bring vehicles to a stop behind the line. " +
            "When there is no stop line, the front of the vehicle must be in line with the stop sign. " +
            "You may not drive off before all the other vehicles which stopped before you have moved off in a three-way or four-way stop. " +
            "Continue only when it is safe.";
    public static String guidanceMarkingsSignDescription =  String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static Integer guidanceMarkingsSignImage = R.drawable.road_markings;
    public static Sign guidanceMarkingsSign = new Sign(guidanceMarkingsSignName, guidanceMarkingsSignDescription, guidanceMarkingsSignPurpose, guidanceMarkingsSignWhere, guidanceMarkingsSignAction, guidanceMarkingsSignImage);

    /********************************************************************************************************************************************************************/


    /********************************************************************************************************************************************************************/
    /********************************************************************************************************************************************************************/

    public static String regulatorySignsSignName = "Regulatory Signs";
    public static String regulatorySignsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String regulatorySignsPurpose = "Stop";
    public static String regulatorySignsWhere = "Stop";
    public static String regulatorySignsAction = "Stop";
    public static Integer regulatorySignsImage = R.drawable.freeway;
    public static Sign regulatorySignsSign = new Sign(regulatorySignsSignName, regulatorySignsDescription, regulatorySignsPurpose, regulatorySignsWhere, regulatorySignsAction, regulatorySignsImage);

    /*** Control Signs */

    public static String controlSignsSignName = "Control Signs";
    public static String controlSignsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String controlSignsPurpose = "Stop";
    public static String controlSignsAction = "Stop";
    public static String controlSignsWhere = "Stop";
    public static Integer controlSignsImage = R.drawable.yield;
    public static Sign controlSignsSign = new Sign(controlSignsSignName, controlSignsDescription, controlSignsPurpose, controlSignsWhere, controlSignsAction, controlSignsImage);

    public static String stopSignName = "Stop";
    public static String stopSignWhere = "At intersections, railway crossings and scholar patrols.";
    public static String stopSignPurpose = "To bring traffic to a stop.";
    public static String stopSignAction = "Bring your vehicle to a stop behind the stop line. " +
            "If there is no stop line, the front of the vehicle must come to a stand still in line with the stop sign. " +
            "At a three or four-way stop you may not move off before all the other vehicles which stopped before you have moved off." +
            "Proceed only when it is safe.";
    public static String stopSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", stopSignWhere, stopSignPurpose, stopSignAction);
    public static Integer stopSignImage = R.drawable.stop;
    public static Sign stopSign = new Sign(stopSignName, stopSignDescription, stopSignPurpose, stopSignWhere, stopSignAction, stopSignImage);

    public static String stopOrYieldSignName = "Stop/Yield";
    public static String stopOrYieldSignWhere = "At intersections.";
    public static String stopOrYieldSignPurpose = "To allow traffic turning left, to do so (if it can be done without interfering with cross traffic) without stopping.";
    public static String stopOrYieldSignAction = "If you intend to carry straight on, bring your vehicle to a standstill behind the stop line. When turning left, yield to all traffic, which is close enough to pose a hazard.\n" +
            "Proceed only when it is safe.";
    public static String stopOrYieldSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", stopOrYieldSignWhere, stopOrYieldSignPurpose, stopOrYieldSignAction);
    public static Integer stopOrYieldSignImage = R.drawable.stop_yield;
    public static Sign stopOrYieldSign = new Sign(stopOrYieldSignName, stopOrYieldSignDescription, stopOrYieldSignPurpose, stopOrYieldSignWhere, stopOrYieldSignAction, stopOrYieldSignImage);

    public static String stopOrGoSignName = "Stop/Go";
    public static String stopOrGoSignWhere = "Usually at road works for temporary traffic control.";
    public static String stopOrGoSignPurpose = "These are two different signs, which are mounted back to back. It indicates whether you may proceed or must stop.";
    public static String stopOrGOSignAction = "Stop if the STOP sign is displayed and move off or proceed with caution if safe when the GO sign is displayed.";
    public static String stopOrGOSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", stopOrGoSignWhere, stopOrGoSignPurpose, stopOrGOSignAction);
    public static Integer stopOrGOSignImage = R.drawable.stop_go;
    public static Sign stopOrGOSign = new Sign(stopOrGoSignName, stopOrGOSignDescription, stopOrGoSignPurpose, stopOrGoSignWhere, stopOrGOSignAction, stopOrGOSignImage);

    public static String yieldSignName = "Yield";
    public static String yieldSignWhere = "At intersections and railway crossings.";
    public static String yieldSignPurpose = "To indicate that you must yield to other traffic.";
    public static String yieldSignAction = "If other traffic is approaching the intersection, reduce speed and, if necessary, stop.";
    public static String yieldSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", yieldSignWhere, yieldSignPurpose, yieldSignAction);
    public static Integer yieldSignImage = R.drawable.yield;
    public static Sign yieldSign = new Sign(yieldSignName, yieldSignDescription, yieldSignPurpose, yieldSignWhere, yieldSignAction, yieldSignImage);

    public static String yieldToPedestriansSignName = "Yield to Pedestrians";
    public static String yieldToPedestriansSignWhere = "At intersections and pedestrian crossings";
    public static String yieldToPedestriansSignPurpose = "To compel you to give priority to pedestrians crossing the road or wanting to cross";
    public static String yieldToPedestriansSignAction = "Look out for pedestrians crossing the road or near the road and be ready to stop.";
    public static String yieldToPedestriansSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", yieldToPedestriansSignWhere, yieldToPedestriansSignPurpose, yieldToPedestriansSignAction);
    public static Integer yieldToPedestriansSignImage = R.drawable.yield_to_pedestrians;
    public static Sign yieldToPedestriansSign = new Sign(yieldToPedestriansSignName, yieldToPedestriansSignDescription, yieldToPedestriansSignPurpose, yieldToPedestriansSignWhere, yieldToPedestriansSignAction, yieldToPedestriansSignImage);

    public static String yieldAtTrafficCircleSignName = "Yield at Traffic Circle";
    public static String yieldAtTrafficCircleSignWhere = "At traffic circles, particularly mini circles.";
    public static String yieldAtTrafficCircleSignPurpose = "To warn you that there is a traffic circle ahead where they must expect to yield.";
    public static String yieldAtTrafficCircleSignAction = "Look out for other vehicles and yield to vehicles already in the circle or that will cross the yield line at their entrance to the circle before you will cross yours. Stop if necessary.\n" +
            "The driver who reaches his/her yield line first may proceed first.\n" +
            "At a mini circle you must, as at a normal intersection, signal in time in which direction you want to turn.";
    public static String yieldAtTrafficCircleSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", yieldToPedestriansSignWhere, yieldToPedestriansSignPurpose, yieldToPedestriansSignAction);
    public static Integer yieldAtTrafficCircleSignImage = R.drawable.traffic_circle_ahead;
    public static Sign yieldAtTrafficCircleSign = new Sign(yieldAtTrafficCircleSignName, yieldAtTrafficCircleSignDescription, yieldAtTrafficCircleSignPurpose, yieldAtTrafficCircleSignWhere, yieldAtTrafficCircleSignAction, yieldAtTrafficCircleSignImage);

    public static String yieldToOncomingTrafficSignName = "Yield To Oncoming Traffic";
    public static String yieldToOncomingTrafficSignWhere = "At the entrance to any road intended for dual way traffic.";
    public static String yieldToOncomingTrafficSignPurpose = "To indicate that there is a single carriageway ahead for use by by vehicle from both directions.";
    public static String yieldToOncomingTrafficSignAction = "Look out for other vehicles and yield to vehicles already in the carriageway.";
    public static String yieldToOncomingTrafficSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", yieldToOncomingTrafficSignWhere, yieldToOncomingTrafficSignPurpose, yieldToOncomingTrafficSignAction);
    public static Integer yieldToOncomingTrafficSignImage = R.drawable.oncoming_traffic;
    public static Sign yieldToOncomingTrafficSignPurposeSign = new Sign(yieldToOncomingTrafficSignName, yieldToOncomingTrafficSignDescription, yieldToOncomingTrafficSignPurpose, yieldToOncomingTrafficSignWhere, yieldToOncomingTrafficSignAction, yieldToOncomingTrafficSignImage);

    public static String noEntrySignName = "No Entry";
    public static String noEntrySignWhere = "Usually found at the end of a one-way street, at the end of an off-ramp or at intersections where two-way traffic roads change to one-way traffic.";
    public static String noEntrySignPurpose = "To indicate that no traffic may proceed past the sign on the road, carriageway or lane.";
    public static String noEntrySignAction = "Do not enter the carriageway where this sign is displayed.";
    public static String noEntrySignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", noEntrySignWhere, noEntrySignPurpose, noEntrySignAction);
    public static Integer noEntrySignImage = R.drawable.no_entry;
    public static Sign noEntrySign = new Sign(noEntrySignName, noEntrySignDescription, noEntrySignPurpose, noEntrySignWhere, noEntrySignAction, noEntrySignImage);

    public static String oneWayRoadwaySignName = "One-Way Roadway";
    public static String oneWayRoadwaySignWhere = "At intersections where a one-way road joins another road.";
    public static String oneWayRoadwaySignPurpose = "To indicate that there is a one-way carriageway to the left, right, or ahead.";
    public static String oneWayRoadwaySignAction = "Proceed in the direction of the arrow only if you want to use that specific carriageway. ";
    public static String oneWayRoadwaySignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", oneWayRoadwaySignWhere, oneWayRoadwaySignPurpose, oneWayRoadwaySignAction);
    public static Integer oneWayRoadwaySignImage = R.drawable.one_way_roadway;
    public static Sign oneWayRoadwaySign = new Sign(oneWayRoadwaySignName, oneWayRoadwaySignDescription, oneWayRoadwaySignPurpose, oneWayRoadwaySignWhere, oneWayRoadwaySignAction, oneWayRoadwaySignImage);

    public static String fourWayStopSignName = "4-Way Stop";
    public static String fourWayStopSignWhere = "At intersections.";
    public static String fourWayStopSignPurpose = "To bring traffic from all four directions to a stop.";
    public static String fourWayStopSignAction = "Bring your vehicle to a standstill behind the stop line.\n" +
            "If there is no stop line, the front of your vehicle must be brought to a stop in line with the stop sign.\n" +
            "Proceed only when it is safe.\n" +
            "If more than one vehicle stops at such an intersection, the vehicle, which stopped first, should move off first.";
    public static String fourWayStopSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", stopSignWhere, stopSignPurpose, stopSignAction);
    public static Integer fourWayStopSignImage = R.drawable.four_way_stop;
    public static Sign fourWayStopSign = new Sign(fourWayStopSignName, fourWayStopSignDescription, fourWayStopSignPurpose, fourWayStopSignWhere, fourWayStopSignAction, fourWayStopSignImage);

    public static String pedestrianPrioritySignName = "Pedestrian Priority";
    public static String pedestrianPrioritySignWhere = "At the entrance to an area intended for pedestrians.";
    public static String pedestrianPrioritySignPurpose = "To give priority to pedestrians but limit other traffic to emergency vehicles, vehicles loading and off loading goods and maintenance vehicles.";
    public static String pedestrianPrioritySignAction = "When driving any of the above-mentioned vehicles, drive carefully in the area at a maximum speed of 15 km/h.\n" +
            "\uF0B7 Priority must be given to pedestrians crossing or wanting to cross the road.\n" +
            "\uF0B7 When loading or off loading goods, only do so in areas marked by road traffic signs. No other vehicles are permitted in such an area.";
    public static String pedestrianPrioritySignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", pedestrianPrioritySignWhere, pedestrianPrioritySignPurpose, pedestrianPrioritySignAction);
    public static Integer pedestrianPrioritySignImage = R.drawable.pedestrian_priority;
    public static Sign pedestrianPrioritySign = new Sign(pedestrianPrioritySignName, pedestrianPrioritySignDescription, pedestrianPrioritySignPurpose, pedestrianPrioritySignWhere, pedestrianPrioritySignAction, pedestrianPrioritySignImage);

    public static String threeWayStopSignName = "3-Way Stop";
    public static String threeWayStopSignWhere = "At intersections.";
    public static String threeWayStopSignPurpose = "To bring traffic from all three directions to a stop.";
    public static String threeWayStopSignAction = "Bring vehicles to a stop behind the line. " +
            "When there is no stop line, the front of the vehicle must be in line with the stop sign. " +
            "You may not drive off before all the other vehicles which stopped before you have moved off in a three-way or four-way stop. " +
            "Continue only when it is safe.";
    public static String threeWayStopSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", threeWayStopSignWhere, threeWayStopSignPurpose, threeWayStopSignAction);
    public static Integer threeWayStopSignImage = R.drawable.threeway_stop;
    public static Sign threeWayStopSign = new Sign(threeWayStopSignName, threeWayStopSignDescription, threeWayStopSignPurpose, threeWayStopSignWhere, threeWayStopSignAction, threeWayStopSignImage);

    /********************************************************************************************************************************************************************/


    public static String commandSignsSignName = "Command Signs";
    public static String commandSignsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String commandSignsPurpose = "Stop";
    public static String commandSignsAction = "Stop";
    public static String commandSignsWhere = "Stop";
    public static Integer commandSignsImage = R.drawable.keep_left;
    public static Sign commandSignsSign = new Sign(commandSignsSignName, commandSignsDescription, commandSignsPurpose, commandSignsWhere, commandSignsAction, commandSignsImage);

    /*** Command Signs ***/

    public static String minimumSpeedLimitSignName = "Minimum Speed Limit";
    public static String minimumSpeedLimitSignWhere = "On any road where slow-moving vehicles could disrupt the traffic flow.";
    public static String minimumSpeedLimitSignPurpose = "To regulate the minimum speed of traffic.";
    public static String minimumSpeedLimitSignAction = "Do not drive slower than the speed indicated in km/h.";
    public static String minimumSpeedLimitSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", minimumSpeedLimitSignWhere, minimumSpeedLimitSignPurpose, minimumSpeedLimitSignAction);
    public static Integer minimumSpeedLimitSignImage = R.drawable.min_speed_limit_50;
    public static Sign minimumSpeedLimitSign = new Sign(minimumSpeedLimitSignName, minimumSpeedLimitSignDescription, minimumSpeedLimitSignPurpose, minimumSpeedLimitSignWhere, minimumSpeedLimitSignAction, minimumSpeedLimitSignImage);

    public static String vehicleExceedingMassOnlySignName = "Vehicle Exceeding Mass Only";
    public static String vehicleExceedingMassOnlySignWhere = "On any public road.";
    public static String vehicleExceedingMassOnlySignPurpose = "To compel drivers of certain heavy vehicles to use the road or part of the road indicated by this road traffic sign.";
    public static String vehicleExceedingMassOnlySignAction = "When driving a vehicle with a Gross Vehicle Mass (GVM) or Gross Combination Mass (GCM) in excess of the mass indicated in tons, use only the part of the road indicated by this sign.\n" +
            "If the GVM or GCM of your vehicle is less than the mass indicated in tons, use a part of the road not indicated by this sign.";
    public static String vehicleExceedingMassOnlySignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", vehicleExceedingMassOnlySignWhere, vehicleExceedingMassOnlySignPurpose, vehicleExceedingMassOnlySignAction);
    public static Integer vehicleExceedingMassOnlySignImage = R.drawable.min_weight;
    public static Sign vehicleExceedingMassOnlySign = new Sign(vehicleExceedingMassOnlySignName, vehicleExceedingMassOnlySignDescription, vehicleExceedingMassOnlySignPurpose, vehicleExceedingMassOnlySignWhere, vehicleExceedingMassOnlySignAction, vehicleExceedingMassOnlySignImage);

    public static String keepLeftSignName = "Keep Left";
    public static String keepLeftSignWhere = "At obstructions such as traffic islands. Only one of these signs will be displayed at a time.";
    public static String keepLeftSignPurpose = "To indicate that you must drive to the left or right of an obstruction where the sign is displayed.";
    public static String keepLeftSignAction = "Pass to the left or right of the obstruction, as indicated by the sign.";
    public static String keepLeftSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", keepLeftSignWhere, keepLeftSignPurpose, keepLeftSignAction);
    public static Integer keepLeftSignImage = R.drawable.keep_left;
    public static Sign keepLeftSign = new Sign(keepLeftSignName, keepLeftSignDescription, keepLeftSignPurpose, keepLeftSignWhere, keepLeftSignAction, keepLeftSignImage);

    public static String headlightsOnSignName = "Switch headlamps on (R133, TR133)";
    public static String headlightsOnSignWhere = "On any road especially in mountainous areas before a tunnel.s";
    public static String headlightsOnSignPurpose = "To indicate that you must switch on your headlights in order to see and be seen.";
    public static String headlightsOnSignAction = "Switch the lights of your vehicle on in the dip position.";
    public static String headlightsOnSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", headlightsOnSignWhere, headlightsOnSignPurpose, headlightsOnSignAction);
    public static Integer headlightsOnSignImage = R.drawable.headlights_on;
    public static Sign headlightsOnSign = new Sign(headlightsOnSignName, headlightsOnSignDescription, headlightsOnSignPurpose, headlightsOnSignWhere, headlightsOnSignAction, headlightsOnSignImage);

    public static String pedestriansOnlySignName = "Pedestrians Only";
    public static String pedestriansOnlySignWhere = "At the beginning of any road or part of a road.";
    public static String pedestriansOnlySignPurpose = "To indicate that the road or part of the road may be used by pedestrians only.";
    public static String pedestriansOnlySignAction = "Do not use the road or part of the road indicated by this sign.\n" +
            "Pedestrians may use only the part of the road indicated by this sign.";
    public static String pedestriansOnlySignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", pedestriansOnlySignWhere, pedestriansOnlySignPurpose, pedestriansOnlySignAction);
    public static Integer pedestriansOnlySignImage = R.drawable.pedestrians_only;
    public static Sign pedestriansOnlySign = new Sign(pedestriansOnlySignName, pedestriansOnlySignDescription, pedestriansOnlySignPurpose, pedestriansOnlySignWhere, pedestriansOnlySignAction, pedestriansOnlySignImage);

    public static String busesOnlySignName = "Buses only (R121, TR121)";
    public static String busesOnlySignWhere = "At the beginning of any road or part of a road.";
    public static String busesOnlySignPurpose = "Indicates that the road or a portion of the road is set aside for use by buses.";
    public static String busesOnlySignAction = "The driver of a bus shall only use such road or portion of such road.";
    public static String busesOnlySignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", busesOnlySignWhere, busesOnlySignPurpose, busesOnlySignAction);
    public static Integer busesOnlySignImage = R.drawable.buses_only;
    public static Sign busesOnlySign = new Sign(busesOnlySignName, busesOnlySignDescription, busesOnlySignPurpose, busesOnlySignWhere, busesOnlySignAction, busesOnlySignImage);

    public static String minibusesOnlySignName = "Minibuses only (R119, TR119)";
    public static String minibusesOnlySignWhere = "At the beginning of any road or part of a road.";
    public static String minibusesOnlySignPurpose = "Indicates that the road or a portion of the road is set aside for use by minibuses";
    public static String minibusesOnlySignAction = "The driver of a minibus shall only use such road or portion of such road.";
    public static String minibusesOnlySignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", minibusesOnlySignWhere, minibusesOnlySignPurpose, minibusesOnlySignAction);
    public static Integer minibusesOnlySignImage = R.drawable.minibuses_only;
    public static Sign minibusesOnlySign = new Sign(minibusesOnlySignName, minibusesOnlySignDescription, minibusesOnlySignPurpose, minibusesOnlySignWhere, minibusesOnlySignAction, minibusesOnlySignImage);

    public static String cyclistsOnlySignName = "Cyclists only (R111)";
    public static String cyclistsOnlySignWhere = "At the beginning of any road or part of a road.";
    public static String cyclistsOnlySignPurpose = "To indicate that the road or part of the road may be used by cyclists only.";
    public static String cyclistsOnlySignAction = "Do not use the road or part of the road indicated by this sign.\n" +
            "Cyclists may use only the part of the road indicated by this sign.";
    public static String cyclistsOnlySignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", cyclistsOnlySignWhere, cyclistsOnlySignPurpose, cyclistsOnlySignAction);
    public static Integer cyclistsOnlySignImage = R.drawable.cyclists_only;
    public static Sign cyclistsOnlySign = new Sign(cyclistsOnlySignName, cyclistsOnlySignDescription, cyclistsOnlySignPurpose, cyclistsOnlySignWhere, cyclistsOnlySignAction, cyclistsOnlySignImage);

    public static String taxisOnlySignName = "Taxis only (R118, TR118)";
    public static String taxisOnlySignWhere = "At the beginning of any road or part of a road.";
    public static String taxisOnlySignPurpose = "To indicate that the road or portion of the road is set aside for use by taxis.";
    public static String taxisOnlySignAction = "The driver of the taxi shall use that road.";
    public static String taxisOnlySignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", taxisOnlySignWhere, taxisOnlySignPurpose, taxisOnlySignAction);
    public static Integer taxisOnlySignImage = R.drawable.taxis_only;
    public static Sign taxisOnlySign = new Sign(taxisOnlySignName, taxisOnlySignDescription, taxisOnlySignPurpose, taxisOnlySignWhere, taxisOnlySignAction, taxisOnlySignImage);

    public static String motorcyclesOnlySignName = "Motorcycles only (R116, TR116)";
    public static String motorcyclesOnlySignWhere = "At the beginning of any road or part of a road.";
    public static String motorcyclesOnlySignPurpose = "Indicate that a road or part of a road may be used by motorcyclists only.";
    public static String motorcyclesOnlySignAction = "Motorcyclists must follow the route indicated by the road traffic sign.\n" +
            "No driver of any other vehicle may use the road or part of the road indicated by this sign.\n" +
            "Motorcyclists may use only that part of the road indicated by this sign.";
    public static String motorcyclesOnlySignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", motorcyclesOnlySignWhere, motorcyclesOnlySignPurpose, motorcyclesOnlySignAction);
    public static Integer motorcyclesOnlySignImage = R.drawable.motorcycles_only;
    public static Sign motorcyclesOnlySign = new Sign(motorcyclesOnlySignName, motorcyclesOnlySignDescription, motorcyclesOnlySignPurpose, motorcyclesOnlySignWhere, motorcyclesOnlySignAction, motorcyclesOnlySignImage);

    public static String motorCarsOnlySignName = "Motor cars only (R117, TR117)";
    public static String motorCarsOnlySignWhere = "At the beginning of any road or part of a road.";
    public static String motorCarsOnlySignPurpose = "Indicate that a road or part of a road may be used by motorcars only.";
    public static String motorCarsOnlySignAction = "You may only drive a motorcar on this road or this part of the road. Where this sign is displayed, you must use that part of the road.";
    public static String motorCarsOnlySignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", motorCarsOnlySignWhere, motorCarsOnlySignPurpose, motorCarsOnlySignAction);
    public static Integer motorCarsOnlySignImage = R.drawable.motor_cars_only;
    public static Sign motorCarsOnlySign = new Sign(motorCarsOnlySignName, motorCarsOnlySignDescription, motorCarsOnlySignPurpose, motorCarsOnlySignWhere, motorCarsOnlySignAction, motorCarsOnlySignImage);

    public static String goodsVehiclesOnlySignName = "Goods vehicles only (R123, TR123)";
    public static String goodsVehiclesOnlySignWhere = motorCarsOnlySignWhere;
    public static String goodsVehiclesOnlySignPurpose = "Indicates that the road or portion of the road is set aside for use by goods vehicles";
    public static String goodsVehiclesOnlySignAction = "The driver of such goods vehicle shall only use such road or portion of such road.";
    public static String goodsVehiclesOnlySignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", goodsVehiclesOnlySignWhere, goodsVehiclesOnlySignPurpose, goodsVehiclesOnlySignAction);
    public static Integer goodsVehiclesOnlySignImage = R.drawable.goods_vehicles_only;
    public static Sign goodsVehiclesOnlySign = new Sign(goodsVehiclesOnlySignName, goodsVehiclesOnlySignDescription, goodsVehiclesOnlySignPurpose, goodsVehiclesOnlySignWhere, goodsVehiclesOnlySignAction, goodsVehiclesOnlySignImage);

    public static String constructionVehiclesOnlySignName = "Construction vehicles only (R125, TR125)";
    public static String constructionVehiclesOnlySignWhere = "In areas where there is mining and industrial activities taking place.";
    public static String constructionVehiclesOnlySignPurpose = "Indicates that the road or a portion of the road is set aside for use by construction vehicles";
    public static String constructionVehiclesOnlySignAction = "The driver of a construction vehicle shall only use such road or portion of such road.";
    public static String constructionVehiclesOnlySignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", constructionVehiclesOnlySignWhere, constructionVehiclesOnlySignPurpose, constructionVehiclesOnlySignAction);
    public static Integer constructionVehiclesOnlySignImage = R.drawable.construction_vehicles_only;
    public static Sign constructionVehiclesOnlySign = new Sign(constructionVehiclesOnlySignName, constructionVehiclesOnlySignDescription, constructionVehiclesOnlySignPurpose, constructionVehiclesOnlySignWhere, constructionVehiclesOnlySignAction, constructionVehiclesOnlySignImage);

    public static String abnormalVehiclesOnlySignName = "Abnormal vehicles only (R127, TR127)";
    public static String abnormalVehiclesOnlySignWhere = "In areas where there is mining and industrial activities taking place.";
    public static String abnormalVehiclesOnlySignPurpose = "Indicates that the road or a portion of the road is set aside for use by abnormal vehicles.";
    public static String abnormalVehiclesOnlySignAction = "The driver of an abnormal vehicle shall only use such road or portion of such road.";
    public static String abnormalVehiclesOnlySignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", abnormalVehiclesOnlySignWhere, abnormalVehiclesOnlySignPurpose, abnormalVehiclesOnlySignAction);
    public static Integer abnormalVehiclesOnlySignImage = R.drawable.abnormal_vehicles_only;
    public static Sign abnormalVehiclesOnlySign = new Sign(abnormalVehiclesOnlySignName, abnormalVehiclesOnlySignDescription, abnormalVehiclesOnlySignPurpose, abnormalVehiclesOnlySignWhere, abnormalVehiclesOnlySignAction, abnormalVehiclesOnlySignImage);

    public static String roundaboutSignName = "Roundabout (R137, TR137)";
    public static String roundaboutSignWhere = "On any road where there are multiple roads intersecting.";
    public static String roundaboutSignPurpose = "To indicate that you must move in a clockwise direction at the junction.";
    public static String roundaboutSignAction = "Yield right of way to vehicle approaching from the right within the roundabout, where such vehicles are close enough to cause a danger or potential danger. Proceed clockwise at the junction if it is safe to do so.";
    public static String roundaboutSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", roundaboutSignWhere, roundaboutSignPurpose, roundaboutSignAction);
    public static Integer roundaboutSignImage = R.drawable.traffic_circle;
    public static Sign roundaboutSign = new Sign(roundaboutSignName, roundaboutSignDescription, roundaboutSignPurpose, roundaboutSignWhere, roundaboutSignAction, roundaboutSignImage);

    public static String payTollSignName = "Pay toll (R132)";
    public static String payTollSignWhere = "On any road.";
    public static String payTollSignPurpose = "To give you a last opportunity to follow an alternative route, or to proceed on the route and pay toll fees.";
    public static String payTollSignAction = "Consider both the alternative and the route indicated by this road traffic sign and decide in good time which to follow.";
    public static String payTollSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", payTollSignWhere, payTollSignPurpose, payTollSignAction);
    public static Integer payTollSignImage = R.drawable.pay_toll;
    public static Sign payTollSign = new Sign(payTollSignName, payTollSignDescription, payTollSignPurpose, payTollSignWhere, payTollSignAction, payTollSignImage);

    public static String agriculturalOnlySignName = "Agricultural vehicles only (R130, TR130)";
    public static String agriculturalOnlySignWhere = "In areas where there are farms and other activities that require agricultural vehicles.";
    public static String agriculturalOnlySignPurpose = "Indicates that the road or a portion of the road is set aside for use by agricultural vehicles";
    public static String agriculturalOnlySignAction = "The driver of an agricultural vehicle shall only use such road or portion of such road.";
    public static String agriculturalOnlySignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", agriculturalOnlySignWhere, agriculturalOnlySignPurpose, agriculturalOnlySignAction);
    public static Integer agriculturalOnlySignImage = R.drawable.agricultural_vehicles_only;
    public static Sign agriculturalOnlySign = new Sign(agriculturalOnlySignName, agriculturalOnlySignDescription, agriculturalOnlySignPurpose, agriculturalOnlySignWhere, agriculturalOnlySignAction, agriculturalOnlySignImage);

    /********************************************************************************************************************************************************************/

    public static String prohibitionsSignsSignName = "Prohibitions Signs";
    public static String prohibitionsSignsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String prohibitionsSignsPurpose = "Stop";
    public static String prohibitionsSignsAction = "Stop";
    public static String prohibitionsSignsWhere = "Stop";
    public static Integer prohibitionsSignsImage = R.drawable.prohibition;
    public static Sign prohibitionsSignsSign = new Sign(prohibitionsSignsSignName, prohibitionsSignsDescription, prohibitionsSignsPurpose, prohibitionsSignsWhere, prohibitionsSignsAction, prohibitionsSignsImage);

    /*** Prohibition Signs ***/

    public static String speedLimitSignName = "Speed limit (R201, TR201)";
    public static String speedLimitSignWhere = "On any public road.";
    public static String speedLimitSignPurpose = "Inform you of the speed limit applicable on this road. The restriction applies from the sign.";
    public static String speedLimitSignAction = "Do not exceed the speed indicated by this sign.";
    public static String speedLimitSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", speedLimitSignWhere, speedLimitSignPurpose, speedLimitSignAction);
    public static Integer speedLimitSignImage = R.drawable.prohibition;
    public static Sign speedLimitSign = new Sign(speedLimitSignName, speedLimitSignDescription, speedLimitSignPurpose, speedLimitSignWhere, speedLimitSignAction, speedLimitSignImage);

    public static String massLimitSignName = "Mass limit (R202, TR202)";
    public static String massLimitSignWhere = speedLimitSignWhere;
    public static String massLimitSignPurpose = "To prevent certain heavy vehicles from using a road or part of a road.";
    public static String massLimitSignAction = "If the GVM or GCM of your vehicle exceeds the mass indicated in tons, use another road or part of the road, which is not indicated by this sign.\n" +
            "If your vehicle’s GVM or GCM is less than the indicated mass in tons, you may use this road.";
    public static String massLimitSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", massLimitSignWhere, massLimitSignPurpose, massLimitSignAction);
    public static Integer massLimitSignImage = R.drawable.max_mass_limit;
    public static Sign massLimitSign = new Sign(massLimitSignName, massLimitSignDescription, massLimitSignPurpose, massLimitSignWhere, massLimitSignAction, massLimitSignImage);

    public static String axleMassLimitSignName = "Axle mass limit (R203, TR203)";
    public static String axleMassLimitSignWhere = speedLimitSignWhere;
    public static String axleMassLimitSignPurpose = "To prohibit certain heavy vehicles from using the road.";
    public static String axleMassLimitSignAction = "If the axle mass of any of your vehicle’s axles exceeds the indicated mass in tons, use another road or part of the road not indicated by this sign.";
    public static String axleMassLimitSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", axleMassLimitSignWhere, axleMassLimitSignPurpose, axleMassLimitSignAction);
    public static Integer axleMassLimitSignImage = R.drawable.axle_mass_limit;
    public static Sign axleMassLimitSign = new Sign(axleMassLimitSignName, axleMassLimitSignDescription, axleMassLimitSignPurpose, axleMassLimitSignWhere, axleMassLimitSignAction, axleMassLimitSignImage);

    public static String heightLimitSignName = "Height limit (R204, TR204)";
    public static String heightLimitSignWhere = speedLimitSignWhere;
    public static String heightLimitSignPurpose = "To warn you against a height restriction ahead.";
    public static String heightLimitSignAction = "If your vehicle (or load) is higher than the indicated height in metres, another road not indicated by this sign, must be used.";
    public static String heightLimitSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", heightLimitSignWhere, heightLimitSignPurpose, heightLimitSignAction);
    public static Integer heightLimitSignImage = R.drawable.height_limit;
    public static Sign heightLimitSign = new Sign(heightLimitSignName, heightLimitSignDescription, heightLimitSignPurpose, heightLimitSignWhere, heightLimitSignAction, heightLimitSignImage);

    public static String lengthLimitSignName = "Length limit (R205, TR205)";
    public static String lengthLimitSignWhere = "On any public road, especially in mountainous areas.";
    public static String lengthLimitSignPurpose = "To prohibit long vehicles from using a road where such a vehicle will not be able to negotiate a curve or will turn in such a manner that it will disrupt or endanger other traffic.";
    public static String lengthLimitSignAction = "If applicable, take an alternative route.";
    public static String lengthLimitSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", lengthLimitSignWhere, lengthLimitSignPurpose, lengthLimitSignAction);
    public static Integer lengthLimitSignImage = R.drawable.length_limit;
    public static Sign lengthLimitSign = new Sign(lengthLimitSignName, lengthLimitSignDescription, lengthLimitSignPurpose, lengthLimitSignWhere, lengthLimitSignAction, lengthLimitSignImage);

    public static String stoppingProhibitedSignName = "Stopping prohibited (R217, TR217)";
    public static String stoppingProhibitedSignWhere = "On any public road. The sign may be supplemented by a red “no stopping line”";
    public static String stoppingProhibitedSignPurpose = "To ensure traffic flow and prevent that driver’s views are not impaired by stationary vehicles.";
    public static String stoppingProhibitedSignAction = "Do not stop unless to obey a traffic light or a traffic officer or to avoid a collision.";
    public static String stoppingProhibitedSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", stoppingProhibitedSignWhere, stoppingProhibitedSignPurpose, stoppingProhibitedSignAction);
    public static Integer stoppingProhibitedSignImage = R.drawable.no_stopping;
    public static Sign stoppingProhibitedSign = new Sign(stoppingProhibitedSignName, stoppingProhibitedSignDescription, stoppingProhibitedSignPurpose, stoppingProhibitedSignWhere, stoppingProhibitedSignAction, stoppingProhibitedSignImage);

    public static String parkingProhibitedSignName = "Parking prohibited (R216, TR216)";
    public static String parkingProhibitedSignWhere = "On a public road where the road is narrow, near an intersection or where a parked vehicle can impair the vision of other drivers.";
    public static String parkingProhibitedSignPurpose = "To prohibit drivers from parking during any time of the day or night.";
    public static String parkingProhibitedSignAction = "Do not park where these signs are displayed.";
    public static String parkingProhibitedSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", parkingProhibitedSignWhere, parkingProhibitedSignPurpose, parkingProhibitedSignAction);
    public static Integer parkingProhibitedSignImage = R.drawable.no_parking;
    public static Sign parkingProhibitedSign = new Sign(parkingProhibitedSignName, parkingProhibitedSignDescription, parkingProhibitedSignPurpose, parkingProhibitedSignWhere, parkingProhibitedSignAction, parkingProhibitedSignImage);

    public static String uTurnProhibitedSignName = "U-turn prohibited (R213)";
    public static String uTurnProhibitedSignWhere = "On a public road before or on the far side of an intersection.";
    public static String uTurnProhibitedSignPurpose = "To vehicles from turning around so that it faces the opposite direction.";
    public static String uTurnProhibitedSignAction = "Do not turn your vehicle around so that it faces the opposite direction.";
    public static String uTurnProhibitedSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", uTurnProhibitedSignWhere, uTurnProhibitedSignPurpose, uTurnProhibitedSignAction);
    public static Integer uTurnProhibitedSignImage = R.drawable.no_u_turn;
    public static Sign uTurnProhibitedSign = new Sign(uTurnProhibitedSignName, uTurnProhibitedSignDescription, uTurnProhibitedSignPurpose, uTurnProhibitedSignWhere, uTurnProhibitedSignAction, uTurnProhibitedSignImage);

    public static String overTakingProhibitedSignName = "Overtaking prohibited (R214, TR214, R215, TR215)";
    public static String overTakingProhibitedSignWhere = "On any public road.";
    public static String overTakingProhibitedSignPurpose = "To inform drivers that overtaking vehicles is prohibited for the next 500m.";
    public static String overTakingProhibitedSignAction = "If sign R214 or TR214 is displayed, do not overtake any vehicle for the next 500m.\n" +
            "If you are driving a heavy motor vehicle, do not overtake another heavy vehicle if sign R215 is displayed.";
    public static String overTakingProhibitedSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", overTakingProhibitedSignWhere, overTakingProhibitedSignPurpose, overTakingProhibitedSignAction);
    public static Integer overTakingProhibitedSignImage = R.drawable.no_overtaking;
    public static Sign overTakingProhibitedSign = new Sign(overTakingProhibitedSignName, overTakingProhibitedSignDescription, overTakingProhibitedSignPurpose, overTakingProhibitedSignWhere, overTakingProhibitedSignAction, overTakingProhibitedSignImage);

    public static String unauthorisedVehiclesProhibitedSignName = "Unauthorised vehicles prohibited (R208, TR208)";
    public static String unauthorisedVehiclesProhibitedSignWhere = "On any public road where it is necessary to close the road for general traffic.\n" +
            "The temporary sign is usually displayed at road works.";
    public static String unauthorisedVehiclesProhibitedSignPurpose = "To prohibit drivers without special authorisation from entering a certain road or section of a road.";
    public static String unauthorisedVehiclesProhibitedSignAction = "Do not proceed past the sign or enter the road without special permission.";
    public static String unauthorisedVehiclesProhibitedSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", unauthorisedVehiclesProhibitedSignWhere, unauthorisedVehiclesProhibitedSignPurpose, unauthorisedVehiclesProhibitedSignAction);
    public static Integer unauthorisedVehiclesProhibitedSignImage = R.drawable.unauthorised_vehicles;
    public static Sign unauthorisedVehiclesProhibitedSign = new Sign(unauthorisedVehiclesProhibitedSignName, unauthorisedVehiclesProhibitedSignDescription, unauthorisedVehiclesProhibitedSignPurpose, unauthorisedVehiclesProhibitedSignWhere, unauthorisedVehiclesProhibitedSignAction, unauthorisedVehiclesProhibitedSignImage);

    /********************************************************************************************************************************************************************/

    public static String reservationSignsSignName = "Reservation Signs";
    public static String reservationSignsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String reservationSignsPurpose = "Stop";
    public static String reservationSignsAction = "Stop";
    public static String reservationSignsWhere = "Stop";
    public static Integer reservationSignsImage = R.drawable.reservations;
    public static Sign reservationSignsSign = new Sign(reservationSignsSignName, reservationSignsDescription, reservationSignsPurpose, reservationSignsWhere, reservationSignsAction, reservationSignsImage);

    /*** Reservation Signs ***/

    public static String busReservationSignName = "Bus reservation (R301, TR301) ";
    public static String busReservationSignWhere = "At the entrance to any carriageway, lane or parking area.";
    public static String busReservationSignPurpose = "Indicate that the road or part of the carriageway is reserved for buses only.";
    public static String busReservationSignAction = "Do not enter this area or park here if you are not driving a bus.";
    public static String busReservationSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", busReservationSignWhere, busReservationSignPurpose, busReservationSignAction);
    public static Integer busReservationSignImage = R.drawable.reservations;
    public static Sign busReservationSign = new Sign(busReservationSignName, busReservationSignDescription, busReservationSignPurpose, busReservationSignWhere, busReservationSignAction, busReservationSignImage);

    public static String busLaneReservationSignName = "Bus lane reservation (R302, TR302) ";
    public static String busLaneReservationSignWhere = "On any road, particularly in urban areas.";
    public static String busLaneReservationSignPurpose = "Signs R302 and TR302 indicate that no other class of vehicle may use that part of the road";
    public static String busLaneReservationSignAction = "Do not follow this bus route if you are not driving a bus.";
    public static String busLaneReservationSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", busLaneReservationSignWhere, busLaneReservationSignPurpose, busLaneReservationSignAction);
    public static Integer busLaneReservationSignImage = R.drawable.bus_lane_reservation;
    public static Sign busLaneReservationSign = new Sign(busLaneReservationSignName, busLaneReservationSignDescription, busLaneReservationSignPurpose, busLaneReservationSignWhere, busLaneReservationSignAction, busLaneReservationSignImage);


    public static String pedalCycleLaneReservationSignName = "Minimum Speed Limit";
    public static String pedalCycleLaneReservationSignWhere = "Railway Crossings, Intersections, and Scholar Patrols";
    public static String pedalCycleLaneReservationSignPurpose = "Bring traffic to a stop.";
    public static String pedalCycleLaneReservationSignAction = "Bring vehicles to a stop behind the line. " +
            "When there is no stop line, the front of the vehicle must be in line with the stop sign. " +
            "You may not drive off before all the other vehicles which stopped before you have moved off in a three-way or four-way stop. " +
            "Continue only when it is safe.";
    public static String pedalCycleLaneReservationSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", pedalCycleLaneReservationSignWhere, pedalCycleLaneReservationSignPurpose, pedalCycleLaneReservationSignAction);
    public static Integer pedalCycleLaneReservationSignImage = R.drawable.stop;
    public static Sign pedalCycleLaneReservationSign = new Sign(pedalCycleLaneReservationSignName, pedalCycleLaneReservationSignDescription, pedalCycleLaneReservationSignPurpose, pedalCycleLaneReservationSignWhere, pedalCycleLaneReservationSignAction, pedalCycleLaneReservationSignImage);

    public static String parkingReservationSignName = "Parking (R305-P, TR305-P)";
    public static String parkingReservationSignWhere = "On any road or other area where parking bays are demarcated.";
    public static String parkingReservationSignPurpose = "Sign (R305-P) indicates a parking area for vehicles with a GVM of less than 3 500 kg where no time limit applies but a fee must be paid. " +
            "Sign (R306-P) indicates a parking area that may be used free of charge or at a fee and the maximum time allowed for a vehicle to be parked, is displayed.";
    public static String parkingReservationSignAction = "Park in accordance with the road traffic sign and road traffic markings. If necessary pay the tariff and do not park for longer than the time indicated.";
    public static String parkingReservationSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", parkingReservationSignWhere, parkingReservationSignPurpose, parkingReservationSignAction);
    public static Integer parkingReservationSignImage = R.drawable.park;
    public static Sign parkingReservationSign = new Sign(parkingReservationSignName, parkingReservationSignDescription, parkingReservationSignPurpose, parkingReservationSignWhere, parkingReservationSignAction, parkingReservationSignImage);

    public static String limitedParkingReservationSignName = "Limited parking (R306-P, TR306-P) reservation";
    public static String limitedParkingReservationSignWhere = parkingReservationSignWhere;
    public static String limitedParkingReservationSignPurpose = parkingReservationSignPurpose;
    public static String limitedParkingReservationSignAction = parkingReservationSignAction;
    public static String limitedParkingReservationSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", limitedParkingReservationSignWhere, limitedParkingReservationSignPurpose, limitedParkingReservationSignAction);
    public static Integer limitedParkingReservationSignImage = R.drawable.limited_time_parking_reservation;
    public static Sign limitedParkingReservationSign = new Sign(limitedParkingReservationSignName, limitedParkingReservationSignDescription, limitedParkingReservationSignPurpose, limitedParkingReservationSignWhere, limitedParkingReservationSignAction, limitedParkingReservationSignImage);

    public static String motorcycleReservationSignName = "Motorcycle reservation (R307, TR307)";
    public static String motorcycleReservationSignWhere = "On any road or at an entrance to a parking area.";
    public static String motorcycleReservationSignPurpose = "To reserve a portion of a road or a parking area for use by motorcycles only.";
    public static String motorcycleReservationSignAction = "Do not use this road (R307, TR307) or parking area (R307-P, TR307-P) if you are not riding a motorcycle.";
    public static String motorcycleReservationSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", motorcycleReservationSignWhere, motorcycleReservationSignPurpose, motorcycleReservationSignAction);
    public static Integer motorcycleReservationSignImage = R.drawable.motorcycles_only;
    public static Sign motorcycleReservationSign = new Sign(motorcycleReservationSignName, motorcycleReservationSignDescription, motorcycleReservationSignPurpose, motorcycleReservationSignWhere, motorcycleReservationSignAction, motorcycleReservationSignImage);

    /********************************************************************************************************************************************************************/

    public static String comprehensiveSignsSignName = "Comprehensive Signs";
    public static String comprehensiveSignsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String comprehensiveSignsPurpose = "Stop";
    public static String comprehensiveSignsAction = "Stop";
    public static String comprehensiveSignsWhere = "Stop";
    public static Integer comprehensiveSignsImage = R.drawable.freeway;
    public static Sign comprehensiveSignsSign = new Sign(comprehensiveSignsSignName, comprehensiveSignsDescription, comprehensiveSignsPurpose, comprehensiveSignsWhere, comprehensiveSignsAction, comprehensiveSignsImage);

    /*** Comprehensive Signs ***/

    public static String dualCarriagewayFreewayBeginsSignName = "Dual-carriageway freeway begins (R401)";
    public static String dualCarriagewayFreewayBeginsSignWhere = "At the beginning of a dual-carriageway freeway.";
    public static String dualCarriagewayFreewayBeginsSignPurpose = "To indicate that a freeway begins at the sign and that the rules that apply to freeways are effective from here.";
    public static String dualCarriagewayFreewayBeginsSignAction = "Follow all the rules that apply to freeways.";
    public static String dualCarriagewayFreewayBeginsSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", dualCarriagewayFreewayBeginsSignWhere, dualCarriagewayFreewayBeginsSignPurpose, dualCarriagewayFreewayBeginsSignAction);
    public static Integer dualCarriagewayFreewayBeginsSignImage = R.drawable.freeway;
    public static Sign dualCarriagewayFreewayBeginsSign = new Sign(dualCarriagewayFreewayBeginsSignName, dualCarriagewayFreewayBeginsSignDescription, dualCarriagewayFreewayBeginsSignPurpose, dualCarriagewayFreewayBeginsSignWhere, dualCarriagewayFreewayBeginsSignAction, dualCarriagewayFreewayBeginsSignImage);

    public static String singleCarriagewayFreewayBeginsSignName = "Single-carriageway freeway begins (R402)";
    public static String singleCarriagewayFreewayBeginsSignWhere = "At the beginning of a single-carriageway freeway.";
    public static String singleCarriagewayFreewayBeginsSignPurpose = "To indicate that a single-carriageway freeway begins at the sign and that all rules that apply to freeways are effective from here.";
    public static String singleCarriagewayFreewayBeginsSignAction = "Follow all the rules, which apply, to freeways.";
    public static String singleCarriagewayFreewayBeginsSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", singleCarriagewayFreewayBeginsSignWhere, singleCarriagewayFreewayBeginsSignPurpose, singleCarriagewayFreewayBeginsSignAction);
    public static Integer singleCarriagewayFreewayBeginsSignImage = R.drawable.single_carriageway;
    public static Sign singleCarriagewayFreewayBeginsSign = new Sign(singleCarriagewayFreewayBeginsSignName, singleCarriagewayFreewayBeginsSignDescription, singleCarriagewayFreewayBeginsSignPurpose, singleCarriagewayFreewayBeginsSignWhere, singleCarriagewayFreewayBeginsSignAction, singleCarriagewayFreewayBeginsSignImage);

    public static String woonerfSignName = "Woonerf (R403)";
    public static String woonerfSignWhere = "On any public road.";
    public static String woonerfSignPurpose = "To prohibit the entry of all vehicles with a mass exceeding 3 500 kg, or vehicles, which have more than 10 seats, except for local access or delivery.\n" +
            "To yield right of way to pedestrians in the street.\n" +
            "To prohibit vehicles from driving through the area without breaking their journey.\n" +
            "To limit the speed of vehicles in the area to 30km/h";
    public static String woonerfSignAction = "Drive slowly, obey the special rules mentioned above and be particularly on the look out for children playing in the street.";
    public static String woonerfSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", woonerfSignWhere, woonerfSignPurpose, woonerfSignAction);
    public static Integer woonerfSignImage = R.drawable.urban_area;
    public static Sign woonerfSign = new Sign(woonerfSignName, woonerfSignDescription, woonerfSignPurpose, woonerfSignWhere, woonerfSignAction, woonerfSignImage);

    /********************************************************************************************************************************************************************/


    public static String secondarySignsSignName = "Secondary Signs";
    public static String secondarySignsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String secondarySignsPurpose = "Stop";
    public static String secondarySignsAction = "Stop";
    public static String secondarySignsWhere = "Stop";
    public static Integer secondarySignsImage = R.drawable.time_restriction;
    public static Sign secondarySignsSign = new Sign(secondarySignsSignName, secondarySignsDescription, secondarySignsPurpose, secondarySignsWhere, secondarySignsAction, secondarySignsImage);


    /* Selective Restriction Signs */


    public static String timeLimitSubgroupSignName = "Time limit subgroup\nTwo-time periods (R) 502\nTwo-time periods/days (R) 50";
    public static String timeLimitSubgroupSignWhere = "Below a regulatory sign on any public road.";
    public static String timeLimitSubgroupSignPurpose = "To indicate that the regulatory sign applies only for the period(s) or during conditions indicated on this sign.";
    public static String timeLimitSubgroupSignAction = "Obey the times on this sign.";
    public static String timeLimitSubgroupSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", timeLimitSubgroupSignWhere, timeLimitSubgroupSignPurpose, timeLimitSubgroupSignAction);
    public static Integer timeLimitSubgroupSignImage = R.drawable.time_restriction;
    public static Sign timeLimitSubgroupSign = new Sign(timeLimitSubgroupSignName, timeLimitSubgroupSignDescription, timeLimitSubgroupSignPurpose, timeLimitSubgroupSignWhere, timeLimitSubgroupSignAction, timeLimitSubgroupSignImage);

    public static String maxStayDuringTwoPeriodsOrDaysSignName = "Maximum stay during two periods/days (R505, R506)";
    public static String maxStayDuringTwoPeriodsOrDaysSignWhere = "Below a regulatory sign on any public road.";
    public static String maxStayDuringTwoPeriodsOrDaysSignPurpose = "To limit the times and periods of stopping.";
    public static String maxStayDuringTwoPeriodsOrDaysSignAction = "Do not stop or park for longer than the times indicated.";
    public static String maxStayDuringTwoPeriodsOrDaysSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", maxStayDuringTwoPeriodsOrDaysSignWhere, maxStayDuringTwoPeriodsOrDaysSignPurpose, maxStayDuringTwoPeriodsOrDaysSignAction);
    public static Integer maxStayDuringTwoPeriodsOrDaysSignImage = R.drawable.stop;
    public static Sign maxStayDuringTwoPeriodsOrDaysSign = new Sign(maxStayDuringTwoPeriodsOrDaysSignName, maxStayDuringTwoPeriodsOrDaysSignDescription, maxStayDuringTwoPeriodsOrDaysSignPurpose, maxStayDuringTwoPeriodsOrDaysSignWhere, maxStayDuringTwoPeriodsOrDaysSignAction, maxStayDuringTwoPeriodsOrDaysSignImage);

    public static String dayTimeSignName = "Daytime (R)511";
    public static String dayTimeSignWhere = "On any public road.";
    public static String dayTimeSignPurpose = "To inform you that the regulatory sign applies during daytime.";
    public static String dayTimeSignAction = "Obey the regulatory sign during daytime.";
    public static String dayTimeSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", dayTimeSignWhere, dayTimeSignPurpose, dayTimeSignAction);
    public static Integer dayTimeSignImage = R.drawable.daytime;
    public static Sign dayTimeSign = new Sign(dayTimeSignName, dayTimeSignDescription, dayTimeSignPurpose, dayTimeSignWhere, dayTimeSignAction, dayTimeSignImage);

    public static String nightTimeSignName = "Night time (R)512";
    public static String nightTimeSignWhere = dayTimeSignWhere;
    public static String nightTimeSignPurpose = "To inform you that the regulatory sign only applies during night time.";
    public static String nightTimeSignAction = "Obey the regulatory sign during night time.";
    public static String nightTimeSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", nightTimeSignWhere, nightTimeSignPurpose, nightTimeSignAction);
    public static Integer nightTimeSignImage = R.drawable.night_time;
    public static Sign nightTimeSign = new Sign(nightTimeSignName, nightTimeSignDescription, nightTimeSignPurpose, nightTimeSignWhere, nightTimeSignAction, nightTimeSignImage);

    public static String payAndDisplaySignName = "Pay and display (R523)";
    public static String payAndDisplaySignWhere = "Below a regulatory sign.";
    public static String payAndDisplaySignPurpose = "To indicate that parking fees must be paid in the parking area.";
    public static String payAndDisplaySignAction = "Pay the parking fee and display the receipt on or within your vehicle.";
    public static String payAndDisplaySignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", payAndDisplaySignWhere, payAndDisplaySignPurpose, payAndDisplaySignAction);
    public static Integer payAndDisplaySignImage = R.drawable.pay_and_display;
    public static Sign payAndDisplaySign = new Sign(payAndDisplaySignName, payAndDisplaySignDescription, payAndDisplaySignPurpose, payAndDisplaySignWhere, payAndDisplaySignAction, payAndDisplaySignImage);

    public static String maxNumberOfVehiclesSignName = "Maximum number of vehicles (R540)";
    public static String maxNumberOfVehiclesSignWhere = "Below the appropriate regulatory sign.";
    public static String maxNumberOfVehiclesSignPurpose = "To indicate to the driver that the reservation indicated on the regulatory sign is further restricted by a maximum number of vehicles as indicated on this sign.";
    public static String maxNumberOfVehiclesSignAction = "Do not enter an area if that would mean there would be more than the number of vehicles indicated.";
    public static String maxNumberOfVehiclesSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", maxNumberOfVehiclesSignWhere, maxNumberOfVehiclesSignWhere, maxNumberOfVehiclesSignAction);
    public static Integer maxNumberOfVehiclesSignImage = R.drawable.max_number_of_vehicles;
    public static Sign maxNumberOfVehiclesSign = new Sign(maxNumberOfVehiclesSignName, maxNumberOfVehiclesSignDescription, maxNumberOfVehiclesSignPurpose, maxNumberOfVehiclesSignWhere, maxNumberOfVehiclesSignAction, maxNumberOfVehiclesSignImage);


    /********************************************************************************************************************************************************************/

    /* Combination Signs (Regulatory) */

    /********************************************************************************************************************************************************************/

    public static String deRestrictionSignsSignName = "De-Restriction Sign";
    public static String deRestrictionSignsWhere = "";
    public static String deRestrictionSignsPurpose = "To cancel a restriction.";
    public static String deRestrictionSignsAction = "From here you do not have to comply with the restriction sign with a symbol similar to this sign but without the red cross.";
    public static String deRestrictionSignsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static Integer deRestrictionSignsImage = R.drawable.headlights_off;
    public static Sign deRestrictionSignsSign = new Sign(deRestrictionSignsSignName, deRestrictionSignsDescription, deRestrictionSignsPurpose, deRestrictionSignsWhere, deRestrictionSignsAction, deRestrictionSignsImage);

    /*** De-Restriction Signs ***/
    public static String headlightsOffSignName = "Headlights Off";
    public static String headlightsOffSignWhere = "Railway Crossings, Intersections, and Scholar Patrols";
    public static String headlightsOffSignPurpose = "Bring traffic to a stop.";
    public static String headlightsOffSignAction = "Bring vehicles to a stop behind the line. " +
            "When there is no stop line, the front of the vehicle must be in line with the stop sign. " +
            "You may not drive off before all the other vehicles which stopped before you have moved off in a three-way or four-way stop. " +
            "Continue only when it is safe.";
    public static String headlightsOffSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", headlightsOffSignWhere, headlightsOffSignPurpose, headlightsOffSignAction);
    public static Integer headlightsOffSignImage = R.drawable.headlights_off;
    public static Sign headlightsOffSign = new Sign(headlightsOffSignName, headlightsOffSignDescription, headlightsOffSignPurpose, headlightsOffSignWhere, headlightsOffSignAction, headlightsOffSignImage);


    /********************************************************************************************************************************************************************/
    /********************************************************************************************************************************************************************/

    public static String warningSignsSignName = "Warning Signs";
    public static String warningSignsDescription = String.format("Examples include:\n%s\n%s", "stopSignName", "yieldSignName");
    public static String warningSignsPurpose = "Stop";
    public static String warningSignsWhere = "Stop";
    public static String warningSignsAction = "Stop";
    public static Integer warningSignsImage = R.drawable.no_u_turn;
    public static Sign warningSignsSign = new Sign(warningSignsSignName, warningSignsDescription, warningSignsPurpose, warningSignsWhere, warningSignsAction, warningSignsImage);

    /********************************************************************************************************************************************************************/

    /*** Road Layout Signs ***/

    public static String crossroadSignName = "Crossroad (W101)";
    public static String crossroadSignWhere = "On any road.";
    public static String crossroadSignPurpose = "To warn that a hazard in the form of a crossroad is ahead";
    public static String crossroadSignAction = "Approach cautiously, look carefully and be able to stop if cross-traffic requires it.";
    public static String crossroadSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", crossroadSignWhere, crossroadSignPurpose, crossroadSignAction);
    public static Integer crossroadSignImage = R.drawable.crossroads;
    public static Sign crossroadSign = new Sign(crossroadSignName, crossroadSignDescription, crossroadSignPurpose, crossroadSignWhere, crossroadSignAction, crossroadSignImage);

    public static String priorityCrossroadSignName = "Priority crossroad (W102)";
    public static String priorityCrossroadSignWhere = crossroadSignWhere;
    public static String priorityCrossroadSignPurpose = "To warn that you are approaching an intersection where you have right of way. (The thicker leg of the cross on the signs indicates which road has priority.)";
    public static String priorityCrossroadSignAction = "Approach cautiously, look carefully and be able to stop if cross-traffic does not yield.";
    public static String priorityCrossroadSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", priorityCrossroadSignWhere, priorityCrossroadSignPurpose, priorityCrossroadSignAction);
    public static Integer priorityCrossroadSignImage = R.drawable.priority_crossroad;
    public static Sign priorityCrossroadSign = new Sign(priorityCrossroadSignName, priorityCrossroadSignDescription, priorityCrossroadSignPurpose, priorityCrossroadSignWhere, priorityCrossroadSignAction, priorityCrossroadSignImage);

    public static String secondaryCrossroadSignName = "Secondary crossroad (W103)";
    public static String secondaryCrossroadSignWhere = crossroadSignWhere;
    public static String secondaryCrossroadSignPurpose = "To warn that you are approaching an intersection where you have to yield to cross-traffic. (The thicker leg of the cross on the sign indicates which road has priority.)";
    public static String secondaryCrossroadSignAction = "Approach cautiously, and yield to traffic approaching from left or right.";
    public static String secondaryCrossroadSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", secondaryCrossroadSignWhere, secondaryCrossroadSignPurpose, secondaryCrossroadSignAction);
    public static Integer secondaryCrossroadSignImage = R.drawable.secondary_crossroad;
    public static Sign secondaryCrossroadSign = new Sign(secondaryCrossroadSignName, secondaryCrossroadSignDescription, secondaryCrossroadSignPurpose, secondaryCrossroadSignWhere, secondaryCrossroadSignAction, secondaryCrossroadSignImage);

    public static String tJunctionSignName = "T-junction (W 104, TW104)";
    public static String tJunctionSignWhere = "On any road before you reach the place where two roads meet.";
    public static String tJunctionSignPurpose = "To warn that you are approaching an intersection where you have to turn sharp to the right or left.";
    public static String tJunctionSignAction = "Look out for cross-traffic. Slow down and be prepared to stop and go round the corner at a safe speed.";
    public static String tJunctionSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", tJunctionSignWhere, tJunctionSignPurpose, tJunctionSignAction);
    public static Integer tJunctionSignImage = R.drawable.t_junction;
    public static Sign tJunctionSign = new Sign(tJunctionSignName, tJunctionSignDescription, tJunctionSignPurpose, tJunctionSignWhere, tJunctionSignAction, tJunctionSignImage);

    public static String skewTJunctionSignName = "Skew T-junction (W105, W106, TW105, TW106)";
    public static String skewTJunctionSignWhere = crossroadSignWhere;
    public static String skewTJunctionSignPurpose = "To warn that you are approaching an intersection where another road meet yours at an angle.";
    public static String skewTJunctionSignAction = "Look out for cross-traffic. Slow down and be prepared to stop.";
    public static String skewTJunctionSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", skewTJunctionSignWhere, skewTJunctionSignPurpose, skewTJunctionSignAction);
    public static Integer skewTJunctionSignImage = R.drawable.skew_t_juntion;
    public static Sign skewTJunctionSign = new Sign(skewTJunctionSignName, skewTJunctionSignDescription, skewTJunctionSignPurpose, skewTJunctionSignWhere, skewTJunctionSignAction, skewTJunctionSignImage);

    public static String sideRoadSignName = "Side road junction from the left (W107, TW107) ";
    public static String sideRoadSignWhere = "On any road before you reach the place where another road joins your road from the left (W107)(TW107) or from the right (W108)(TW108).";
    public static String sideRoadSignPurpose = "To warn that traffic may be approaching you from the left or right-hand side.";
    public static String sideRoadSignAction = "Slow down so that you will be able to stop, or go around the corner or pass the intersection at a safe speed.\n" +
            "Look out for other traffic at the intersection that might not yield.";
    public static String sideRoadSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", sideRoadSignWhere, sideRoadSignPurpose, sideRoadSignAction);
    public static Integer sideRoadSignImage = R.drawable.side_road;
    public static Sign sideRoadSign = new Sign(sideRoadSignName, sideRoadSignDescription, sideRoadSignPurpose, sideRoadSignWhere, sideRoadSignAction, sideRoadSignImage);

    public static String staggeredJunctionsSignName = "Staggered junctions (W109, TW109, W110, TW110)";
    public static String staggeredJunctionsSignWhere = "On any road before you reach the place where two roads join your road within a short distance.";
    public static String staggeredJunctionsSignPurpose = "To warn that your road is first joined by another road from the left hand side first and within a short distance by another from the right hand side (W110,TW110) or from the right first and then from the left (W109,TW109).";
    public static String staggeredJunctionsSignAction = "Slow down and be prepared to stop or turn at a safe speed. Look out for traffic at the intersection that might not yield.";
    public static String staggeredJunctionsSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", staggeredJunctionsSignWhere, staggeredJunctionsSignPurpose, staggeredJunctionsSignAction);
    public static Integer staggeredJunctionsSignImage = R.drawable.staggered_junction;
    public static Sign staggeredJunctionsSign = new Sign(staggeredJunctionsSignName, staggeredJunctionsSignDescription, staggeredJunctionsSignPurpose, staggeredJunctionsSignWhere, staggeredJunctionsSignAction, staggeredJunctionsSignImage);

    public static String sharpJunctionSignName = "Sharp junction (W112, TW112, W114, TW114)";
    public static String sharpJunctionSignWhere = crossroadSignWhere;
    public static String sharpJunctionSignPurpose = "To warn that traffic could merge from the left (W112, TW112) or from the right (W114, TW114) at sharp angles.";
    public static String sharpJunctionSignAction = "Pass the intersection at a safe speed and look out for merging traffic that might not yield.";
    public static String sharpJunctionSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", sharpJunctionSignWhere, sharpJunctionSignPurpose, sharpJunctionSignAction);
    public static Integer sharpJunctionSignImage = R.drawable.sharp_curve;
    public static Sign sharpJunctionSign = new Sign(sharpJunctionSignName, sharpJunctionSignDescription, sharpJunctionSignPurpose, sharpJunctionSignWhere, sharpJunctionSignAction, sharpJunctionSignImage);

    public static String yJunctionSignName = "Y-junction (W115, TW115)";
    public static String yJunctionSignWhere = "On any road before you reach a place where your road splits in two.";
    public static String yJunctionSignPurpose = "To warn that the road forks into two roads.";
    public static String yJunctionSignAction = "Decide well in time which road to take. Look out for approaching traffic whose path you will cross when taking the right hand road";
    public static String yJunctionSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", yJunctionSignWhere, yJunctionSignPurpose, yJunctionSignAction);
    public static Integer yJunctionSignImage = R.drawable.y_junction;
    public static Sign yJunctionSign = new Sign(yJunctionSignName, yJunctionSignDescription, yJunctionSignPurpose, yJunctionSignWhere, yJunctionSignAction, yJunctionSignImage);

    public static String endOfDualRoadwaySignName = "End of dual roadway (W116, TW116, W117, TW117)";
    public static String endOfDualRoadwaySignWhere = "On any dual roadway.";
    public static String endOfDualRoadwaySignPurpose = "To warn that the one-way roadway is ending soon and that approaching vehicles will use the same carriageway as you.";
    public static String endOfDualRoadwaySignAction = "Position your vehicle on the road where it will not endanger approaching traffic. It may be necessary to change lanes.";
    public static String endOfDualRoadwaySignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", endOfDualRoadwaySignWhere, endOfDualRoadwaySignPurpose, endOfDualRoadwaySignAction);
    public static Integer endOfDualRoadwaySignImage = R.drawable.dual_roadway_ends;
    public static Sign endOfDualRoadwaySign = new Sign(endOfDualRoadwaySignName, endOfDualRoadwaySignDescription, endOfDualRoadwaySignPurpose, endOfDualRoadwaySignWhere, endOfDualRoadwaySignAction, endOfDualRoadwaySignImage);

    public static String beginningOfDualRoadwaySignName = "Beginning of dual roadway (W118, TW118, W119, TW119)";
    public static String beginningOfDualRoadwaySignWhere = "On any single carriage way road.";
    public static String beginningOfDualRoadwaySignPurpose = "To warn that the single carriageway is ending and that you will soon enter a one-way road.";
    public static String beginningOfDualRoadwaySignAction = "You will be able to overtake more safely after entering the one way road. This sign does not indicate a freeway and intersections can still be found on such a road.";
    public static String beginningOfDualRoadwaySignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", beginningOfDualRoadwaySignWhere, beginningOfDualRoadwaySignPurpose, beginningOfDualRoadwaySignAction);
    public static Integer beginningOfDualRoadwaySignImage = R.drawable.dual_roadway_begins;
    public static Sign beginningOfDualRoadwaySign = new Sign(beginningOfDualRoadwaySignName, beginningOfDualRoadwaySignDescription, beginningOfDualRoadwaySignPurpose, beginningOfDualRoadwaySignWhere, beginningOfDualRoadwaySignAction, beginningOfDualRoadwaySignImage);

    /********************************************************************************************************************************************************************/

    /*** Direction of Movement Signs ***/

    public static String trafficCircleSignName = "Traffic circle (W201, TW201)";
    public static String trafficCircleSignWhere = crossroadSignWhere;
    public static String trafficCircleSignPurpose = "To warn that there is a traffic circle ahead where you may need to yield to other traffic.";
    public static String trafficCircleSignAction = "Slow down so that you can stop or drive around the circle at a safe speed. Look out for road traffic signs and markings which will tell you whether you have the right of way or whether you have to yield. If there is no indication you have to give way to traffic approaching from the right. Vehicles within a traffic circle have right of way.\n" +
            "If you have right of way still look out for traffic in the circle which may not yield to you.\n" +
            "If sign R2.2 is displayed at the traffic circle, you must yield to any driver who crosses his yield line first before you cross yours.\n";
    public static String trafficCircleSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", trafficCircleSignWhere, trafficCircleSignPurpose, trafficCircleSignAction);
    public static Integer trafficCircleSignImage = R.drawable.traffic_circle_ahead;
    public static Sign trafficCircleSign = new Sign(trafficCircleSignName, trafficCircleSignDescription, trafficCircleSignPurpose, trafficCircleSignWhere, trafficCircleSignAction, trafficCircleSignImage);

    public static String gentleCurveSignName = "Gentle curve (W202, TW202, W203, TW203)";
    public static String gentleCurveSignWhere = crossroadSignWhere;
    public static String gentleCurveSignPurpose = "To warn that there is a gentle curve ahead to the left or right.";
    public static String gentleCurveSignAction = "Ensure that you drive at such a speed that you can take the curve safely or stop within the distance that you can see.\n";
    public static String gentleCurveSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", gentleCurveSignWhere, gentleCurveSignPurpose, gentleCurveSignAction);
    public static Integer gentleCurveSignImage = R.drawable.gentle_curve;
    public static Sign gentleCurveSign = new Sign(gentleCurveSignName, gentleCurveSignDescription, gentleCurveSignPurpose, gentleCurveSignWhere, gentleCurveSignAction, gentleCurveSignImage);

    public static String sharpCurveSignName = "Sharp curve (W204, TW204, W205, TW205)";
    public static String sharpCurveSignWhere = crossroadSignWhere;
    public static String sharpCurveSignPurpose = "To warn that there is a sharp curve ahead to the left or right.";
    public static String sharpCurveSignAction = "Slow down so that you can take the curve safely or stop within the distance that you can see.";
    public static String sharpCurveSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", sharpCurveSignWhere, sharpCurveSignPurpose, sharpCurveSignAction);
    public static Integer sharpCurveSignImage = R.drawable.sharp_curve;
    public static Sign sharpCurveSign = new Sign(sharpCurveSignName, sharpCurveSignDescription, sharpCurveSignPurpose, sharpCurveSignWhere, sharpCurveSignAction, sharpCurveSignImage);

    public static String hairpinBendSignName = "Hairpin bend (W206, TW206, W207, TW207)";
    public static String hairpinBendSignWhere = "On any public road especially in mountainous areas.";
    public static String hairpinBendSignPurpose = "To warn that there is a very sharp, U-shaped curve ahead to the left or right.";
    public static String hairpinBendSignAction = "Slow down so that you can take the curve safely or stop within the distance you can see.";
    public static String hairpinBendSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", hairpinBendSignWhere, hairpinBendSignPurpose, hairpinBendSignAction);
    public static Integer hairpinBendSignImage = R.drawable.hairpin_bend_right;
    public static Sign hairpinBendSign = new Sign(hairpinBendSignName, hairpinBendSignDescription, hairpinBendSignPurpose, hairpinBendSignWhere, hairpinBendSignAction, hairpinBendSignImage);

    public static String windingRoadSignName = "Winding road (W208, TW208, W209, TW209)";
    public static String windingRoadSignWhere = hairpinBendSignWhere;
    public static String windingRoadSignPurpose = "To warn of a series of curves ahead. In the case of W209 the first curve is to the left and in the case of W208 the first bend is to the right.";
    public static String windingRoadSignAction = "Slow down enough to take the curves safely or stop within the distance you can see. Remember that there could be any number of curves after the first one without further warning.";
    public static String windingRoadSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", windingRoadSignWhere, windingRoadSignPurpose, windingRoadSignAction);
    public static Integer windingRoadSignImage = R.drawable.winding_road;
    public static Sign windingRoadSign = new Sign(windingRoadSignName, windingRoadSignDescription, windingRoadSignPurpose, windingRoadSignWhere, windingRoadSignAction, windingRoadSignImage);

    public static String combinedCurvesSignName = "Combined curves (W210, TW210, W211, TW211)";
    public static String combinedCurvesSignWhere = hairpinBendSignWhere;
    public static String combinedCurvesSignPurpose = "To warn that there are two sharp curves ahead in opposite directions. W210 indicates the first curve is to the right and W211 that the first curve is to the left.";
    public static String combinedCurvesSignAction = hairpinBendSignAction;
    public static String combinedCurvesSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", combinedCurvesSignWhere, combinedCurvesSignPurpose, combinedCurvesSignAction);
    public static Integer combinedCurvesSignImage = R.drawable.combined_curves;
    public static Sign combinedCurvesSign = new Sign(combinedCurvesSignName, combinedCurvesSignDescription, combinedCurvesSignPurpose, combinedCurvesSignWhere, combinedCurvesSignAction, combinedCurvesSignImage);

    public static String twoWayTrafficSignName = "Two-way traffic (W212, TW212)";
    public static String twoWayTrafficSignWhere = "On any one-way road.";
    public static String twoWayTrafficSignPurpose = "To warn that the one-way roadway you are travelling on will soon become a two-way roadway.";
    public static String twoWayTrafficSignAction = "Be aware that you are entering a roadway with two-way traffic and have to be more careful when overtaking to allow for oncoming vehicles.\n";
    public static String twoWayTrafficSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", twoWayTrafficSignWhere, twoWayTrafficSignPurpose, twoWayTrafficSignAction);
    public static Integer twoWayTrafficSignImage = R.drawable.stop;
    public static Sign twoWayTrafficSign = new Sign(twoWayTrafficSignName, twoWayTrafficSignDescription, twoWayTrafficSignPurpose, twoWayTrafficSignWhere, twoWayTrafficSignAction, twoWayTrafficSignImage);

    public static String concealedDrivewaySignName = "Concealed driveway (W216, TW216, W217, TW217, W218, TW218)";
    public static String concealedDrivewaySignWhere = crossroadSignWhere;
    public static String concealedDrivewaySignPurpose = "To warn that one or more concealed driveways enter the road you are driving on from the left or right in such a way that you cannot easily see the road or traffic travelling on that road.";
    public static String concealedDrivewaySignAction = "Slow down so that you can stop or yield if there is cross traffic that do not yield at the intersection. Remember that a driver of such a vehicle that joins your road from the concealed driveway sometimes finds it also difficult to see you.";
    public static String concealedDrivewaySignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", concealedDrivewaySignWhere, concealedDrivewaySignPurpose, concealedDrivewaySignAction);
    public static Integer concealedDrivewaySignImage = R.drawable.concealed_driveway;
    public static Sign concealedDrivewaySign = new Sign(concealedDrivewaySignName, concealedDrivewaySignDescription, concealedDrivewaySignPurpose, concealedDrivewaySignWhere, concealedDrivewaySignAction, concealedDrivewaySignImage);

    public static String laneEndsSignName = "Lane ends (W214, TW214, W215, TW215)";
    public static String laneEndsSignWhere = "On any road with more than one traffic lane in the direction you are travelling.";
    public static String laneEndsSignPurpose = "To warn that the double-lane road you are driving on narrows by a full lane from the left (W215 or TW215) or from the right-hand side (W214 or TW 214).";
    public static String laneEndsSignAction = "Depending on which sign is displayed, change in good time to the lane that carries on.\n";
    public static String laneEndsSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", laneEndsSignWhere, laneEndsSignPurpose, laneEndsSignAction);
    public static Integer laneEndsSignImage = R.drawable.dual_roadway_ends;
    public static Sign laneEndsSign = new Sign(laneEndsSignName, laneEndsSignDescription, laneEndsSignPurpose, laneEndsSignWhere, laneEndsSignAction, laneEndsSignImage);

    /********************************************************************************************************************************************************************/

    /*** Symbolic Signs ***/


    /********************************************************************************************************************************************************************/
    /********************************************************************************************************************************************************************/


    public static String parkSignName = "Park";
    public static String parkSignDescription = "I am here.";
    public static String parkSignPurpose = "Stop";
    public static String parkSignAction = "Stop";
    public static String parkSignWhere = "Stop";
    public static Integer parkSignImage = R.drawable.park;
    public static Sign parkSign = new Sign(parkSignName, parkSignDescription, parkSignPurpose, parkSignWhere, parkSignAction, parkSignImage);

    public static String noOvertakingSignName = "No Overtaking";
    public static String noOvertakingSignDescription = "I am here.";
    public static String noOvertakingSignPurpose = "Stop";
    public static String noOvertakingSignAction = "Stop";
    public static String noOvertakingSignWhere = "Stop";
    public static Integer noOvertakingSignImage = R.drawable.no_overtaking;
    public static Sign noOvertakingSign = new Sign(noOvertakingSignName, noOvertakingSignDescription, noOvertakingSignPurpose, noOvertakingSignWhere, noOvertakingSignAction, noOvertakingSignImage);

    public static String pedestrianCrossingSignName = "Pedestrian Crossing";
    public static String pedestrianCrossingSignDescription = "I am here.";
    public static String pedestrianCrossingSignPurpose = "Stop";
    public static String pedestrianCrossingSignAction = "Stop";
    public static String pedestrianCrossingSignWhere = "Stop";
    public static Integer pedestrianCrossingSignImage = R.drawable.pedestrian_crossing;
    public static Sign pedestrianCrossingSign = new Sign(pedestrianCrossingSignName, pedestrianCrossingSignDescription, pedestrianCrossingSignPurpose, pedestrianCrossingSignWhere, pedestrianCrossingSignAction, pedestrianCrossingSignImage);

    /********************************************************************************************************************************************************************/

}
