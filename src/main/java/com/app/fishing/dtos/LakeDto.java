package com.app.fishing.dtos;

import java.util.Objects;

public class LakeDto {


    private String name;

    private String location;

    private int price;

    private String fishs;

    public LakeDto(String name, String location, int price, String fishs) {
        this.name = name;
        this.location = location;
        this.price = price;
        this.fishs = fishs;
    }

    public LakeDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFishs() {
        return fishs;
    }

    public void setFishs(String fishs) {
        this.fishs = fishs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LakeDto lakeDto = (LakeDto) o;
        return price == lakeDto.price &&
                Objects.equals(name, lakeDto.name) &&
                Objects.equals(location, lakeDto.location) &&
                Objects.equals(fishs, lakeDto.fishs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, price, fishs);
    }

    @Override
    public String toString() {
        return "LakeDto{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", price=" + price +
                ", fishs='" + fishs + '\'' +
                '}';
    }
}
