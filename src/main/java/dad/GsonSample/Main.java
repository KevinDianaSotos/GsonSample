package dad.GsonSample;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Persona p = new Persona();
		System.out.println("Introduzca el nombre porfavor: ");
		p.Nombre = scanner.nextLine();
		System.out.println("Introduzca los apellidos porfavor: ");
		p.Apellidos = scanner.nextLine();
		System.out.println("Introduzca la edad porfavor: ");
		p.Edad = scanner.nextInt();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		scanner.close();
		
	}
}
