package com.sparta.javabinks.dtos;

import java.time.ZonedDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PlanetsDTO{

	@JsonProperty("films")
	private List<String> films;

	@JsonProperty("edited")
	private String edited;

	@JsonProperty("created")
	private String created;

	@JsonProperty("climate")
	private String climate;

	@JsonProperty("rotation_period")
	private String rotationPeriod;

	@JsonProperty("url")
	private String url;

	@JsonProperty("population")
	private String population;

	@JsonProperty("orbital_period")
	private String orbitalPeriod;

	@JsonProperty("surface_water")
	private String surfaceWater;

	@JsonProperty("diameter")
	private String diameter;

	@JsonProperty("gravity")
	private String gravity;

	@JsonProperty("name")
	private String name;

	@JsonProperty("residents")
	private List<String> residents;

	@JsonProperty("terrain")
	private String terrain;

	public List<String> getFilms(){
		return films;
	}

	public String getEdited(){
		return edited;
	}

	public String getCreated(){
		return created;
	}

	public String getClimate(){
		return climate;
	}

	public String getRotationPeriod(){
		return rotationPeriod;
	}

	public String getUrl(){
		return url;
	}

	public String getPopulation(){
		return population;
	}

	public String getOrbitalPeriod(){
		return orbitalPeriod;
	}

	public String getSurfaceWater(){
		return surfaceWater;
	}

	public String getDiameter(){
		return diameter;
	}

	public String getGravity(){
		return gravity;
	}

	public String getName(){
		return name;
	}

	public List<String> getResidents(){
		return residents;
	}

	public String getTerrain(){
		return terrain;
	}

	public boolean hasFilms() { return films != null; }
	public boolean areFilmsEmpty() { return films.isEmpty(); }
	public boolean hasEditedDate() { return edited != null; }
	public boolean hasCreatedDate() { return created != null; }
	public boolean hasClimate() { return climate != null; }
	public boolean hasRotationPeriod() { return rotationPeriod != null; }
	public boolean hasUrl() { return url != null; }
	public boolean hasPopulation() { return population != null; }
	public boolean hasOrbitalPeriod() { return orbitalPeriod != null; }
	public boolean hasSurfaceWater() { return surfaceWater != null; }
	public boolean hasDiameter() { return diameter != null; }
	public boolean hasGravity() { return gravity != null; }
	public boolean hasName() { return name != null; }
	public boolean hasResidents() { return residents != null; }
	public boolean areResidentsEmpty() { return residents.isEmpty(); }
	public boolean hasTerrain() { return terrain != null; }
	public boolean createdBeforeEdited() {
		ZonedDateTime createdDate = ZonedDateTime.parse(created);
		ZonedDateTime editedDate = ZonedDateTime.parse(edited);
		return createdDate.isBefore(editedDate);
	}
}