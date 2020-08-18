package com.app.fishing.service;

import com.app.fishing.dtos.LakeDto;
import com.app.fishing.model.LakeEntity;

import java.util.List;

public interface ILakeService {

    void saveLake(LakeDto lake);

    List<LakeEntity> findall();

}
