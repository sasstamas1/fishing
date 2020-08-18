package com.app.fishing.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "fishing", schema = "dbo")
@NamedQuery(name = "FishingEntity.findAll", query = "select fishing from FishingEntity fishing")
public class FishingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fishing_id")
    private Long fishing_id;
    @Column(name = "date")
    private Date date;
    @Column(name="withwho")
    private String withwho;
    @Column(name="fishs_count")
    private int fishs_count;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lake_id")
    private LakeEntity lake;

    @OneToMany(mappedBy = "fishing", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<FishEntity> fishEntitiess = new ArrayList<>();


    public FishingEntity() {
    }

    public FishingEntity(Date date, String withwho, int fishs_count, LakeEntity lakeEntity, List<FishEntity> fishEntitiess) {
        this.date = date;
        this.withwho = withwho;
        this.fishs_count = fishs_count;
        this.lake = lakeEntity;
        this.fishEntitiess = fishEntitiess;
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

    public LakeEntity getLakeEntity() {
        return lake;
    }

    public void setLakeEntity(LakeEntity lakeEntity) {
        this.lake = lakeEntity;
    }

    public List<FishEntity> getFishEntitiess() {
        return fishEntitiess;
    }

    public void setFishEntitiess(List<FishEntity> fishEntitiess) {
        this.fishEntitiess = fishEntitiess;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FishingEntity that = (FishingEntity) o;
        return fishs_count == that.fishs_count &&
                Objects.equals(fishing_id, that.fishing_id) &&
                Objects.equals(date, that.date) &&
                Objects.equals(withwho, that.withwho) &&
                Objects.equals(lake, that.lake) &&
                Objects.equals(fishEntitiess, that.fishEntitiess);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fishing_id, date, withwho, fishs_count, lake, fishEntitiess);
    }

    @Override
    public String toString() {
        return "FishingEntity{" +
                "fishing_id=" + fishing_id +
                ", date=" + date +
                ", withwho='" + withwho + '\'' +
                ", fishs_count=" + fishs_count +
                ", lakeEntity=" + lake +
                ", fishEntitiess=" + fishEntitiess +
                '}';
    }
}