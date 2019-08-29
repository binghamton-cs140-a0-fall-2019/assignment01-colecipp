package assignment01;

public class PlaceDOBTester {

	public static void main(String[] args) {
		DateAndPlaceOfBirth birth1 = new DateAndPlaceOfBirth(00, 8, 02, "Bellport", "New York", "USA");
		System.out.println(birth1);
		DateAndPlaceOfBirth birth2 = new DateAndPlaceOfBirth(00, 8, 02, "Binghamton", "New York", "USA");
		System.out.println(birth2);
		DateAndPlaceOfBirth birth3 = new DateAndPlaceOfBirth(02, 8, 02, "Albany", "New York", "USA");
		System.out.println(birth3);
		DateAndPlaceOfBirth birth4 = new DateAndPlaceOfBirth(00, 7, 03, "Berlin",  "Germany");
		System.out.println(birth4);
		DateAndPlaceOfBirth birth5 = new DateAndPlaceOfBirth(00, 8, 21, "London",  "England");
		System.out.println(birth5);
	
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");
			DateAndPlaceOfBirth birth12 = new DateAndPlaceOfBirth(00, 8, 02, "Bellport", "New York", "USA");
			output.println(birth12);
			DateAndPlaceOfBirth birth22 = new DateAndPlaceOfBirth(00, 8, 02, "Binghamton", "New York", "USA");
			output.println(birth22);
			DateAndPlaceOfBirth birth32 = new DateAndPlaceOfBirth(02, 8, 02, "Albany", "New York", "USA");
			output.println(birth32);
			DateAndPlaceOfBirth birth42 = new DateAndPlaceOfBirth(00, 7, 03, "Berlin",  "Germany");
			output.println(birth42);
			DateAndPlaceOfBirth birth52 = new DateAndPlaceOfBirth(00, 8, 21, "London",  "England");
			output.println(birth52);
	
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
