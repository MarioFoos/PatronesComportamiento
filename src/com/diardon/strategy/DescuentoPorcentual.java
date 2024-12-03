package com.diardon.strategy;

public class DescuentoPorcentual implements EstrategiaDescuento
{
	private double percentage;

	public DescuentoPorcentual(double percentage){
		this.percentage = percentage;
	}
	@Override
	public double aplicarDescuento(double price)
	{
		return price - (price * percentage / 100);
	}
}
