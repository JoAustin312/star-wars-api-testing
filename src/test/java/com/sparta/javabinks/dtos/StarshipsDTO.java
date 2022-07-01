package com.sparta.javabinks.dtos;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StarshipsDTO{

	@JsonProperty("max_atmosphering_speed")
	private String maxAtmospheringSpeed;

	@JsonProperty("cargo_capacity")
	private String cargoCapacity;

	@JsonProperty("films")
	private List<String> films;

	@JsonProperty("passengers")
	private String passengers;

	@JsonProperty("pilots")
	private List<String> pilots;

	@JsonProperty("edited")
	private String edited;

	@JsonProperty("consumables")
	private String consumables;

	@JsonProperty("MGLT")
	private String mGLT;

	@JsonProperty("created")
	private String created;

	@JsonProperty("length")
	private String length;

	@JsonProperty("starship_class")
	private String starshipClass;

	@JsonProperty("url")
	private String url;

	@JsonProperty("manufacturer")
	private String manufacturer;

	@JsonProperty("crew")
	private String crew;

	@JsonProperty("hyperdrive_rating")
	private String hyperdriveRating;

	@JsonProperty("cost_in_credits")
	private String costInCredits;

	@JsonProperty("name")
	private String name;

	@JsonProperty("model")
	private String model;

	public String getMaxAtmospheringSpeed(){
		return maxAtmospheringSpeed;
	}

	public String getCargoCapacity(){
		return cargoCapacity;
	}

	public List<String> getFilms(){
		return films;
	}

	public String getPassengers(){
		return passengers;
	}

	public List<String> getPilots(){
		return pilots;
	}

	public String getEdited(){
		return edited;
	}

	public String getConsumables(){
		return consumables;
	}

	public String getMGLT(){
		return mGLT;
	}

	public String getCreated(){
		return created;
	}

	public String getLength(){
		return length;
	}

	public String getStarshipClass(){
		return starshipClass;
	}

	public String getUrl(){
		return url;
	}

	public String getManufacturer(){
		return manufacturer;
	}

	public String getCrew(){
		return crew;
	}

	public String getHyperdriveRating(){
		return hyperdriveRating;
	}

	public String getCostInCredits(){
		return costInCredits;
	}

	public String getName(){
		return name;
	}

	public String getModel(){
		return model;
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

	public boolean hasMaxAtmospheringSpeed() { return maxAtmospheringSpeed != null; }
	public boolean hasCargoCapacity() { return cargoCapacity != null; }
	public boolean hasFilms() { return films != null; }
	public boolean areFilmsEmpty() { return films.isEmpty(); }
	public boolean hasPassengers() { return passengers != null; }
	public boolean hasPilots() { return pilots != null; }
	public boolean arePilotsEmpty() { return pilots.isEmpty(); }
	public boolean hasEditedDate() { return edited != null; }
	public boolean hasConsumables() { return consumables != null; }
	public boolean hasMGLT() { return mGLT != null; }
	public boolean hasCreatedDate() { return created != null; }
	public boolean hasLength() { return length != null; }
	public boolean hasStarshipClass() { return starshipClass != null; }
	public boolean hasUrl() { return url != null; }
	public boolean hasManufacturer() { return manufacturer != null; }
	public boolean hasCrew() { return crew != null; }
	public boolean hasHyperdriveRating() { return hyperdriveRating != null; }
	public boolean hasCostInCredits() { return costInCredits != null; }
	public boolean hasName() { return name != null; }
	public boolean hasModel() { return model != null; }
}