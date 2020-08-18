package com.app.fishing.dtos;

import java.util.Date;
import java.util.Objects;

public class FishDto {
    private String name;

    private float size;

    private Date date;

    private String time;

    private String bait;

    public FishDto(String name,float size, Date date, String time,  String bait) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.size = size;
        this.bait = bait;
    }

    public FishDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getBait() {
        return bait;
    }

    public void setBait(String bait) {
        this.bait = bait;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FishDto that = (FishDto) o;
        return Float.compare(that.size, size) == 0 &&
                Objects.equals(name, that.name) &&
                Objects.equals(date, that.date) &&
                Objects.equals(time, that.time) &&
                Objects.equals(bait, that.bait);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date, time, size, bait);
    }

    @Override
    public String toString() {
        return "FishDto{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", size=" + size +
                ", bait='" + bait + '\'' +
                '}';
    }
}
