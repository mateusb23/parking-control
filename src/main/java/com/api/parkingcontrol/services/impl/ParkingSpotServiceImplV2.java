package com.api.parkingcontrol.services.impl;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.services.ParkingSpotService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class ParkingSpotServiceImplV2 implements ParkingSpotService {


    @Override
    public ParkingSpotModel saveParking(ParkingSpotModel parkingSpotModel) {
        return null;
    }

    @Override
    public Boolean existsByLicensePlateCar(String licensePlateCar) {
        return null;
    }

    @Override
    public Boolean existsByParkingSpotNumber(String parkingspotNumber) {
        return null;
    }

    @Override
    public Boolean existsByApartmentAndBlock(String apartment, String block) {
        return null;
    }

    @Override
    public Page<ParkingSpotModel> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<ParkingSpotModel> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public void delete(ParkingSpotModel parkingSpotModel) {

    }
}
