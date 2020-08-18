package com.app.fishing.controllers;

import com.app.fishing.model.FishEntity;
import com.app.fishing.service.IFishService;
import com.app.fishing.service.IFishingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fish")
@CrossOrigin(value = "http://localhost:4200")
public class FishController {
    @Autowired
    private IFishService fishService;



    @RequestMapping(method = RequestMethod.GET)
    List<FishEntity> findallFish(){
        return fishService.findall();

    }



}
