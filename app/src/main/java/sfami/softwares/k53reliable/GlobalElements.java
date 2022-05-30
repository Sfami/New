package sfami.softwares.k53reliable;
public class GlobalElements {


    static char bulletSymbol='\u2023';

    /*
     * Questions
     * */

    public static QuestionModel[] roadRulesQuestions = new QuestionModel[]{
            // New
            new QuestionModel("A driver may:", "A. In an emergency use hand signals on a freeway.","B. While the engine is running leave the vehicle unattended.","C. Let passengers ride on the outside of the vehicle.","D. Allow passengers to help steer the vehicle.",1, 0),
            new QuestionModel("An accident which no one had or has been injured must be reported within ... hours. \n(i) 24\n(ii) 72\n(iii) 48", "A. (i) only is correct.","B. (ii) only is correct.","C. (iii) only is correct.","D. None of the above are correct.",1, 0),
            new QuestionModel("If you see that someone wants to overtake you, you must:\n(i) Keep left as far as it is safe.\n(ii) Not drive faster.\n(iii) Give hand signals to allow the person to ass safely.", "A. (i) and (ii) are correct.","B. (ii) only is correct.","C. None of the above are correct.","D. All of the above are correct.",1, 0),
            new QuestionModel("You may NOT drive to the left of the edge line marking to overtake on the left:", "A. True","B. False","C. This is permitted in an emergency.","D. None of the above.",1, 0),
            new QuestionModel("Your vehicle's headlights must be switched on:\n(i) At any time of the day when you cannot see persons and vehicles 150m in front of you.\n(ii) From sunset to sunrise.\n(iii) When it rains and you cannot see vehicles 100m in front of you.", "A. (i) and (ii)","B. (i) only is correct.","C. (ii) and (iii) are correct.","D. All of the above are correct.",4, 0),
            new QuestionModel("When you drive:", "A. Always check your blind spot.","B. You must have ywo hands on the steering wheel.","C. Your vision of the road and the traffic must be unobstructed.","D. None of the above.",3, 0),
            new QuestionModel("You must give way to pedestrians:\n(i) who need to cross the freeway\n(ii) who are approaching your half of a pedestrian crossing.\n(iii) both of these", "A. (i) only is correct.","B. (ii) only is correct.","C. (iii) only is correct.","D. All of the above are correct.",2, 0),
            new QuestionModel("You may not drive a motor vehicle on a public road while the concentration of alcohol in your blood is ...", "A. 0,05 grams per 100ml of blood or more","B. 0,005 grams per 100ml of blood or more","C. 0,0005 grams per 100ml of blood or more","D. 0,5 grams per 100ml of blood or more",2, 0),
            new QuestionModel("A driver/rider should not drive/ride a vehicle on a public road ...", "A. If it does not have a sunroof.","B. In such a manner that willfully disregard the safety of individuals or property.","C. If it does not have a car stereo.","D. It is registered.",2, 0),
            new QuestionModel("If your vehicle is involved in an accident you are supposed to\n(i) Immediately stop your vehicle\n(ii) Ascertain the nature and extent of any injuries.\n(iii) Drink a bit to calm your nerves.", "A. (iii) only is correct.","B. All of the above.","C. (i) and (ii) are correct.","",2, 0),
            new QuestionModel("Vehicles must be fitted with pneumatic tyres and maintain a tread depth of at least ...", "A. 1 millimetre","B. 0.1 millimetre","C. 0.10 millimetre","",2, 0),
            new QuestionModel("A vehicle may not be used on a public road if ...", "A. The fuel tank is fitted with an effective yellow cap.","B. The fuel tank is not fitted with an effective yellow cap.","C. The fuel tank is fitted with an effective red cap.","",2, 0),
            new QuestionModel("A driver/rider of a vehicle on a public road should stop if ...\n(i) Is in compliance with an instruction conveyed by a traffic sign.\n(ii) He was signaled by a person leading or driving any bovine animal on the road.\n Animals are seen crossing the road and can only move on when all the animals have crossed and the road is safe to continue.", "A. (i) only is correct.","B. (ii) and (iii)  is correct.","C. All the above.","",2, 0),
            new QuestionModel("A driver/rider of a vehicle may not enter/cross a public road if ...", "A. There is an obstruction and moving traffic","B. The vehicle can cross the road without obstructing or endangering any traffic.","C. The road is clear of moving traffic.","",2, 0),
            new QuestionModel("You may tow another vehicle on a public road if ...", "A. The length of the tow-rope, chain or tow-bar between the two vehicles is less than 3,5 metres.","B. The length of the tow-rope, chain or tow-bar between the two vehicles is 3,5 metres.","A. The length of the tow-rope, chain or tow-bar between the two vehicles is 2,5 metres.","",2, 0),
            new QuestionModel("Which of the following vehicles are not allowed on a freeway\n(i) Vehicle drawn by animal.\n(ii) Pedal cycle.\n(iii) A tractor", "A. (i) and (ii) are correct.","B. (i) only is correct.","C. All of the above.","",2, 0),
            new QuestionModel("Pedestrians should cross a roadway only at a pedestrian crossing, at an intersection or a distance further than ... from such pedestrian or intersection crossing.", "A. 9m","B. 12m","C. 50m","",2, 0),
            new QuestionModel("When can you use your emergency warning triangle", "A. When you vehicle has broken down.","B. When parked outside a friend's house on the wrong side of the road, facing oncoming traffic.","C. When you want to stop for a lunch break next to the road.","",2, 0),
            new QuestionModel("How many windscreen wipers should a light or heavy motor vehicle have and when in operation they should wipe the outside of the windscreen continuously, evenly, and adequately.", "A. At least one windscreen wiper, to wipe the windscreen directly in front if the driver.","B. Two windscreen wipers, to clean","","",2, 0),
            new QuestionModel("A general speed limit of ... should apply in every freeway respectfully.", "A. 120 km/h","B. 100 km/h","C. 60 km/h","",2, 00),
            new QuestionModel("A vehicle is deemed abandoned if it is left for ...", "A. 5 days in an urban area.","B. 7 days in the same place on a public road within an urban area.","C. 1 day in the same place on a public road.","",2, 0),
            new QuestionModel("A cellular, mobile telephone or any other communication device should ... while driving.", "A. Be handled with both hands.","B. Be handled with one hand.","C. Not handled with either hands or any other part of the body.","",2, 0),
            new QuestionModel("A driver/rider can disobey any road traffic sign or rule of the road if ...", "A. Ordered to do so by a traffic officer.","B. He/she feels like.","C. He/she is under the influence of alcohol.","",2, 0),
            new QuestionModel("You should not park your vehicle on the roadway of a road if ...", "A. It is beyond your control.","B. You have a flat tyre.","C. It will obstruct any private or public vehicular entrance.","",2, 0),
            new QuestionModel("You should not park your vehicle on the roadway of a road within an urban area if ...", "A. You have a flat tyre.","B. It is beyond your control.","C. You are within 5 metres of any intersection.","",2, 0),
            new QuestionModel("A driver/rider of a vehicle can never ...", "A. Exceed the speed limit when overtaking/passing","B. Pass to the right at a safe distance when overtaking.","C. Have passengers when overtaking.","",2, 0),
            new QuestionModel("The driver/rider of a vehicle may not overtake another vehicle moving in the same direction on a public road when ... ", "A. He/She can do so without encroaching on the right-hand side of the roadway.","B. The roadway of such a road is restricted to vehicles moving in one direction.","C. Approaching a curve.","",2, 0),
            new QuestionModel("A load that projects more than 150 millimeters to the side or 300 millimeters to the rear must be marked by a ...", "A. Reg flag or flags (30mm x 30mm) during the day, and retro reflectors at night.","B. Reg flag or flags (100mm x 100mm) during the day, and retro reflectors at night.","C. Reg flag or flags (300mm x 300mm) during the day, and retro reflectors at night.","",2, 0),
            new QuestionModel("Goods should not be loaded on the vehicle in a way ...", "A. That is securely fastened to such vehicle.","B. That is safely contained within the body of such vehicle.","C. That they may obscure the drivers/riders view of traffic at the front, on either sides or to the rear.","",2, 0),
            new QuestionModel("A speed limit of ... should apply in respect of every public road other than a freeway situated outside an urban area.", "A. 60 km/h","B. 120 km/h","C. 100 km/h","D. 80km/h",2, 0),
            new QuestionModel("You can tow another vehicle on a public road if ...", "A. You are using a tow-rope or chain and travelling 30 km/h.","B. You are using a draw bar or a tow-bar and travelling 30 km/h.","C. You are using a chain.","D. You do not have a driver's license.",2, 0),
            new QuestionModel("A vehicle is deemed abandoned if it is left for ...", "A. 20 hours in the same place on a public road.","B. 12 hours in the same place on a public road outside an urban area.","C. 24 hours in the same place on a public road outside an urban area.","B. 48 hours in the same place on a public road outside an urban area.",2, 0),
            new QuestionModel("A South African Bureau of Standards (SABS) approved number plate should ...\n(i) be affixed in such a manner that each letter and figure thereon is clearly legible.\n(ii) be affixed in an upright position or within degrees of such position.\n(iii) have a dark background.", "A. (i) and (ii) are correct.","B. (i) only is correct.","C. All of the above.","",2, 0),
//            new QuestionModel("", "","","","",2),
            // Driver
            new QuestionModel("You may not get a learner's licence if you:", "Are over 17 years old.","You already have a licence for the same class of vehicle","Wear glasses.","60 km/h",2, 0),
            new QuestionModel("When you only have a learner's licence you are not allowed to:", "Carry passengers in your car.","Drive faster than 100 km/h.","Drive without having your licence with you.","60 km/h",1, 0),
            // Speed-limit
            new QuestionModel("If there are no speed limit signs, the general speed limit in urban areas (towns and cities) is:", "80 km/h","60 km/h","100 km/h","20 km/h",2, 0),
            new QuestionModel("The general speed limit on national roads in 100 km/h for the following vehicles:\n(1) Light motor vehicles.\n(2)Bakkies.\n(3)Passenger buses.", "(1), (2), and (3) are all true.","Only (1) and (2) are true.","Only (1) is true.","60 km/h",2, 0),
            new QuestionModel("If you do not know what the speed limit on a national is, you should:", "Pull off the road immediately.","Drive at 80 km/h","Drive at 100 km/h","60 km/h",2, 0),
            new QuestionModel("Which of the following is false?", "The maximum speed limit for tractors on public roads is 80 km/h.","Minibuses carrying passengers may never travel faster than 100 km/h"," If a road sign gives a different speed limit than 60 km/h in an urban area it must be obeyed.","60 km/h",2, 0),
            new QuestionModel("The general speed limit on freeways roads in 120 km/h for the following vehicles:\n(1) Light motor vehicles.\n(2)Bakkies.\n(3)Passenger buses.", "(1), (2), and (3) are all true.","Only (1) and (2) are true.","Only (1) is true.","60 km/h",2, 0),
            // General
            new QuestionModel("You may not:", "Overtake on the left where there is only one lane but the road is wide enough for two cars outside and urban area.","Overtake when directed to do so by an officer.","Indicate to the left when you are overtaking on the left.","",2, 0),
            new QuestionModel("Your vehicle's clearance certificate (licence disc) is valid for:", "6 months","12 months","18 months","",2, 0),
            new QuestionModel("On a public road, you are allowed to:", "Pass other vehicles on the left-hand side if they are turning right.","Pass other vehicles on the left-hand side if they are turning right as long as you don't o onto the road shoulder.","You may not pass vehicles on the left-hand side.","",2, 0),
            new QuestionModel("You may drive on the right hand side of a two-way road if:", "There is a sign prohibiting overtaking.","You did not cross any barriers or solid road markings to get there.","The closest oncoming car is 2 seconds away.","",2, 0),
            new QuestionModel("Adjustable spotlights may be used by the following people on a public road:", "Vets","Farmers","Four-wheel drive vehicles.","",2, 0),
            new QuestionModel("You may not have any ... showing on your tyre:", "Tread pattern","Steel belts","Cuts of less than 10% of the tyre width.","",2, 0),
            new QuestionModel("Your tyre tread must be deeper than:", "25mm all over","1mm all over","10mm all over","",2, 0),
            new QuestionModel("Which one is not correct?", "You may not stop facing oncoming traffic.","If you are in a traffic circle you must yield to people entering the circle in front of you.","The maximum amount of time that a vehicle can be parked in one place without moving outside an urban area is 24 hours.","",2, 0),
            new QuestionModel("The service brake of a light motor vehicle is also known as the:", "Parking brake","Emergency brake","Foot brake","",2, 0),
//            new QuestionModel("", "","","","",2),
    };

    public static QuestionModel[] roadSignsQuestions = new QuestionModel[]{
            // TEST 1
            new QuestionModel("This road sign prohibits you from doing what on a public road.", "A. To park your vehicle in that area.","B. To drive slow for the next 100m.","C. To park your vehicle at the nearest park.","D. Stopping",2, R.drawable.no_parking),
            new QuestionModel("What will you come by ahead of this warning sign?", "A. A hospital.","B. A crossroad.","C. A sharp curve.","D. A 4-way road.",2, R.drawable.crossroads),
            new QuestionModel("This road sign prohibits you from doing what on a public road.", "A. To use your hooter at other road users.","B. To use your hooter and make sure the noise level of your vehicle is very low.","C. To play loud music from your stereo.","",2, R.drawable.no_parking),
            new QuestionModel("This road sign reminds you of a ...", "A. A town ahead.","B. Right turn ahead.","C. T-Junction ahead.","D. Crossroads ahead.",2, R.drawable.t_junction),
            new QuestionModel("This road sign disallows you from ... ", "A. Driving for 6 hours without stopping.","B. Using hand signals for other road users.","C. Picking up passengers or hitchhikers for the next 500m.","",2, R.drawable.no_hiking),
            new QuestionModel("This road sign warns you of what?", "A. A dual roadway ending.","B. A dual roadway beginning.","C. Road widening.","",2, 0),
            new QuestionModel("What does this road sign forbid you from doing?", "A. Entering a certain road or section of a road without special authorisation.","B. Driving your vehicle on the two solid line.","C. Overtaking another vehicle.","D. Parking in that area.",2, R.drawable.unauthorised_vehicles),
            new QuestionModel("The road sign warns you of a ... ", "A. Primary school ahead.","B. Traffic signals ahead.","C. Pedestrian crossing ahead.","",2, 0),
            new QuestionModel("What does this road sign prevent you from doing?", "A. Using hand signals.","B Turning left at an intersection.","C. Driving on the left lane of the road.","",2, R.drawable.no_left_turn),
            new QuestionModel("What will you come by ahead of this warning sign.", "A. A yield sign.","B. A traffic circle.","C. A stop sign.","",2, R.drawable.yield),
            new QuestionModel("This road sign warns you of what?", "A. A demarcated pedestrian crossing ahead.","B. A primary school.","C. Pedestrian walking ahead.","",2, R.drawable.pedestrian_crossing),
            new QuestionModel("Which vehicle type is allowed on this part of the road?", "A. Only mini-buses may drive there.","A. Only buses may drive there.","A. Only tour buses may drive there.","",2, R.drawable.buses_only),
            new QuestionModel("This road sign warns you of a ... ", "A. Dead end ahead.","B. Gravel road beginning ahead.","C. T-Junction ahead.","",2, R.drawable.gravel_begins),
            new QuestionModel("Which vehicle type is allowed on this part of the road?", "A. Construction vehicles.","B. Buses.","C. Delivery vehicles.","",2, R.drawable.construction_vehicles_only),
            new QuestionModel("What does this road sign warn you about?", "A. The road ahead is closed.","B. There is a gate on this road ahead.","C. The road narrows when crossing the bridge.","",3, 0),
            new QuestionModel("What does this road sign command?.", "A. Only buses are allowed here.","B. Only abnormal vehicles are allowed here.","C. Only vehicles carrying dangerous substances are allowed here.","",2, R.drawable.abnormal_vehicles_only),
            new QuestionModel("This road sign warns you of what?", "A. A one vehicle width structure ahead.","B. Only taxis may drive there.","C. A bus reservation only ahead.","",1, 0),
            new QuestionModel("This road sign commands that only ... may use this part of the road.", "A. Motor cars.","B. Animal drawn vehicles.","C. Rickshaws","",3, 0),
            new QuestionModel("This road sign warns you of what?", "A. Two way road ahead.","B Road narrows fro both sides ahead.","C. Pedestrian crossing ahead.","",2, 0),
            new QuestionModel("What should be your reaction when you approach this road sign?", "A. Switch headlamps on.","B. Turn up the volume of your stereo.","C. Drive at high speed.","",1, R.drawable.headlights_on),
            new QuestionModel("This road sign informs you of what?", "A. A tunnel ahead.","B. A pay toll.","C. A truck toll ahead. ","",2, 0),
            new QuestionModel("How should vehicle drivers react to this road marking?\n(i) Do not drive on this part of the road.\n(ii) You can park to change your tyre.\n(iii) You may stop for a break.", "A. (i), (ii), and (iii) are correct.","B. (i) and (ii) are correct.","C. (i) only is correct.","",2, 0),
            new QuestionModel("What should you do when you come across this road sign?", "A. Drive around in circles without stopping.","B. U-turn","C. Drive in a clockwise direction at the junction if it is safe to do so.","",2, R.drawable.traffic_circle),
            new QuestionModel("This road marking informs drivers that ...", "A. Parking is prohibited in this area.","B. You may park your vehicle here.","C. Mall parking lot available.","",2, 0),
            new QuestionModel("This road sign commands what?", "A. Only taxis may drive there.","B. Only motor cars may drive there.","C. Only mini-buses may drive there.","",2, 0),
            new QuestionModel("When approaching one of this road markings a driver should ... ", "A. Only stop when directed to do so by s traffic officer.","B. Drive for 60km without stopping.","C. Only proceed in the direction indicated by the arrow in your lane.","",2, 0),
            new QuestionModel("This road sign commands that only ... may use this part of the road.", "A. Motor cars.","B. Animal-drawn vehicles.","C. Rickshaws","",2, 0),
            new QuestionModel("What should be your reaction when you approach this road marking at a parking bay?\n(i) Park your vehicle at any spot you like.\n(ii) Parking available only for an ambulance.\n(iii) For emergency you may park on the SOS sign.", "","","","",2, 0),
            new QuestionModel("This road sign commands that only ... may use this part of the road.", "A. Vehicles with a (GVM) less or equal the mass indicated on the sign.","B. Vehicles with a (GVM) less than the mass indicated on the sign.","C. Vehicles with a (GVM) exceeding the mass indicated on the sign.","",2, R.drawable.max_mass_limit),
            new QuestionModel("This road marking warns road users that ...", "A. This part of the road may not be used by buses.","B. This part of the road is for buses only.","C. This part of the road may be used by pedestrians as a bus stop.","",2, R.drawable.bus_lane_reservation),
//            new QuestionModel("What does this flag signal mean?", "A. Vehicles turning to the right may proceed.","B. Slow down and stop before reaching the flagman.","C. Potential hazard ahead. Proceed slowly and be alert.","",3, 0),
//            new QuestionModel("What does this warn you about?", "A. That the traffic may be approaching you from the right hand side.","B. That the traffic may be approaching you from the left hand side.","C. That the traffic may be approaching you straight ahead.","",2, 0),
//            new QuestionModel("What actions must you take when you see this sign?", "A. You may not turn left at the next intersection.","B. You must only turn right.","C. You may proceed either straight or turn right.","",2, 0),
//            new QuestionModel("This command sign informs you that this part of the road may be used by ...", "A. Heavy motor vehicles.","B. Light motor vehicles.","C. Construction vehicles.","",2, 0),
//            new QuestionModel("What do you do when you see this sign?", "A. Give right of way to pedestrians.","B. Leave your vehicle and travel by foot.","C. Control the traffic.","",2, 0),
//            new QuestionModel("This sign tells you to be on the lookout for what?", "A. Temporary construction or maintenance works ahead.","B. Pedestrians ahead.","C. Road block ahead.","",2, 0),
//            new QuestionModel("Where would you find this type of road sign?", "A. On the left hand side of a freeway about 2km after entering the freeway and every 20km thereafter.","B. On the far right hand side of any road before an intersection leading to a freeway.","C. On the left hand side of the road about 750m after entering a freeway and after that every 5 to 10km.","",2, 0),
//            new QuestionModel("This road marking is a ...", "A. Painted island where you are not allowed to drive on or stop.","B. Pedestrian crossing where you must stop for pedestrians.","C. Chevron that indicates a curve to the left.","",2, 0),
//            new QuestionModel("How should a driver respond to this road sign?", "A. Make sure, in time that there is a big enough gap in the traffic to merge with other traffic. Also yield to other traffic, which might merge.","B. Keep to the left and drive over the painted island, if necessary, until you can safely merge with traffic.","C. If you are driving in the lane that has to merge, you must drive to the front and stop. Only move off once it is safe to do so.","",2, 0),
//            new QuestionModel("This sign indicates:", "A. The minimum speed limit","B. The maximum speed limit","C. The distance to the next town.","",2, 0),
//            new QuestionModel("What does this sign tell vehicle drivers?", "A. A freeway begins and all freeway rules are effective now.","B. The road widens ahead.","C. There is a bridge ahead.","",2, 0),
//            new QuestionModel("What is the purpose of this sign?", "A. To warn you of heavy cross winds on the road.","B. To warn that the one-way street you are driving on will soon be crossed by a street that carries two-way traffic.","C. To warn you about construction vehicles entering and crossing the road ahead.","",2, 0),
//            new QuestionModel("This sign tells you to:", "A. Turn left if you want to","B. Look out for vehicles turning left","C. Proceed left only","",2, 0),
//            new QuestionModel("", "","","","",2),
//            new QuestionModel("", "","","","",2),
//            new QuestionModel("", "","","","",2),
    };

    public static QuestionModel[] vehicleControlsQuestions = new QuestionModel[]{
            new QuestionModel("Which control is used to keep the vehicle stationary after parking?", "A. 6","B. 9","C. 7","D. 11",3, R.drawable.light_motor_manual_controls),
            new QuestionModel("The ... is NOT found in an automatic vehicle.", "A. 8","B. 5","C. 3","D. 9",1, R.drawable.light_motor_manual_controls),
            new QuestionModel("The following control is used to alert other road users in order to avoid a collision?", "A. 11","B. 7","C. 4","D. 9",1, R.drawable.light_motor_manual_controls),
            new QuestionModel("Which control is used when you want to stop on a steep incline and preventing the vehicle from rolling backwards?", "A. 7","B. 8","C. 9","D. 3",1, R.drawable.light_motor_manual_controls),
            new QuestionModel("Which controls must be used in combination immediately before coming to a standstill?", "A. 8, 6 and 9.","B. 2, 6, and 7","C. 2, 5, and 1.","D. 6, 2, and 4",1, R.drawable.light_motor_manual_controls),
            new QuestionModel("Use ... to keep your vehicle stationary after parking", "A. 7","B. 5","C. 2","D. 3",1, R.drawable.light_motor_manual_controls),
            new QuestionModel("The control used to steer the vehicle to the left or right is?", "A. 3","B. 5","C. 4","D. 6",3, R.drawable.light_motor_manual_controls),
    };

    public static QuestionModel[] K53TestQuestions = new QuestionModel[]{
//            new QuestionModel("", "","","","",2),
            roadRulesQuestions[0],
            roadRulesQuestions[1],
            roadRulesQuestions[2],
            roadRulesQuestions[3],
            roadRulesQuestions[4],
            roadRulesQuestions[5],
            roadRulesQuestions[6],
            roadRulesQuestions[7],
            roadRulesQuestions[8],
            roadRulesQuestions[9],
            roadRulesQuestions[10],
            roadRulesQuestions[11],
            roadRulesQuestions[12],
            roadRulesQuestions[13],
            roadRulesQuestions[14],
            roadRulesQuestions[15],
            roadRulesQuestions[16],
            roadRulesQuestions[17],
            roadRulesQuestions[18],
            roadRulesQuestions[19],
            roadRulesQuestions[20],
            roadRulesQuestions[21],
            roadRulesQuestions[22],
            roadRulesQuestions[23],
            roadRulesQuestions[24],
            roadRulesQuestions[25],
            roadRulesQuestions[26],
            roadRulesQuestions[27],
            roadRulesQuestions[28],
            roadRulesQuestions[29],

            roadSignsQuestions[0],
            roadSignsQuestions[1],
            roadSignsQuestions[2],
            roadSignsQuestions[3],
            roadSignsQuestions[4],
            roadSignsQuestions[5],
            roadSignsQuestions[6],
            roadSignsQuestions[7],
            roadSignsQuestions[8],
            roadSignsQuestions[9],
            roadSignsQuestions[10],
            roadSignsQuestions[11],
            roadSignsQuestions[12],
            roadSignsQuestions[13],
            roadSignsQuestions[14],
            roadSignsQuestions[15],
            roadSignsQuestions[16],
            roadSignsQuestions[17],
            roadSignsQuestions[18],
            roadSignsQuestions[19],
            roadSignsQuestions[20],
            roadSignsQuestions[21],
            roadSignsQuestions[22],
            roadSignsQuestions[23],
            roadSignsQuestions[24],
            roadSignsQuestions[25],
            roadSignsQuestions[26],
            roadSignsQuestions[27],
            roadSignsQuestions[28],
            roadSignsQuestions[29],

            vehicleControlsQuestions[0],
            vehicleControlsQuestions[1],
            vehicleControlsQuestions[2],
            vehicleControlsQuestions[3],
            vehicleControlsQuestions[4],
            vehicleControlsQuestions[5],
            vehicleControlsQuestions[6],
    };
    /*
     * Signs
     * */

    /* Control Signs */

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

    /* Command Signs */

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

//    public static String keepRightSignName = "Keep Right";
//    public static String keepRightSignWhere = "Railway Crossings, Intersections, and Scholar Patrols";
//    public static String keepRightSignPurpose = "Bring traffic to a stop.";
//    public static String keepRightSignAction = "Bring vehicles to a stop behind the line. " +
//            "When there is no stop line, the front of the vehicle must be in line with the stop sign. " +
//            "You may not drive off before all the other vehicles which stopped before you have moved off in a three-way or four-way stop. " +
//            "Continue only when it is safe.";
//    public static String keepRightSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", keepRightSignWhere, keepRightSignWhere, keepRightSignAction);
//    public static Integer keepRightSignImage = R.drawable.stop;
//    public static Sign keepRightSign = new Sign(keepRightSignName, keepRightSignDescription, keepRightSignPurpose, keepRightSignWhere, keepRightSignAction, keepRightSignImage);


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

    /* Prohibition Signs */

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

    /* Reservation Signs */

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

    /* Comprehensive Signs */

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

    /* De-Restriction Signs */

    /********************************************************************************************************************************************************************/

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

    public static String regulatorySignsSignName = "Regulatory Signs";
    public static String regulatorySignsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static String regulatorySignsPurpose = "Stop";
    public static String regulatorySignsWhere = "Stop";
    public static String regulatorySignsAction = "Stop";
    public static Integer regulatorySignsImage = R.drawable.freeway;
    public static Sign regulatorySignsSign = new Sign(regulatorySignsSignName, regulatorySignsDescription, regulatorySignsPurpose, regulatorySignsWhere, regulatorySignsAction, regulatorySignsImage);

    public static String warningSignsSignName = "Warning Signs";
    public static String warningSignsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static String warningSignsPurpose = "Stop";
    public static String warningSignsWhere = "Stop";
    public static String warningSignsAction = "Stop";
    public static Integer warningSignsImage = R.drawable.no_u_turn;
    public static Sign warningSignsSign = new Sign(warningSignsSignName, warningSignsDescription, warningSignsPurpose, warningSignsWhere, warningSignsAction, warningSignsImage);

    public static String guidanceSignsSignName = "Guidance Signs";
    public static String guidanceSignsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static String guidanceSignsPurpose = "Stop";
    public static String guidanceSignsWhere = "Stop";
    public static String guidanceSignsAction = "Stop";
    public static Integer guidanceSignsImage = R.drawable.guidance;
    public static Sign guidanceSignsSign = new Sign(guidanceSignsSignName, guidanceSignsDescription, guidanceSignsPurpose, guidanceSignsWhere, guidanceSignsAction, guidanceSignsImage);


    public static String temporarySignsSignName = "Temporary Signs";
    public static String temporarySignsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static String temporarySignsPurpose = "Stop";
    public static String temporarySignsWhere = "Stop";
    public static String temporarySignsAction = "Stop";
    public static Integer temporarySignsImage = R.drawable.temporary;
    public static Sign temporarySignsSign = new Sign(temporarySignsSignName, temporarySignsDescription, temporarySignsPurpose, temporarySignsWhere, temporarySignsAction, temporarySignsImage);

    public static String roadMarkingsSignName = "Road Markings";
    public static String roadMarkingsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static String roadMarkingsPurpose = "Stop";
    public static String roadMarkingsWhere = "Stop";
    public static String roadMarkingsAction = "Stop";
    public static Integer roadMarkingsImage = R.drawable.road_markings;
    public static Sign roadMarkingsSign = new Sign(roadMarkingsSignName, roadMarkingsDescription, roadMarkingsPurpose, roadMarkingsWhere, roadMarkingsAction, roadMarkingsImage);


    public static String controlSignsSignName = "Control Signs";
    public static String controlSignsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static String controlSignsPurpose = "Stop";
    public static String controlSignsAction = "Stop";
    public static String controlSignsWhere = "Stop";
    public static Integer controlSignsImage = R.drawable.yield;
    public static Sign controlSignsSign = new Sign(controlSignsSignName, controlSignsDescription, controlSignsPurpose, controlSignsWhere, controlSignsAction, controlSignsImage);

    public static String commandSignsSignName = "Command Signs";
    public static String commandSignsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static String commandSignsPurpose = "Stop";
    public static String commandSignsAction = "Stop";
    public static String commandSignsWhere = "Stop";
    public static Integer commandSignsImage = R.drawable.keep_left;
    public static Sign commandSignsSign = new Sign(commandSignsSignName, commandSignsDescription, commandSignsPurpose, commandSignsWhere, commandSignsAction, commandSignsImage);

    public static String prohibitionsSignsSignName = "Prohibitions Signs";
    public static String prohibitionsSignsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static String prohibitionsSignsPurpose = "Stop";
    public static String prohibitionsSignsAction = "Stop";
    public static String prohibitionsSignsWhere = "Stop";
    public static Integer prohibitionsSignsImage = R.drawable.prohibition;
    public static Sign prohibitionsSignsSign = new Sign(prohibitionsSignsSignName, prohibitionsSignsDescription, prohibitionsSignsPurpose, prohibitionsSignsWhere, prohibitionsSignsAction, prohibitionsSignsImage);

    public static String reservationSignsSignName = "Reservation Signs";
    public static String reservationSignsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static String reservationSignsPurpose = "Stop";
    public static String reservationSignsAction = "Stop";
    public static String reservationSignsWhere = "Stop";
    public static Integer reservationSignsImage = R.drawable.reservations;
    public static Sign reservationSignsSign = new Sign(reservationSignsSignName, reservationSignsDescription, reservationSignsPurpose, reservationSignsWhere, reservationSignsAction, reservationSignsImage);

    public static String comprehensiveSignsSignName = "Comprehensive Signs";
    public static String comprehensiveSignsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static String comprehensiveSignsPurpose = "Stop";
    public static String comprehensiveSignsAction = "Stop";
    public static String comprehensiveSignsWhere = "Stop";
    public static Integer comprehensiveSignsImage = R.drawable.freeway;
    public static Sign comprehensiveSignsSign = new Sign(comprehensiveSignsSignName, comprehensiveSignsDescription, comprehensiveSignsPurpose, comprehensiveSignsWhere, comprehensiveSignsAction, comprehensiveSignsImage);

    public static String secondarySignsSignName = "Secondary Signs";
    public static String secondarySignsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static String secondarySignsPurpose = "Stop";
    public static String secondarySignsAction = "Stop";
    public static String secondarySignsWhere = "Stop";
    public static Integer secondarySignsImage = R.drawable.time_restriction;
    public static Sign secondarySignsSign = new Sign(secondarySignsSignName, secondarySignsDescription, secondarySignsPurpose, secondarySignsWhere, secondarySignsAction, secondarySignsImage);

    public static String deRestrictionSignsSignName = "De-Restriction Sign";
    public static String deRestrictionSignsWhere = "";
    public static String deRestrictionSignsPurpose = "To cancel a restriction.";
    public static String deRestrictionSignsAction = "From here you do not have to comply with the restriction sign with a symbol similar to this sign but without the red cross.";
    public static String deRestrictionSignsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static Integer deRestrictionSignsImage = R.drawable.headlights_off;
    public static Sign deRestrictionSignsSign = new Sign(deRestrictionSignsSignName, deRestrictionSignsDescription, deRestrictionSignsPurpose, deRestrictionSignsWhere, deRestrictionSignsAction, deRestrictionSignsImage);


    public static String locationSignsSignName = "Location Signs";
    public static String locationSignsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static String locationSignsPurpose = "Stop";
    public static String locationSignsAction = "Stop";
    public static String locationSignsWhere = "Stop";
    public static Integer locationSignsImage = R.drawable.pedestrian_crossing;
    public static Sign locationSignsSign = new Sign(locationSignsSignName, locationSignsDescription, locationSignsPurpose, locationSignsWhere, locationSignsAction, locationSignsImage);


    /********************************************************************************************************************************************************************/

    public static String directionSignSymbolsSignName = "Direction Sign Symbols";
    public static String directionSignSymbolsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static String directionSignSymbolsPurpose = "Stop";
    public static String directionSignSymbolsAction = "Stop";
    public static String directionSignSymbolsWhere = "Stop";
    public static Integer directionSignSymbolsImage = R.drawable.side_road;
    public static Sign directionSignSymbolsSign = new Sign(directionSignSymbolsSignName, directionSignSymbolsDescription, directionSignSymbolsPurpose, directionSignSymbolsWhere, directionSignSymbolsAction, directionSignSymbolsImage);

    /********************************************************************************************************************************************************************/

    public static String routeMarkersSignName = "Route Markers";
    public static String routeMarkersDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
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
    public static String directionSignsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
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
    public static String diagrammaticSignsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
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
    public static String tourismDirectionSignsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static String tourismDirectionSignsPurpose = "Stop";
    public static String tourismDirectionSignsAction = "Stop";
    public static String tourismDirectionSignsWhere = "Stop";
    public static Integer tourismDirectionSignsImage = R.drawable.pedestrian_crossing;
    public static Sign tourismDirectionSignsSign = new Sign(tourismDirectionSignsSignName, tourismDirectionSignsDescription, tourismDirectionSignsPurpose, tourismDirectionSignsWhere, tourismDirectionSignsAction, tourismDirectionSignsImage);


    public static String localDirectionSignsSignName = "Local Direction Signs";
    public static String localDirectionSignsDescription =String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static String localDirectionSignsPurpose = "Stop";
    public static String localDirectionSignsAction = "Stop";
    public static String localDirectionSignsWhere = "Stop";
    public static Integer localDirectionSignsImage = R.drawable.prohibition;
    public static Sign localDirectionSignsSign = new Sign(localDirectionSignsSignName, localDirectionSignsDescription, localDirectionSignsPurpose, localDirectionSignsWhere, localDirectionSignsAction, localDirectionSignsImage);

    /********************************************************************************************************************************************************************/

    public static String signalsSignName = "Signals";
    public static String signalsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
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
    public static String otherRegulatorySignalsSignWhere = crossroadSignWhere;
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
    public static String proceedSignalSignWhere = crossroadSignWhere;
    public static String proceedSignalSignPurpose = "Indicates to the driver that he/she may proceed";
    public static String proceedSignalSignAction = otherRegulatorySignalsSignAction;
    public static String proceedSignalSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", proceedSignalSignWhere, proceedSignalSignPurpose, proceedSignalSignAction);
    public static Integer proceedSignalSignImage = R.drawable.signal_proceed1;
    public static Sign proceedSignalSign = new Sign(proceedSignalSignName, proceedSignalSignDescription, proceedSignalSignPurpose, proceedSignalSignWhere, proceedSignalSignAction, proceedSignalSignImage);

    public static String proceedFlagSignalSignName = "Proceed flag signal";
    public static String proceedFlagSignalSignWhere = crossroadSignWhere;
    public static String proceedFlagSignalSignPurpose = "To direct traffic in areas where there is road works ahead, herdsman leading cattle or other animals across or next to a roadway.";
    public static String proceedFlagSignalSignAction = "";
    public static String proceedFlagSignalSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", proceedFlagSignalSignWhere, proceedFlagSignalSignWhere, proceedFlagSignalSignAction);
    public static Integer proceedFlagSignalSignImage = R.drawable.flag_proceed;
    public static Sign proceedFlagSignalSign = new Sign(proceedFlagSignalSignName, proceedFlagSignalSignDescription, proceedFlagSignalSignPurpose, proceedFlagSignalSignWhere, proceedFlagSignalSignAction, proceedFlagSignalSignImage);

    public static String stopFlagSignalSignName = "Stop flag signal";
    public static String stopFlagSignalSignWhere = crossroadSignWhere;
    public static String stopFlagSignalSignPurpose = "To direct traffic in areas where there is road works ahead, herdsman leading cattle or other animals across or next to a roadway.";
    public static String stopFlagSignalSignAction = "";
    public static String stopFlagSignalSignDescription = String.format("Where:\n%s\n\nPurpose:\n%s\n\nAction:\n%s", stopFlagSignalSignWhere, stopFlagSignalSignWhere, stopFlagSignalSignAction);
    public static Integer stopFlagSignalSignImage = R.drawable.flag_stop;
    public static Sign stopFlagSignalSign = new Sign(stopFlagSignalSignName, stopFlagSignalSignDescription, stopFlagSignalSignPurpose, stopFlagSignalSignWhere, stopFlagSignalSignAction, stopFlagSignalSignImage);

    public static String warningFlagSignalSignName = "Warning flag signal";
    public static String warningFlagSignalSignWhere = crossroadSignWhere;
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
    public static String variableMessageSignsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static String variableMessageSignsPurpose = "Stop";
    public static String variableMessageSignsAction = "Stop";
    public static String variableMessageSignsWhere = "Stop";
    public static Integer variableMessageSignsImage = R.drawable.time_restriction;
    public static Sign variableMessageSignsSign = new Sign(variableMessageSignsSignName, variableMessageSignsDescription, variableMessageSignsPurpose, variableMessageSignsWhere, variableMessageSignsAction, variableMessageSignsImage);

    public static String regulatorySignName = "Regulatory";
    public static String regulatoryDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static String regulatoryPurpose = "Stop";
    public static String regulatoryAction = "Stop";
    public static String regulatoryWhere = "Stop";
    public static Integer regulatoryImage = R.drawable.turn_left;
    public static Sign regulatorySign = new Sign(regulatorySignName, regulatoryDescription, regulatoryPurpose, regulatoryWhere, regulatoryAction, regulatoryImage);

    public static String warningSignName = "Warning";
    public static String warningDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static String warningPurpose = "Stop";
    public static String warningAction = "Stop";
    public static String warningWhere = "Stop";
    public static Integer warningImage = R.drawable.road_markings;
    public static Sign warningSign = new Sign(warningSignName, warningDescription, warningPurpose, warningWhere, warningAction, warningImage);

    public static String guidanceSignName = "Guidance";
    public static String guidanceDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static String guidancePurpose = "Stop";
    public static String guidanceAction = "Stop";
    public static String guidanceWhere = "Stop";
    public static Integer guidanceImage = R.drawable.road_markings;
    public static Sign guidanceSign = new Sign(guidanceSignName, guidanceDescription, guidancePurpose, guidanceWhere, guidanceAction, guidanceImage);

    public static String exclusiveUseSymbolsSignName = "Exclusive Use Symbols";
    public static String exclusiveUseSymbolsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static String exclusiveUseSymbolsPurpose = "Stop";
    public static String exclusiveUseSymbolsAction = "Stop";
    public static String exclusiveUseSymbolsWhere = "Stop";
    public static Integer exclusiveUseSymbolsImage = R.drawable.temporary;
    public static Sign exclusiveUseSymbolsSign = new Sign(exclusiveUseSymbolsSignName, exclusiveUseSymbolsDescription, exclusiveUseSymbolsPurpose, exclusiveUseSymbolsWhere, exclusiveUseSymbolsAction, exclusiveUseSymbolsImage);


    public static String roadLayoutSignsSignName = "Road Layout Signs";
    public static String roadLayoutSignsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static String roadLayoutSignsPurpose = "Stop";
    public static String roadLayoutSignsAction = "Stop";
    public static String roadLayoutSignsWhere = "Stop";
    public static Integer roadLayoutSignsImage = R.drawable.crossroads;
    public static Sign roadLayoutSignsSign = new Sign(roadLayoutSignsSignName, roadLayoutSignsDescription, roadLayoutSignsPurpose, roadLayoutSignsWhere, roadLayoutSignsAction, roadLayoutSignsImage);

    public static String directionOfMovementSignsSignName = "Direction of Movement Signs";
    public static String directionOfMovementSignsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static String directionOfMovementSignsPurpose = "Stop";
    public static String directionOfMovementSignsAction = "Stop";
    public static String directionOfMovementSignsWhere = "Stop";
    public static Integer directionOfMovementSignsImage = R.drawable.gentle_curve;
    public static Sign directionOfMovementSignsSign = new Sign(directionOfMovementSignsSignName, directionOfMovementSignsDescription, directionOfMovementSignsPurpose, directionOfMovementSignsWhere, directionOfMovementSignsAction, directionOfMovementSignsImage);

    public static String symbolicSignsSignName = "Symbolic Signs";
    public static String symbolicSignsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static String symbolicSignsPurpose = "Stop";
    public static String symbolicSignsAction = "Stop";
    public static String symbolicSignsWhere = "Stop";
    public static Integer symbolicSignsImage = R.drawable.robot_ahead;
    public static Sign symbolicSignsSign = new Sign(symbolicSignsSignName, symbolicSignsDescription, symbolicSignsPurpose, symbolicSignsWhere, symbolicSignsAction, symbolicSignsImage);

    public static String hazardMarkerSignsSignName = "Hazard Marker Signs";
    public static String hazardMarkerSignsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static String hazardMarkerSignsPurpose = "Stop";
    public static String hazardMarkerSignsAction = "Stop";
    public static String hazardMarkerSignsWhere = "Stop";
    public static Integer hazardMarkerSignsImage = R.drawable.hazard;
    public static Sign hazardMarkerSignsSign = new Sign(hazardMarkerSignsSignName, hazardMarkerSignsDescription, hazardMarkerSignsPurpose, hazardMarkerSignsWhere, hazardMarkerSignsAction, hazardMarkerSignsImage);

    public static String informationSignsSignName = "Information Signs";
    public static String informationSignsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static String informationSignsPurpose = "Stop";
    public static String informationSignsAction = "Stop";
    public static String informationSignsWhere = "Stop";
    public static Integer informationSignsImage = R.drawable.information;
    public static Sign informationSignsSign = new Sign(informationSignsSignName, informationSignsDescription, informationSignsPurpose, informationSignsWhere, informationSignsAction, informationSignsImage);


    public static String exampleOfTemporarySignsSignName = "Example of Temporary Signs";
    public static String exampleOfTemporarySignsDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
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
    public static String regulatoryMarkingsSignDescription =  String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static Integer regulatoryMarkingsSignImage = R.drawable.stop_line;
    public static Sign regulatoryMarkingsSign = new Sign(regulatoryMarkingsSignName, regulatoryMarkingsSignDescription, regulatoryMarkingsSignPurpose, regulatoryMarkingsSignWhere, regulatoryMarkingsSignAction, regulatoryMarkingsSignImage);

    public static String warningMarkingsSignName = "Warning Markings";
    public static String warningMarkingsSignWhere = "Railway Crossings, Intersections, and Scholar Patrols";
    public static String warningMarkingsSignPurpose = "Bring traffic to a stop.";
    public static String warningMarkingsSignAction = "Bring vehicles to a stop behind the line. " +
            "When there is no stop line, the front of the vehicle must be in line with the stop sign. " +
            "You may not drive off before all the other vehicles which stopped before you have moved off in a three-way or four-way stop. " +
            "Continue only when it is safe.";
    public static String warningMarkingsSignDescription = String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static Integer warningMarkingsSignImage = R.drawable.yield_lane;
    public static Sign warningMarkingsSign = new Sign(warningMarkingsSignName, warningMarkingsSignDescription, warningMarkingsSignPurpose, warningMarkingsSignWhere, warningMarkingsSignAction, warningMarkingsSignImage);

    public static String guidanceMarkingsSignName = "Guidance Markings";
    public static String guidanceMarkingsSignWhere = "Railway Crossings, Intersections, and Scholar Patrols";
    public static String guidanceMarkingsSignPurpose = "Bring traffic to a stop.";
    public static String guidanceMarkingsSignAction = "Bring vehicles to a stop behind the line. " +
            "When there is no stop line, the front of the vehicle must be in line with the stop sign. " +
            "You may not drive off before all the other vehicles which stopped before you have moved off in a three-way or four-way stop. " +
            "Continue only when it is safe.";
    public static String guidanceMarkingsSignDescription =  String.format("Examples include:\n%s\n%s", stopSignName, yieldSignName);
    public static Integer guidanceMarkingsSignImage = R.drawable.road_markings;
    public static Sign guidanceMarkingsSign = new Sign(guidanceMarkingsSignName, guidanceMarkingsSignDescription, guidanceMarkingsSignPurpose, guidanceMarkingsSignWhere, guidanceMarkingsSignAction, guidanceMarkingsSignImage);


//    public static String SignName = "Road Markings";
//    public static String Description = "I am here.";
//    public static String Purpose = "Stop";
//    public static String Action = "Stop";
//    public static String Where = "Stop";
//    public static Integer Image = R.drawable.pedestrian_crossing;
//    public static Sign Sign = new Sign(parkSignName, parkSignDescription, parkSignPurpose, parkSignWhere, parkSignAction, parkSignImage);

//    public static String SignName = "Stop";
//    public static String Description = "I am here.";
//    public static String Purpose = "Stop";
//    public static String Action = "Stop";
//    public static String Where = "Stop";
//    public static Integer Image = R.drawable.pedestrian_crossing;
//    public static Sign Sign = new Sign(parkSignName, parkSignDescription, parkSignPurpose, parkSignWhere, parkSignAction, parkSignImage);

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


//    public static String Title = "Stop";
//    public static String Description = "I am here.";
//    public static String Purpose = "Stop";
//    public static String Action = "Stop";
//    public static String Where = "Stop";
//    public static Integer Image = R.drawable.pedestrian_crossing;
//    public static Sign Sign = new Sign(parkSignName, parkSignDescription, parkSignPurpose, parkSignWhere, parkSignAction, parkSignImage);



    /*
     * Rules
     * */

    public static String lightsRulesTitle = "LIGHTS";
    public static String lightsRulesInstruction = "Motorcycles\n\n" +
            "1. You may not operate any motorcycle, on a public road unless all lamps fitted to such motorcycles are undamaged, properly secured and capable of being lighted at all times.\n\n" +
            "2. When riding a motorcycle on a public road, the headlamp must be lighted at all times. (During night and day)\n\n" +
            "Light and Heavy Motor Vehicles\n\n" +
            "1. When using any light or heavy motor vehicle on a public road; all lamps must be undamaged, not obscured, properly secured, and capable of being lit at all times; \n\n" +
            "2. The headlamps, rear lamps and number plate lamps must be kept lighted during the period;\n" + bulletSymbol +
            " between sunset and sunrise, and \n" + bulletSymbol +
            " at any other time when, due to insufficient light or unfavourable weather conditions, persons and vehicles upon the public road are not clearly discernible at a distance of 150 metres. \n\n" +
            "3. Provided that these provisions shall not apply to a motor vehicle, which is parked;\n" + bulletSymbol +
            " off the roadway of a public road, \n" + bulletSymbol +
            " in a parking place demarcated by an appropriate road traffic sign, or\n" + bulletSymbol +
            " within a distance of 12 metres from a lighted street lamp illuminating the road on which such vehicle is parked.\n";
    public static Integer lightsRulesImage = 0;
    public static Rule lightsRules = new Rule(lightsRulesTitle, lightsRulesInstruction, lightsRulesImage);

    public static String mainBeamOrBrightRulesTitle = "MAIN BEAM (BRIGHT)";
    public static String mainBeamOrBrightRulesInstruction = "1. Every headlamp emitting a main-beam (bright), must be so adjusted and maintained that it shall be capable of adequately illuminating an area ahead of the motor vehicle, enabling the driver/rider to see any person, vehicle or substantial object at a distance of at least 100 metres.\n\n" +
            "2. Remember to dip the main-beam (bright) of your vehicle for oncoming traffic, as well as when following another vehicle.\n";
    public static Integer mainBeamOrBrightRulesImage = 0;
    public static Rule mainBeamOrBrightRules = new Rule(mainBeamOrBrightRulesTitle, mainBeamOrBrightRulesInstruction, mainBeamOrBrightRulesImage);

    public static String dipBeamRulesTitle = "DIPPED BEAM";
    public static String dipBeamRulesInstruction = "1. Every headlamp emitting a dipped-beam must be so adjusted and maintained to be capable of adequately illuminating an area ahead of the motor vehicle, enabling the driver/rider to see any person, vehicle or substantial object at a distance of at least 45 metres ahead of the motor vehicle.\n";
    public static Integer dipBeamRulesImage = 0;
    public static Rule dipBeamRules = new Rule(dipBeamRulesTitle, dipBeamRulesInstruction, dipBeamRulesImage);

    public static String parkingLampsRulesTitle = "PARKING LAMPS";
    public static String parkingLampsRulesInstruction = "1. A vehicle may not be driven on a public road with only the parking lamps lighted while such vehicle is in motion.\n";
    public static Integer parkingLampsRulesImage = 0;
    public static Rule parkingLampsRules = new Rule(parkingLampsRulesTitle, parkingLampsRulesInstruction, parkingLampsRulesImage);

    public static String rearLampsRulesTitle = "REAR LAMPS";
    public static String rearLampsRulesInstruction = "1. You may not ride any motorcycle or a motor tricycle on a public road unless such cycle is fitted with a rear lamp emitting a red light to the rear.\n\n" +
            "2. You may not drive a light motor vehicle on a public road unless it is fitted with lamps at the rear, emitting a red light to the rear.\n\n" +
            "3. You may not drive a heavy motor vehicle on a public road unless such motor vehicle is fitted with at least one lamp on each side at the rear emitting a red light to the rear.\n";
    public static Integer rearLampsRulesImage = 0;
    public static Rule rearLampsRules = new Rule(rearLampsRulesTitle, rearLampsRulesInstruction, rearLampsRulesImage);

    public static String stopLampsRulesTitle = "STOP LAMP";
    public static String stopLampsRulesInstruction = "1. You may not drive a light motor vehicle or motorcycle on a public road unless it is fitted with stop lamps at the rear. When in use, they must emit a red light, which must be greater than that of the light emitted by the rear lamps and must be visible in normal sunlight at a distance of 30 metres to a person of normal eyesight.\n\n" +
            "2. A person may not drive a heavy motor vehicle on a public road unless it is fitted with at least one stop lamp on each side at the rear of the motor vehicle which shall, when in use, emit a red light and the intensity of which shall be greater than that of the light emitted by the rear lamp on the motor vehicle and shall be visible in normal sunlight at a distance of not less than 30 metres to a person of normal eyesight.\n\n" +
            "3. When a stop lamp is illuminated, this indicates that the vehicle is decreasing speed and may stop.\n";
    public static Integer stopLampsRulesImage = 0;
    public static Rule stopLampsRules = new Rule(stopLampsRulesTitle, stopLampsRulesInstruction, stopLampsRulesImage);

    public static String numberPlateLampRulesTitle = "NUMBER PLATE LAMP";
    public static String numberPlateLampRulesInstruction = "1. You may not drive a motor vehicle on a public road, unless it is fitted with at least one number-plate lamp at the rear, illuminating the number plate.\n\n" +
            "2. Every letter and figure of such plate must be visible from a distance of 20 metres by a person of normal eyesight.\n";
    public static Integer numberPlateLampRulesImage = 0;
    public static Rule numberPlateLampRules = new Rule(numberPlateLampRulesTitle, numberPlateLampRulesInstruction, numberPlateLampRulesImage);

    public static String numberPlatesRulesTitle = "NUMBER PLATES";
    public static String numberPlatesRulesInstruction = "1. A South African Bureau of Standards (SABS) approve number plate shall be affixed —\n" +
            "(a) in such a manner that it is not easily detachable;\n" +
            "(b) in an upright position or within 30 degrees of such position;\n" +
            "(c) in such a manner that each letter and figure thereon is clearly legible;\n" +
            "(d) in such a manner that the whole number plate is clearly visible;\n" +
            "(e) to the back of a motor cycle, motor tricycle, or trailer; and\n" +
            "(f) one to the back and one to the front of all other motor vehicles.\n";
    public static Integer numberPlatesRulesImage = 0;
    public static Rule numberPlatesRules = new Rule(numberPlatesRulesTitle, numberPlatesRulesInstruction, numberPlatesRulesImage);

    public static String fogLampsRulesTitle = "FOG LAMPS";
    public static String fogLampsRulesInstruction = "1. No vehicle may be driven on a public road while any fog lamp fitted to such vehicle is lit, except in conditions of poor visibility caused by;\n" + bulletSymbol +
            " snow, \n" + bulletSymbol +
            " fog, \n" + bulletSymbol +
            " mist, \n" + bulletSymbol +
            " dust, or \n" + bulletSymbol +
            " smoke.";
    public static Integer fogLampsRulesImage = 0;
    public static Rule fogLampsRules = new Rule(fogLampsRulesTitle, fogLampsRulesInstruction, fogLampsRulesImage);

    public static String spotLampRulesTitle = "SPOT LAMP";
    public static String spotLampRulesInstruction = "1. A motor vehicle may not be used on a public road if it is fitted with a spot lamp, which can be so adjusted as to enable a beam of light emit there from to be deflect in any direction. Provided that a spot lamp which is adjustable —\n" + bulletSymbol +
            " may be fitted and used for official purposes on any ambulance, rescue vehicle, fire fighting vehicle, police vehicle or traffic control vehicle,\n" + bulletSymbol +
            " may be fitted to a vehicle owned by a medical practitioner or veterinarian, and used for professional duties only; or\n" + bulletSymbol +
            " may be fitted to a breakdown vehicle or a vehicle employed in connection with the supply of electricity or other public essential services: Provided that it is used solely at the scene of an accident or breakdown or for the examination of overhead telephone, telegraph or power lines.\n";
    public static Integer spotLampRulesImage = 0;
    public static Rule spotLampRules = new Rule(spotLampRulesTitle, spotLampRulesInstruction, spotLampRulesImage);

    public static String rearViewMirrorsRulesTitle = "DRIVING VIEW TO BE UNOBSTRUCTED – (REAR-VIEW MIRRORS)";
    public static String rearViewMirrorsRulesInstruction = "1. No person shall operate on a public road a motor vehicle—\n" + bulletSymbol +
            " if the driver/rider thereof have a full and clear view of the roadway ahead and to his or her right and left when the vehicle is in use;\n" +
            "\u2023 which is not fitted with a rear-view mirror or mirrors enabling the driver/rider of such vehicle, to see in clear weather, a clear reflection of traffic to the rear: Provided that this shall not apply in respect of a tractor;\n" +
            "\u2023 which is a motor car, minibus, bus or goods vehicle, unless it is fitted with an exterior rear-view mirror on the driving side and an interior rear-view mirror: Provided that where the interior rear-view mirror does not enable the driver, when he or she is in the driving position, to see in clear weather, a clear reflection of traffic to the rear, an additional exterior rear-view mirror shall be fitted on the side opposite to the driving seat and in such a case it shall not be necessary to fit an interior rear-view mirror.\n";
    public static Integer rearViewMirrorsRulesImage = 0;
    public static Rule rearViewMirrorsRules = new Rule(rearViewMirrorsRulesTitle, rearViewMirrorsRulesInstruction, rearViewMirrorsRulesImage);

    public static String steeringGearRulesTitle = "STEERING GEAR";
    public static String steeringGearRulesInstruction = "Motorcycle\n\n" +
            "1. You may not use a motorcycle on a public road unless all parts of the steering gear are maintained in a condition, which enables the motorcycle to be steered safely and efficiently; unless the distance between the outside edges of the handlebars is \n" +
            "(i) between 600 and 800 millimetres in respect of motorcycles having an engine with a cylinder capacity of 200 cubic centimetres more, and\n" +
            "(ii) between 500 and 800 millimetres in respect of motorcycles having an engine with a cylinder capacity of less than 200 cubic centimetres of which the outer ends of the hand-grips on the handlebars are:\n" + bulletSymbol +
            " (i) higher than 500 millimetres above the seat height; or \n" + bulletSymbol +
            " (ii) lower than the seat height,\n\n" +
            "Light and Heavy motor vehicles\n\n" +
            "1. A motor vehicle may not be used on a public road unless all parts of the steering are maintained in a condition, which enables the vehicle to be steered safely and efficiently\n";
    public static Integer steeringGearRulesImage = 0;
    public static Rule steeringGearRules = new Rule(steeringGearRulesTitle, steeringGearRulesInstruction, steeringGearRulesImage);

    public static String turningRadiusRulesTitle = "TURNING RADIUS";
    public static String turningRadiusRulesInstruction = "1. A motor vehicle may not be used on a public road if the turning radius of such vehicle exceeds 13,1 metres.\n";
    public static Integer turningRadiusRulesImage = 0;
    public static Rule turningRadiusRules = new Rule(turningRadiusRulesTitle, turningRadiusRulesInstruction, turningRadiusRulesImage);

    public static String brakesRulesTitle = "BRAKES";
    public static String brakesRulesInstruction = "Motorcycle\n\n" +
            "1. You may not ride a motorcycle on a public road, which is not equipped with two independent braking systems:\n" + bulletSymbol +
            "one of which shall act on the front wheel, and\n" + bulletSymbol +
            "and the other which shall act on the rear wheel or wheels which is in good working order.\n\n" +
            "Light and Heavy motor vehicles\n\n" +
            "1. Every light and heavy motor vehicle used on a public road must be equipped with;\n" + bulletSymbol +
            " a service brake, \n" + bulletSymbol +
            " a parking brake, and \n" + bulletSymbol +
            " an emergency brake. (Same as parking brake)\n" +
            "which is in good working order. Provided that the emergency brake and parking brake may be one and the same brake.\n";
    public static Integer brakesRulesImage = 0;
    public static Rule brakesRules = new Rule(brakesRulesTitle, brakesRulesInstruction, brakesRulesImage);

    public static String hooterRulesTitle = "HOOTER";
    public static String hooterRulesInstruction = "1. No person shall use the hooter of a vehicle except when such use is necessary on the grounds of safety.\n\n" +
            "2. You may not use a light motor vehicle on a public road unless :\n" + bulletSymbol +
            " it is equipped with a warning device (hooter), which is in good working order and, \n" +bulletSymbol +
            " when used, capable of emitting a sound, which is clearly audible by a person of \n" + bulletSymbol +
            " normal hearing from a distance of 90 metres.\n\n" +
            "3. Sirens or warning devices that play a tune may not be used in private vehicles.\n";
    public static Integer hooterRulesImage = 0;
    public static Rule hooterRules = new Rule(hooterRulesTitle, hooterRulesInstruction, hooterRulesImage);

    public static String sirenRulesTitle = "EMERGENCY WARNING DEVICE (SIREN)";
    public static String sirenRulesInstruction = "1. The driver/rider of a motor vehicle shall give immediate right of way to all emergency vehicles sounding a siren and displaying emergency warning lights.\n" + bulletSymbol +
            "The following vehicles are regarded as an emergency vehicles-\n" + bulletSymbol +
            " a fire-fighting vehicle (red warning light), \n" + bulletSymbol +
            " a fire-fighting response vehicle (red warning light), \n" + bulletSymbol +
            " a rescue vehicle (red warning light), \n" + bulletSymbol +
            " a emergency medical response vehicle (red warning light), \n" + bulletSymbol +
            " ambulance (red warning light),\n" + bulletSymbol +
            " vehicle driven by a traffic officer in the carrying out of his or her duties (blue warning \n" + bulletSymbol +
            "light), \n" + bulletSymbol +
            " to a vehicle driven by a person while engaged in civil protection (green warning \n" +
            "light).\n";
    public static Integer sirenRulesImage = 0;
    public static Rule sirenRules = new Rule(sirenRulesTitle, sirenRulesInstruction, sirenRulesImage);

    public static String seatBeltsRulesTitle = "SEATBELTS";
    public static String seatBeltsRulesInstruction = "1. Seatbelts are compulsory to wear when moving forward for children and adults but it only covers persons 3 years of age and older.\n\n" +
            "2. If seatbelts are fitted, rear-seat passengers must wear such seatbelts whilst the vehicle is driven.\n\n" +
            "3. A child is defined as a person between the ages of 3 and 14 years, except when such person is taller than 1,5 metres, then he or she is regarded as an adult, irrespective of age. A person older than 14 years is defined as an adult.\n\n" +
            "4. No adult shall; \n" + bulletSymbol +
            " occupy a seat in any motor vehicle unless such person wears a seatbelt: \n" + bulletSymbol +
            " occupy a seat on a row of seats, which is not fitted with a seatbelt, unless all other seats on such row which are fitted with seatbelts, are already occupied.\n\n" +
            "Children\n\n" +
            "1. The driver of a motor vehicle shall ensure that a child seated on a seat;\n" + bulletSymbol +
            " where it is available, uses an appropriate child restraint; or\n" + bulletSymbol +
            " if no child restraint is available, wears a seatbelt when available.\n\n" +
            "2. If a seat, equipped with a seatbelt, is not available, the driver shall ensure that a child shall, if such motor vehicle is equipped with a rear seat, be seated on the rear seat.\n\n" +
            "3. It is not compulsory to wear a seatbelt while reversing or moving in or out of a parking bay or area.\n\n" +
            "4. The driver of a motor vehicle shall ensure that all persons travelling in such motor vehicle shall wear a seat belt.\n";
    public static Integer seatBeltsRulesImage = 0;
    public static Rule seatBeltsRules = new Rule(seatBeltsRulesTitle, seatBeltsRulesInstruction, seatBeltsRulesImage);

    public static String protectiveHelmetRulesTitle = "PROTECTIVE HELMET FOR MOTORCYCLE RIDERS";
    public static String protectiveHelmetRulesInstruction = "1. You may not ride a motorcycle or be a passenger on a motorcycle, motor tricycle or a motor quadru cycle, or be a passenger in the sidecar attached to a motorcycle, on a public road, unless a protective helmet is worn-\n" + bulletSymbol +
            " which is specially designed for use in connection with such cycle; and \n" + bulletSymbol +
            " which fits properly and of which the chin strap is properly fastened under the chin.\n" +
            "\n2. The rider of a motorcycle shall ensure that any passenger in or on such cycle who is younger than 14 years, wears such protective helmet.\n" +
            "\n3. The rider and passenger on a motorcycle may not wear a protective helmet when the motorcycle is equipped with a seatbelt that complies with the requirements of the SABS, and the engine can not move unless the driver and passengers (if any), of the motorcycle wear such seatbelt.\n";
    public static Integer protectiveHelmetRulesImage = 0;
    public static Rule protectiveHelmetRules = new Rule(protectiveHelmetRulesTitle, protectiveHelmetRulesInstruction, protectiveHelmetRulesImage);

    public static String windscreenWipersRulesTitle = "WINDSCREEN";
    public static String windscreenWipersRulesInstruction = "1. The transparent windscreen of a light motor vehicle, must;\n" + bulletSymbol +
            " afford the driver sufficient visibility for safe driving,\n" + bulletSymbol +
            " be of safety glass, and\n" + bulletSymbol +
            " have visible light transmittance through the windscreen of at least 70%.\n";
    public static Integer windscreenWipersRulesImage = 0;
    public static Rule windscreenWipersRules = new Rule(windscreenWipersRulesTitle, windscreenWipersRulesInstruction, windscreenWipersRulesImage);

    public static String windscreenRulesTitle = "WINDSCREEN WIPERS";
    public static String windscreenRulesInstruction = "1. A light and heavy motor vehicle with a windscreen must be fitted with at least one windscreen wiper and must, when in operation, wipe the outside of the windscreen directly in front of the driver, continuously, evenly and adequately.\n";
    public static Integer windscreenRulesImage = 0;
    public static Rule windscreenRules = new Rule(windscreenRulesTitle, windscreenRulesInstruction, windscreenRulesImage);

    public static String exhaustPipesRulesTitle = "EXHAUST SILENCERS / EXHAUST PIPES";
    public static String exhaustPipesRulesInstruction = "1. A motor vehicle must be equipped with an efficient exhaust silencer, which must;\n" + bulletSymbol +
            " allow the exhaust gas from the engine to be projected through such silencer; \n" + bulletSymbol +
            " not emit exhaust gas or smoke from the engine which is so dense as to cause a nuisance to, or obstruct the vision of other road users, or\n" + bulletSymbol +
            " be in such a position that oil or other flammable liquid or material cannot drip or fall onto it, \n" + bulletSymbol +
            " be so maintained that exhaust gas or smoke does not leak into the driving cab or passenger compartment of the vehicle.\n\n" +
            "2. A motor vehicle may not be used on a public road-\n" + bulletSymbol +
            " without an efficient exhaust silencer.\n" + bulletSymbol +
            " unless the gas from the engine is projected through such silencer \n" + bulletSymbol +
            " if the exhaust gas or smoke from the engine is so dense as to cause a nuisance to, or obstruct the vision of other road users, or\n" + bulletSymbol +
            " if the exhaust pipe or silencer thereof is in such a position that oil or other flammable liquid or material can drip or fall onto it, or \n" + bulletSymbol +
            " is not in efficient working order, or \n" + bulletSymbol +
            " is so placed and maintained that exhaust gas or smoke leaks into the driving cab or passenger compartment of the vehicle.\n";
    public static Integer exhaustPipesRulesImage = 0;
    public static Rule exhaustPipesRules = new Rule(exhaustPipesRulesTitle, exhaustPipesRulesInstruction, exhaustPipesRulesImage);

    public static String fuelTankRulesTitle = "FUEL TANK, ELECTRICAL WIRING AND BATTERY";
    public static String fuelTankRulesInstruction = "1. A motor vehicle may not be used on a public road—\n" + bulletSymbol +
            " if the fuel tank, carburettor, fuel receptacle or fuel pipes thereof is defective or so exposed that it constitutes a source of danger; \n" + bulletSymbol +
            " if the fuel tank is not fitted with an effective cap; or \n" + bulletSymbol +
            " unless the electrical wiring and battery are properly installed, insulated and maintained so that such wiring and battery do not constitute a source of danger.\n";
    public static Integer fuelTankRulesImage = 0;
    public static Rule fuelTankRules = new Rule(fuelTankRulesTitle, fuelTankRulesInstruction, fuelTankRulesImage);

    public static String engineRulesTitle = "ENGINE";
    public static String engineRulesInstruction = "1. A light and heavy motor vehicle may not be used on a public road, unless the engine thereof is so covered as not to be a source of danger.\n";
    public static Integer engineRulesImage = 0;
    public static Rule engineRules = new Rule(engineRulesTitle, engineRulesInstruction, engineRulesImage);

    public static String trianglesRulesTitle = "EMERGENCY WARNING SIGNS (TRIANGLES)";
    public static String trianglesRulesInstruction = "1. Any heavy motor vehicle (GVM exceeds 3500kg), all goods vehicles, minibuses and busses, \n" +
            "(excluding motor cars, ambulances and motorcycles) may not be used on a public road, unless there is carried on such vehicle at least one emergency warning sign. Provided that in the case of a combination of motor vehicles (vehicle with one or more trailers), the emergency warning sign for every motor vehicle of such combination may be carried on the drawing vehicle.\n\n" +
            "2. Where a motor vehicle is for any reason stationary on the roadway of a public road, the driver of such vehicle shall display at least one emergency warning sign in the following manner—\n" + bulletSymbol +
            " the sign shall be placed not less than 45 metres from the motor vehicle along the roadway of the public road concerned in the direction from which traffic will approach such vehicle when travelling on the side of the roadway closest to such motor vehicle;\n" + bulletSymbol +
            " the sign shall be placed approximately as far from the edge of the roadway as the transverse centre of the motor vehicle is from the edge of the roadway; and\n" + bulletSymbol +
            " the reflective side of the sign shall face in the direction from which any traffic will approach.\n\n" +
            "3. This shall not apply where a motor vehicle is stationary—\n" + bulletSymbol +
            " in a place where a road traffic sign authorises the loading or unloading of a vehicle;\n" + bulletSymbol +
            " in compliance with any direction conveyed by a road traffic sign or given by a traffic officer;\n" + bulletSymbol +
            " on account of other traffic on the public road concerned and while the driver occupies the driving seat of such motor vehicle; or\n" + bulletSymbol +
            " in the course of events accompanying the carrying out of a State or municipal function.\n";
    public static Integer trianglesRulesImage = 0;
    public static Rule trianglesRules = new Rule(trianglesRulesTitle, trianglesRulesInstruction, trianglesRulesImage);

    public static String excessiveNoiseRulesTitle = "EXCESSIVE NOISE";
    public static String excessiveNoiseRulesInstruction = "1. No person shall operate on a public road a vehicle in such a manner as to cause any excessive noise.\n";
    public static Integer excessiveNoiseRulesImage = 0;
    public static Rule excessiveNoiseRules = new Rule(excessiveNoiseRulesTitle, excessiveNoiseRulesInstruction, excessiveNoiseRulesImage);

    public static String speedometerRulesTitle = "SPEEDOMETERS";
    public static String speedometerRulesInstruction = "1. A motor vehicle, which is designed for or capable of reaching a speed of 60 km/h or more, must be equipped with a speedometer, which is in a good working order.\n";
    public static Integer speedometerRulesImage = 0;
    public static Rule speedometerRules = new Rule(speedometerRulesTitle, speedometerRulesInstruction, speedometerRulesImage);



    public static String speedLimitsRulesTitle = "SPEED LIMITS";
    public static String speedLimitsRulesInstruction = "1. A general speed limit is applicable on all roads and does not have to be displayed by a road traffic sign.\n" + bulletSymbol +
            " Unless otherwise indicated by a road traffic sign, a speed limit of—\n" + bulletSymbol +
            " 60 kilometres per hour shall apply in respect of every public road situated within an urban area;\n" + bulletSymbol +
            " 100 kilometres per hour shall apply in respect of every public road other than a freeway, situated outside an urban area; and\n" + bulletSymbol +
            " 120 kilometres per hour shall apply in respect of every freeway.\n";
    public static Integer speedLimitsRulesImage = 0;
    public static Rule speedLimitsRules = new Rule(speedLimitsRulesTitle, speedLimitsRulesInstruction, speedLimitsRulesImage);

    public static String speedLimitForPassengerVehiclesRulesTitle = "SPEED LIMIT IN RESPECT OF PASSENGER VEHICLES CONVEYING PERSONS FOR REWARD";
    public static String speedLimitForPassengerVehiclesRulesInstruction = "1. A speed limit of 100 kilometres per hour shall apply in respect of-\n" + bulletSymbol +
            " bus, and\n" + bulletSymbol +
            " a minibus.\n";
    public static Integer speedLimitForPassengerVehiclesRulesImage = 0;
    public static Rule speedLimitForPassengerVehiclesRules = new Rule(speedLimitForPassengerVehiclesRulesTitle, speedLimitForPassengerVehiclesRulesInstruction, speedLimitForPassengerVehiclesRulesImage);

    public static String speedLimitForParticularClassOFVehicleRulesTitle = "SPEED LIMIT FOR A PARTICULAR CLASS OF VEHICLES";
    public static String speedLimitForParticularClassOFVehicleRulesInstruction = "1. A speed limit of 80 kilometres per hour shall apply in respect to-\n" + bulletSymbol +
            " a goods vehicle with a GVM of more than 9000 kilograms;\n" + bulletSymbol +
            " a combination of motor vehicles consisting of a goods vehicle, being the drawing vehicle, and one or two trailers of which the sum of the gross vehicle mass of the goods vehicle and of the trailer or trailers exceeds 9 000 kilograms; or\n" + bulletSymbol +
            " an articulated motor vehicle, of which the gross combination mass of the truck-tractor exceeds 9000 kilograms;\n" + bulletSymbol +
            " Any breakdown vehicle that is towing another vehicle:\n";
    public static Integer speedLimitForParticularClassOFVehicleRulesImage = 0;
    public static Rule speedLimitForParticularClassOFVehicleRules = new Rule(speedLimitForParticularClassOFVehicleRulesTitle, speedLimitForParticularClassOFVehicleRulesInstruction, speedLimitForParticularClassOFVehicleRulesImage);

    public static String overallLengthOfVehicleRulesTitle = "OVERALL LENGTH OF VEHICLES";
    public static String overallLengthOfVehicleRulesInstruction = "1. Legislation provides for restrictions on the overall length of certain types of vehicles. The restricted lengths are as follows;\n" + bulletSymbol +
            " a trailer (not semi-trailer) of which the GVM is less than 12 000 kilograms - not exceed 8 metres\n" + bulletSymbol +
            " a trailer (not semi-trailer) of which the GVM is more than 12 000 kilograms - not exceed 12,5 metres\n" + bulletSymbol +
            " an articulated motor vehicle - shall not exceed 18,5 metres\n" + bulletSymbol +
            " a bus-train - shall not exceed 22 metres\n" + bulletSymbol +
            " any other vehicles - shall not exceed 12,5 metres\n" + bulletSymbol +
            " any combination of motor vehicles _1 shall not exceed 22 metres.\n";
    public static Integer overallLengthOfVehicleRulesImage = 0;
    public static Rule overallLengthOfVehicleRules = new Rule(overallLengthOfVehicleRulesTitle, overallLengthOfVehicleRulesInstruction, overallLengthOfVehicleRulesImage);




    public static String overallHeightOfVehicleRulesTitle = "OVERALL HEIGHT OF VEHICLE";
    public static String overallHeightOfVehicleRulesInstruction = "1. The following motor vehicles may not be used on a public road together with any load thereon, if the overall height-\n" + bulletSymbol +
            " in the case of a double-deck bus exceeds 4,65 metres; and\n" + bulletSymbol +
            " in the case of any other motor vehicle exceeds 4,3 metres.\n";
    public static Integer overallHeightOfVehicleRulesImage = 0;
    public static Rule overallHeightOfVehicleRules = new Rule(overallHeightOfVehicleRulesTitle, overallHeightOfVehicleRulesInstruction, overallHeightOfVehicleRulesImage);


    public static String overallWidthOfVehicleRulesTitle = "OVERALL WIDTH OF VEHICLES";
    public static String overallWidthOfVehicleRulesInstruction = "1. The following motor vehicles may not be used on a public road-\n" + bulletSymbol +
            " a bus of which the distance between the centre-lines of the tyres of the two front wheels exceeds 1,9 metres, if the overall width of such bus exceeds 2,6 metres;\n" + bulletSymbol +
            " a goods vehicle the gross vehicle mass of which is 12 000 kilograms or more, if the overall width thereof exceeds 2,6 metres, or\n" + bulletSymbol +
            " any other vehicle, if the overall width thereof exceeds 2,5 metres.\n";
    public static Integer overallWidthOfVehicleRulesImage = 0;
    public static Rule overallWidthOfVehicleRules = new Rule(overallWidthOfVehicleRulesTitle, overallWidthOfVehicleRulesInstruction, overallWidthOfVehicleRulesImage);


    public static String conveyingOfGoodsRulesTitle = "CONVEYANCE OF GOODS";
    public static String conveyingOfGoodsRulesInstruction = "1. Goods may not be loaded onto a vehicle in such a manner that it may-\n" + bulletSymbol +
            " come into contact with the surface of the road,\n" + bulletSymbol +
            " obscure the drivers/riders view of traffic to the front or on either side, or his or her view in the rear-view mirror or mirrors of traffic to the rear; which are not—\n" + bulletSymbol +
            " safely contained within the body of such vehicle; or\n" + bulletSymbol +
            " securely fastened to such vehicle, and which are not properly protected from being dislodged or spilled from such vehicle;\n" + bulletSymbol +
            " on the roof thereof, in the case where such vehicle is a motorcar, if the height of such goods measured from the highest point of such roof exceeds one-half of the height of the motor car, measured from ground level: Provided that the provisions of this paragraph shall not be applicable in respect of pedal cycles being transported on the roof of a motor vehicle. Any container, which has provision for fastening by means of “twist locks”, unless such container is securely fastened by at least four “twist locks”.\n\n" +
            "2. Transporting baggage on a motorcycle in the best possible way is to place the baggage into suitable carriers attached securely to the motorcycle.\n";
    public static Integer conveyingOfGoodsRulesImage = 0;
    public static Rule conveyingOfGoodsRules = new Rule(conveyingOfGoodsRulesTitle, conveyingOfGoodsRulesInstruction, conveyingOfGoodsRulesImage);



    public static String carryingPersonsInGoodsVehicleRulesTitle = "CIRCUMSTANCES UNDER WHICH PERSONS MAY BE CARRIED ON GOODS VEHICLE";
    public static String carryingPersonsInGoodsVehicleRulesInstruction = "1. If persons are carried on a goods vehicle, that portion of the vehicle in which the persons are being conveyed must be enclosed to a height of—\n" + bulletSymbol +
            " at least 350 millimetres above the surface upon which such person is seated; or\n" + bulletSymbol +
            " at least 900 millimetres above the surface on which such person is standing.\n\n" +
            "2. It is against the law for passengers to ride in a caravan\n";
    public static Integer carryingPersonsInGoodsVehicleRulesImage = 0;
    public static Rule carryingPersonsInGoodsVehicleRules = new Rule(carryingPersonsInGoodsVehicleRulesTitle, carryingPersonsInGoodsVehicleRulesInstruction, carryingPersonsInGoodsVehicleRulesImage);



    public static String projectionsRulesTitle = "PROJECTIONS/OVERHANG";
    public static String projectionsRulesInstruction = "1. A motorcycle may not be used on a public road if any goods carried thereon, or on any sidecar project more-\n" + bulletSymbol +
            " than 600 millimetres to the front of the axle of the front wheel;\n" + bulletSymbol +
            " than 900 millimetres to the rear of the axle of the rear wheel;\n" + bulletSymbol +
            " than 450 millimetres on either side of the wheels, and\n" + bulletSymbol +
            " than 300 millimetres to the outside of the wheel of the sidecar.\n\n" +
            "2. A light & heavy motor vehicle may not be used on a public road carrying any goods, which project:a)\n" +
            "either side of the longitudinal centre-line of the vehicle by more than;\n" +
            "i. in the case a bus or a goods vehicle of which the gross vehicle mass of exceeds 12 000 kilograms - 1,3 metres; or (therefore maximum width of goods is 2,6 metres)\n" +
            "ii. in the case of any other vehicle, 1,25 metres. (therefore maximum width of goods is 2,5 metres)\n" +
            "Provided that any side mirror or direction indicator on the vehicle shall not be taken into account;\n\n" +
            "3. A light & heavy motor vehicle may not be used on a public road carrying any goods, which project:\n" +
            "a) more than 300 millimetres beyond the front end of the vehicle.\n" +
            "b) more than 1,8 metres beyond the rear end of the vehicle. A light & heavy motor vehicle may not be used on a public road:\n" + bulletSymbol +
            " Of which any bracket projects more than 150 millimetres beyond the widest part of the vehicle. (Side rear view mirrors or direction indicators are excluded)\n";
    public static Integer projectionsRulesImage = 0;
    public static Rule projectionsRules = new Rule(projectionsRulesTitle, projectionsRulesInstruction, projectionsRulesImage);



    public static String warningFlagsRulesTitle = "WARNING FLAGS/REFLECTORS";
    public static String warningFlagsRulesInstruction = "1. Where any load projects more than 150 millimetres to the side, or more than 300 millimetres to the rear, it must be marked by means of;\n" + bulletSymbol +
            " a red flag or flags (300mm x 300mm) during the day, and\n" + bulletSymbol +
            " retro reflectors at night, or\n" + bulletSymbol +
            " any other time when persons and vehicles are not clearly visible due to unfavourable conditions. White retro reflectors to the front and red retro reflectors to the rear.\n";
    public static Integer warningFlagsRulesImage = 0;
    public static Rule warningFlagsRules = new Rule(warningFlagsRulesTitle, warningFlagsRulesInstruction, warningFlagsRulesImage);




    public static String drivingODividedPublicRoadRulesTitle = "DRIVING ON DIVIDED PUBLIC ROAD";
    public static String drivingODividedPublicRoadRulesInstruction = "1. Whenever any public road has been divided into two or more roadways, no person shall drive/ride a vehicle upon such public road except upon the left hand roadway, unless directed or permitted by an appropriate road traffic sign or a traffic officer to use another roadway.\n";
    public static Integer drivingODividedPublicRoadRulesImage = 0;
    public static Rule drivingODividedPublicRoadRules = new Rule(drivingODividedPublicRoadRulesTitle, drivingODividedPublicRoadRulesInstruction, drivingODividedPublicRoadRulesImage);



    public static String drivingOnLeftSideOfRoadwayRulesTitle = "DRIVING ON LEFT SIDE OF ROADWAY";
    public static String drivingOnLeftSideOfRoadwayRulesInstruction = "1. Any person driving a vehicle on a public road shall drive on the left side of the roadway and,\n" +
            "where the roadway is wide enough, in such manner as not to encroach on that half of the roadway to his or her right: Provided that such encroachment shall be permissible—\n" + bulletSymbol +
            " where it can be done without obstructing or endangering other traffic, or\n" + bulletSymbol +
            " in compliance with a direction of a traffic officer or a road traffic sign.\n\n" +
            "2. When you become aware of other traffic proceeding in the same direction and wishing to\n" +
            "pass your vehicle –\n" + bulletSymbol +
            " drive as near to the left edge of the roadway as is possible, without endangering yourself, other traffic or property, and\n" + bulletSymbol +
            " do not accelerate the speed of your vehicle until the other vehicle has passed.\n\n" +
            "3. When about to pass oncoming traffic, the driver of a motor vehicle must ensure that his/her vehicle does not encroach on the roadway to his/ her right in such manner as may obstruct or endanger such oncoming traffic. The driver of a vehicle intending to pass a stationary bus must do so with due care for the safety of persons who are approaching or leaving or may approach or leave such bus.\n";
    public static Integer drivingOnLeftSideOfRoadwayRulesImage = 0;
    public static Rule drivingOnLeftSideOfRoadwayRules = new Rule(drivingOnLeftSideOfRoadwayRulesTitle, drivingOnLeftSideOfRoadwayRulesInstruction, drivingOnLeftSideOfRoadwayRulesImage);

    public static String laneChangingRulesTitle = "LANE CHANGING";
    public static String laneChangingRulesInstruction = "1. When driving a motor vehicle on a public road which is divided into traffic lanes by means of road markings, the driver/rider shall not turn from one lane into another unless he or she can do so without obstructing or endangering other traffic.\n";
    public static Integer laneChangingRulesImage = 0;
    public static Rule laneChangingRules = new Rule(laneChangingRulesTitle, laneChangingRulesInstruction, laneChangingRulesImage);


    public static String drivingSignalsRulesTitle = "DRIVING SIGNALS";
    public static String drivingSignalsRulesInstruction = "1. The driver/rider of a vehicle who intends to stop, or to turn such vehicle to the left or to the right, shall in good time, give a conspicuous signal of his or her intention, visible to any person approaching him or her from the front or from the rear or from the side, and of a duration sufficient to warn any such person of his or her intention.\n";
    public static Integer drivingSignalsRulesImage = 0;
    public static Rule drivingSignalsRules = new Rule(drivingSignalsRulesTitle, drivingSignalsRulesInstruction, drivingSignalsRulesImage);


    public static String directionIndicatorsRoadLanesRulesTitle = "DIRECTION INDICATORS";
    public static String directionIndicatorsRoadLanesInstruction = "1. You may not drive your motor vehicle on a public road, unless it is equipped on both sides with flasher type direction indicators.\n\n" +
            "2. Each time when turning left or to the right and when changing lanes on a public road, it is compulsory to make use of direction indicators.\n\n" +
            "3. A light motor vehicle must be equipped with direction indicators. and;\n" + bulletSymbol +
            " each indicator must have a lamp;\n" + bulletSymbol +
            " when in use, the lamp must show an intermittently flashing light of such intensity that it is clearly visible in normal daylight at a distance of 30 metres to a person of normal eyesight.\n\n" +
            "4. Indicator lamps, when in use, must emit white, yellow or amber light to the front, and yellow, amber or red light to the rear.\n";
    public static Integer directionIndicatorsRoadLanesRulesImage = 0;
    public static Rule directionIndicatorsRoadLanesRules = new Rule(directionIndicatorsRoadLanesRulesTitle, directionIndicatorsRoadLanesInstruction, directionIndicatorsRoadLanesRulesImage);

    public static String reflectorsRulesTitle = "REFLECTORS";
    public static String reflectorsRulesInstruction = "Motorcycles\n\n" +
            "1. You may not ride your motorcycle, motorcycle with a sidecar or motor tricycle, on a public road unless there is fitted on the rear of such cycle a red retro reflector.\n\n" +
            "Light Motor Vehicles\n\n" +
            "1. A light motor vehicle must be fitted on the rear of it with two red retro-reflectors, one on each side.\n\n" +
            "Heavy Motor Vehicle\n\n" +
            "1. A heavy motor vehicle may not be used on a public road unless there are fitted on the rear of such vehicle at the same height two red retro-reflectors, one on each side. A heavy motor vehicle or a combination of motor vehicles may not be used on a public road, if the overall length of such vehicle or combination exceeds 7 metres, unless there is fitted, on each side of such vehicle so many yellow retro-reflectors as may be necessary to ensure that no two successive yellow retro-reflectors are more than 3,6 metres apart.\n\n" +
            "2. If yellow reflective strips are fitted to a goods vehicle, yellow retro-reflectors are not necessary.\n";
    public static Integer reflectorsRulesImage = 0;
    public static Rule reflectorsRules = new Rule(reflectorsRulesTitle, reflectorsRulesInstruction, reflectorsRulesImage);

    public static String yellowReflectiveMaterialRulesTitle = "YELLOW REFLECTIVE MATERIAL";
    public static String yellowReflectiveMaterialRulesInstruction = "1. As from 1 January 2001, yellow reflective material (as prescribed), shall be fitted to the sides and rear of all goods vehicles of which the gross vehicle mass exceeds 10000 kilograms. Goods vehicles of which the GVM does not exceed 10000 kilograms, may be fitted with such strips on the sides and rear, but is not compulsory.\n";
    public static Integer yellowReflectiveMaterialRulesImage = 0;
    public static Rule yellowReflectiveMaterialRules = new Rule(yellowReflectiveMaterialRulesTitle, yellowReflectiveMaterialRulesInstruction, yellowReflectiveMaterialRulesImage);


    public static String overtakingRulesTitle = "OVERTAKING/PASSING";
    public static String overtakingRulesInstruction = "1. The driver/rider of a vehicle intending to pass any other vehicle proceeding in the same direction on a public road shall pass to the right thereof at a safe distance and shall not again drive on the left side of the roadway until safely clear of the vehicle so passed.\n\n" +
            "2. Exceeding the speed limit when overtaking/passing is not permissible.\n\n" +
            "3. Passing on the left of such vehicle shall be permissible if the person driving the passing vehicle can do so with safety to himself or herself and other traffic, and—\n" +
            "a. the vehicle being passed is turning to its right or the driver/rider thereof has signalled his or her intention of turning to his or her right;\n" +
            "b. such road is a public road in an urban area and—\n" + bulletSymbol +
            " i. is restricted to vehicles moving in one direction; and\n" + bulletSymbol +
            " ii. the roadway is of sufficient width for two or more lines of moving vehicles;\n" +
            "c. such road is a public road in an urban area and the roadway is of sufficient width for two or more lines of moving vehicles moving in each direction;\n" +
            "d. the roadway of such road is restricted to vehicles moving in one direction and is divided into traffic lanes by appropriate road traffic signs; or\n" +
            "e. he or she is driving in compliance with the directions of a traffic officer. Provided further that in no event shall any passing be done by driving on the shoulder of the roadway or on the verge of a public road.\n\n" +
            "4. The driver/rider of a vehicle shall not pass other traffic moving in the same direction on a public road when approaching —\n" +
            "a. the summit of a rise;\n" +
            "b. a curve; or\n" +
            "c. any other place where the view is so restricted that any such passing could create a hazard in relation to other traffic, which might approach from the opposite\n" +
            "direction, unless—\n" + bulletSymbol +
            " i. he or she can do so without encroaching on the right-hand side of the roadway; or\n" + bulletSymbol +
            " ii. the roadway of such road is restricted to vehicles moving in one direction.\n\n" +
            "5. When you become aware of other traffic proceeding in the same direction and wishing to pass your vehicle –\n" +  bulletSymbol +
            " drive as near to the left edge of the roadway as is possible, without endangering yourself, other traffic or property, and\n" +  bulletSymbol +
            " do not accelerate the speed of your vehicle until the other vehicle has passed.\n\n" +
            "6. When about to pass oncoming traffic, the driver/rider of a motor vehicle must ensure that his/her vehicle does not encroach on the roadway to his/ her right in such manner as may obstruct or endanger such oncoming traffic\n\n" +
            "7. The driver/rider of a vehicle intending to pass a stationary bus must do so with due care for the safety of persons who are approaching or leaving or may approach or leave such bus.\n\n" +
            "8. A driver of a vehicle who wishes to overtake another vehicle ahead that is not in the left hand lane can make the driver of such vehicle aware that he or she intends to overtake by giving a visible signal by means of flashing the headlights of his or her vehicle.\n\n" +
            "9. Vehicles must kept left and overtake to the right on any freeway.\n";
    public static Integer overtakingRulesImage = 0;
    public static Rule overtakingRules = new Rule(overtakingRulesTitle, overtakingRulesInstruction, overtakingRulesImage);


    public static String intersectionsRulesTitle = "INTERSECTIONS";
    public static String intersectionsRulesInstruction = "1. The driver/rider of a vehicle on a public road shall, when he or she intends entering any portion of a public road which constitutes a junction of two or more public roads where vehicular traffic is required to move around a traffic island within such junction, yield the right of way to all vehicular traffic approaching from his or her right within such junction, unless his or her entry into such junction is controlled by an instruction given by a traffic officer or a direction conveyed by a road traffic sign requiring him or her to act differently.\n";
    public static Integer intersectionsRulesImage = 0;
    public static Rule intersectionsRules = new Rule(intersectionsRulesTitle, intersectionsRulesInstruction, intersectionsRulesImage);

    public static String parkingRulesTitle = "PARKING";
    public static String parkingRulesInstruction = "1. No person shall park a vehicle on the roadway of a public road—\n" + bulletSymbol +
            " with a direction given by a traffic officer,\n" + bulletSymbol +
            " for any cause beyond the control of the driver/rider,\n" + bulletSymbol +
            " in any place where “Stopping” is not permitted.\n" + bulletSymbol +
            " in contravention of any road traffic sign;\n" +  bulletSymbol +
            " on the same side as a fire hydrant within 1,5 metres on either side of the hydrant,\n" +  bulletSymbol +
            " in any place where the vehicle would obscure any road traffic sign;\n" +  bulletSymbol +
            " in such manner as to encroach upon the sidewalk; or\n" +  bulletSymbol +
            " in such manner as to obstruct any private or public vehicular entrance.\n" +  bulletSymbol +
            " except for any reason beyond the control of the driver/rider.\n" +  bulletSymbol +
            " on any portion of the roadway (excluding the shoulders) of a public road outside an urban area or with any part of such vehicle within 1 metre of the edge of such roadway.\n\n" +
            "2. No person shall park on the roadway of a public road within an urban area —\n" +  bulletSymbol +
            " within 9 metres of the side from which he or she approaches a pedestrian crossing.\n" +  bulletSymbol +
            " within 5 metres of any intersection.\n" +  bulletSymbol +
            " upon or over the actuating mechanism of a traffic signal.\n" +  bulletSymbol +
            " with the outside of any left-hand wheel thereof more than 450 millimetres within the roadway.\n" +  bulletSymbol +
            " which is less than 5,5 metres wide.\n" +  bulletSymbol +
            " on a traffic island or in a pedestrian mall or pedestrian lane.\n";
    public static Integer parkingRulesImage = 0;
    public static Rule parkingRules = new Rule(parkingRulesTitle, parkingRulesInstruction, parkingRulesImage);


    public static String stoppingRulesTitle = "STOPPING";
    public static String stoppingRulesInstruction = "1. No person shall stop a vehicle on the roadway of a public road-\n" + bulletSymbol +
            " except in order to avoid an accident,\n" + bulletSymbol +
            " with a direction given by a traffic officer,\n" + bulletSymbol +
            " for any cause beyond the control of the driver/rider,\nalongside or opposite an excavation or obstruction on the public road if other traffic would be obstructed or endangered by such stopping;\n" + bulletSymbol +
            " within any tunnel or subway or on any bridge or within 6 metres of any tunnel, subway or bridge;\n" + bulletSymbol +
            " on, or within 6 metres from the beginning or end of, any part of such roadway where the normal width thereof has for any reason been constricted;\n" + bulletSymbol +
            " in contravention of any road traffic sign;\n" + bulletSymbol +
            " on the right-hand side of such roadway facing oncoming traffic;\n" + bulletSymbol +
            " alongside or opposite any other vehicle on such roadway where such roadway is less than 9 metres wide;\n" +  bulletSymbol +
            " within the railway reserve at a level crossing;\n" + bulletSymbol +
            " within 9 metres of his or her approaching side of a demarcated pedestrian crossing;\n" + bulletSymbol +
            " in any other place where the stopping of a vehicle would constitute a danger or an obstruction to other traffic.\n";
    public static Integer stoppingRulesImage = 0;
    public static Rule stoppingRules = new Rule(stoppingRulesTitle, stoppingRulesInstruction, stoppingRulesImage);




    public static String generalDutiesOfDriverRulesTitle = "GENERAL DUTIES OF DRIVER/RIDER";
    public static String generalDutiesOfDriverRulesInstruction = "1. No person driving a vehicle on a public road shall-\n" + bulletSymbol +
            " disobey any road traffic sign or rule of the road unless so ordered to do so by a traffic officer.\n" + bulletSymbol +
            " cause such vehicle to travel backwards unless it can be done in safety,\n" + bulletSymbol +
            " follow another vehicle more closely than is reasonable, INCLUDE FOLLOWING DISTANCE. See Australia Drivers Handbook Crash Facts (Rear end Crashes)\n\n" +
            "2. Maintain a minimum 2-second following distance for light motor vehicles and motorcycles.\n\n" +
            "3. Maintain a minimum 3-second following distance for heavy motor vehicles.\n\n" +
            "4. Under adverse conditions such as rain, slippery surface, poor visibility or when being followed too closely, the following distance shall be increased.\n" + bulletSymbol +
            " permit any person, animal or object to occupy any position in or on such vehicle which may prevent the driver/rider thereof from exercising complete control over the movements of the vehicle,\n" + bulletSymbol +
            " when driving/riding such vehicle, permit any person to take hold of or interfere with the steering or operating mechanism of the vehicle;\n" + bulletSymbol +
            " when driving/riding such vehicle, occupy a position that he or she does not have complete control over the vehicle or does not have a full view of the roadway and the traffic ahead of such vehicle.\nallow such vehicle to remain unattended on such road without setting its brake or adopting such other method as will effectively prevent the vehicle from moving from the position in which it is left;\n" +
            " if such vehicle is parked or is stationary at the side of such road, drive the vehicle from that position unless he or she is able to do so without interfering with moving traffic approaching from any direction and with safety to himself or herself and others;\n" + bulletSymbol +
            " fail to give an immediate and absolute right of way to a vehicle sounding a device or bell.\n" + bulletSymbol +
            " allow any portion of his or her body to protrude beyond such vehicle while it is in motion on such road except for the purpose of giving any hand signal\n" + bulletSymbol +
            " permit any person or animal to occupy the roof, any step or running board or any other place on top of a vehicle while such vehicle is in motion;\n" + bulletSymbol +
            " cause or allow the engine thereof to run in such manner that it emits smoke or fumes which would not be emitted if the engine were in good condition;\n" + bulletSymbol +
            " cause or allow the engine thereof to run while the motor vehicle is stationary and unattended;\n" + bulletSymbol +
            " negligently or wilfully deposit any petrol or other liquid fuel or any oil or grease or other flammable or offensive matter, ashes or other refuse, of whatever nature, from such vehicle upon or alongside such road; or\n" + bulletSymbol +
            " cause or allow the engine thereof to run while petrol or other flammable fuel is being delivered into the fuel tank.\n" + bulletSymbol +
            " drive, pull or push a vehicle upon a sidewalk.\n";
    public static Integer generalDutiesOfDriverRulesImage = 0;
    public static Rule generalDutiesOfDriverRules = new Rule(generalDutiesOfDriverRulesTitle, generalDutiesOfDriverRulesInstruction, generalDutiesOfDriverRulesImage);



    public static String dutiesRelatingToMotorcyclesRulesTitle = "DUTIES RELATING TO MOTORCYCLES";
    public static String dutiesRelatingToMotorcyclesRulesInstruction = "1. When riding any motorcycle on a public road -\n" + bulletSymbol +
            " A rider may not disobey any road traffic sign or rule of the road unless so ordered to do so by a traffic officer.\n" + bulletSymbol +
            " a riders feet must rest on the front foot rests;\n" + bulletSymbol +
            " a rider must be seated astride on the saddle;\n" + bulletSymbol +
            " a rider must have at least one hand on the handlebars of such motorcycle at all times;\n" + bulletSymbol +
            " a passenger must be briefed by the rider and shall be seated on securely fastened seat and their feet must rest on securely fastened foot rests astride the motorcycle;\n" + bulletSymbol +
            " not more than two persons shall ride upon such cycle, excluding a person riding in a side car attached to such motorcycle;\n" + bulletSymbol +
            " a rider is not allowed to carry a passenger on a motorcycle unless such cycle has an engine with a cylinder capacity exceeding 50 cubic centimetres and unless such passenger is seated in a side car or astride on a pillion attached to such motorcycle;\n" + bulletSymbol +
            " a rider is not allowed to carry more than two adult persons in a side car attached to a motorcycle;\n" + bulletSymbol +
            " a rider may not carry any person or animal or object in front of him/her. Provided that an object of a non bulky nature may be so carried, if securely attached or placed in a suitable carrier fitted thereon and carried in such a way as not to obstruct the rider’s view or prevent his or her exercising complete control over such motorcycle;\n" + bulletSymbol +
            " a rider or his/her passenger shall not take hold of any other vehicle in motion;\n" + bulletSymbol +
            " a rider shall do so in such manner that all the wheels of such motorcycle are in contact with the surface of the road at all times;\n" + bulletSymbol +
            " all riders, shall drive in single file in the same lane, except in the course of overtaking another motorcycle in such lane, and two or more persons driving motorcycles shall not overtake another vehicle at the same time: Provided that where a public road is divided into traffic lanes, each such lane shall be regarded as a public road.\n";
    public static Integer dutiesRelatingToMotorcyclesRulesImage = 0;
    public static Rule dutiesRelatingToMotorcyclesRules = new Rule(dutiesRelatingToMotorcyclesRulesTitle, dutiesRelatingToMotorcyclesRulesInstruction, dutiesRelatingToMotorcyclesRulesImage);



    public static String motorcycleSideCarRulesTitle = "MANNER IN WHICH SIDE CAR TO BE ATTACHED TO MOTORCYCLE";
    public static String motorcycleSideCarRulesInstruction = "1. No person shall use a motorcycle with sidecar on a public road, unless such sidecar is attached to the left side of the motorcycle.\n\n" +
            "2. No sidecar may be attached to a motorcycle having an engine with a cylinder capacity of less than 50 cubic centimetres.\n";
    public static Integer motorcycleSideCarRulesImage = 0;
    public static Rule motorcycleSideCarRules = new Rule(motorcycleSideCarRulesTitle, motorcycleSideCarRulesInstruction, motorcycleSideCarRulesImage);




    public static String cellphonesRulesTitle = "CELLPHONES";
    public static String cellphonesRulesInstruction = "1. No person shall drive/ride a vehicle on a public road while holding a cellular or mobile telephone or any other communication device in one or both hands or with any other part of the body.\n";
    public static Integer cellphonesRulesImage = 0;
    public static Rule cellphonesRules = new Rule(cellphonesRulesTitle, cellphonesRulesInstruction, cellphonesRulesImage);




    public static String pedestriansRightOfWayRulesTitle = "PEDESTRIANS RIGHT OF WAY";
    public static String pedestriansRightOfWayRulesInstruction = "1. The driver/rider of a vehicle must yield right of way, slow down or stop, if necessary in order to yield right of way to a pedestrian crossing a roadway within a pedestrian crossing.\n\n" +
            "2. Whenever any vehicle has stopped at a pedestrian crossing, the driver/rider of any other vehicle may not pass the stopped vehicle.\n\n" +
            "3. The “red man” light signal shows pedestrians that they may not cross the road at an intersection until the green man light signal is displayed. The pedestrians must remain stationary on the sidewalk until a “green man” light signal is displayed. If red man light signal flashes, pedestrians who have not entered the roadway must wait until a “green man” light signal is displayed. Pedestrians who are already in the intersection must cross the road.\n";
    public static Integer pedestriansRightOfWayRulesImage = 0;
    public static Rule pedestriansRightOfWayRules = new Rule(pedestriansRightOfWayRulesTitle, pedestriansRightOfWayRulesInstruction, pedestriansRightOfWayRulesImage);



    public static String abandonedVehiclesRulesTitle = "VEHICLE LEFT / ABANDONED";
    public static String abandonedVehiclesRulesInstruction = "1. Any vehicle left for a continuous period of more than;\n" + bulletSymbol +
            " 24 hours in the same place on a public road outside an urban area;\n" + bulletSymbol +
            " 7 days in the same place on a public road within an urban area, shall be deemed to been abandoned by the owner.\n";
    public static Integer abandonedVehiclesRulesImage = 0;
    public static Rule abandonedVehiclesRules = new Rule(abandonedVehiclesRulesTitle, abandonedVehiclesRulesInstruction, abandonedVehiclesRulesImage);



    public static String damageToPublicRoadsRulesTitle = "DAMAGE TO PUBLIC ROADS";
    public static String damageToPublicRoadsRulesInstruction = "1. You may not;\n" + bulletSymbol +
            " cause any wheel of a vehicle to drag or spin upon the surface of the roadway, except in the case of an emergency;\n" + bulletSymbol +
            " make use of chocks or shoes between any wheel of a vehicle moving along the roadway and the surface of that roadway, or\n" + bulletSymbol +
            " use any vehicle or thing or move any vehicle or thing on a roadway in a manner causing damage thereto.\n";
    public static Integer damageToPublicRoadsRulesImage = 0;
    public static Rule damageToPublicRoadsRules = new Rule(damageToPublicRoadsRulesTitle, damageToPublicRoadsRulesInstruction, damageToPublicRoadsRulesImage);



    public static String freewaysRulesTitle = "FREEWAYS";
    public static String freewaysRulesInstruction = "1. The following vehicles may not be used on a freeway—\n" + bulletSymbol +
            " a vehicle drawn by an animal;\n" + bulletSymbol +
            " a pedal cycle;\n" + bulletSymbol +
            " a motorcycle having an engine with a cylinder capacity not exceeding 50cc (cubic centimetres) or which is propelled by electrical power;\n" + bulletSymbol +
            " a motor quadrucycle;\n" + bulletSymbol +
            " a vehicle with a mass not exceeding 230 kilograms and specially designed, constructed or adapted for the use of a person suffering from a physical defect or disability; or\n" + bulletSymbol +
            " a tractor, except when such tractor is used in connection with the construction or maintenance of a freeway.\n\n" +
            "2. No person shall stop a vehicle on a freeway except—\n" + bulletSymbol +
            " in compliance with a road traffic sign or a direction given by a traffic officer;\n" + bulletSymbol +
            " within an area reserved for the stopping or parking of vehicles by an appropriate road traffic sign, or\n" + bulletSymbol +
            " for any reason beyond his or her control.\n\n" +
            "3. No person shall:\n" + bulletSymbol +
            " give a hand signal when driving/riding a motor vehicle on a freeway except for a reason beyond his or her control.\n" + bulletSymbol +
            " be on a freeway on foot under normal circumstances.\n" + bulletSymbol +
            " leave or allow an animal to be on a freeway or leave an animal in a place from where it may stray onto a freeway.\n\n" +
            "4. When a driver/rider of a vehicle travelling on a freeway notices a vehicle in front of him/her wishing to merge from an On-ramp, such driver/rider must allow a vehicle to merge in front of them.";
    public static Integer freewaysRulesImage = 0;
    public static Rule freewaysRules = new Rule(freewaysRulesTitle, freewaysRulesInstruction, freewaysRulesImage);




    public static String towingRulesTitle = "TOWING";
    public static String towingRulesInstruction = "1. No person shall use any motorcycle to tow another vehicle.\n\n" +
            "2. No person shall be allowed to tow another vehicle on a public road—\n" + bulletSymbol +
            " if the length of the tow-rope, chain or tow-bar between the two vehicles exceeds 3,5 metres;\n" + bulletSymbol +
            " with a tow-rope or chain in excess of 30km/h, unless the towing vehicle is connected to the towed vehicle by means of a draw bar or a tow-bar;\n" + bulletSymbol +
            " if the towed vehicle is conveying persons at a speed in excess of 30 km/h, unless the towed vehicle is a semi-trailer. Therefore a towed vehicle not exceeding 30km/h may convey passengers.\n" + bulletSymbol +
            " unless the steering gear of the vehicle being towed is controlled by a person holding a code of driving licence authorising him or her to drive the class of such vehicle.\n" + bulletSymbol +
            " if the brakes of the towed vehicle do not comply with the provisions, unless the\n" +
            "towing vehicle is connected to the towed vehicle by means of a draw bar or tow-bar.\n";
    public static Integer towingRulesImage = 0;
    public static Rule towingRules = new Rule(towingRulesTitle, towingRulesInstruction, towingRulesImage);



    public static String combinationOfMotorVehiclesRulesTitle = "RESTRICTION ON COMBINATION OF MOTOR VEHICLES";
    public static String combinationOfMotorVehiclesRulesInstruction = "1. A combination of motor vehicles is restricted to a drawing vehicle, and—\n" + bulletSymbol +
            " a maximum of two trailers;\n" + bulletSymbol +
            " one other motor vehicle which is not a trailer;\n\n" +
            "2. In an emergency it is permitted to draw or tow one other motor vehicle, which is not a trailer, and a trailer.\n";
    public static Integer combinationOfMotorVehiclesRulesImage = 0;
    public static Rule combinationOfMotorVehiclesRules = new Rule(combinationOfMotorVehiclesRulesTitle, combinationOfMotorVehiclesRulesInstruction, combinationOfMotorVehiclesRulesImage);



    public static String enteringPublicRoadRulesTitle = "CROSSING/ENTERING PUBLIC ROAD";
    public static String enteringPublicRoadRulesInstruction = "1. The driver/rider of a vehicle shall not cross a public road unless the road is clear of moving traffic for a sufficient distance to allow him or her to cross the road without obstructing or endangering any traffic.\n\n" +
            "2. The driver/rider of a vehicle shall not enter a public road unless he or she can do so with safety to himself or herself and other traffic.\n";
    public static Integer enteringPublicRoadRulesImage = 0;
    public static Rule enteringPublicRoadRules = new Rule(enteringPublicRoadRulesTitle, enteringPublicRoadRulesInstruction, enteringPublicRoadRulesImage);



    public static String compulsoryStopsRulesTitle = "COMPULSORY STOPS";
    public static String compulsoryStopsRulesInstruction = "1. The driver/rider of a vehicle on a public road shall stop such vehicle —\n" + bulletSymbol +
            " in compliance with any direction conveyed by a road traffic sign or given by a traffic officer in uniform; or\n" + bulletSymbol +
            " at the request or on the signal of a person leading or driving any bovine animal, horse, donkey, mule, sheep, goat, pig or ostrich on the road.\n" + bulletSymbol +
            " when animals are seen crossing a road and driver/rider may only move when all the animals have crossed and the road is safe to continue driving.";
    public static Integer compulsoryStopsRulesImage = 0;
    public static Rule compulsoryStopsRules = new Rule(compulsoryStopsRulesTitle, compulsoryStopsRulesInstruction, compulsoryStopsRulesImage);




    public static String tyresRulesTitle = "TYRES";
    public static String tyresRulesInstruction = "Light Motor Vehicle\n\n" +
            "1. A light motor vehicle must be fitted with pneumatic tyres, which display throughout, across the breadth and around the entire circumference, a pattern that is clearly visible, and has a tread of at least 1 millimetre in depth.\n\n" +
            "Motorcycle\n\n" +
            "1. You may not ride a motorcycle on a public road-\n" + bulletSymbol +
            " having an engine with a cylinder capacity exceeding 50 cubic centimetres, every tyre displays throughout, across its breadth and around its entire circumference, a pattern which is clearly visible, and has a tread of at least one millimetre in depth;\n" + bulletSymbol +
            " with an engine having a cylinder capacity not exceeding 50 cubic centimetres, which is fitted with a pneumatic tyre which does not at any position on the tread thereof have a visible tread pattern over at least 80 percent of the full width of the tread, or\n" + bulletSymbol +
            " which is equipped with a retreated tyre\n";
    public static Integer tyresRulesImage = 0;
    public static Rule tyresRules = new Rule(tyresRulesTitle, tyresRulesInstruction, tyresRulesImage);




    public static String accidentsRulesTitle = "ACCIDENTS";
    public static String accidentsRulesInstruction = "1. Any driver/rider of a motor vehicle involved in an accident or who contributes to any accident must –\n" +  bulletSymbol +
            " immediately stop his/her vehicle;\n" + bulletSymbol +
            " ascertain the nature and extent of any injuries;\n" + bulletSymbol +
            " render such assistance to an injured person as he/she may be capable of rendering;\n" + bulletSymbol +
            " ascertain the nature and extent of any damage sustained;\n" + bulletSymbol +
            " if required to do so by any person having reasonable grounds to request it, give his/her name and address, name and address of the owner of the vehicle driven by him/her, and the registration number of the vehicle;\n" + bulletSymbol +
            " if he/she has not already furnished his/her and the owner’s names and addresses, and the registration number a traffic officer at the scene of the accident, within 24 hours report it to a police station and furnish any additional information that may be required of him/her.\n" + bulletSymbol +
            " not, except on the instructions of a medical practitioner, take any intoxicating liquor or narcotic drugs before he/she has reported the accident.\n\n" +
            "2. If a person has been killed or injured in an accident, and such accident causes a complete obstruction on the roadway, no vehicle may not be moved from the position from where it came to rest, unless its position has been clearly marked on the road surface by the person moving the vehicle, or such removal has been authorised by a traffic officer.\n\n" +
            "3. The driver or owner of a vehicle, which was damaged in a collision/accident, must give permission before such vehicle can be removed from the scene of an accident/collision.\n";
    public static Integer accidentsRulesImage = 0;
    public static Rule accidentsRules = new Rule(accidentsRulesTitle, accidentsRulesInstruction, accidentsRulesImage);




    public static String inconsiderateDrivingRulesTitle = "INCONSIDERATE DRIVING";
    public static String inconsiderateDrivingRulesInstruction = "1. No person shall drive a vehicle on a public road without reasonable consideration for any other person using the road.";
    public static Integer inconsiderateDrivingRulesImage = 0;
    public static Rule inconsiderateDrivingRules = new Rule(inconsiderateDrivingRulesTitle, inconsiderateDrivingRulesInstruction, inconsiderateDrivingRulesImage);



    public static String recklessDrivingRulesTitle = "RECKLESS OR NEGLIGENT DRIVING";
    public static String recklessDrivingRulesInstruction = "1. No person shall drive a vehicle on a public road -\n" + bulletSymbol +
            " recklessly or negligently; and\n" + bulletSymbol +
            " in a manner that wilfully disregard the safety of persons or property.";
    public static Integer recklessDrivingRulesImage = 0;
    public static Rule recklessDrivingRules = new Rule(recklessDrivingRulesTitle, recklessDrivingRulesInstruction, recklessDrivingRulesImage);



    public static String drivingUnderTheInfluenceRulesTitle = "DRIVING WHILE UNDER THE INFLUENCE OF INTOXICATING LIQUOR OR DRUGS";
    public static String drivingUnderTheInfluenceRulesInstruction = "1. No person shall drive a motor vehicle on a public road while the concentration of alcohol in a person’s body is:\n" +  bulletSymbol +
            " 0,05 grams per 100ml of blood or more, and;\n" + bulletSymbol +
            " 0,02 grams per 100ml of blood or more in a case of a professional driver.\n\n" +
            "2. No person shall -\n" + bulletSymbol +
            " drive a vehicle on a public road; or\n" + bulletSymbol +
            " occupy the drivers/riders seat of a motor vehicle of which the engine is running,\n" + bulletSymbol +
            " while under the influence of intoxicating liquor or a drug having a narcotic effect.";
    public static Integer drivingUnderTheInfluenceRulesImage = 0;
    public static Rule drivingUnderTheInfluenceRules = new Rule(drivingUnderTheInfluenceRulesTitle, drivingUnderTheInfluenceRulesInstruction, drivingUnderTheInfluenceRulesImage);








    public static String generalRoadRulesTitle = "General Rules";
    public static String generalRoadRulesInstruction = "Stop";
    public static Integer generalRoadRulesImage = 0;
    public static Rule generalRoadRules = new Rule(generalRoadRulesTitle, generalRoadRulesInstruction, generalRoadRulesImage);

    public static String overTakingLanesFreewayRulesTitle = "Overtaking, Lanes, Freeway";
    public static String overTakingLanesFreewayRulesInstruction = "Stop";
    public static Integer overTakingLanesFreewayRulesImage = 0;
    public static Rule overTakingLanesFreewayRules = new Rule(generalRoadRulesTitle, generalRoadRulesInstruction, generalRoadRulesImage);


    public static String speedRulesTitle = "Speed";
    public static String speedRulesInstruction = "Stop";
    public static Integer speedRulesImage = 0;
    public static Rule speedRules = new Rule(generalRoadRulesTitle, generalRoadRulesInstruction, generalRoadRulesImage);

    public static String parkingAndStoppingAreasRulesTitle = "Parking and Stopping Areas";
    public static String parkingAndStoppingAreasRulesInstruction = "Stop";
    public static Integer parkingAndStoppingAreasRulesImage = null;
    public static Rule parkingAndStoppingAreasRules = new Rule(generalRoadRulesTitle, generalRoadRulesInstruction, generalRoadRulesImage);




    /*
     * FAQs
     * */

    public static String learnerFAQ1question = "Why you need a learner's licence.";
    public static String learnerFAQ1answer = "A learner's licence is a permit that proves that you have basic knowledge of a motor vehicle and the rules of the road.\n" +
            "\nIf you have a learner's licence you are only allowed to drive a vehicle when you are supervised and accompanied by a licensed driver.";
    public static Integer learnerFAQ1image = 0;
    public static Rule learnerFAQ1 = new FAQ(learnerFAQ1question,learnerFAQ1answer,0);

    public static String learnerFAQ2question = "How long is a learner's licence valid for in South Africa.";
    public static String learnerFAQ2answer = "A learner's licence is valid for 24 months and cannot be extended.";
    public static Integer learnerFAQ2image = 0;
    public static Rule learnerFAQ2 = new FAQ(learnerFAQ2question,learnerFAQ2answer,0);

    public static String learnerFAQ3question = "How many categories are available for a learner's licence and the required age to apply.";
    public static String learnerFAQ3answer = "Code 1: Motorcycle with or without a sidecar, quad-cycle, and tricycle. " +
            "You must be 16 years or older for a motorcycle with an engine capacity of 125 cc or less, and 18 years or older for a motorcycle with an engine capacity of 125 cc or more.\n" +
            "\nCode 2: Motor vehicles (minibus, goods vehicles) with a gross mass of 3500 kg or less, and must be 17 years or older to apply.\n" +
            "\nCode 3: Motor Vehicles with a gross mass of 3500 kg or greater, and must be 18 years or older to apply.";
    public static Integer learnerFAQ3image = 0;
    public static Rule learnerFAQ3 = new FAQ(learnerFAQ3question,learnerFAQ3answer,0);

    public static String learnerFAQ4question = "How can I apply?";
    public static String learnerFAQ4answer = "Apply online for a learner's license" +
            " at https://online.natis.gov.za/ .\n" +
            "\nIf you were unable to apply online, find the nearest driving licensing test centre (DLTC) to book a test and confirm your test date.";
    public static Integer learnerFAQ4image = null;
    public static Rule learnerFAQ4 = new FAQ(learnerFAQ4question,learnerFAQ4answer,0);

    public static String learnerFAQ5question = "What are the required documents for a learner's licence application?";
    public static String learnerFAQ5answer = "Identity (ID) Document\n" +
            "\nBooking fee.\n" +
            "\nTwo identical black-white or color photos (at least 2 photos).\n" +
            "\nProof of postal and residential address.";
    public static Integer learnerFAQ5image = null;
    public static Rule learnerFAQ5 = new FAQ(learnerFAQ5question,learnerFAQ5answer,0);

    public static String learnerFAQ16question = "Which form am I required to fill for a learner's licence";
    public static String learnerFAQ6answer = "You will complete learner's licence (LL1) form which is available at the DLTC.\n" +
            "\nIf you are 65 years old or greater you should also complete a medical certificate form (MC) which will be available too at the DLTC.";
    public static Integer learnerFAQ6image = 0;
    public static Rule learnerFAQ6 = new FAQ(learnerFAQ16question,learnerFAQ6answer,0);

    public static String learnerFAQ7question = "Other requirements that are needed from you at the DLCT.";
    public static String learnerFAQ7answer = "You will be requested to do an eye test at the DLTC or have a qualified optometrist to test your eyes and submit the form at the testing centre.";
    public static Integer learnerFAQ7image = 0;
    public static Rule learnerFAQ7 = new FAQ(learnerFAQ7question,learnerFAQ7answer,0);

    public static String learnerFAQ8question = "What must I study for a learner's licence test?";
    public static String learnerFAQ8answer = "Rules of the Road\n" +
            "\nVehicle and/or Motorcycle Controls\n" +
            "\nRoad Signs and Road Markings\n";
    public static Integer learnerFAQ8image = 0;
    public static Rule learnerFAQ8 = new FAQ(learnerFAQ8question,learnerFAQ8answer,0);

    public static String learnerFAQ9question = "Which document or material is required before the test.";
    public static String learnerFAQ9answer = "Booking receipt\n" +
            "\nID Document\n" +
            "\nPen and Pencil";
    public static Integer learnerFAQ9image = null;
    public static Rule learnerFAQ9 = new FAQ(learnerFAQ9question,learnerFAQ9answer,0);

    public static String learnerFAQ10question = "How long does it take to get my learner's licence?";
    public static String learnerFAQ10answer = "The learner's licence is issued the same day if you have passed and paid the relevant issuing fee.";
    public static Integer learnerFAQ10image = null;
    public static Rule learnerFAQ10 = new FAQ(learnerFAQ10question,learnerFAQ10answer,0);

    public static String dummyRuleName = "";
    public static String dummyRuleInstruction = "";
    public static Integer dummyRuleImage = null;
    public static Rule dummyRule = new FAQ(dummyRuleName,dummyRuleInstruction,0);


    public static Rule[] driverFAQs = new Rule[]{
            new FAQ("Why you need a driver's licence.","To drive legally on South African roads, you need a driving licence. You must have a learner's licence before applying for a driving licence.",0),
            new FAQ("How can I apply?","You can apply online for your driving test at https://online.natis.gov.za/#/\nIf you could not apply online, find the nearest driving test and confirm your test date.",0),
            new FAQ(learnerFAQ5question.replace("learner's", "driver's"),"Your learner's licence.\n"+ learnerFAQ5answer,0),
            new FAQ("How many categories are available for a driver's license and the required age to apply?","",0),
//            new Rule("","",0),
            new FAQ("Which form am I required to fill for a Driver's license? (If you could not apply online).","You will complete Driver's license (DL1) form which is available at the DLTC.\nIf you are 65 years old or greater you should also complete a medical certificate form (MC) which will be available too at the DLTC.",0),
            new FAQ("Other processes or requirement that will be needed from you at the DLTC?","Your fingerprints will be taken, you need to do an eye test at the DLTC or have a qualified optometrist to test your eyes and submit the form at the testing centre. After the application has been processed you will be provided with a date and time for your driving test.",0),
            new FAQ("How will I be tested?","A qualified examiner will assess you.\nYou will be tested according to the K53 testing standard.\nYou will be tested to guarantee that you know and recognize the road traffic signs, knowledge of the rules of the road and the different signals which a driver of a vehicle is required to give when driving on a public road and are you capable of driving the type of vehicle specified on the (DL1) application form.",0),
            new FAQ("Which document or material is required before the test.","Booking receipt\nID Document\nLearner's license",0),
            new FAQ("How long does it take to get my driver's licence?","If you pass your driving licence test you will be issued with a temporary driving licence after paying the issuing fee, you will use the temporary driving licence while you wait for the credit card format driving license.\nThe driving licence should be ready within 4 to 6 weeks.\nThe driving license centre will notify you via email, SMS or post when your license is ready for collection.\nWhen collecting your license card, you will need to produce your ID document.\nLicenses not collected within 120 days are destroyed.",0),
    };

//
//    public static String driverFAQ1question = "Noise On The Road";
//    public static String learnerFAQ1answer = "Stop";
//    public static Integer learnerFAQ1image = null;
//    public static Rule learnerFAQ1 = new FAQ("","",0);
//
//    public static String learnerFAQ2question = "Noise On The Road";
//    public static String learnerFAQ2answer = "Stop";
//    public static Integer learnerFAQ2image = null;
//    public static Rule learnerFAQ2 = new FAQ("","",0);
//
//    public static String learnerFAQ3question = "Noise On The Road";
//    public static String learnerFAQ3answer = "Stop";
//    public static Integer learnerFAQ3image = null;
//    public static Rule learnerFAQ3 = new FAQ("","",0);
//
//    public static String learnerFAQ4question = "Noise On The Road";
//    public static String learnerFAQ4answer = "Stop";
//    public static Integer learnerFAQ4image = null;
//    public static Rule learnerFAQ4 = new FAQ("","",0);
//
//    public static String learnerFAQ5question = "Noise On The Road";
//    public static String learnerFAQ5answer = "Stop";
//    public static Integer learnerFAQ5image = null;
//    public static Rule learnerFAQ5 = new FAQ("","",0);
//
//    public static String learnerFAQ16question = "Noise On The Road";
//    public static String learnerFAQ6answer = "Stop";
//    public static Integer learnerFAQ6image = null;
//    public static Rule learnerFAQ6 = new FAQ("","",0);
//
//    public static String learnerFAQ7question = "Noise On The Road";
//    public static String learnerFAQ7answer = "Stop";
//    public static Integer learnerFAQ7image = null;
//    public static Rule learnerFAQ7 = new FAQ("","",0);
//
//    public static String learnerFAQ8question = "Noise On The Road";
//    public static String learnerFAQ8answer = "Stop";
//    public static Integer learnerFAQ8image = null;
//    public static Rule learnerFAQ8 = new FAQ("","",0);
//
//    public static String learnerFAQ9question = "Noise On The Road";
//    public static String learnerFAQ9answer = "Stop";
//    public static Integer learnerFAQ9image = null;
//    public static Rule learnerFAQ9 = new FAQ("","",0);
//
//    public static String learnerFAQ10question = "Noise On The Road";
//    public static String learnerFAQ10answer = "Stop";
//    public static Integer learnerFAQ10image = null;
//    public static Rule learnerFAQ10 = new FAQ("","",0);

//    public static String FAQ = "Noise On The Road";
//    public static String FAQ = "Stop";
//    public static Integer FAQ = null;
//    public static Rule faq = new FAQ("","",0);
}
