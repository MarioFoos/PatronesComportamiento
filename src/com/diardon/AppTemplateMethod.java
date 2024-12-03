package com.diardon;

import com.diardon.templatemethod.Bebida;
import com.diardon.templatemethod.Cafe;
import com.diardon.templatemethod.Te;

/**
 * Clase principal para demostrar el uso del patrón Template Method
 */
public class AppTemplateMethod
{
	public static void main(String[] args)
	{
		// Preparar té
		Bebida tea = new Te();
		System.out.println("Preparando té:");
		tea.prepareRecipe();

		System.out.println();

		// Preparar café
		Bebida coffee = new Cafe();
		System.out.println("Preparando café:");
		coffee.prepareRecipe();
	}
}
