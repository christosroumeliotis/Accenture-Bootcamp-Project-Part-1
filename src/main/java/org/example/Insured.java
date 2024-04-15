package org.example;

public class Insured {
    private String afm;
    private String amka;
    private String name;
    //call the Date() constructor and pass the string as its argument
    private String birthdate;
    private String surname;
    private String email;

    public Insured(String afm, String amka, String name, String birthdate, String surname, String email) {
        this.afm = afm;
        this.amka = amka;
        this.name = name;
        this.birthdate = birthdate;
        this.surname = surname;
        this.email = email;
    }

    public String getAfm() {
        return afm;
    }

    public String getAmka() {
        return amka;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    //Selects a Vaccination Center and checks its available Timeslots
    public void availableTimeslotsOfSelectedVC(VaccinationCenter vc) {
        vc.availableTimeslots();
    }

    //Ensures if the selected timeslot is free and selects it. If not prints message
    public void selectAvailableTimeslot(VaccinationCenter vc, Timeslot t) {
        if (vc.checkIfIsFree(t)) {
            vc.selectTimeslot(t);
            vc.addReservation(new Reservation(this, t));
        } else {
            System.out.println("This timeslot isn't available");
        }
    }

    public void printInfoForInsured() {
        System.out.println("Insured{" +
                "afm='" + afm + '\'' +
                ", amka='" + amka + '\'' +
                ", name='" + name + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}');

    }
}
