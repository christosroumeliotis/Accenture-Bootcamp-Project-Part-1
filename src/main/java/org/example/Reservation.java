package org.example;

public class Reservation {
    private Insured insured;
    private Timeslot timeslot;

    public Reservation(Insured insured, Timeslot timeslot) {
        this.insured = insured;
        this.timeslot = timeslot;
    }

    public void printInfo(){
        System.out.print("Insured: "+insured.getName()+" "+insured.getSurname()+" AFM: "+insured.getAfm()+" AMKA: "+insured.getAmka()+" ");
        timeslot.printTimeslot();
    }
}
