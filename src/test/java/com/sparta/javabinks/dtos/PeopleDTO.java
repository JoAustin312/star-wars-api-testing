package com.sparta.javabinks.dtos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PeopleDTO{

	@JsonProperty("films")
	private List<String> films;

	@JsonProperty("homeworld")
	private String homeworld;

	@JsonProperty("gender")
	private String gender;

	@JsonProperty("skin_color")
	private String skinColor;

	@JsonProperty("edited")
	private String edited;

	@JsonProperty("created")
	private String created;

	@JsonProperty("mass")
	private String mass;

	@JsonProperty("vehicles")
	private List<String> vehicles;

	@JsonProperty("url")
	private String url;

	@JsonProperty("hair_color")
	private String hairColor;

	@JsonProperty("birth_year")
	private String birthYear;

	@JsonProperty("eye_color")
	private String eyeColor;

	@JsonProperty("species")
	private List<String> species;

	@JsonProperty("starships")
	private List<String> starships;

	@JsonProperty("name")
	private String name;

	@JsonProperty("height")
	private String height;

	public List<String> getFilms(){
		return films;
	}

	public String getHomeworld(){
		return homeworld;
	}

	public String getGender(){
		return gender;
	}

	public String getSkinColor(){
		return skinColor;
	}

	public String getEdited(){
		return edited;
	}

	public String getCreated(){
		return created;
	}

	public String getMass(){
		return mass;
	}

	public List<String> getVehicles(){
		return vehicles;
	}

	public String getUrl(){
		return url;
	}

	public String getHairColor(){
		return hairColor;
	}

	public String getBirthYear(){
		return birthYear;
	}

	public String getEyeColor(){
		return eyeColor;
	}

	public List<String> getSpecies(){
		return species;
	}

	public List<String> getStarships(){
		return starships;
	}

	public String getName(){
		return name;
	}

	public String getHeight(){
		return height;
	}

	public List<String> getPossibleGenders() {
		return Arrays.asList(
				"male",
				"female",
				"unknown",
				"n/a"
		);
	}

	public boolean hasValidGender(String value) {
		if (!hasGender()) return false;
		return getPossibleGenders().contains(value);
	}

	public boolean createdBeforeEdited() {
		ZonedDateTime createdDate = ZonedDateTime.parse(created);
		ZonedDateTime editedDate = ZonedDateTime.parse(edited);
		return createdDate.isBefore(editedDate);
	}

	public boolean hasValidValueInFile(String value, String path) {
		Set<String> set = new HashSet<>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			reader.readLine();
			reader.lines().map(String::trim)
					.map((x) -> x.replace("\"", ""))
					.map((x) -> x.replace(",", ""))
					.filter((x) -> !x.equals(""))
					.map((x) -> x.split(" "))
					.forEach((x) -> Collections.addAll(set, x));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return set.contains(value);
	}

	public boolean hasValidHairColor() {
		if (!hasHairColor()) return false;
		boolean valid = false;
		String[] hairColorsAsArray = hairColor.split(", ");
		for (String color : hairColorsAsArray) {
			if (hasValidValueInFile(color, "src/test/resources/haircolour.csv"))
				valid = true;
		}
		return valid;
	}

	public boolean hasValidEyeColor() {
		if (!hasHairColor()) return false;
		boolean valid = false;
		String[] hairColorsAsArray = hairColor.split(", ");
		for (String color : hairColorsAsArray) {
			if (hasValidValueInFile(color, "src/test/resources/eyecolour.csv"))
				valid = true;
		}
		return valid;
	}

	public boolean hasValidSkinColor() {
		if (!hasHairColor()) return false;
		boolean valid = false;
		String[] hairColorsAsArray = hairColor.split(", ");
		for (String color : hairColorsAsArray) {
			if (hasValidValueInFile(color, "src/test/resources/skincolour.csv"))
				valid = true;
		}
		return valid;
	}

	public boolean Gendercheck(){
		return (getGender().equals("male")||
				getGender().equals("Female")||
				getGender().equals("unknown")||
				getGender().equals("n/a") );
	}

	public boolean urlCorrectFormat(){
		String pattern = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
		try {
			Pattern pat = Pattern.compile(pattern);
			Matcher match = pat.matcher(url);
			return match.matches();
		} catch (RuntimeException e) {
			return false;
		}
	}

	public boolean homeworldURLCorrectFormat(){
		String pattern = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
		try {
			Pattern pat = Pattern.compile(pattern);
			Matcher match = pat.matcher(homeworld);
			return match.matches();
		} catch (RuntimeException e) {
			return false;
		}
	}
	public boolean checkFieldURLFormat(List<String> array){
		String pattern = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
		try {
			Pattern pat = Pattern.compile(pattern);
			for (String field : array) {
				Matcher match = pat.matcher(field);
				return match.matches();
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean checkFilmsHasValidUrl(){
		return checkFieldURLFormat(films);
	}
	public boolean checkSpeciesHasValidUrl(){
		return checkFieldURLFormat(species);
	}

	public boolean checkVehiclessHasValidUrl(){
		return checkFieldURLFormat(vehicles);
	}

	public boolean checkStarshipsHasValidUrl(){
		return checkFieldURLFormat(starships);
	}

	public boolean hasBeenInAFilm() { return films != null; }
	public boolean areFilmsEmpty() { return films.isEmpty(); }
	public boolean hasHomeworld() { return homeworld != null; }
	public boolean hasGender() { return gender != null; }
	public boolean hasSkinColor() { return skinColor != null; }
	public boolean hasEditedDate() { return edited != null; }
	public boolean hasCreatedDate() { return created != null; }
	public boolean hasMass() { return mass != null; }
	public boolean hasVehicles() { return vehicles != null; }
	public boolean areVehiclesEmpty() { return vehicles.isEmpty(); }
	public boolean hasUrl() { return url != null; }
	public boolean hasHairColor() { return hairColor != null; }
	public boolean hasBirthYear() { return birthYear != null; }
	public boolean hasEyeColor() { return eyeColor != null; }
	public boolean hasSpecies() { return species != null; }
	public boolean areSpeciesEmpty() { return species.isEmpty(); }
	public boolean hasStartships() { return starships != null; }
	public boolean areStarshipsEmpty() { return starships.isEmpty(); }
	public boolean hasName() { return name != null; }
	public boolean hasHeight() { return height != null; }
}