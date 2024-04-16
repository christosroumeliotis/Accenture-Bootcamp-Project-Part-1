package org.example.utilities;

import org.example.entities.VaccinationCenter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static org.example.utilities.Constants.OUTPUT_FILE_NAME;

public class FileUtils {
    public static void printUpcomingReservations(List<VaccinationCenter> vaccinationCenters) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(OUTPUT_FILE_NAME);
            fileWriter.write("-------- Τα επικείμενα ραντεβού για κάθε εμβολιαστικό κέντρο --------\n");

            for (VaccinationCenter vaccinationCenter : vaccinationCenters) {
                fileWriter.write(vaccinationCenter.returnAllMyReservations() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
