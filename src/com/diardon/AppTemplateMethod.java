package com.diardon;

import com.diardon.templatemethod.Bebida;
import com.diardon.templatemethod.Cafe;
import com.diardon.templatemethod.Te;

/**
 * Clase principal para demostrar el uso del patr�n Template Method
 */
public class AppTemplateMethod
{
	public static void main(String[] args)
	{
		// Preparar t�
		Bebida tea = new Te();
		System.out.println("Preparando t�:");
		tea.prepareRecipe();

		System.out.println();

		// Preparar caf�
		Bebida coffee = new Cafe();
		System.out.println("Preparando caf�:");
		coffee.prepareRecipe();
	}
}
