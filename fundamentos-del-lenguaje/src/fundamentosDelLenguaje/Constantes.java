package fundamentosDelLenguaje;

public class Constantes {
    /**
     * Esta es una constante por objeto, es decir, cada objeto tiene su propio
     * valor inmodificable
     */
    public final String NOMBRE;
    

    /**
     * Setea por defecto nuestra constante {@code NOMBRE}, está será "Sin nombre"
     */
    public Constantes(){
        this.NOMBRE = "Sin nombre";
    }

    /**
     * Setea por defecto nuestra constante {@code NOMBRE} con el valor que 
     * agregemos 
     */
    public Constantes(String nombre) {
        this.NOMBRE = nombre;
    }


    /**
     * Está es una constante de clase, es decir puede ser accedida a tráves de 
     * la clase y no puede ser modificada
     */
    public static final float TAX_RATE = 0.1F;
}
