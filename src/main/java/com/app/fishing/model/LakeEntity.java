package com.app.fishing.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "lake", schema = "dbo")
@NamedQuery(name = "LakeEntity.findAll", query = "select lake from LakeEntity lake")
public class LakeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lake_id", nullable = false, unique = true)
    private Long lake_id;
    @Column(name = "name")
    private String name;
    @Column(name="location")
    private String location;
    @Column(name="price")
    private int price;
    @Column(name="fishs")
    private String fishs;

    @OneToOne(mappedBy = "lake")
    private FishingEntity fishingEntity;

    public LakeEntity() {
    }

    public LakeEntity(String name, String location, int price, String fishs) {
        this.name = name;
        this.location = location;
        this.price = price;
        this.fishs = fishs;
    }

    public Long getLake_id() {
        return lake_id;
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
        LakeEntity that = (LakeEntity) o;
        return price == that.price &&
                Objects.equals(lake_id, that.lake_id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(location, that.location) &&
                Objects.equals(fishs, that.fishs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lake_id, name, location, price, fishs);
    }

    @Override
    public String toString() {
        return "LakeEntity{" +
                "id=" + lake_id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", price=" + price +
                ", fishs='" + fishs + '\'' +
                '}';
    }
}
