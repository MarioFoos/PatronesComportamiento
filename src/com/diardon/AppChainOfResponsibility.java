package com.diardon;

import com.diardon.chainofresponsibility.CEO;
import com.diardon.chainofresponsibility.Director;
import com.diardon.chainofresponsibility.ExpenseHandler;
import com.diardon.chainofresponsibility.Manager;

/**
 * Clase principal para demostrar el uso del patrón Chain of Responsibility
 */
public class AppChainOfResponsibility
{
	public static void main(String[] args)
	{
		// Crear los manejadores
		ExpenseHandler manager = new Manager();
		ExpenseHandler director = new Director();
		ExpenseHandler ceo = new CEO();

		// Configurar la cadena
		manager.setNextHandler(director);
		director.setNextHandler(ceo);

		// Probar diferentes montos
		System.out.println("Solicitud 1: $500");
		manager.handleExpense(500);

		System.out.println("\nSolicitud 2: $3000");
		manager.handleExpense(3000);

		System.out.println("\nSolicitud 3: $7000");
		manager.handleExpense(7000);
	}
}
