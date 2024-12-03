package com.diardon;

import com.diardon.observer.EmailObserver;
import com.diardon.observer.Observer;
import com.diardon.observer.SmsObserver;
import com.diardon.observer.Subject;

/*
 * Explicación
 * Sujeto (Subject): Administra la lista de observadores (Observer) y notifica cambios a todos ellos.
 * Observadores (Observer): Implementan la interfaz y definen su propia lógica para manejar notificaciones.
 * Notificación: Cuando el sujeto detecta un cambio (por ejemplo, un nuevo mensaje), notifica a todos los observadores registrados.
 */
/**
 * Clase principal para demostrar el uso del patrón Observer
 */
public class AppObserver
{
	public static void main(String[] args)
	{
		Subject sujeto = new Subject();
		Observer emailObserver = new EmailObserver();
		Observer smsObserver = new SmsObserver();

		// Agregar observadores al sujeto
		sujeto.agregarObservador(emailObserver);
		sujeto.agregarObservador(smsObserver);

		// Enviar notificaciones
		sujeto.notificarObservadores("¡Nuevo mensaje disponible!");

		// Eliminar un observador y notificar nuevamente
		sujeto.eliminarObservador(emailObserver);
		sujeto.notificarObservadores("Otro mensaje importante.");
	}
}
