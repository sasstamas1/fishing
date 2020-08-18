package com.app.fishing.service;


import com.app.fishing.dtos.FishDto;
import com.app.fishing.dtos.FishingDto;
import com.app.fishing.dtos.LakeDto;
import com.app.fishing.model.FishEntity;
import com.app.fishing.model.FishingEntity;
import com.app.fishing.model.LakeEntity;
import com.app.fishing.repositories.FishDao;
import com.app.fishing.repositories.FishingDao;

import com.app.fishing.repositories.LakeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class FishingService implements IFishingService {

    @Autowired
    private FishingDao fishingDao;
    @Autowired
    private FishDao fishDao;
    @Autowired
    private LakeDao lakeDao;


    @Override
    public List<FishingEntity> findall(){
        return fishingDao.findAll();
    }

    @Override
    public void saveFishing(FishingDto fishingDto) throws ParseException {
        System.out.println(fishingDto);
        List<FishDto> fishDtos= fishingDto.getFishs();
        List<FishEntity> fishEntities = new ArrayList<>();
        for(FishDto dto: fishDtos){
            DateFormat dateFormat = new SimpleDateFormat("hh:mm");
            Date d = dateFormat.parse(dto.getTime());
            FishEntity fishEntity = new FishEntity(dto.getName(), dto.getDate(), d,dto.getSize(),dto.getBait());
            fishDao.save(fishEntity);
            fishEntities.add(fishEntity);
        }
        LakeEntity lakeEntity = findOne(fishingDto.getLake());
        FishingEntity fishingEntity = new FishingEntity(fishingDto.getDate(),fishingDto.getWithwho(),fishingDto.getFishs_count(),lakeEntity,findbydate(fishingDto.getDate()));
        fishingDao.save(fishingEntity);
    }

    LakeEntity findOne(List<LakeDto> lakeDtos){
        LakeDto lakeDto = lakeDtos.get(0);
        List<LakeEntity> lakeEntities = lakeDao.findAll();
        for(LakeEntity lakeEntity: lakeEntities){
            if(lakeEntity.getName().equals(lakeDto.getName()) && lakeEntity.getLocation().equals(lakeDto.getLocation())){
                System.out.println(lakeEntity);
                return lakeEntity;
            }
        }
        return null;
    }

    List<FishEntity> findbydate(Date date){
        List<FishEntity> fishEntities = fishDao.findAll();
        List<FishEntity> result = new ArrayList<>();
        for(FishEntity fishEntity: fishEntities){
            if(fishEntity.getDate().equals(date)){
                result.add(fishEntity);
            }
        }
        return result;
    }

}