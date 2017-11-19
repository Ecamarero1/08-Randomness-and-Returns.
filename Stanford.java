/**
 * File: Stanford.java
 * -------------------
 * The program provides an example of using Student objects
 */

import acm.program.*;

public class Stanford extends ConsoleProgram {
	
	/* Constants */
	private static final int CS106A_UNITS = 5;
	
	public void run() {
		setFont("Times New Roman-28");
				
		Student mehran = new Student("Mehran Sahami", 38000000);
		mehran.setUnits(3);
		printUnits(mehran);

		Student vikas = new Student("Vikas Yendluri", 57000000);
		vikas.setUnits(179);
		printUnits(vikas);
		
		println("Called tryToAddUnits to add to Vikas' units...");
		tryToAddUnits(vikas.getUnits(), CS106A_UNITS);
		printUnits(vikas);
				
		takeCS106A(vikas);
		takeCS106A(mehran);
		
		printUnits(mehran);
		printUnits(vikas);
	}
	
	/**
	 * Prints the name and number of units that student s has,
	 * as well as whether the student can graduate
	 * @param s The student who we will print information for
	 */
	private void printUnits(Student s) {
		println(s.getName() + " has " + s.getUnits() + " units");
		println(s.toString() + " can graduate: " + s.hasEnoughUnits());
	}
	
	/**
	 * BUGGY!! -- Tries to add to numUnits, but only adds to copy!
	 * @param numUnits Original number of units
	 * @param numUnitsToAdd Number of units to add to original
	 */
	private void tryToAddUnits(double numUnits, double numUnitsToAdd) {
		numUnits += numUnitsToAdd;
	}

	/**
	 * States that student s takes CS106A and increments number of units
	 * @param s The student who will be taking CS106A
	 */
	private void takeCS106A(Student s) {
		println(s.getName() + " takes CS106A!!");
		s.incrementUnits(CS106A_UNITS);
	}
}