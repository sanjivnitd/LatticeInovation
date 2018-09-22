package com.lattice.inovation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Patientdataservice {

	@Autowired
	private PatientRepository patientRepository;

	private List<Patientdata> patients = new ArrayList<>(Arrays.asList(new Patientdata("1", "a", "A1"),
			new Patientdata("2", "b", "A1"), new Patientdata("3", "c", "A1"), new Patientdata("4", "d", "A1"),
			new Patientdata("5", "e", "A1"), new Patientdata("6", "f", "A1"), new Patientdata("7", "g", "A1"),
			new Patientdata("8", "h", "A1"), new Patientdata("9", "i", "A1"), new Patientdata("10", "j", "A1")));

	public List<Patientdata> getpatientdata() {
		List<Patientdata> patients = new ArrayList<>();
		patientRepository.findAll().forEach(patients::add); /*
		 all the record into patients list;
		 */
		
		return patients;

	}

	public Patientdata getpatientname(String patient_id) {
		return patients.stream().filter(t -> t.getPatient_id().equals(patient_id)).findFirst().get();
	}

	public void postpatientdata(Patientdata d) {
		Patientdata ob = new Patientdata("1","2","3");
		
		patientRepository.save(ob);

	}
}