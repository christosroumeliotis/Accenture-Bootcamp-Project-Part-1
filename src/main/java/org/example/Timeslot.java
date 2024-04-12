package org.example;

public class Timeslot {
    //validate with try catch or throw
    private String day;
    private String month;
    private int year;
    private int hour;
    private int minutes;
    private int startMinutes;
    private int endMinutes;
    private Doctor doctor;


    public Timeslot(String day, String month, int year, int hour, int minutes, int startMinutes, int endMinutes, Doctor doctor) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minutes = minutes;
        this.startMinutes = startMinutes;
        this.endMinutes = endMinutes;
        this.doctor = doctor;

    }

    public void printTimeslot(){
        System.out.print("Timeslot: "+day+month+year+" "+hour+":"+minutes);
    }

}
