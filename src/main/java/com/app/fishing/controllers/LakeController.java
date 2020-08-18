package com.app.fishing.controllers;

import com.app.fishing.dtos.LakeDto;
import com.app.fishing.model.LakeEntity;
import com.app.fishing.service.ILakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/lake")
@CrossOrigin(value = "http://localhost:4200")
public class LakeController {
    @Autowired
    private ILakeService lakeService;


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    void addLake(@RequestBody LakeDto lake) {
        lakeService.saveLake(lake);

    }


    @RequestMapping(method = RequestMethod.GET)
    List<LakeEntity> findallLake(){
        return lakeService.findall();

    }



}