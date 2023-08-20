package edu.disease.asn2;

import java.util.*;

class Hospital {
    private String name;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public void admitPatient(Patient patient) {
        patients.add(patient);
    }

    public List<Patient> getPatients() {
        return patients;
    }

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}

class Patient {
    private String name;
    private int age;
    private String disease;

    public Patient(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }
}

class DiseaseControlManager {
    private List<Hospital> hospitals;

    public DiseaseControlManager() {
        hospitals = new ArrayList<>();
    }

    public void addHospital(Hospital hospital) {
        hospitals.add(hospital);
    }

    public void displayHospitalPatients() {
        System.out.println("Hospital Patient List:");
        for (Hospital hospital : hospitals) {
            System.out.println("Hospital: " + hospital.getName());
            for (Patient patient : hospital.getPatients()) {
                System.out.println("Name: " + patient.getName());
                System.out.println("Age: " + patient.getAge());
                System.out.println("Disease: " + patient.getDisease());
                System.out.println("-----------------------------");
            }
        }
    }

	public List<Patient> getHospitals() {
		// TODO Auto-generated method stub
		return null;
	}

	public void admitPatientToHospital(Patient patient, Hospital hospital) {
		// TODO Auto-generated method stub
		
	}

    // Add more methods for disease analysis, control measures, etc.
}

class DiseaseControlManagerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DiseaseControlManager manager = new DiseaseControlManager();

        while (true) {
            System.out.println("Disease Control Manager Application");
            System.out.println("1. Add Hospital");
            System.out.println("2. Admit Patient");
            System.out.println("3. Display Hospital Patients");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter hospital name: ");
                    String hospitalName = scanner.nextLine();
                    Hospital hospital = new Hospital(hospitalName);
                    manager.addHospital(hospital);
                    break;
                case 2:
                    // Admit a patient to a hospital
                    break;
                case 3:
                    manager.displayHospitalPatients();
                    break;
                case 4:
                    System.out.println("Exiting application. Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}