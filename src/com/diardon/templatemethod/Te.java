package com.diardon.templatemethod;

public class Te extends Bebida
{
	@Override
	protected void brew()
	{
		System.out.println("Remojando el té...");
	}
	@Override
	protected void addCondiments()
	{
		System.out.println("Añadiendo limón...");
	}
}
