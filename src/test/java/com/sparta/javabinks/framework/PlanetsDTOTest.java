package com.sparta.javabinks.framework;

import com.sparta.javabinks.dtos.PeopleDTO;
import com.sparta.javabinks.dtos.PlanetsDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.sparta.javabinks.framework.ConnectionManager.getConnection;
import static com.sparta.javabinks.framework.Injector.injectPlantsDTO;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlanetsDTOTest {
    PlanetsDTO planetsDTO;
    @BeforeEach
    void setup(){
        planetsDTO =  injectPlantsDTO(getConnection("planets/4"));
    }


    @DisplayName("Check all the values are valid")
    @Nested
    class responseValues {

        @Test
        @DisplayName("Check If the Name Is Valid ")
        void checkIfTheNameIsNotNull(){
            assertTrue(planetsDTO.hasName());
        }

        @Test
        @DisplayName("Check if the planet has RotationPeriod ")
        void checkIfThePlanetHasRotationPeriod(){
            assertNotNull(planetsDTO.hasRotationPeriod());
        }
        @Test
        @DisplayName("Check If The planet has Orbital Speed ")
        void checkIfThePlanetHasOrbitalSpeed(){
            assertNotNull(planetsDTO.hasOrbitalPeriod());
        }
        @Test
        @DisplayName("Check If the Planet has a Diameter")
        void checkIfThePlanetHasADiameter(){
            assertNotNull(planetsDTO.hasDiameter());
        }
        @Test
        @DisplayName("Check If The Planet Has a Climate ")
        void checkIfThePlanetHasAClimmate(){
            assertNotNull(planetsDTO.hasClimate());
        }
        @Test
        @DisplayName("Check If The Planet Gravity Valid ")
        void checkIfThePlanetGravityIsNotNull(){
            assertNotNull(planetsDTO.hasGravity());
        }
        @Test
        @DisplayName("Check Planet terrain is Valid  ")
        void checkPlanetTerrainIsNotNull(){
            assertNotNull(planetsDTO.hasTerrain());
        }
        @Test
        @DisplayName("Check Planets Surface Water is Valid ")
        void checkPlanetsSurfaceWaterIsNotNull(){
            assertNotNull(planetsDTO.hasSurfaceWater());
        }
        @Test
        @DisplayName("Check If the Population Is Valid ")
        void checkIfThePopulationIsNotNull(){
            assertNotNull(planetsDTO.hasPopulation());
        }
        @Test
        @DisplayName("Check If There are films in the List ")
        void checkIfThereAreFilmsInTheList(){
            assertNotNull(planetsDTO.hasFilms());
        }
        @Test
        @DisplayName("Check If the Resident list is Empty or Has Values")
        void checkIfTheResidentsListIsEmptyOrHasValues(){
            assertNotNull(planetsDTO.hasResidents());
        }

        }

        }










