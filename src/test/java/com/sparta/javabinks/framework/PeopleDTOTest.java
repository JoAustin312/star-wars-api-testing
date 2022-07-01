package com.sparta.javabinks.framework;


import com.sparta.javabinks.dtos.PeopleDTO;
import org.junit.jupiter.api.*;

import static com.sparta.javabinks.framework.ConnectionManager.getConnection;
import static com.sparta.javabinks.framework.Injector.injectPeopleDTO;
import static org.junit.jupiter.api.Assertions.*;

public class PeopleDTOTest {
    PeopleDTO peopleDTO;

    @BeforeEach
    void setup() {
        peopleDTO = injectPeopleDTO(getConnection("people/3"));
    }


    @DisplayName("Check all the values are valid")
    @Nested
    class responseValues {

        @Test
        @DisplayName("Check Flim not contain the null value ")
        void Filmcontain() {
            assertTrue(peopleDTO.hasBeenInAFilm());
        }

        @Test
        @DisplayName("Check people has home world ")
        void hasHomeWorld() {
            assertTrue(peopleDTO.hasHomeworld());
        }

        @Test
        @DisplayName("Check people has home world ")
        void hasGender() {
            assertTrue(peopleDTO.hasGender());
        }

        @Test
        @DisplayName("Check people's hasSkinColor is not null ")
        void hasSkinColor() {
            assertTrue(peopleDTO.hasSkinColor());
        }

        @Test
        @DisplayName("Check people's edit date is not null ")
        void hasEditedDate() {
            assertTrue(peopleDTO.hasEditedDate());
        }

        @Test
        @DisplayName("Check people's edit date is not null ")
        void hasCreatedDate() {
            assertTrue(peopleDTO.hasCreatedDate());
        }

        @Test
        @DisplayName("Check people's Mass is not null ")
        void hasMass() {
            assertTrue(peopleDTO.hasMass());
        }

        @Test
        @DisplayName("Check people's Mass is not null ")
        void hasVehicles() {
            assertTrue(peopleDTO.hasVehicles());
        }

        @Test
        @DisplayName("Check url is not null ")
        void hasurl() {
            assertTrue(peopleDTO.hasUrl());
        }

        @Test
        @DisplayName("Check people's Mass is not null ")
        void hairColour() {
            assertTrue(peopleDTO.hasHairColor());
        }

        @Test
        @DisplayName("Check people's birth is not null ")
        void checkbirthyear() {
            assertTrue(peopleDTO.hasBirthYear());
        }

        @Test
        @DisplayName("Check people's birth is not null ")
        void checkBirthYearNull() {
            assertTrue(peopleDTO.hasBirthYear());
        }

        @Test
        @DisplayName("Check EyeClourNull is not null ")
        void checkEyeClourNull() {
            assertTrue(peopleDTO.hasEyeColor());
        }

        @Test
        @DisplayName("Check people's birth is not null ")
        void checkspeciesNull() {
            assertTrue(peopleDTO.hasSpecies());
        }

        @Test
        @DisplayName("Check hasStartships is not null ")
        void checkStartShipsNull() {
            assertTrue(peopleDTO.hasStartships());
        }

        @Test
        @DisplayName("Check people's birth is not null ")
        void checkNamesNull() {
            assertTrue(peopleDTO.hasName());
        }

        @Test
        @DisplayName("Check people's birth is not null ")
        void checkHeightNull() {
            assertTrue(peopleDTO.hasHeight());
        }

    }



    @Nested
    @DisplayName("To check the Valid test ")
    class ValidTest{
        @Test
        @DisplayName("Gender check")
        void checkForGender(){
            Assumptions.assumeTrue(peopleDTO.getGender().equals("male")||
                    peopleDTO.getGender().equals("Female")||
                    peopleDTO.getGender().equals("unknown")||
                    peopleDTO.getGender().equals("n/a") );
            assertEquals(peopleDTO.getGender(),"n/a");

        }

        @Test
        @DisplayName("Check for the dates been created before edited")
        void checkfordatecreatedBeforeEdited(){
            assertTrue(peopleDTO.createdBeforeEdited());
        }
    }
}












