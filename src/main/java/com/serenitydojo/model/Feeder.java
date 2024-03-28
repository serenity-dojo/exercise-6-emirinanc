package com.serenitydojo.model;

public class Feeder {
    private String animal;
    private boolean isPremium;

    public String feeds(String animal, boolean isPremium) {
        if(animal.equals("Hamster")) {
            return isPremium ? "Carrot":"Cabbage";
        }

        if(animal.equals("Dog")) {
            return isPremium ? "Chicken": "Dog Food";
        }

        if(animal.equals("Cat")) {
            return isPremium ? "Salmon": "Tuna";
        }
        else {
            return "Animal not on list";
        }
    }

}
