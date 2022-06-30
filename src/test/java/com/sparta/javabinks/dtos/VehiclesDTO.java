package com.sparta.javabinks.dtos;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class VehiclesDTO{

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

	@JsonProperty("created")
	private String created;

	@JsonProperty("length")
	private String length;

	@JsonProperty("url")
	private String url;

	@JsonProperty("manufacturer")
	private String manufacturer;

	@JsonProperty("crew")
	private String crew;

	@JsonProperty("vehicle_class")
	private String vehicleClass;

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

	public String getCreated(){
		return created;
	}

	public String getLength(){
		return length;
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

	public String getVehicleClass(){
		return vehicleClass;
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

	public boolean hasMaxAtmospheringSpeed() { return maxAtmospheringSpeed != null; }
	public boolean hasCargoCapacity() { return cargoCapacity != null; }
	public boolean hasFilms() { return films != null && !films.isEmpty(); }
	public boolean hasPassengers() { return passengers != null; }
	public boolean hasPilots() { return pilots != null && !pilots.isEmpty(); }
	public boolean hasEditedDate() { return edited != null; }
	public boolean hasConsumables() { return consumables != null; }
	public boolean hasCreatedDate() { return created != null; }
	public boolean hasLength() { return length != null; }
	public boolean hasUrl() { return url != null; }
	public boolean hasManufacturer() { return manufacturer != null; }
	public boolean hasCrew() { return crew != null; }
	public boolean hasVehicleClass() { return vehicleClass != null; }
	public boolean hasCostInCredits() { return costInCredits != null; }
	public boolean hasName() { return name != null; }
	public boolean hasModel() { return model != null; }
}