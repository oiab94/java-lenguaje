package main.oiab.fundamentosDelLenguaje;

public class Condicionales {
	private short age;
	public static String[] DAYS =
			new String[] {  "sunday",
							"monday",
							"tuesday",
							"wednesday",
							"thursday",
							"friday",
							"saturday" };

	/**
	 * Construye la clase Condicionales
	 */
	public Condicionales() {
		System.out.println("CONSTRUCTOR EXECUTED: OK\n");
	}

	/**
	 * Define la edad de una persona
	 * @param age edad de la persona
	 */
	public void setAge (short age) { this.age = age; }

	/**
	 * Obtiene la edad de una persona
	 * @return la edad de la persona
	 */
	public short getAge() { return this.age; }

	/**
	 * Verifica si una persona es mayor de edad
	 */
	public void checkIfPersonAreOlder() {
		boolean isOlder = this.age >= 18;

		System.out.print("CHECK IF PERSON ARE OLDER: " + isOlder);
	}

	/**
	 * Verifica si un día corresponde a alguna fecha
	 * @param day dia que se desea comprobar
	 */
	public void checkADayInAWeek(byte day) {
		String isTheDay = DAYS[day];
		boolean isADay = DAYS[day] != null;

		switch (day){
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
				System.out.println("\nCHECK IF IS A DAY IN A WEEK: " + isTheDay);
				break;
			default:
				System.out.println("\nCHECK IF IS A DAY IN A WEEK: " + isADay);
		}
	}

}
