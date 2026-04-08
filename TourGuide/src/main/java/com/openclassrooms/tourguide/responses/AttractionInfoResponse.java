package com.openclassrooms.tourguide.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AttractionInfoResponse {
    private String attractionName;
    private double attractionLatitude;
    private double attractionLongitude;
    private double userLatitude;
    private double userLongitude;
    private double distanceInMiles;
    private int rewardPoints;
}
