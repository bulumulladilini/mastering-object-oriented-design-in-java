package domain;

public class Nurse extends Employee {

	public Nurse(int id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("Nurse in action...");
	}

	// nurses
	private void checkVitalSigns() {
		System.out.println("Checking Vitals");
	}

	private void drawBlood() {
		System.out.println("drawing blood");
	}

	private void cleanPatientArea() {
		System.out.println("cleaning patient area");
	}

	@Override
	public void preformDuties() {
		checkVitalSigns();
		drawBlood();
		cleanPatientArea();
	}

}