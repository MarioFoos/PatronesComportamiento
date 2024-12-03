package com.diardon.strategy;

public class DescuentoNulo implements EstrategiaDescuento
{
	@Override
	public double aplicarDescuento(double price)
	{
		return price; // Sin descuento
	}
}
