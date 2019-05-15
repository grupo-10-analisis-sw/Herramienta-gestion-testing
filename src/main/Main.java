package main;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		String path = "D:\\Eclipse\\eclipse_workspace\\Herramienta de gestion de testing\\archivos lectura\\Triangulo.java";
		
		LinkedList<String> codigo = null;
		
		try {
			codigo = LectorArchivos.leerArchivo(path);
		} catch (FileNotFoundException e) {
			System.out.println("No se encontro el archivo indicado");
		}

		for(int i = 0; i < codigo.size(); i++)
			System.out.println(codigo.get(i));
	}
	
	private void analizarLlaves(LinkedList<String> codigo) {
		Stack<Llave> pilaLlaves = new Stack<Llave>();
		
		for(int nroLinea = 0; nroLinea < codigo.size(); nroLinea++) {
			
			String lineaActual = codigo.get(nroLinea);
			
			if(lineaActual.contains("{"))
				pilaLlaves.push(new Llave(nroLinea, "{"));
			if(lineaActual.contains("}"))
				pilaLlaves.push(new Llave(nroLinea, "}"));
		}
		
		while(!pilaLlaves.isEmpty())
			System.out.println(pilaLlaves.pop());
	}

}
