package org.example;

public class Vaccination {
    private Insured insured;
    private Doctor doctor;
    private String vaccinationDate;
    private String expirationDate;

    public Vaccination(Insured insured, Doctor doctor, String vaccinationDate, String expirationDate) {
        this.insured = insured;
        this.doctor = doctor;
        this.vaccinationDate = vaccinationDate;
        this.expirationDate = expirationDate;
    }
}
