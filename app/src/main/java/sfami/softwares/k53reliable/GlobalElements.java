package sfami.softwares.k53reliable;

import static sfami.softwares.k53reliable.Questions.roadRulesQuestions;
import static sfami.softwares.k53reliable.Questions.roadSignsQuestions;
import static sfami.softwares.k53reliable.Questions.vehicleControlsQuestions;

public class GlobalElements {


    static char bulletSymbol='\u2023';


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



    /***
        Rules of the Road
     ***/

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
            new FAQ("Which form am I required to fill for a Driver's license? (If you could not apply online).","You will complete Driver's license (DL1) form which is available at the DLTC.\nIf you are 65 years old or greater you should also complete a medical certificate form (MC) which will be available too at the DLTC.",0),
            new FAQ("Other processes or requirement that will be needed from you at the DLTC?","Your fingerprints will be taken, you need to do an eye test at the DLTC or have a qualified optometrist to test your eyes and submit the form at the testing centre. After the application has been processed you will be provided with a date and time for your driving test.",0),
            new FAQ("How will I be tested?","A qualified examiner will assess you.\nYou will be tested according to the K53 testing standard.\nYou will be tested to guarantee that you know and recognize the road traffic signs, knowledge of the rules of the road and the different signals which a driver of a vehicle is required to give when driving on a public road and are you capable of driving the type of vehicle specified on the (DL1) application form.",0),
            new FAQ("Which document or material is required before the test.","Booking receipt\nID Document\nLearner's license",0),
            new FAQ("How long does it take to get my driver's licence?","If you pass your driving licence test you will be issued with a temporary driving licence after paying the issuing fee, you will use the temporary driving licence while you wait for the credit card format driving license.\nThe driving licence should be ready within 4 to 6 weeks.\nThe driving license centre will notify you via email, SMS or post when your license is ready for collection.\nWhen collecting your license card, you will need to produce your ID document.\nLicenses not collected within 120 days are destroyed.",0),
    };

}
