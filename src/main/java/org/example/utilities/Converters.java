package org.example.utilities;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Converters {
    public static Date convertLocaleDateToDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public static LocalDate convertDateToLocaleDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
}
