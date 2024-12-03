package com.diardon;

import com.diardon.strategy.DescuentoMontoFijo;
import com.diardon.strategy.DescuentoNulo;
import com.diardon.strategy.DescuentoPorcentual;
import com.diardon.strategy.CalculadoraDePrecio;

/**
 * Clase principal para demostrar el uso del patrón Strategy
 */
public class AppStrategy
{
	public static void main(String[] args)
	{
		double originalPrice = 100.0;

		// Sin descuento
		CalculadoraDePrecio calculator = new CalculadoraDePrecio(new DescuentoNulo());
		System.out.println("Precio sin descuento: $" + calculator.calculatePrice(originalPrice));

		// Descuento porcentual
		calculator.setDiscountStrategy(new DescuentoPorcentual(10)); // 10% de descuento
		System.out.println("Precio con 10% de descuento: $" + calculator.calculatePrice(originalPrice));

		// Descuento de cantidad fija
		calculator.setDiscountStrategy(new DescuentoMontoFijo(15)); // $15 de descuento
		System.out.println("Precio con descuento de $15: $" + calculator.calculatePrice(originalPrice));
	}
}
