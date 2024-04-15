package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Timeslot {

    private Date timeslotDateAndTime;
    private int startMinutes;
    private int endMinutes;
    private Doctor doctor;

    public Timeslot(Date timeslotDateAndTime, Doctor doctor) {
        this.timeslotDateAndTime = timeslotDateAndTime;
        this.startMinutes = timeslotDateAndTime.getMinutes();
        this.endMinutes = timeslotDateAndTime.getMinutes() + 15;
        this.doctor = doctor;
        doctor.addTimeslot(this);//με το που φτιαχνεται το ταιμσλοτ προστιθεται και στον γιατρο
    }

    public String getTimeslotDateAndTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        String strDate = formatter.format(timeslotDateAndTime);
        return strDate;
    }

    public Date getDate() {
        return timeslotDateAndTime;
    }
}
