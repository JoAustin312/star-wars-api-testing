package com.sparta.javabinks.dtos;

import java.util.List;
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

	public boolean hasEditedDate() { return edited != null; }
	public boolean hasDirector() { return director != null; }
	public boolean hasCreatedDate() { return created != null; }
	public boolean hasVehicles() { return vehicles != null && !vehicles.isEmpty(); }
	public boolean hasOpeningCrawl() { return openingCrawl != null; }
	public boolean hasTitle() { return title != null; }
	public boolean hasUrl() { return url != null; }
	public boolean hasCharacters() { return characters != null && !characters.isEmpty(); }
	public boolean hasEpisodeId() { return episodeId != null; }
	public boolean hasPlanets() { return planets != null && !planets.isEmpty(); }
	public boolean hasReleaseDate() { return releaseDate != null; }
	public boolean hasStarships() { return starships != null && !starships.isEmpty(); }
	public boolean hasSpecies() { return species != null && !species.isEmpty(); }
	public boolean hasProducer() { return producer != null; }
}