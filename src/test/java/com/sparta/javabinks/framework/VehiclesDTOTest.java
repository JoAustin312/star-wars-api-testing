package com.sparta.javabinks.framework;

import com.sparta.javabinks.dtos.PeopleDTO;
import com.sparta.javabinks.dtos.VehiclesDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.sparta.javabinks.framework.ConnectionManager.getConnection;
import static com.sparta.javabinks.framework.Injector.injectPeopleDTO;
import static com.sparta.javabinks.framework.Injector.injectVehiclesDTO;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VehiclesDTOTest {
    VehiclesDTO vehiclesDTO;

    @BeforeEach
    void setup() {
        vehiclesDTO = injectVehiclesDTO(getConnection("vehicles/4"));
    }

    @DisplayName("Validity Tests")
    @Nested
    class responseValues {
        @Test
        @DisplayName("Check Vehicle class is valid ")
        void vehicleValid() {
            assertTrue(vehiclesDTO.hasVehicleClass());
        }

        @Test
        @DisplayName("Check Manufacturer is valid ")
        void manufacturerValid() {
            assertTrue(vehiclesDTO.hasManufacturer());
        }

        @Test
        @DisplayName("Check max atmosphering speed is valid ")
        void maxAtmospheringSpeedValid() {
            assertTrue(vehiclesDTO.hasMaxAtmospheringSpeed());
        }

        @Test
        @DisplayName("Check cargo capacity is valid ")
        void cargoCapacityValid() {
            assertTrue(vehiclesDTO.hasCargoCapacity());
        }

        @Test
        @DisplayName("Check films is valid ")
        void filmsValid() {
            assertTrue(vehiclesDTO.hasFilms());
        }

        @Test
        @DisplayName("Check passengers is valid ")
        void passengersValid() {
            assertTrue(vehiclesDTO.hasPassengers());
        }

        @Test
        @DisplayName("Check pilots is valid ")
        void pilotsValid() {
            assertTrue(vehiclesDTO.hasPilots());
        }

        @Test
        @DisplayName("Check edited date is valid ")
        void editDateValid() {
            assertTrue(vehiclesDTO.hasEditedDate());
        }

        @Test
        @DisplayName("Check consumables is valid ")
        void consumablesValid() {
            assertTrue(vehiclesDTO.hasConsumables());
        }

        @Test
        @DisplayName("Check created date is valid ")
        void createdDatedValid() {
            assertTrue(vehiclesDTO.hasCreatedDate());
        }

        @Test
        @DisplayName("Check length is valid ")
        void lengthValid() {
            assertTrue(vehiclesDTO.hasLength());
        }

        @Test
        @DisplayName("Check url is valid ")
        void urlValid() {
            assertTrue(vehiclesDTO.hasUrl());
        }

        @Test
        @DisplayName("Check crew is valid ")
        void crewValid() {
            assertTrue(vehiclesDTO.hasCrew());
        }

        @Test
        @DisplayName("Check cost_in_credits is valid ")
        void costInCreditsValid() {
            assertTrue(vehiclesDTO.hasCostInCredits());
        }

        @Test
        @DisplayName("Check name is valid ")
        void nameValid() {
            assertTrue(vehiclesDTO.hasName());
        }

        @Test
        @DisplayName("Check model is valid ")
        void modelValid() {
            assertTrue(vehiclesDTO.hasModel());
        }

        @Test
        @DisplayName("Check films is empty ")
        void filmsEmpty() {
            assertTrue(vehiclesDTO.areFilmsEmpty());}

        @Test
        @DisplayName("Check pilots is empty ")
        void pilotsEmpty() {
            assertTrue(vehiclesDTO.arePilotsEmpty());}


    }
}
