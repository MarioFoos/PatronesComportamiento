package com.diardon.templatemethod;

public class Cafe extends Bebida
{
	@Override
	protected void brew()
	{
		System.out.println("Preparando el caf�...");
	}
	@Override
	protected void addCondiments()
	{
		System.out.println("A�adiendo az�car y leche...");
	}
}
