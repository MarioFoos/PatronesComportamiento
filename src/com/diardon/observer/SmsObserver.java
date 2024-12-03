package com.diardon.observer;

public class SmsObserver implements Observer
{
	@Override
	public void update(String mensaje)
	{
		System.out.println("SMS recibido: " + mensaje);
	}
}
