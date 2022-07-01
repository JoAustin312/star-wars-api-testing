package com.sparta.javabinks.dtos;

import com.sparta.javabinks.framework.ConnectionManager;
import com.sparta.javabinks.framework.Injector;

import java.util.List;
import java.util.Set;

public class ListExistingDTOPossibilities {
    public static void main(String[] args) {
//        Set<String> eyeColors = new HashSet<>();
//        Set<String> hairColors = new HashSet<>();
//        Set<String> skinColors = new HashSet<>();
//
//        populateSetsForPeople(eyeColors, hairColors, skinColors);
//
//        System.out.println("Sets of:\n" +
//                "Eye Colors: " + eyeColors + "\n" +
//                "Hair Colors: " + hairColors + "\n" +
//                "Skin Colors: " + skinColors + "\n" +
//                "");
        PeopleDTO person = Injector.injectPeopleDTO(ConnectionManager.getConnection("people/1"));
        System.out.println(person.hasValidValueInFile("red", "src/test/resources/haircolour.csv"));
    }

    private static void populateSetsForPeople(Set<String> eyeColors, Set<String> hairColors, Set<String> skinColors) {
        for (int i = 1; i < 100; i++) {
            PeopleDTO peoples = Injector.injectPeopleDTO(ConnectionManager.getConnection("people/" + i));
            if (peoples == null) continue;
            String[] stringAsArray = peoples.getEyeColor().split(", ");
            eyeColors.addAll(List.of(stringAsArray));
            stringAsArray = peoples.getHairColor().split(", ");
            hairColors.addAll(List.of(stringAsArray));
            stringAsArray = peoples.getSkinColor().split(", ");
            skinColors.addAll(List.of(stringAsArray));
        }
    }
}
