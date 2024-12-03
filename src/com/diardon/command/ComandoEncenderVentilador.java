package com.diardon.command;

public class ComandoEncenderVentilador implements Comando
{
	private Ventilador fan;

	public ComandoEncenderVentilador(Ventilador fan)
	{
		this.fan = fan;
	}
	@Override
	public void execute()
	{
		fan.start();
	}
}
