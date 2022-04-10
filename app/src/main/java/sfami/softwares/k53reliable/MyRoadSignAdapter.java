package sfami.softwares.k53reliable;

import static android.content.ContentValues.TAG;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

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
        holder.textViewTitle.setText(myRoadSignDataList.getSignName());
        holder.textViewDescription.setText(myRoadSignDataList.getSignDescriptions());
        holder.movieImage.setImageResource(myRoadSignDataList.getSignImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, myRoadSignDataList.getSignName(), Toast.LENGTH_SHORT).show();

                if (myRoadSignDataList.getSignName().equals(GlobalElements.controlSignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(GlobalElements.stopSign),
                            new MyRoadSignData(GlobalElements.stopOrYieldSign),
                            new MyRoadSignData(GlobalElements.fourWayStopSign),
                            new MyRoadSignData(GlobalElements.stopOrGOSign),
                            new MyRoadSignData(GlobalElements.yieldSign),
                            new MyRoadSignData(GlobalElements.yieldToPedestriansSign),
                            new MyRoadSignData(GlobalElements.yieldAtTrafficCircleSign),
                            new MyRoadSignData(GlobalElements.noEntrySign),
                            new MyRoadSignData(GlobalElements.oneWayRoadwaySign),
                            new MyRoadSignData(GlobalElements.pedestrianPrioritySign),
                            new MyRoadSignData(GlobalElements.threeWayStopSign),
                            new MyRoadSignData(GlobalElements.yieldToOncomingTrafficSignPurposeSign),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getSignName().equals(GlobalElements.commandSignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(GlobalElements.minimumSpeedLimitSign),
                            new MyRoadSignData(GlobalElements.vehicleExceedingMassOnlySign),
                            new MyRoadSignData(GlobalElements.keepLeftSign),
                            new MyRoadSignData(GlobalElements.pedestriansOnlySign),
                            new MyRoadSignData(GlobalElements.cyclistsOnlySign),
                            new MyRoadSignData(GlobalElements.motorcyclesOnlySign),
                            new MyRoadSignData(GlobalElements.motorCarsOnlySign),
                            new MyRoadSignData(GlobalElements.taxisOnlySign),
                            new MyRoadSignData(GlobalElements.minibusesOnlySign),
                            new MyRoadSignData(GlobalElements.busesOnlySign),
                            new MyRoadSignData(GlobalElements.goodsVehiclesOnlySign),
                            new MyRoadSignData(GlobalElements.constructionVehiclesOnlySign),
                            new MyRoadSignData(GlobalElements.abnormalVehiclesOnlySign),
                            new MyRoadSignData(GlobalElements.agriculturalOnlySign),
                            new MyRoadSignData(GlobalElements.payTollSign),
                            new MyRoadSignData(GlobalElements.headlightsOnSign),
                            new MyRoadSignData(GlobalElements.roundaboutSign),

                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getSignName().equals(GlobalElements.prohibitionsSignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(GlobalElements.speedLimitSign),
                            new MyRoadSignData(GlobalElements.massLimitSign),
                            new MyRoadSignData(GlobalElements.axleMassLimitSign),
                            new MyRoadSignData(GlobalElements.heightLimitSign),
                            new MyRoadSignData(GlobalElements.lengthLimitSign),
                            new MyRoadSignData(GlobalElements.unauthorisedVehiclesProhibitedSign),
                            new MyRoadSignData(GlobalElements.uTurnProhibitedSign),
                            new MyRoadSignData(GlobalElements.overTakingProhibitedSign),
                            new MyRoadSignData(GlobalElements.parkingProhibitedSign),
                            new MyRoadSignData(GlobalElements.stoppingProhibitedSign),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getSignName().equals(GlobalElements.reservationSignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(GlobalElements.busReservationSign),
                            new MyRoadSignData(GlobalElements.busLaneReservationSign),
                            new MyRoadSignData(GlobalElements.parkingReservationSign),
                            new MyRoadSignData(GlobalElements.limitedParkingReservationSign),
                            new MyRoadSignData(GlobalElements.motorcycleReservationSign),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getSignName().equals(GlobalElements.comprehensiveSignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(GlobalElements.dualCarriagewayFreewayBeginsSign),
                            new MyRoadSignData(GlobalElements.singleCarriagewayFreewayBeginsSign),
                            new MyRoadSignData(GlobalElements.woonerfSign),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getSignName().equals(GlobalElements.secondarySignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(GlobalElements.timeLimitSubgroupSign),
                            new MyRoadSignData(GlobalElements.maxStayDuringTwoPeriodsOrDaysSign),
                            new MyRoadSignData(GlobalElements.dayTimeSign),
                            new MyRoadSignData(GlobalElements.nightTimeSign),
                            new MyRoadSignData(GlobalElements.payAndDisplaySign),
                            new MyRoadSignData(GlobalElements.maxNumberOfVehiclesSign),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getSignName().equals(GlobalElements.deRestrictionSignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(GlobalElements.deRestrictionSignsSign),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }

                if (myRoadSignDataList.getSignName().equals(GlobalElements.roadLayoutSignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(GlobalElements.crossroadSign),
                            new MyRoadSignData(GlobalElements.priorityCrossroadSign),
                            new MyRoadSignData(GlobalElements.secondaryCrossroadSign),
                            new MyRoadSignData(GlobalElements.tJunctionSign),
                            new MyRoadSignData(GlobalElements.skewTJunctionSign),
                            new MyRoadSignData(GlobalElements.sideRoadSign),
                            new MyRoadSignData(GlobalElements.staggeredJunctionsSign),
                            new MyRoadSignData(GlobalElements.sharpJunctionSign),
                            new MyRoadSignData(GlobalElements.yJunctionSign),
                            new MyRoadSignData(GlobalElements.beginningOfDualRoadwaySign),
                            new MyRoadSignData(GlobalElements.endOfDualRoadwaySign),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getSignName().equals(GlobalElements.directionOfMovementSignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(GlobalElements.trafficCircleSign),
                            new MyRoadSignData(GlobalElements.gentleCurveSign),
                            new MyRoadSignData(GlobalElements.hairpinBendSign),
                            new MyRoadSignData(GlobalElements.windingRoadSign),
                            new MyRoadSignData(GlobalElements.combinedCurvesSign),
                            new MyRoadSignData(GlobalElements.twoWayTrafficSign),
                            new MyRoadSignData(GlobalElements.laneEndsSign),
                            new MyRoadSignData(GlobalElements.concealedDrivewaySign),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getSignName().equals(GlobalElements.symbolicSignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(GlobalElements.symbolicSignsSign),
                            new MyRoadSignData(GlobalElements.pedestrianCrossingSign),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getSignName().equals(GlobalElements.routeMarkersSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(GlobalElements.advanceTrailblazerSign),
                            new MyRoadSignData(GlobalElements.overheadDirectionSign),
                            new MyRoadSignData(GlobalElements.fingerBoardSign),
                            new MyRoadSignData(GlobalElements.stackTypeDirectionSign),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getSignName().equals(GlobalElements.directionSignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(GlobalElements.advanceExitDirectionSign),
                            new MyRoadSignData(GlobalElements.exitDirectionSign),
                            new MyRoadSignData(GlobalElements.exitSequenceSign),
                            new MyRoadSignData(GlobalElements.farSideAdvanceOnRampDirectionSign),
                            new MyRoadSignData(GlobalElements.overheadFreewayDirectionSign),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getSignName().equals(GlobalElements.diagrammaticSignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(GlobalElements.lanesMergeSign),
                            new MyRoadSignData(GlobalElements.diagrammaticSignsSign),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getSignName().equals(GlobalElements.exampleOfTemporarySignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(GlobalElements.exampleOfTemporarySignsSign),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }

                if (myRoadSignDataList.getSignName().equals("Regulatory Markings")){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(GlobalElements.roadMarkingsSign),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }

                if (myRoadSignDataList.getSignName().equals("Warning Markings")){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    MyRoadSignData[] d = new MyRoadSignData[]{

                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }

                if (myRoadSignDataList.getSignName().equals("Guidance Markings")){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    MyRoadSignData[] d = new MyRoadSignData[]{

                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }

                if (myRoadSignDataList.getSignName().equals(GlobalElements.trafficLightsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    MyRoadSignData[] d = new MyRoadSignData[]{

                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getSignName().equals(GlobalElements.otherRegulatorySignalsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(GlobalElements.stopFrontSignalSign),
                            new MyRoadSignData(GlobalElements.stopRearSignalSign),
                            new MyRoadSignData(GlobalElements.stopFrontAndRearSignalSign),
                            new MyRoadSignData(GlobalElements.proceedSignalSign),
                            new MyRoadSignData(GlobalElements.stopFlagSignalSign),
                            new MyRoadSignData(GlobalElements.proceedFlagSignalSign),
                            new MyRoadSignData(GlobalElements.warningFlagSignalSign),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }

                if (myRoadSignDataList.getSignName().equals(GlobalElements.informationSignsSignName)){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    MyRoadSignData[] d = new MyRoadSignData[]{

                    };
                    intent.putExtra("data", d);
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
