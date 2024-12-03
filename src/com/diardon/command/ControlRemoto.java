package com.diardon.command;

/**
 * El control remoto que recibe los comandos
 */
public class ControlRemoto
{
	private Comando command;

	public void setCommand(Comando command)
	{
		this.command = command;
	}
	public void pressButton()
	{
		command.execute();
	}
}
