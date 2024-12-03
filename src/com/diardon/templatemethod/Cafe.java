package com.diardon.templatemethod;

public class Cafe extends Bebida
{
	@Override
	protected void brew()
	{
		System.out.println("Preparando el café...");
	}
	@Override
	protected void addCondiments()
	{
		System.out.println("Añadiendo azúcar y leche...");
	}
}
