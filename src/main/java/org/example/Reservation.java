package org.example;

public class Reservation {
    private Insured insured;
    private Timeslot timeslot;

    public Reservation(Insured insured, Timeslot timeslot) {
        this.insured = insured;
        this.timeslot = timeslot;
    }

    public Timeslot getTimeslot() {
        return timeslot;
    }

    public String returnReservation() {
        return insured.getName() + " " + insured.getSurname() + " has reservation for " + timeslot.getTimeslotDateAndTime();
    }
}
