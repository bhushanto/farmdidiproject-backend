package com.farmdidipro.model;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name = "favorite_universities")
public class FavoriteUniversity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

   
    @Column(name = "website")
    private String web_pages;

    // Add additional fields as needed

    // Constructors, getters, and setters

    // Constructor
    
    
    
    public FavoriteUniversity() {
    }

    
    
	@Override
	public String toString() {
		return "FavoriteUniversity [id=" + id + ", name=" + name + ", web_pages=" + web_pages + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeb_pages() {
		return web_pages;
	}

	public void setWeb_pages(String web_pages) {
		this.web_pages = web_pages;
	}

    // Getters and Setters

}