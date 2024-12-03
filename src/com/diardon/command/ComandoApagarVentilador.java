package com.diardon.command;

public class ComandoApagarVentilador implements Comando
{
	private Ventilador fan;

	public ComandoApagarVentilador(Ventilador fan)
	{
		this.fan = fan;
	}
	@Override
	public void execute()
	{
		fan.stop();
	}
}
