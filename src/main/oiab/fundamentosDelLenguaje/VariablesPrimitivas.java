package main.oiab.fundamentosDelLenguaje;

/**
 * La clase {@code VariablePrimitvas} demuestra el uso de variables primitivas 
 * en Java como {@code String}, {@code byte}, {@code double} y {@code int}
 */
public class VariablesPrimitivas {
    private String nombre;
    private byte age;
    private double price;
    private int xAxis, yAxis;

    /**
     * Construye una instancia {@code VariablePrimitvas} con los valores por 
     * defecto:
     * <ul>
     *      <li> {@code nombre} =  12 </li>
     *      <li> {@code age} =  34 </li>
     *      <li> {@code price} =  34.56 </li>
     *      <li> {@code xAxis} =  78 </li>
     *      <li> {@code yAxis} =  910 </li>
     * </ul>
     */
    public VariablesPrimitivas () {
        this.nombre = "Hola Mundo";
        this.age = 12;
        this.price = 34.56;
        this.xAxis = 78;
        this.yAxis = 910;
    }

    /**
     * Muestra los valores en la consola.
     * <ul>
     *      <li> {@code nombre} </li>
     *      <li> {@code age} </li>
     *      <li> {@code price} </li>
     *      <li> {@code xAxis} </li>
     *      <li> {@code yAxis} </li>
     * </ul>
     */
    public void mostrarVariablesPrimitivas() {
        String result = "Age: " + this.age + "\n" +
                        "Nombre: " + this.nombre + "\n" +
                        "Price: " + this.price + "\n" +
                        "xAxis: " + this.xAxis +  "\n" +
                        "yAxis: " + this.yAxis ;

        System.out.println( result );
    }
}