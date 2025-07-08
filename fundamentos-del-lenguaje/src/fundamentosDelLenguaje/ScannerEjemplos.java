package fundamentosDelLenguaje;

import java.util.Scanner;

public class ScannerEjemplos{
	private final Scanner input;
	private Integer firstNumber;
	private Integer secondNumber;

	/**
	 * Construye una nueva instancia de {@code ScannerEjemplos} utilizando un
	 * Scanner.
	 *
	 * @param input la instancia {@link Scanner} que se va a utilizar para la
	 *              entrada de lectura.
	 */
	public ScannerEjemplos( Scanner input ) {
		this.input = input;
	}

	/**
	 * Función que lee dos números.
	 */
	public void addNumbers() {
		System.out.print( "Add the first number: " );
		this.firstNumber = this.input.nextInt();

		System.out.print( "Add the second number: " );
		this.secondNumber = this.input.nextInt();
	}

	/**
	 * Función que suma dos números agregados previamente.
	 */
	public void sumOfTwoNumbers() {
		if ( this.firstNumber != null  && this.secondNumber != null ) {
			int sum = this.firstNumber + this.secondNumber;

			System.out.println( "The sum is: " + sum );
			return ;
		}

		System.out.println( "The numbers are not valid" );
	}

	/**
	 * Compara cual de los dos números agregados es mayor, menor o igual
	 */
	public void compareTwoNumbers() {
		int compared = Integer.compare( this.firstNumber, this.secondNumber );

		switch ( compared ) {
			case 1:
				System.out.println( "First number is mayor" );
				break;
			case 0:
				System.out.println( "Both numbers are equals" );
				break;
			case  -1:
				System.out.println( "Second number is mayor");
				break;
		}
	}

}
