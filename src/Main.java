import fundamentosDelLenguaje.Constantes;

public class Main {
    public static void main(String[] args) {
        String sinNombre = new Constantes().NOMBRE;
        Constantes persona = new Constantes( "Laura" );
        
        System.out.println( "Constante por defecto: " + sinNombre );
        System.out.println( "Constante con nombre: " + persona.NOMBRE );


        float taxRate = Constantes.TAX_RATE;
        System.out.println( "Constante de clase: " + taxRate );
    }
}