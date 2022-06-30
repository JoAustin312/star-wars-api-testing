package com.sparta.javabinks.framework;


import com.sparta.javabinks.dtos.PeopleDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.sparta.javabinks.framework.ConnectionManager.getConnection;
import static com.sparta.javabinks.framework.Injector.injectPeopleDTO;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PeopleDTOTest {
    PeopleDTO peopleDTO;
    @BeforeEach
    void setup(){
        peopleDTO =  injectPeopleDTO(getConnection("people/3"));
    }


    @DisplayName("Check all the values are valid")
    @Nested
    class responseValues {

        @Test
        @DisplayName("Check Flim not contain the null value ")
        void Filmcontain(){
            assertNotNull(peopleDTO.hasBeenInAFilm());
        }
        @Test
        @DisplayName("Check people has home world ")
        void hasHomeWorld(){
            assertNotNull(peopleDTO.hasHomeworld());
        }
        @Test
        @DisplayName("Check people has home world ")
        void hasGender(){
            assertNotNull(peopleDTO.hasGender());
        }
        @Test
        @DisplayName("Check people's hasSkinColor is not null ")
        void hasSkinColor(){
            assertNotNull(peopleDTO.hasSkinColor());
        }
        @Test
        @DisplayName("Check people's edit date is not null ")
        void hasEditedDate(){
            assertNotNull(peopleDTO.hasEditedDate());
        }
        @Test
        @DisplayName("Check people's edit date is not null ")
        void hasCreatedDate(){
            assertNotNull(peopleDTO.hasCreatedDate());
        }
        @Test
        @DisplayName("Check people's Mass is not null ")
        void hasMass(){
            assertNotNull(peopleDTO.hasMass());
        }
        @Test
        @DisplayName("Check people's Mass is not null ")
        void hasVehicles(){
            assertNotNull(peopleDTO.hasVehicles());
        }
        @Test
        @DisplayName("Check url is not null ")
        void hasurl(){
            assertNotNull(peopleDTO.hasUrl());
        }
        @Test
        @DisplayName("Check people's Mass is not null ")
        void hairColour(){
            assertNotNull(peopleDTO.hasHairColor());
        }
        @Test
        @DisplayName("Check people's birth is not null ")
        void checkbirthyear(){
            assertNotNull(peopleDTO.hasBirthYear());
        }
        @Test
        @DisplayName("Check people's birth is not null ")
        void checkBirthYearNull(){
            assertNotNull(peopleDTO.hasBirthYear());
        }
        @Test
        @DisplayName("Check EyeClourNull is not null ")
        void checkEyeClourNull(){
            assertNotNull(peopleDTO.hasEyeColor());
        }
        @Test
        @DisplayName("Check people's birth is not null ")
        void checkspeciesNull(){
            assertNotNull(peopleDTO.hasSpecies());
        }
        @Test
        @DisplayName("Check hasStartships is not null ")
        void checkStartShipsNull(){
            assertNotNull(peopleDTO.hasStartships());
        }
        @Test
        @DisplayName("Check people's birth is not null ")
        void checkNamesNull(){
            assertNotNull(peopleDTO.hasName());
        }
        @Test
        @DisplayName("Check people's birth is not null ")
        void checkHeightNull(){
            assertNotNull(peopleDTO.hasHeight());
        }






    }

}

