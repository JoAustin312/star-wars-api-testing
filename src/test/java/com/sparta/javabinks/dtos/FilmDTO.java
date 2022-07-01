package com.sparta.javabinks.dtos;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FilmDTO{

	@JsonProperty("edited")
	private String edited;

	@JsonProperty("director")
	private String director;

	@JsonProperty("created")
	private String created;

	@JsonProperty("vehicles")
	private List<String> vehicles;

	@JsonProperty("opening_crawl")
	private String openingCrawl;

	@JsonProperty("title")
	private String title;

	@JsonProperty("url")
	private String url;

	@JsonProperty("characters")
	private List<String> characters;

	@JsonProperty("episode_id")
	private Integer episodeId;

	@JsonProperty("planets")
	private List<String> planets;

	@JsonProperty("release_date")
	private String releaseDate;

	@JsonProperty("starships")
	private List<String> starships;

	@JsonProperty("species")
	private List<String> species;

	@JsonProperty("producer")
	private String producer;

	public String getEdited(){
		return edited;
	}

	public String getDirector(){
		return director;
	}

	public String getCreated(){
		return created;
	}

	public List<String> getVehicles(){
		return vehicles;
	}

	public String getOpeningCrawl(){
		return openingCrawl;
	}

	public String getTitle(){
		return title;
	}

	public String getUrl(){
		return url;
	}

	public List<String> getCharacters(){
		return characters;
	}

	public Integer getEpisodeId(){
		return episodeId;
	}

	public List<String> getPlanets(){
		return planets;
	}

	public String getReleaseDate(){
		return releaseDate;
	}

	public List<String> getStarships(){
		return starships;
	}

	public List<String> getSpecies(){
		return species;
	}

	public String getProducer(){
		return producer;
	}

	public boolean createdBeforeEdited() {
		ZonedDateTime createdDate = ZonedDateTime.parse(created);
		ZonedDateTime editedDate = ZonedDateTime.parse(edited);
		return createdDate.isBefore(editedDate);
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

	public boolean checkCharacterURLFormat(){
		String pattern = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
		try {
			Pattern pat = Pattern.compile(pattern);
			for (String character : characters) {
				Matcher match = pat.matcher(character);
				return match.matches();
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean checkPlanetURLFormat(){
		String pattern = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
		try {
			Pattern pat = Pattern.compile(pattern);
			for (String planet : planets) {
				Matcher match = pat.matcher(planet);
				return match.matches();
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean checkStarshipsURLFormat(){
		String pattern = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
		try {
			Pattern pat = Pattern.compile(pattern);
			for (String starship : starships) {
				Matcher match = pat.matcher(starship);
				return match.matches();
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean checkVehicleURLFormat(){
		String pattern = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
		try {
			Pattern pat = Pattern.compile(pattern);
			for (String vehicle : vehicles) {
				Matcher match = pat.matcher(vehicle);
				return match.matches();
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		return false;
	}


	public boolean hasEditedDate() { return edited != null; }
	public boolean hasDirector() { return director != null; }
	public boolean hasCreatedDate() { return created != null; }
	public boolean hasVehicles() { return vehicles != null; }
	public boolean areVehiclesEmpty() { return vehicles.isEmpty(); }
	public boolean hasOpeningCrawl() { return openingCrawl != null; }
	public boolean hasTitle() { return title != null; }
	public boolean hasUrl() { return url != null; }
	public boolean hasCharacters() { return characters != null; }
	public boolean areCharactersEmpty() { return characters.isEmpty(); }
	public boolean hasEpisodeId() { return episodeId != null; }
	public boolean hasPlanets() { return planets != null; }
	public boolean arePlanetsEmpty() { return planets.isEmpty(); }
	public boolean hasReleaseDate() { return releaseDate != null; }
	public boolean hasStarships() { return starships != null; }
	public boolean areStarshipsEmpty() { return starships.isEmpty(); }
	public boolean hasSpecies() { return species != null; }
	public boolean areSpeciesEmpty() { return species.isEmpty(); }
	public boolean hasProducer() { return producer != null; }
}