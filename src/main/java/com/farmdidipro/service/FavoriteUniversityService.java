package com.farmdidipro.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmdidipro.dao.FavoriteUniversityRepository;
import com.farmdidipro.model.FavoriteUniversity;

import java.util.List;

@Service
public class FavoriteUniversityService {

    @Autowired
    private FavoriteUniversityRepository favoriteUniversityRepository;

    public List<FavoriteUniversity> getAllFavorites() {
        return favoriteUniversityRepository.findAll();
    }

    public void addFavorite(FavoriteUniversity favoriteUniversity) {
        favoriteUniversityRepository.save(favoriteUniversity);
    }

    public void removeFavorite(Long id) {
        favoriteUniversityRepository.deleteById(id);
    }
}
