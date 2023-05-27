package com.farmdidipro.cntr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.farmdidipro.model.FavoriteUniversity;
import com.farmdidipro.service.FavoriteUniversityService;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FavoriteUniversityController {

    @Autowired
    private FavoriteUniversityService favoriteUniversityService;

    @GetMapping
    public ResponseEntity<List<FavoriteUniversity>> getAllFavorites() {
    	
        List<FavoriteUniversity> favorites = favoriteUniversityService.getAllFavorites();
        return new ResponseEntity<>(favorites, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> addFavorite(@RequestBody FavoriteUniversity favoriteUniversity) {
        favoriteUniversityService.addFavorite(favoriteUniversity);
        System.out.println("added");
        System.out.println(favoriteUniversity);
        System.out.println(favoriteUniversity.getName());

  //      System.out.println(favoriteUniversity.getWebsite());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeFavorite(@PathVariable("id") Long id) {
        favoriteUniversityService.removeFavorite(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
