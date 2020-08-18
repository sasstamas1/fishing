package com.app.fishing.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "fish", schema = "dbo")
@NamedQuery(name = "FishEntity.findAll", query = "select fish from FishEntity fish")
public class FishEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fish_id")
    private Long fish_id;
    @Column(name = "name")
    private String name;
    @Column(name = "date")
    private Date date;
    @Column(name = "time")
    private Date time;
    @Column(name = "size")
    private float size;
    @Column(name="bait")
    private String bait;

    @ManyToOne
    @JoinColumn(name = "fishing_id")
    private FishingEntity fishing;

    public FishEntity() {
    }

    public FishEntity(String name, Date date, Date time, float size, String bait) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.size = size;
        this.bait = bait;
    }

    public Long getId() {
        return fish_id;
    }

    public void setId(Long id) {
        this.fish_id = id;
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
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

    public FishingEntity getFishing() {
        return fishing;
    }

    public void setFishing(FishingEntity fishing) {
        this.fishing = fishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FishEntity that = (FishEntity) o;
        return size == that.size &&
                Objects.equals(fish_id, that.fish_id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(date, that.date) &&
                Objects.equals(time, that.time) &&
                Objects.equals(bait, that.bait);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fish_id, name, date, time, size, bait);
    }

    @Override
    public String toString() {
        return "FishEntity{" +
                "id=" + fish_id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", size=" + size +
                ", bait='" + bait + '\'' +
                '}';
    }
}