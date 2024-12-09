package java_io.tests;

import java_io.Crime;
import java_io.CrimeReader;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class CrimeReaderTest {

    private final String filePath = "C:\\Users\\RN89\\junior_hetfo\\ProbaVizsga\\src\\java_io\\atlcrime.csv";
    List<Crime> crimes = CrimeReader.readCrimesFromCSV(new File(filePath));


    public CrimeReaderTest() throws FileNotFoundException {
    }


    @Test
    public void crimeReaderTest_1() {
        assertEquals(32855, crimes.size());
    }

    @Test
    public void crimeReaderTest_2() {

        List<String> crimeCategories = crimes.stream().map(Crime::getCrimeCategory).distinct().toList();
        assertEquals(11, crimeCategories.size());
    }

    @Test
    public void crimeReaderTest_3() {
        Map<String, List<Crime>> neighborhoodPlanningUnits = crimes.stream().collect(Collectors.groupingBy(Crime::getNeighborhoodPlanningUnits));
        assertEquals(248, neighborhoodPlanningUnits.get("A").size());
        assertEquals(877, neighborhoodPlanningUnits.get("L").size());
        assertEquals(1305, neighborhoodPlanningUnits.get("X").size());
    }

    @Test
    public void crimeReaderTest_4() {
        int expectedCrimesInPolarRock = 75;
        int expectedCrimesInWashingtonPark = 128;
        int expectedCrimesInCenterHill = 280;

        int crimesInPolarRock = 0;
        int crimesInWashingtonPark = 0;
        int crimesInCenterHill = 0;
        for(Crime crime: crimes){
            if(crime.getNeighborhood().equals("Polar Rock")){
                crimesInPolarRock++;
            }
            if(crime.getNeighborhood().equals("Washington Park")){
                crimesInWashingtonPark++;
            }
            if(crime.getNeighborhood().equals("Center Hill")){
                crimesInCenterHill++;
            }
        }

        assertEquals(expectedCrimesInPolarRock, crimesInPolarRock);
        assertEquals(expectedCrimesInWashingtonPark, crimesInWashingtonPark);
        assertEquals(expectedCrimesInCenterHill, crimesInCenterHill);

    }

    @Test
    public void crimeReaderTest_5() {
        int expectedBeatUnit = 210;

        Map<Integer, List<Crime>> crimesByBeatUnits = crimes.stream().collect(Collectors.groupingBy(Crime::getPoliceBeat));
        int beatUnit = 0;
        int crimesRespondedTo = 0;
        for(Map.Entry crime:crimesByBeatUnits.entrySet()){
                int numberOfCrimesResponse = ((List<Crime>) crime.getValue()).size();
                if(numberOfCrimesResponse > crimesRespondedTo){
                    beatUnit = (int) crime.getKey();
                    crimesRespondedTo = numberOfCrimesResponse;
                }
            }


        assertEquals(expectedBeatUnit, beatUnit);
    }

    @Test
    public void crimeReaderTest_6() {
        int counter = 0;
        for(Crime crime: crimes){
            if(crime.getLocation().length() > 0){
                if(crime.getLocation().substring(0,4).equals("3867")){
                    counter++;
                }
            }
        }
        if(counter <=1){
            fail();
        }
        else{
            assertEquals(0,0);
        }
    }
}
