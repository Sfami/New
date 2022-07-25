package sfami.softwares.k53reliable;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.rewarded.RewardedAd;

public class MyRoadSignAdapter extends RecyclerView.Adapter<MyRoadSignAdapter.ViewHolder> {

    MyRoadSignData[] myRoadSignData;
    Context context;
    private RewardedAd mRewardedAd;

    public MyRoadSignAdapter(MyRoadSignData[] myRoadSignData, Activity activity) {
        this.myRoadSignData = myRoadSignData;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.road_sign_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MyRoadSignData myRoadSignDataList = myRoadSignData[position];
        holder.textViewTitle.setText(myRoadSignDataList.getName());
        holder.textViewDescription.setText(myRoadSignDataList.getDescription());
        holder.movieImage.setImageResource(myRoadSignDataList.getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, myRoadSignDataList.getName(), Toast.LENGTH_SHORT).show();

                if (myRoadSignDataList.getName().equals(RoadSigns.controlSignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(RoadSigns.stopSign),
                            new MyRoadSignData(RoadSigns.stopOrYieldSign),
                            new MyRoadSignData(RoadSigns.fourWayStopSign),
                            new MyRoadSignData(RoadSigns.stopOrGOSign),
                            new MyRoadSignData(RoadSigns.yieldSign),
                            new MyRoadSignData(RoadSigns.yieldToPedestriansSign),
                            new MyRoadSignData(RoadSigns.yieldAtTrafficCircleSign),
                            new MyRoadSignData(RoadSigns.noEntrySign),
                            new MyRoadSignData(RoadSigns.oneWayRoadwaySign),
                            new MyRoadSignData(RoadSigns.pedestrianPrioritySign),
                            new MyRoadSignData(RoadSigns.threeWayStopSign),
                            new MyRoadSignData(RoadSigns.yieldToOncomingTrafficSignPurposeSign),
                    };
                    intent.putExtra("data", d);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getName().equals(RoadSigns.commandSignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(RoadSigns.minimumSpeedLimitSign),
                            new MyRoadSignData(RoadSigns.vehicleExceedingMassOnlySign),
                            new MyRoadSignData(RoadSigns.keepLeftSign),
                            new MyRoadSignData(RoadSigns.pedestriansOnlySign),
                            new MyRoadSignData(RoadSigns.cyclistsOnlySign),
                            new MyRoadSignData(RoadSigns.motorcyclesOnlySign),
                            new MyRoadSignData(RoadSigns.motorCarsOnlySign),
                            new MyRoadSignData(RoadSigns.taxisOnlySign),
                            new MyRoadSignData(RoadSigns.minibusesOnlySign),
                            new MyRoadSignData(RoadSigns.busesOnlySign),
                            new MyRoadSignData(RoadSigns.goodsVehiclesOnlySign),
                            new MyRoadSignData(RoadSigns.constructionVehiclesOnlySign),
                            new MyRoadSignData(RoadSigns.abnormalVehiclesOnlySign),
                            new MyRoadSignData(RoadSigns.agriculturalOnlySign),
                            new MyRoadSignData(RoadSigns.payTollSign),
                            new MyRoadSignData(RoadSigns.headlightsOnSign),
                            new MyRoadSignData(RoadSigns.roundaboutSign),

                    };
                    intent.putExtra("data", d);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getName().equals(RoadSigns.prohibitionsSignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(RoadSigns.speedLimitSign),
                            new MyRoadSignData(RoadSigns.massLimitSign),
                            new MyRoadSignData(RoadSigns.axleMassLimitSign),
                            new MyRoadSignData(RoadSigns.heightLimitSign),
                            new MyRoadSignData(RoadSigns.lengthLimitSign),
                            new MyRoadSignData(RoadSigns.unauthorisedVehiclesProhibitedSign),
                            new MyRoadSignData(RoadSigns.uTurnProhibitedSign),
                            new MyRoadSignData(RoadSigns.overTakingProhibitedSign),
                            new MyRoadSignData(RoadSigns.parkingProhibitedSign),
                            new MyRoadSignData(RoadSigns.stoppingProhibitedSign),
                    };
                    intent.putExtra("data", d);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getName().equals(RoadSigns.reservationSignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(RoadSigns.busReservationSign),
                            new MyRoadSignData(RoadSigns.busLaneReservationSign),
                            new MyRoadSignData(RoadSigns.parkingReservationSign),
                            new MyRoadSignData(RoadSigns.limitedParkingReservationSign),
                            new MyRoadSignData(RoadSigns.motorcycleReservationSign),
                    };
                    intent.putExtra("data", d);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getName().equals(RoadSigns.comprehensiveSignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(RoadSigns.dualCarriagewayFreewayBeginsSign),
                            new MyRoadSignData(RoadSigns.singleCarriagewayFreewayBeginsSign),
                            new MyRoadSignData(RoadSigns.woonerfSign),
                    };
                    intent.putExtra("data", d);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getName().equals(RoadSigns.secondarySignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(RoadSigns.timeLimitSubgroupSign),
                            new MyRoadSignData(RoadSigns.maxStayDuringTwoPeriodsOrDaysSign),
                            new MyRoadSignData(RoadSigns.dayTimeSign),
                            new MyRoadSignData(RoadSigns.nightTimeSign),
                            new MyRoadSignData(RoadSigns.payAndDisplaySign),
                            new MyRoadSignData(RoadSigns.maxNumberOfVehiclesSign),
                    };
                    intent.putExtra("data", d);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getName().equals(RoadSigns.deRestrictionSignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(RoadSigns.deRestrictionSignsSign),
                    };
                    intent.putExtra("data", d);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    context.startActivity(intent);
                }

                if (myRoadSignDataList.getName().equals(RoadSigns.roadLayoutSignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(RoadSigns.crossroadSign),
                            new MyRoadSignData(RoadSigns.priorityCrossroadSign),
                            new MyRoadSignData(RoadSigns.secondaryCrossroadSign),
                            new MyRoadSignData(RoadSigns.tJunctionSign),
                            new MyRoadSignData(RoadSigns.skewTJunctionSign),
                            new MyRoadSignData(RoadSigns.sideRoadSign),
                            new MyRoadSignData(RoadSigns.staggeredJunctionsSign),
                            new MyRoadSignData(RoadSigns.sharpJunctionSign),
                            new MyRoadSignData(RoadSigns.yJunctionSign),
                            new MyRoadSignData(RoadSigns.beginningOfDualRoadwaySign),
                            new MyRoadSignData(RoadSigns.endOfDualRoadwaySign),
                    };
                    intent.putExtra("data", d);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getName().equals(RoadSigns.directionOfMovementSignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(RoadSigns.trafficCircleSign),
                            new MyRoadSignData(RoadSigns.gentleCurveSign),
                            new MyRoadSignData(RoadSigns.hairpinBendSign),
                            new MyRoadSignData(RoadSigns.windingRoadSign),
                            new MyRoadSignData(RoadSigns.combinedCurvesSign),
                            new MyRoadSignData(RoadSigns.twoWayTrafficSign),
                            new MyRoadSignData(RoadSigns.laneEndsSign),
                            new MyRoadSignData(RoadSigns.concealedDrivewaySign),
                    };
                    intent.putExtra("data", d);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getName().equals(RoadSigns.symbolicSignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(RoadSigns.symbolicSignsSign),
                            new MyRoadSignData(RoadSigns.pedestrianCrossingSign),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getName().equals(RoadSigns.routeMarkersSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(RoadSigns.advanceTrailblazerSign),
                            new MyRoadSignData(RoadSigns.overheadDirectionSign),
                            new MyRoadSignData(RoadSigns.fingerBoardSign),
                            new MyRoadSignData(RoadSigns.stackTypeDirectionSign),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getName().equals(RoadSigns.directionSignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(RoadSigns.advanceExitDirectionSign),
                            new MyRoadSignData(RoadSigns.exitDirectionSign),
                            new MyRoadSignData(RoadSigns.exitSequenceSign),
                            new MyRoadSignData(RoadSigns.farSideAdvanceOnRampDirectionSign),
                            new MyRoadSignData(RoadSigns.overheadFreewayDirectionSign),
                    };
                    intent.putExtra("data", d);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getName().equals(RoadSigns.diagrammaticSignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(RoadSigns.lanesMergeSign),
                            new MyRoadSignData(RoadSigns.diagrammaticSignsSign),
                    };
                    intent.putExtra("data", d);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getName().equals(RoadSigns.exampleOfTemporarySignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(RoadSigns.exampleOfTemporarySignsSign),
                    };
                    intent.putExtra("data", d);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    context.startActivity(intent);
                }

                if (myRoadSignDataList.getName().equals("Regulatory Markings")){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(RoadSigns.roadMarkingsSign),
                    };
                    intent.putExtra("data", d);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    context.startActivity(intent);
                }

                if (myRoadSignDataList.getName().equals("Warning Markings")){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    MyRoadSignData[] d = new MyRoadSignData[]{

                    };
                    intent.putExtra("data", d);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    context.startActivity(intent);
                }

                if (myRoadSignDataList.getName().equals("Guidance Markings")){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    MyRoadSignData[] d = new MyRoadSignData[]{

                    };
                    intent.putExtra("data", d);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    context.startActivity(intent);
                }

                if (myRoadSignDataList.getName().equals(RoadSigns.trafficLightsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    MyRoadSignData[] d = new MyRoadSignData[]{

                    };
                    intent.putExtra("data", d);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getName().equals(RoadSigns.otherRegulatorySignalsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(RoadSigns.stopFrontSignalSign),
                            new MyRoadSignData(RoadSigns.stopRearSignalSign),
                            new MyRoadSignData(RoadSigns.stopFrontAndRearSignalSign),
                            new MyRoadSignData(RoadSigns.proceedSignalSign),
                            new MyRoadSignData(RoadSigns.stopFlagSignalSign),
                            new MyRoadSignData(RoadSigns.proceedFlagSignalSign),
                            new MyRoadSignData(RoadSigns.warningFlagSignalSign),
                    };
                    intent.putExtra("data", d);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    context.startActivity(intent);
                }

                if (myRoadSignDataList.getName().equals(RoadSigns.informationSignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    MyRoadSignData[] d = new MyRoadSignData[]{

                    };
                    intent.putExtra("data", d);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return myRoadSignData.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView movieImage;
        TextView textViewTitle;
        TextView textViewDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            movieImage = itemView.findViewById(R.id.imageview);
            textViewTitle = itemView.findViewById(R.id.title);
            textViewDescription = itemView.findViewById(R.id.description);

        }
    }


}
