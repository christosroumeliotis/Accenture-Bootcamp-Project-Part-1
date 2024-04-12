package org.example;

public class Insured {
    private int afm;
    private int amka;
    private String name;
    //call the Date() constructor and pass the string as its argument
    private String birthdate;
    private String surname;
    private String email;

    public Insured(int afm, int amka, String name, String birthdate, String surname, String email) {
        this.afm = afm;
        this.amka = amka;
        this.name = name;
        this.birthdate = birthdate;
        this.surname = surname;
        this.email = email;
    }

    public int getAfm() {
        return afm;
    }

    public int getAmka() {
        return amka;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    //Selects a Vaccination Center and checks its available Timeslots
    public void availableTimeslotsOfSelectedVC(VaccinationCenter vc){
        vc.availableTimeslots();
    }

    //Ensures if the selected timeslot is free and selects it. If not prints message
    public void selectAvailableTimeslot(VaccinationCenter vc,Timeslot t){
        if(vc.checkIfIsFree(t)){
            vc.selectTimeslot(t);
            vc.addReservation(new Reservation(this,t));
        }else{
            System.out.println("This timeslot isn't available");
        }
    }

}
