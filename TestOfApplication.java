package edu.disease.asn1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Date;

class HospitalTest {
    private Hospital hospital;

    @BeforeEach
    public void setUp() {
        hospital = new Hospital();
    }

    @Test
    public void testAdmitPatient() {
        String input = "John\n30\nFever\nCommunity\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Patient patient = new Patient("John", 30, "Fever", "Community");
        hospital.admitPatient(patient);

        assertEquals(1, hospital.getPatients().size());
    }

    @Test
    public void testDisplayPatients() {
        // Assuming that the displayPatients method just prints to the console
        // This test case will just check if the method runs without errors
        hospital.displayPatients();
    }

    @Test
    public void testDisplayDiseaseStatistics() {
        // Assuming that the displayDiseaseStatistics method just prints to the console
        // This test case will just check if the method runs without errors
        hospital.displayDiseaseStatistics();
    }
    
    @Test
    public void testAdmitPatientAndUpdateDiseaseStatistics() {
        String input = "Alice\n25\nCold\nWorkplace\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Patient patient = new Patient("Alice", 25, "Cold", "Workplace");
        hospital.admitPatient(patient);

        assertEquals(1, hospital.getPatients().size());
        assertEquals(1, hospital.getDiseaseCounts().getOrDefault("Cold", 0));
    }
    
    // You can add more test cases as needed to cover edge cases and different scenarios
}