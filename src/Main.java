import fundamentosDelLenguaje.Condicionales;

public class Main {
    public static void main(String[] args) {
        Condicionales condicion = new Condicionales();

        byte age = 17;
        condicion.setAge(age);
        condicion.checkIfPersonAreOlder();

        byte day = 2;
        condicion.checkADayInAWeek(day);
    }
}