package com.diardon.strategy;

public class DescuentoMontoFijo implements EstrategiaDescuento
{
	private double discountAmount;

	public DescuentoMontoFijo(double discountAmount)
	{
		this.discountAmount = discountAmount;
	}
	@Override
	public double aplicarDescuento(double price)
	{
		return Math.max(price - discountAmount, 0); // Evitar precios negativos
	}
}
