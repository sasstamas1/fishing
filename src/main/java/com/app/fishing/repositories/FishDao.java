package com.app.fishing.repositories;

import com.app.fishing.model.FishEntity;
import com.app.fishing.model.FishingEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;


@Transactional
@Repository
public interface FishDao extends JpaRepository<FishEntity, Long> {


}