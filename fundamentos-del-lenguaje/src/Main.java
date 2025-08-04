import estructuraDeDatos.ArraysStructure;

public class Main {
    public static void main( String[] args ) {
        ArraysStructure arraysStructure = new ArraysStructure();

        arraysStructure.testPrimitivePerformance();
        arraysStructure.testReadPrimitivePerformance();

        arraysStructure.testDynamicPerformance();
        arraysStructure.testReadDynamicPerformance();
    }
}