package com.app.fishing.service;

import com.app.fishing.model.FishEntity;
import com.app.fishing.repositories.FishDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FishService implements IFishService {

    @Autowired
    private FishDao fishDao;


    @Override
    public List<FishEntity> findall(){
        return fishDao.findAll();
    }
}