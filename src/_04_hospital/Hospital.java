package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	
	Hospital() {
		
	}
	
	void addDoctor(Doctor d) {
		doctors.add(d);
	}
	
	ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	
	void addPatient(Patient p) {
		patients.add(p);
	}
	
	ArrayList<Patient> getPatients() {
		return patients;
	}

	public void assignPatientsToDoctors() {
		for (Patient p : patients) {
			for (Doctor d : doctors) {
				if (!(d.getPatients().size() == 3)) {
					try {
						d.assignPatient(p);
					} catch (DoctorFullException e) {
						e.printStackTrace();
					}
					break;
				}
			}
		}
	}
	
}
