package com.diardon.observer;

public class EmailObserver implements Observer
{
	@Override
	public void update(String mensaje)
	{
		System.out.println("Email recibido: " + mensaje);
	}
}
