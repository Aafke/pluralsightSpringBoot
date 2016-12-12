package com.boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Shipwreck {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String name;
	String description;
	String conditions;
	Integer depth;
	Double latitude;
	Double longitude;
	Integer year_Discovered;

	public Shipwreck() { }

	public Shipwreck(Long id, String name, String description, String conditions, Integer depth, Double latitude, Double longitude, Integer year_Discovered) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.conditions = conditions;
		this.depth = depth;
		this.latitude = latitude;
		this.longitude = longitude;
		this.year_Discovered = year_Discovered;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getConditions() {
		return conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public Integer getDepth() {
		return depth;
	}

	public void setDepth(Integer depth) {
		this.depth = depth;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Integer getYear_Discovered() {
		return year_Discovered;
	}

	public void setYear_Discovered(Integer year_Discovered) {
		this.year_Discovered = year_Discovered;
	}
}
