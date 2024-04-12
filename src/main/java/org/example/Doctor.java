package org.example;

import java.util.ArrayList;

public class Doctor {
    private int amka;
    private String name;
    private String surname;
    private ArrayList<Timeslot> timeslots;

    public Doctor(int amka, String name, String surname) {
        this.amka = amka;
        this.name = name;
        this.surname = surname;
    }

}
