package com.nt.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class HospitalFinder {
    @SuppressWarnings("unused")
	public static void main(String[] args) {
        HospitalService hospitalService = new HospitalService();

        List<String> treatments1 = Arrays.asList("Cardiac", "ENT", "Ortho", "Pediatric", "Gastro");
        @SuppressWarnings("unused")
		int code1 = hospitalService.addHospital("YASHODA", treatments1, "MATHEWS", "9848222222", "Sec");
        
        List<String> treatments2 = Arrays.asList("Neuro", "Cardiac", "Ortho");
        @SuppressWarnings("unused")
		int code2 = hospitalService.addHospital("APOLLO", treatments2, "JOHN", "9848333333", "Hyderabad");
        
        List<String> treatments3 = Arrays.asList("Dermatology", "ENT", "Gastro");
        int code3 = hospitalService.addHospital("CARE", treatments3, "DAVID", "9848444444", "Bangalore");

        
        Map<Integer, String> hospitalMap = hospitalService.getHospitals();
        System.out.println("Hospital Codes and Names:");
        for (Map.Entry<Integer, String> entry : hospitalMap.entrySet())
        {
            System.out.println("Code: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        
        System.out.println("\nDetails of Hospital with Code 100:");
        Hospital hospital = hospitalService.getHospitalDetails(100);
        if (hospital != null) 
        {
            System.out.println(hospital);
        }
        else 
        {
            System.out.println("Hospital not found.");
        }

        System.out.println("\nDetails of Hospital with Code 102:");
        hospital = hospitalService.getHospitalDetails(102);
        if (hospital != null)
        {
            System.out.println(hospital);
        } 
        else 
        {
            System.out.println("Hospital not found.");
        }
    }
}
