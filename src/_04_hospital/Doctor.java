package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public Object performsSurgery() {
		return false;
	}

	public Object makesHouseCalls() {
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		if (patients.size() == 3) {
			throw new DoctorFullException();
		} else {
			patients.add(patient);
		}
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void doMedicine() {
		for (Patient p : patients) {
			p.checkPulse();
		}
	}
	
	
}
