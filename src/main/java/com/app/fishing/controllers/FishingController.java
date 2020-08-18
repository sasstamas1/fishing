package com.app.fishing.controllers;

import com.app.fishing.dtos.FishingDto;
import com.app.fishing.model.FishingEntity;
import com.app.fishing.service.IFishingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;


@RestController
@RequestMapping("/fishing")
@CrossOrigin(value = "http://localhost:4200")
public class FishingController {
    @Autowired
    private IFishingService fishingService;


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    void fishingLake(@RequestBody FishingDto fishing) throws ParseException {
        fishingService.saveFishing(fishing);

    }

    @RequestMapping(method = RequestMethod.GET)
    List<FishingEntity> findallFishing(){
        return fishingService.findall();

    }

}