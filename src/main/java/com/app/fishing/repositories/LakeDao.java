package com.app.fishing.repositories;

import com.app.fishing.model.LakeEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Repository
public interface LakeDao extends JpaRepository<LakeEntity, Long> {

}
