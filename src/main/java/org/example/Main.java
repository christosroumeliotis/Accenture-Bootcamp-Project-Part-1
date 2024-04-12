package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        VaccinationCenter vc1=new VaccinationCenter("VC001","Ethnikis Aminis 10");

        Doctor doc1=new Doctor(12345,"Nikos","Papadopoulos");

        Timeslot ts1=new Timeslot("Monday","January",2024,10,30,30,45,doc1);
        Timeslot ts2=new Timeslot("Tuesday","February",2024,10,30,30,45,doc1);

        Insured ins1=new Insured(123123,333333,"Giannis","10/10/1999","Mihailidis","email@email.com");

        vc1.addTimeslot(ts1);
        vc1.addTimeslot(ts2);

        ins1.availableTimeslotsOfSelectedVC(vc1);

        ins1.selectAvailableTimeslot(vc1,ts1);

        vc1.availableTimeslots();
        vc1.printMyReservations();
    }
}