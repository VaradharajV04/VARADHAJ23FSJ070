package edu.disease.asn1;

import java.util.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;


class Patient {
    private UUID uuid;
    public Patient(UUID uuid, String name, int age, String disease, Date admissionDate, String exposureType) {
		super();
		this.uuid = uuid;
		this.name = name;
		this.age = age;
		this.disease = disease;
		this.admissionDate = admissionDate;
		this.exposureType = exposureType;
	}

	private String name;
    private int age;
    private String disease;
    private Date admissionDate;
    private String exposureType;

    public Patient(String name, int age, String disease, String exposureType) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.admissionDate = new Date();
        this.exposureType = exposureType;
    }

    // Getters
    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public String getExposureType() {
        return exposureType;
    }
}

class Hospital {
    private List<Patient> patients;
    private Map<String, Integer> diseaseCounts;

    public Hospital() {
        patients = new ArrayList<>();
        diseaseCounts = new HashMap<>();
    }

    public void admitPatient(Patient patient) {
        patients.add(patient);

        String disease = patient.getDisease();
        diseaseCounts.put(disease, diseaseCounts.getOrDefault(disease, 0) + 1);
    }

    public void displayPatients() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("List of Admitted Patients:");
        for (Patient patient : patients) {
            System.out.println("UUID: " + patient.getUuid());
            System.out.println("Name: " + patient.getName());
            System.out.println("Age: " + patient.getAge());
            System.out.println("Disease: " + patient.getDisease());
            System.out.println("Admission Date: " + dateFormat.format(patient.getAdmissionDate()));
            System.out.println("Exposure Type: " + patient.getExposureType());
            System.out.println("-----------------------------");
        }
    }

    public void displayDiseaseStatistics() {
        System.out.println("Disease Statistics:");
        for (String disease : diseaseCounts.keySet()) {
            int count = diseaseCounts.get(disease);
            System.out.println(disease + ": " + count + " cases");
        }
    }

	public Object getPatients() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getDiseaseCounts() {
		// TODO Auto-generated method stub
		return null;
	}
}

class DiseaseControlApp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			Hospital hospital = new Hospital();

			while (true) {
			    System.out.println("Central Disease Control - Hospital Application");
			    System.out.println("1. Admit Patient");
			    System.out.println("2. Display Patients");
			    System.out.println("3. Display Disease Statistics");
			    System.out.println("4. Exit");
			    System.out.print("Enter your choice: ");
			    int choice = scanner.nextInt();
			    scanner.nextLine(); // Consume newline

			    switch (choice) {
			        case 1:
			            System.out.print("Enter patient name: ");
			            String name = scanner.nextLine();
			            System.out.print("Enter patient age: ");
			            int age = scanner.nextInt();
			            scanner.nextLine(); // Consume newline
			            System.out.print("Enter patient disease: ");
			            String disease = scanner.nextLine();
			            System.out.print("Enter exposure type: ");
			            String exposureType = scanner.nextLine();
			            Patient patient = new Patient(name, age, disease, exposureType);
			            hospital.admitPatient(patient);
			            break;
			        case 2:
			            hospital.displayPatients();
			            break;
			        case 3:
			            hospital.displayDiseaseStatistics();
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
}