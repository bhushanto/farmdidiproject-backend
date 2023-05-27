package com.farmdidipro.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmdidipro.model.FavoriteUniversity;

@Repository
public interface FavoriteUniversityRepository extends JpaRepository<FavoriteUniversity, Long> {
}
