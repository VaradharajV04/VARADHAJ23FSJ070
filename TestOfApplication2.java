package edu.disease.asn2;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiseaseControlManagerTest {
    private DiseaseControlManager manager;
    
    @BeforeEach
    public void setUp() {
        manager = new DiseaseControlManager();
    }

    @Test
    public void testAddHospital() {
        Hospital hospital = new Hospital("Test Hospital");
        manager.addHospital(hospital);

        assertEquals(1, manager.getHospitals().size());
    }

    @Test
    public void testAdmitPatientToHospital() {
        Hospital hospital = new Hospital("Test Hospital");
        manager.addHospital(hospital);

        Patient patient = new Patient("John", 30, "Fever");
        manager.admitPatientToHospital(patient, hospital);

        assertEquals(1, hospital.getPatients().size());
    }

    @Test
    public void testDisplayHospitalPatients() {
        // Assuming that the displayHospitalPatients method just prints to the console
        // This test case will just check if the method runs without errors
        manager.displayHospitalPatients();
    }
    
    // You can add more test cases as needed to cover edge cases and different scenarios
}