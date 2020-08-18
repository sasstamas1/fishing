package com.app.fishing.service;

import com.app.fishing.dtos.FishingDto;
import com.app.fishing.model.FishingEntity;

import java.text.ParseException;
import java.util.List;

public interface IFishingService {

    void saveFishing(FishingDto fishingDto) throws ParseException;

    List<FishingEntity> findall();
}
