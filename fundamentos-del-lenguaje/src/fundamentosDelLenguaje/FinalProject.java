package fundamentosDelLenguaje;

import java.io.InputStream;
import java.util.Scanner;

public class FinalProject{
	private Scanner scanner;
	private int age;
	private int grade1;
	private int grade2;
	private int grade3;

	public FinalProject( InputStream inputStream ) {
		this.scanner = new Scanner(inputStream);
	}

	public void initializeFinalProject() {
		System.out.print( "Insert your age: "  );
		this.setAge();

		System.out.print( "Insert your grade_1: "  );
		this.grade1 = this.setGrade();

		System.out.print( "Insert your grade_2: "  );
		this.grade2 = this.setGrade();

		System.out.print( "Insert your grade_3: "  );
		this.grade3 = this.setGrade();

		System.out.printf( "-> Your average grade is: %.3f \n", this.getAverage() );

		System.out.print( "-> Subject aprove: " + this.checkIfApprove()  );
		this.grade3 = this.setGrade();
	}

	/**
	 * Get the age of the user
	 */
	private void setAge() {
		this.age = scanner.nextInt();
	}

	/**
	 * Get the grade from the student
	 * @return the grade added
	 */
	private int setGrade() {
		return this.scanner.nextInt();
	}

	/**
	 * Get the average of the student
	 * @return the average
	 */
	private float getAverage() {
		float gradeSums = (float)grade1 + (float)grade2 + (float)grade3;

		return gradeSums / 3;
	}

	/**
	 * Check if the student approve subjects
	 * @return true/false if approve or not
	 */
	private boolean checkIfApprove() {
		return this.getAverage() > 6F;
	}
}

