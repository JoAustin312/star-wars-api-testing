package com.sparta.javabinks.framework;


import com.sparta.javabinks.dtos.SpeciesDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.sparta.javabinks.framework.ConnectionManager.getConnection;
import static com.sparta.javabinks.framework.Injector.*;
import static org.junit.jupiter.api.Assertions.assertTrue;


    public class SpeciesDTOTest {


        SpeciesDTO speciesDTO;

        @BeforeEach
        void setup() {
            speciesDTO = injectSpeciesDTO(getConnection("species/3"));
        }


        @DisplayName("Check all the values are valid")
        @Nested
        class responseValues {

            @Test
            @DisplayName("Check Flim has valid  ")
            void validFilm() {
                assertTrue(speciesDTO.hasFilms());
            }

            @Test
            @DisplayName("Check are Films Empty ")
            void FilmsEmpty() {
                assertTrue(speciesDTO.areFilmsEmpty());
            }

            @Test
            @DisplayName("Check people has SkinColors ")
            void hasSkinColors() {
                assertTrue(speciesDTO.hasSkinColors());
            }

            @Test
            @DisplayName("Check people's has Homeworld is valid ")
            void validHomeworld() {
                assertTrue(speciesDTO.hasHomeworld());
            }

            @Test
            @DisplayName("Check people's edit date is valid ")
            void hasEditedDate() {
                assertTrue(speciesDTO.hasEditedDate());
            }

            @Test
            @DisplayName("Check people's edit date is valid")
            void hasCreatedDate() {
                assertTrue(speciesDTO.hasCreatedDate());
            }

            @Test
            @DisplayName("Check people's hasEyeColors is valid ")
            void valisEyeColors() {
                assertTrue(speciesDTO.hasEyeColors());
            }
                @Test
                @DisplayName("Check species Mass is valid ")
                void validLanguage() {
                    assertTrue(speciesDTO.hasLanguage());
                }

            @Test
            @DisplayName("Check people's has Classification is valid ")
            void hasClassification() {
                assertTrue(speciesDTO.hasClassification());
            }

            @Test
            @DisplayName("Check people's hasPeople  ")
            void hasPeople() {
                assertTrue(speciesDTO.hasPeople());
            }




            @Test
            @DisplayName("Check are people Empty is valid")
            void arePeopleEmpty() {
                assertTrue(speciesDTO.arePeopleEmpty());
            }

            @Test
            @DisplayName("Check species has Url is valid ")
            void checkhasUrl() {
                assertTrue(speciesDTO.hasUrl());
            }

            @Test
            @DisplayName("Check Eye Colour Null is not null ")
            void checkEyeColourNull() {
                assertTrue(speciesDTO.hasHairColors());
            }

            @Test
            @DisplayName("Check has Average Height is valid")
            void hasAverageHeight() {
                assertTrue(speciesDTO.hasAverageHeight());
            }

            @Test
            @DisplayName("Check has name is valid")
            void checkhasNameNull() {
                assertTrue(speciesDTO.hasName());
            }

            @Test
            @DisplayName("Check Species has Designation is valid ")
            void checkNamesNull() {
                assertTrue(speciesDTO.hasDesignation());
            }

            @Test
            @DisplayName("Check has Average Lifespan is valid ")
            void checkAverageLifespan() {
                assertTrue(speciesDTO.hasAverageLifespan());
            }

        }
    }

