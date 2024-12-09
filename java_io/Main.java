package java_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        try {
            List<Crime> crimes = CrimeReader.readCrimesFromCSV(new File("C:\\Users\\RN89\\junior_hetfo\\ProbaVizsga\\src\\java_io\\atlcrime.csv"));
            System.out.println();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
