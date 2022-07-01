package com.sparta.javabinks.dtos;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SpeciesDTO{

	@JsonProperty("films")
	private List<String> films;

	@JsonProperty("skin_colors")
	private String skinColors;

	@JsonProperty("homeworld")
	private String homeworld;

	@JsonProperty("edited")
	private String edited;

	@JsonProperty("created")
	private String created;

	@JsonProperty("eye_colors")
	private String eyeColors;

	@JsonProperty("language")
	private String language;

	@JsonProperty("classification")
	private String classification;

	@JsonProperty("people")
	private List<String> people;

	@JsonProperty("url")
	private String url;

	@JsonProperty("hair_colors")
	private String hairColors;

	@JsonProperty("average_height")
	private String averageHeight;

	@JsonProperty("name")
	private String name;

	@JsonProperty("designation")
	private String designation;

	@JsonProperty("average_lifespan")
	private String averageLifespan;

	public List<String> getFilms(){
		return films;
	}

	public String getSkinColors(){
		return skinColors;
	}

	public String getHomeworld(){
		return homeworld;
	}

	public String getEdited(){
		return edited;
	}

	public String getCreated(){
		return created;
	}

	public String getEyeColors(){
		return eyeColors;
	}

	public String getLanguage(){
		return language;
	}

	public String getClassification(){
		return classification;
	}

	public List<String> getPeople(){
		return people;
	}

	public String getUrl(){
		return url;
	}

	public String getHairColors(){
		return hairColors;
	}

	public String getAverageHeight(){
		return averageHeight;
	}

	public String getName(){
		return name;
	}

	public String getDesignation(){
		return designation;
	}

	public String getAverageLifespan(){
		return averageLifespan;
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

	public boolean hasFilms() { return films != null; }
	public boolean areFilmsEmpty() { return films.isEmpty(); }
	public boolean hasSkinColors() { return skinColors != null; }
	public boolean hasHomeworld() { return homeworld != null; }
	public boolean hasEditedDate() { return edited != null; }
	public boolean hasCreatedDate() { return created != null; }
	public boolean hasEyeColors() { return eyeColors != null; }
	public boolean hasLanguage() { return language != null; }
	public boolean hasClassification() { return classification != null; }
	public boolean hasPeople() { return people != null; }
	public boolean arePeopleEmpty() { return people.isEmpty(); }
	public boolean hasUrl() { return url != null; }
	public boolean hasHairColors() { return hairColors != null; }
	public boolean hasAverageHeight() { return averageHeight != null; }
	public boolean hasName() { return name != null; }
	public boolean hasDesignation() { return designation != null; }
	public boolean hasAverageLifespan() { return averageLifespan != null; }
}