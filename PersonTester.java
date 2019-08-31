package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
	public static void main(String[] args) {

	Person Guy1 = new Person("Jeff", "Diamonds", "123948745", new DateAndPlaceOfBirth(1985, 6, 7, "Atlantic City", "New Jersey", "United States"), new StreetUSAddress("40 Dowry Lane", "", "Atlantic City", "NJ", "12112"));
	Person Guy2 = new Person("Jahmal", "Freeman", "123645335", new DateAndPlaceOfBirth(1988, 9, 9, "Bellport", "New York", "United States"), new StreetUSAddress("24 Albert Lane", "", "Bellport", "NY", "12112"));
	Person Guy3 = new Person("Shrek", "Swampert", "122739445", new DateAndPlaceOfBirth(1982, 4, 5, "Brooklyn", "New York", "United States"), new StreetUSAddress("88 Apple Street", "", "Brooklyn", "NY", "12112"));
	Person Guy4 = new Person("Spack", "Jacker", "920361352", new DateAndPlaceOfBirth(1982, 4, 5, "Patchogue", "New York", "United States"), new StreetUSAddress("4 Main Street", "", "Patchogue", "NY", "12112"));
	System.out.println(Guy1);
	System.out.println(Guy2);
	System.out.println(Guy3);
	System.out.println(Guy4);
	try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");
	DateAndPlaceOfBirth[] DOB2 = new DateAndPlaceOfBirth[6];
	DOB2[1] = new DateAndPlaceOfBirth(1985, 6, 7, "Atlantic City", "New Jersey", "United States");
	DOB2[2] = new DateAndPlaceOfBirth(1988, 9, 9, "Bellport", "New York", "United States");
	DOB2[3] = new DateAndPlaceOfBirth(1982, 4, 5, "Brooklyn", "New York", "United States");
	DOB2[4] = new DateAndPlaceOfBirth(1982, 4, 5, "Patchogue", "New York", "United States");
	StreetUSAddress[] Add2 = new StreetUSAddress[5];
	Add2[1] = new StreetUSAddress("40 Dowry Lane", "", "Atlantic City", "NJ", "12112");
	Add2[2] = new StreetUSAddress("24 Albert Lane", "", "Bellport", "NY", "12112");
	Add2[3] = new StreetUSAddress("88 Apple Street", "", "Brooklyn", "NY", "12112");
	Add2[4] = new StreetUSAddress("4 Main Street", "", "Patchogue", "NY", "12112");
	Person Guy12 = new Person("Jeff", "Diamonds", "123948745", DOB2[1], Add2[1]);
	Person Guy22 = new Person("Jahmal", "Freeman", "123645335", DOB2[2], Add2[2]);
	Person Guy32 = new Person("Shrek", "Swampert", "122739445", DOB2[3], Add2[3]);
	Person Guy42 = new Person("Spack", "Jacker", "920361352", DOB2[4], Add2[4]);
	output.println(Guy12);
	output.println(Guy22);
	output.println(Guy32);
	output.println(Guy42);
	} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

