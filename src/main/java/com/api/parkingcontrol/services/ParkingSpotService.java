package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import java.util.Optional;
import java.util.UUID;

public interface ParkingSpotService {

    ParkingSpotModel save(ParkingSpotModel parkingSpotModel);
    Boolean existsByLicensePlateCar(String licensePlateCar);
    Boolean existsByParkingSpotNumber(String parkingspotNumber);
    Boolean existsByApartmentAndBlock(String apartment, String block);
    Page<ParkingSpotModel> findAll(Pageable pageable);
    Optional<ParkingSpotModel> findById(UUID id);
    void delete(ParkingSpotModel parkingSpotModel);

}
