package com.diardon.command;

public class ComandoApagarLuz implements Comando
{
	private Luz light;

	public ComandoApagarLuz(Luz light)
	{
		this.light = light;
	}
	@Override
	public void execute()
	{
		light.turnOff();
	}
}
