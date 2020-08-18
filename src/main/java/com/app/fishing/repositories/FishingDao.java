package com.app.fishing.repositories;

import com.app.fishing.model.FishingEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Repository
public interface FishingDao extends JpaRepository<FishingEntity, Long> {

}