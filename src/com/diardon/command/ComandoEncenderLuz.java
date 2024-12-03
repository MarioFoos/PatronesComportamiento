package com.diardon.command;

public class ComandoEncenderLuz implements Comando
{
	private Luz light;

	public ComandoEncenderLuz(Luz light)
	{
		this.light = light;
	}
	@Override
	public void execute()
	{
		light.turnOn();
	}
}
