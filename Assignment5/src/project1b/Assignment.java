package project1b;
import java.util.Arrays;
public class Assignment {
	public static void main(String[] args) {
		Module[] array = {
				new Module("Programming","Donal",36),
				new Module("Networks","Faheem",36),
				new Module("Graphics","Barry",36),
				new Module("Web","Ruairi",36),
				new Module("Hardware","Paddy",36),
				new Module("Algorithms","Eoin",36),
				new Module("OOP","Tony",36),
				new Module("Maths","Paddy",36),
				new Module("BigData","Osama",36)
			};
		Arrays.sort(array);
		System.out.println("\nModules :\n"+Arrays.toString(array));
		Arrays.sort(array, Module.lectCompare);
		System.out.println("\nModules sorted by Lecturers :\n"+Arrays.toString(array));
	}
}

