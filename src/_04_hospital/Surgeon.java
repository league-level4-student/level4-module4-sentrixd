package _04_hospital;

public class Surgeon extends Doctor {
	public Boolean performsSurgery() {
		return true;
	}
	
	public Boolean makesHouseCalls() {
		return false;
	}
}
