package com.sparta.javabinks.framework;

import com.sparta.javabinks.dtos.FilmDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.sparta.javabinks.framework.ConnectionManager.getConnection;
import static com.sparta.javabinks.framework.Injector.injectFilmDTO;
import static org.junit.jupiter.api.Assertions.*;

public class FilmDTOTests {
    FilmDTO filmDTO;
    @BeforeEach
    void setup(){
        filmDTO =  injectFilmDTO(getConnection("films/2"));
    }


    @DisplayName("Check all the values are valid")
    @Nested
    class responseValues {

        @Test
        @DisplayName("Check If the Edited Date Is Valid ")
        void checkIfTheEditedDateIsValid(){assertTrue(filmDTO.hasEditedDate());}
        @Test
        @DisplayName("Check If The Film Director is Valid ")
        void checkIfTheFilmDirectorIsValid(){assertNotNull(filmDTO.hasDirector());
        }
        @Test
        @DisplayName("Check if the Film Created date is Valid ")
        void checkIfTheFilmCreatedDateIsValid(){
            assertNotNull(filmDTO.hasCreatedDate());
        }

        @Test
        @DisplayName("Check If The Film Has Vehicles ")
        void checkIfTheFilmHasVehicles(){assertNotNull(filmDTO.hasVehicles());
        }
        @Test
        @DisplayName("Check If The Vehicles are Empty ")
        void checkIfTheVehiclesAreEmpty(){assertFalse(filmDTO.areVehiclesEmpty());
        }
        @Test
        @DisplayName("Check If the OpeningCrawl Is Valid")
        void checkIfTheOpeningCrawlIsValid(){
            assertNotNull(filmDTO.hasOpeningCrawl());
        }
        @Test
        @DisplayName("Check If The Title is Valid ")
        void checkIfTheTitleIsValid(){
            assertNotNull(filmDTO.hasTitle());
        }
        @Test
        @DisplayName("Check If The Url is valid")
        void checkIfTheUrlIsValid(){
            assertNotNull(filmDTO.hasUrl());
        }
        @Test
        @DisplayName("Check If the Characters are Valid")
        void checkIfTheStarCharactersAreValid(){
            assertNotNull(filmDTO.hasCharacters());
        }
        @Test
        @DisplayName("Check If the Characters are Empty")
        void checkIfTheCharactersAreEmpty(){
            assertFalse(filmDTO.areCharactersEmpty());
        }
        @Test
        @DisplayName("Check Film Episode IDs are Valid  ")
        void checkFilmEpisodeIdsAreValid(){
            assertNotNull(filmDTO.hasEpisodeId());
        }
        @Test
        @DisplayName("Check If the Planets Are Valid ")
        void checkIfThePlanetsAreValid(){
            assertNotNull(filmDTO.hasPlanets());
        }
        @Test
        @DisplayName("Check If the Planets are Empty")
        void checkIfThePlanetsAreEmpty(){
            assertFalse(filmDTO.arePlanetsEmpty());
        }
        @Test
        @DisplayName("Check If File Released Date is Valid ")
        void checkIfTheFilmReleasedDateIsValid(){
            assertNotNull(filmDTO.hasReleaseDate());
        }
        @Test
        @DisplayName("Check If the Producer is Valid")
        void checkIfTheProducerIsValid(){
            assertNotNull(filmDTO.hasProducer());
        }
        @Test
        @DisplayName("Check If the Starships are Valid")
        void checkIfTheStarShipsAreValid(){
            assertNotNull(filmDTO.hasStarships());
        }
        @Test
        @DisplayName("Check If the Starships are Empty")
        void checkIfTheStarStarshipsAreEmpty(){
            assertFalse(filmDTO.areStarshipsEmpty());
        }
        @Test
        @DisplayName("Check If the Species are Valid")
        void checkIfTheSpeciesAreValid(){
            assertNotNull(filmDTO.hasSpecies());
        }
        @Test
        @DisplayName("Check If the Species are Empty")
        void checkIfTheSpeciesAreEmpty(){assertFalse(filmDTO.areSpeciesEmpty());
        }

    }
}
