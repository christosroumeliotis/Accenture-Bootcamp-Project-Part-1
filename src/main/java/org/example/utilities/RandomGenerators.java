package org.example.utilities;

import org.example.Insured;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

import static org.example.utilities.Constants.FIRST_NAMES;
import static org.example.utilities.Constants.LAST_NAMES;

public class RandomGenerators {
    public static ArrayList<Insured> createInsureds() {
        Random random = new Random();
        ArrayList<Insured> insureds = new ArrayList<>();
        String name;
        String surname;
        String afm;
        LocalDate birthdate;
        String amka;
        System.out.println("\n----------My insureds---------");
        for (int i = 0; i < Constants.NUMBER_OF_INSUREDS; i++) {
            name = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
            surname = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
            afm = String.format("%09d", Math.abs(random.nextInt()));
            birthdate = LocalDate.now().minusYears(random.nextInt(10, 91));
            StringBuilder amkaSecondPart = new StringBuilder();
            for (int j = 0; j < 5; j++) {
                amkaSecondPart.append(random.nextInt(0, 10));
            }
            amka = String.format("%02d", birthdate.getDayOfMonth()) + String.format("%02d", birthdate.getMonthValue()) + String.valueOf(birthdate.getYear()).substring(2) + amkaSecondPart;
            insureds.add(new Insured(afm, amka, name, Converters.convertLocalDateToDate(birthdate), surname, name + "." + surname + "@gmail.com"));
        }
        return insureds;
    }
}
