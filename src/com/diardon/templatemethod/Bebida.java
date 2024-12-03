package com.diardon.templatemethod;

/**
 * Define el esqueleto del proceso (template method)
 */
public abstract class Bebida
{
	// Template method
	public final void prepareRecipe()
	{
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	private void boilWater()
	{
		System.out.println("Hirviendo agua...");
	}
	private void pourInCup()
	{
		System.out.println("Vertiendo en la taza...");
	}
	// Métodos abstractos que las subclases deben implementar
	protected abstract void brew();

	protected abstract void addCondiments();
}
