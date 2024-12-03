package com.diardon.strategy;

/**
 * Clase Contexto Utiliza la estrategia seleccionada para aplicar el descuento
 */
public class CalculadoraDePrecio
{
	private EstrategiaDescuento discountStrategy;

	public CalculadoraDePrecio(EstrategiaDescuento discountStrategy)
	{
		this.discountStrategy = discountStrategy;
	}
	public void setDiscountStrategy(EstrategiaDescuento discountStrategy)
	{
		this.discountStrategy = discountStrategy;
	}
	public double calculatePrice(double price)
	{
		return discountStrategy.aplicarDescuento(price);
	}
}
