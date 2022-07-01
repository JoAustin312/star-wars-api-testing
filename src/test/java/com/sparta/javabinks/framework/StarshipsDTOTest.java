package com.sparta.javabinks.framework;


import com.sparta.javabinks.dtos.StarshipsDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.sparta.javabinks.framework.ConnectionManager.getConnection;
import static com.sparta.javabinks.framework.Injector.injectStarshipsDTO;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class StarshipsDTOTest {

    StarshipsDTO starshipsDTO;

    @BeforeEach
    void setup() {
        starshipsDTO = injectStarshipsDTO(getConnection("starships/9"));
    }

    @DisplayName("Validity Tests")
    @Nested
    class responseValues {
        @Test
        @DisplayName("Check max atmosphering speed is valid ")
        void maxAtmospheringSpeedValid() {
            assertTrue(starshipsDTO.hasMaxAtmospheringSpeed());
        }
        @Test
        @DisplayName("Check max cargo Capacity speed is valid ")
        void cargoCapacityValid() {
            assertTrue(starshipsDTO.hasCargoCapacity());
        }

        @Test
        @DisplayName("Check films is valid ")
        void filmsValid() {
            assertTrue(starshipsDTO.hasFilms());
        }

        @Test
        @DisplayName("Check if films is empty ")
        void filmsEmpty() {
            assertTrue(starshipsDTO.areFilmsEmpty());
        }

        @Test
        @DisplayName("Check if passengers is valid ")
        void passengersValid() {
            assertTrue(starshipsDTO.hasPassengers());
        }

        @Test
        @DisplayName("Check if pilots is valid ")
        void pilotsValid() {
            assertTrue(starshipsDTO.hasPilots());
        }

        @Test
        @DisplayName("Check if pilots is empty ")
        void pilotsEmpty() {
            assertTrue(starshipsDTO.arePilotsEmpty());
        }

        @Test
        @DisplayName("Check if edited date is valid ")
        void editDateValid() {
            assertTrue(starshipsDTO.hasEditedDate());
        }

        @Test
        @DisplayName("Check if MGLT is valid ")
        void mgltValid() {
            assertTrue(starshipsDTO.hasMGLT());
        }

        @Test
        @DisplayName("Check if created date is valid")
        void createDateValid() {
            assertTrue(starshipsDTO.hasCreatedDate());
        }

        @Test
        @DisplayName("Check if length is valid")
        void lengthValid() {
            assertTrue(starshipsDTO.hasLength());
        }


        @Test
        @DisplayName("Check if Starship class is valid")
        void starshipClassValid() {
            assertTrue(starshipsDTO.hasStarshipClass());
        }

        @Test
        @DisplayName("Check if url is valid")
        void urlValid() {
            assertTrue(starshipsDTO.hasUrl());
        }

        @Test
        @DisplayName("Check if manufacturer is valid")
        void manufacturerValid() {
            assertTrue(starshipsDTO.hasManufacturer());
        }

        @Test
        @DisplayName("Check if crew is valid")
        void crewValid() {
            assertTrue(starshipsDTO.hasCrew());
        }

        @Test
        @DisplayName("Check if hyper drive rating is valid")
        void hyperDriveRatingValid() {
            assertTrue(starshipsDTO.hasHyperdriveRating());
        }

        @Test
        @DisplayName("Check if cost_in_credits is valid")
        void costInCreditsValid() {
            assertTrue(starshipsDTO.hasCostInCredits());
        }
        @Test
        @DisplayName("Check if name is valid")
        void nameValid() {
            assertTrue(starshipsDTO.hasName());
        }
        @Test
        @DisplayName("Check if model is valid")
        void modelValid() {
            assertTrue(starshipsDTO.hasModel());
        }

        @Test
        @DisplayName("Check if consumables is valid")
        void consumablesValid() {
            assertTrue(starshipsDTO.hasConsumables());
        }

        @Test
        @DisplayName("Check created date before the edited date ")
        void checkForDateCreatedAndEdited() {
            assertTrue(starshipsDTO.createdBeforeEdited());
        }
    }
}






