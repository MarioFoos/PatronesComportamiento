package com.diardon;

import com.diardon.command.Comando;
import com.diardon.command.Ventilador;
import com.diardon.command.Luz;
import com.diardon.command.ControlRemoto;
import com.diardon.command.ComandoEncenderVentilador;
import com.diardon.command.ComandoApagarVentilador;
import com.diardon.command.ComandoApagarLuz;
import com.diardon.command.ComandoEncenderLuz;

/**
 * Clase principal para demostrar el uso del patrón Command
 */
public class AppCommand
{
	public static void main(String[] args)
	{
		// Crear los receivers
		Luz light = new Luz();
		Ventilador fan = new Ventilador();

		// Crear los comandos
		Comando encenderLuz = new ComandoEncenderLuz(light);
		Comando apagarLuz = new ComandoApagarLuz(light);
		Comando encenderVentilador = new ComandoEncenderVentilador(fan);
		Comando apagarVentilador = new ComandoApagarVentilador(fan);

		// Crear el invoker
		ControlRemoto controlRemoto = new ControlRemoto();

		// Encender la luz
		controlRemoto.setCommand(encenderLuz);
		controlRemoto.pressButton();

		// Apagar la luz
		controlRemoto.setCommand(apagarLuz);
		controlRemoto.pressButton();

		// Encender el ventilador
		controlRemoto.setCommand(encenderVentilador);
		controlRemoto.pressButton();

		// Apagar el ventilador
		controlRemoto.setCommand(apagarVentilador);
		controlRemoto.pressButton();
	}
}
