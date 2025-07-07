import fundamentosDelLenguaje.ScannerEjemplos;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        // Start our ScannerEjemplosClass
        Scanner input = new Scanner( System.in );
        ScannerEjemplos scannerEjemplos = new ScannerEjemplos( input );

        // Executed our functions
        scannerEjemplos.addNumbers();
        scannerEjemplos.sumOfTwoNumbers();
        scannerEjemplos.compareTwoNumbers();

        // Close the Scanner Class
        input.close();
    }
}