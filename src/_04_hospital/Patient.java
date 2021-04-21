package _04_hospital;

public class Patient {
	private boolean feelsCared = false;

	public Object feelsCaredFor() {
		return feelsCared;
	}

	public void checkPulse() {
		feelsCared = true;
	}

}
