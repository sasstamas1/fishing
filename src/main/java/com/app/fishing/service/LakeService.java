package com.app.fishing.service;

import com.app.fishing.dtos.LakeDto;
import com.app.fishing.model.LakeEntity;
import com.app.fishing.repositories.FishingDao;
import com.app.fishing.repositories.LakeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class LakeService implements ILakeService {

    @Autowired
    private LakeDao lakeDao;


    @Override
    public void saveLake(LakeDto lake){
        lakeDao.save(new LakeEntity(lake.getName(),lake.getLocation(),lake.getPrice(),lake.getFishs()));
    }

    @Override
    public List<LakeEntity> findall(){
        return lakeDao.findAll();
    }
}
