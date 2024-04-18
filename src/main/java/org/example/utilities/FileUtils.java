package org.example.utilities;

import org.example.entities.Doctor;
import org.example.entities.Insured;
import org.example.entities.VaccinationCenter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Year;
import java.util.List;

import static org.example.utilities.Constants.OUTPUT_FILE_NAME;

public class FileUtils {
    public static void printResults(List<VaccinationCenter> vaccinationCenters, List<Doctor> doctors, List<Insured> insureds) {
        try {
            File myObj = new File("vaccination-results.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }


            FileWriter myWriter = new FileWriter("vaccination-results.txt");
            myWriter.write("----Τα επικείμενα ραντεβού για κάθε εμβολιαστικό κέντρο----\n");
            for (VaccinationCenter vc : vaccinationCenters) {
                myWriter.write(vc.returnAllMyReservations() + "\n");
            }

            myWriter.write("----Τις ελεύθερες χρονικές θυρίδες κάθε εμβολιαστικού κέντρου----\n");
            for (VaccinationCenter vc : vaccinationCenters) {
                myWriter.write(vc.availableTimeslotsOfVc() + "\n");
            }

            myWriter.write("----Τους εμβολιασμούς (ημερομηνία εμβολιασμού και ονοματεπώνυμο ασφαλισμένου) που " +
                    "πραγματοποίησε κάθε γιατρός, για όλους τους γιατρούς.----\n");
            for (Doctor dc : doctors) {
                myWriter.write(dc.returnTheVaccinationsDone() + "\n");
            }

            myWriter.write("----Τους ασφαλισμένους άνω των 60 ετών που δεν έχουν κλείσει ραντεβού για εμβολιασμό.----\n");
            for (Insured ins : insureds) {
                if (ins.getVaccinationCoverage() == null && ins.getReservation() == null && Year.now().getValue() - ins.getBirthdate().getYear() > 60) {
                    myWriter.write(ins.getName() + " " + ins.getSurname() + " AFM: " + ins.getAfm() + " is over 60 and never made a reservation for vaccination\n");
                }
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
