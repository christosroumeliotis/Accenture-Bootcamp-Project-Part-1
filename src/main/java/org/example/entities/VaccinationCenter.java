package org.example.entities;

import java.util.ArrayList;

public class VaccinationCenter {
    private String code;
    private String address;
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Reservation> reservations = new ArrayList<>();//Λιστ με τα reservations που έχουν γίνει σε κάθε κέντρο

    public VaccinationCenter(String code, String address) {
        this.code = code;
        this.address = address;
    }

    //προστιθεται ο γιατρος στο κεντρο
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        if (doctor.getVc() == null) {
            doctor.setVc(this);
            System.out.println("Doctor " + doctor.getName() + " " + doctor.getSurname() + " added in " + code);
        } else {
            System.out.println("Doctor " + doctor.getName() + " " + doctor.getSurname() + " has been in another vaccination center");
        }
    }

    //προστιθεται το ρεζερβετιον που εκανε ο ασφαλισμενος
    public void addReservation(Reservation r) {
        reservations.add(r);
    }

    //διαγραφεται το ρεζερβετιον που εκανε ο ασφαλισμενος
    public void deleteReservation(Reservation r) {
        reservations.remove(r);
    }

    public String getCode() {
        return code;
    }

    public String returnAllMyReservations() {
        String s = "Vaccination center:" + code + " reservations\n";
        for (Reservation r : reservations) {
            s += r.returnReservation() + "\n";
        }
        if (s.length() == 0) {
            return "No reservations for the vaccination center with code: " + code;
        } else {
            return s;
        }
    }

    public String availableTimeslotsOfVc() {
        String s = "Vaccination center:" + code + " available timeslots\n";
        for (Doctor d : doctors) {
            s += d.returnMyAvailableTimeslots();
        }
        return s;
    }
}
