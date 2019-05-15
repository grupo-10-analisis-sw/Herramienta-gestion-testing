package main;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.LinkedList;
import java.util.Stack;

public class LectorArchivos {
	
	public static LinkedList<String> leerArchivo(String path) throws FileNotFoundException {
		
		File f = new File(path);
		Scanner sc = new Scanner(f);
		
		LinkedList<String> codigo = new LinkedList<String>();
		Stack<String> pilaCodigo = new Stack<String>();
		String linea = null;
		
		try {
			linea = sc.nextLine();
			if(!linea.isEmpty())
				pilaCodigo.push(linea);
		}
		catch (NoSuchElementException err) {
			System.out.println("No hay ninguna linea para leer en el archivo");
		}

		// Mientras haya una linea para leer
		while(sc.hasNextLine()) {
			linea = sc.nextLine();
			
			// Si la linea no esta vacia la pongo en la pila
			if(!linea.isEmpty())
				pilaCodigo.push(linea);
		}
		
		// La pila se lleno al reves, entonces cuando voy sacando las lineas 
		// y las pongo en lista quedan en el orden correcto
		while(!pilaCodigo.isEmpty())
			codigo.push(pilaCodigo.pop());
		
		// Cierro el archivo para que no haya posibilidad de corromperse y devuelvo el codigo
		sc.close();
		return codigo;
	}
}
