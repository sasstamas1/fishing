package com.app.fishing.dtos;


import com.app.fishing.model.LakeEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class FishingDto {

    private List<FishDto> fishs = new ArrayList<FishDto>();

    private List<LakeDto> lake = new ArrayList<>();

    private int fishs_count;

    private Date date;

    private String withwho;


    public FishingDto( List<FishDto> fishs,List<LakeDto> lake, int fishs_count, String withwho) {
        this.date = date;
        this.withwho = withwho;
        this.fishs_count = fishs_count;
        this.lake = lake;
        this.fishs = fishs;
    }

    public FishingDto() {
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getWithwho() {
        return withwho;
    }

    public void setWithwho(String withwho) {
        this.withwho = withwho;
    }

    public int getFishs_count() {
        return fishs_count;
    }

    public void setFishs_count(int fishs_count) {
        this.fishs_count = fishs_count;
    }

    public List<LakeDto> getLake() {
        return lake;
    }

    public void setLake(List<LakeDto> lakeDto) {
        this.lake = lakeDto;
    }

    public List<FishDto> getFishs() {
        return fishs;
    }

    public void setFishs(List<FishDto> fishs) {
        this.fishs = fishs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FishingDto that = (FishingDto) o;
        return fishs_count == that.fishs_count &&
                Objects.equals(date, that.date) &&
                Objects.equals(withwho, that.withwho) &&
                Objects.equals(lake, that.lake) &&
                Objects.equals(fishs, that.fishs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, withwho, fishs_count, lake, fishs);
    }

    @Override
    public String toString() {
        return "FishingDto{" +
                "date=" + date +
                ", withwho='" + withwho + '\'' +
                ", fishs_count=" + fishs_count +
                ", lake=" + lake +
                ", fishs=" + fishs +
                '}';
    }
}
