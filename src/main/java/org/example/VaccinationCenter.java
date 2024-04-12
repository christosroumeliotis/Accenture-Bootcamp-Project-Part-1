package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VaccinationCenter {
    private String code;
    private String address;
    private HashMap<Timeslot,Boolean> timeslots=new HashMap<>();//Key Value pairs with the timeslot and if It's free or not
    private ArrayList<Reservation> reservations=new ArrayList<>();

    public VaccinationCenter(String code, String address) {
        this.code = code;
        this.address = address;
    }

    public void addTimeslot(Timeslot t){
        timeslots.put(t,true);
    }

    //Checks if the Timeslot of the specific Vaccination center is free
    //If it's not found prints message
    public boolean checkIfIsFree(Timeslot t){
        boolean bool=false;
        try{
            for(Map.Entry<Timeslot, Boolean> entry : timeslots.entrySet()){
                if(entry.getKey()==t){
                    bool=true;
                }
            }
            return bool;
        }catch(Exception e){
            System.out.println("No such timeslot available");
            return bool;
        }
    }

    //Selects the given timeslot,checked if is available
    public void selectTimeslot(Timeslot t){
        timeslots.put(t,false);
    }

    //Prints the available Timeslots
    public void availableTimeslots(){
        System.out.println("----My available timeslots----");
        for(Map.Entry<Timeslot, Boolean> entry : timeslots.entrySet()) {
            if (entry.getValue()) {
                entry.getKey().printTimeslot();
                System.out.println(": " + entry.getValue());
            }
        }
    }

    public void addReservation(Reservation r){
        reservations.add(r);
    }

    public void printMyReservations(){
        System.out.println("----My reserved timeslots----");
        for(Reservation r:reservations){
            r.printInfo();
        }
    }

}
